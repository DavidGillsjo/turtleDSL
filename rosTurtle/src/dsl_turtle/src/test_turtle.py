#!/usr/bin/env python
import rospy
from geometry_msgs.msg  import Twist
from turtlesim.msg import Pose
from math import pow,atan2,sqrt
import numpy as np
from copy import copy

class turtle():
    def __init__(self, bot_start, area, waypoints):
        #Creating our node,publisher and subscriber        
        rospy.init_node('turtlebot_controller', anonymous=True)
        self.velocity_publisher = rospy.Publisher('/turtle1/cmd_vel', Twist, queue_size=10)
        self.pose_subscriber = rospy.Subscriber('/turtle1/pose', Pose, self.callback)
        self.pose = Pose()
        self.rate = rospy.Rate(10)
        #This is the tolerance of the controller, because the turtlesim is not the most accurate simulator
        self.tolerance = 0.1

        self.bot_start = bot_start
        self.bot_position = bot_start
        self.area = area
        self.waypoints = waypoints

    #Callback function implementing the pose value received
    #This saves the current position of the turtle in global coordinate system
    def callback(self, data):
        self.pose = data
        self.pose.x = round(self.pose.x, 4)
        self.pose.y = round(self.pose.y, 4)

    #Distance to the actual goal
    def get_distance(self, goal_x, goal_y):
        distance = sqrt(pow((goal_x - self.pose.x), 2) + pow((goal_y - self.pose.y), 2))
        return distance

    #This function drives the correct behavior of the robot in the turtle sim map
    def move2goal(self,posX,posY):
        speed = 10
        goal_pose = Pose()
        goal_pose.x = posX
        goal_pose.y = posY
        distance_tolerance = self.tolerance
        vel_msg = Twist()
        angErrorLast = 0.0
        angError = atan2(goal_pose.y - self.pose.y, goal_pose.x - self.pose.x) - self.pose.theta
        while abs(angError) >= 0.0001:
            vel_msg.angular.z = speed * 2.0 * angError
            self.velocity_publisher.publish(vel_msg)
            angError = atan2(goal_pose.y - self.pose.y, goal_pose.x - self.pose.x) - self.pose.theta
            
        while sqrt(pow((goal_pose.x - self.pose.x), 2) + pow((goal_pose.y - self.pose.y), 2)) >= distance_tolerance:
            vel_msg.linear.x = speed * 1.0 * sqrt(pow((goal_pose.x - self.pose.x), 2) + pow((goal_pose.y - self.pose.y), 2))
            vel_msg.linear.y = 0
            vel_msg.linear.z = 0

            angError = atan2(goal_pose.y - self.pose.y, goal_pose.x - self.pose.x) - self.pose.theta
            vel_msg.angular.x = 0
            vel_msg.angular.y = 0
            vel_msg.angular.z = speed * 2.0 * angError - speed * 1.0 *(angError - angErrorLast)
            angErrorLast = angError

            self.velocity_publisher.publish(vel_msg)
            self.rate.sleep()
        vel_msg.linear.x = 0
        vel_msg.angular.z =0
        self.velocity_publisher.publish(vel_msg)

    def find_nearest_wp(self, waypoints):
        distances = np.zeros(len(waypoints))
        for i,wp in enumerate(waypoints):
            x_wp = self.waypoints[wp][1]
            y_wp = self.waypoints[wp][2]
            d = sqrt((self.bot_position[0] - x_wp)**2 + (self.bot_position[1] - y_wp)**2)
            distances[i] = d
        return distances.argmin()

    def shortest_path(self, waypoints):
        coords = []
        my_wps = copy(waypoints)
        
        while len(my_wps) > 0:
            best_wp_ind = self.find_nearest_wp(my_wps)
            next_coord = self.get_wp_pos(my_wps[best_wp_ind])
            coords.append(next_coord)
            del my_wps[best_wp_ind]
            self.bot_position = next_coord
        
        return coords

    def line_path(self, waypoints):
        coords = [self.get_wp_pos(wp) for wp in waypoints]
        self.bot_position = coords[-1]
        return coords

    def return_to_start(self):
        self.bot_position = self.mission_start_pos
        return [self.mission_start_pos]
    
    def run_mission(self,mission_obj):
        self.mission_start_pos = self.bot_position
        mission_name = mission_obj[0]
        tasks = mission_obj[1]

        print "Starting mission %s" % mission_name
        for task in tasks:
            task_name = task[0]
            task_wps = task[1] if len(task) > 1 else None
            print "Running task %s" % task_name

            if task_name == "ShortestPath":
                coords_to_run = self.shortest_path(task_wps)
            elif task_name == "ReturnToStart":
                coords_to_run = self.return_to_start()
            else:
                coords_to_run = self.line_path(task_wps)

            for c in coords_to_run:
                self.move2goal(c[0], c[1])


    def get_wp_pos(self, wp):
        x_wp = self.waypoints[wp][1]
        y_wp = self.waypoints[wp][2]
        return [x_wp, y_wp]


if __name__ == '__main__':
    try:
        #Testing our function
        
        
        # filler for the coordinate dictionary
        waypoints = {"W0": (["Hotel"], 1, 1), "W1": (["GasStation"], 1, 2), "W2": (["PetrolStation", "GasStation"], 3, 4), "W3": (["Airport"], 10, 5) }

        # filler for the waypoint types
        waypointTypes = {"Hotel", "GasStation", "PetrolStation", "Airport" }

        # filler for the area dictionary
        area = (0, 0)

        # filler for the bot-start
        bot_start = (5.5, 5.5)

        #creating a turtle object        
        tb = turtle(bot_start, area, waypoints)

        # parse the missions
        missions = [["ReFuel", [["ShortestPath", ["W1", "W2"]], ["ReturnToStart" ]]], ["ShuttleService", [["ShortestPath", ["W1", "W3"]], [ "Line", ["W2", "W3", "W2"]], ["ReturnToStart" ]]]]

        for m in missions:
            tb.run_mission(m)


    except rospy.ROSInterruptException:
        pass
