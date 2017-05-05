#!/bin/bash 
source rosTurtle/devel/setup.bash
cp MyTurtle/generated_mission.py rosTurtle/src/dsl_turtle/src/generated_turtle.py
chmod +x rosTurtle/src/dsl_turtle/src/generated_turtle.py
roslaunch dsl_turtle simulate_generated.launch
