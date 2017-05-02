/**
 */
package turtlebotmission;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see turtlebotmission.TurtlebotmissionFactory
 * @model kind="package"
 * @generated
 */
public interface TurtlebotmissionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "turtlebotmission";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.chalmers.se/turtlebotmission";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "turtlebotmission";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TurtlebotmissionPackage eINSTANCE = turtlebotmission.impl.TurtlebotmissionPackageImpl.init();

	/**
	 * The meta object id for the '{@link turtlebotmission.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see turtlebotmission.impl.NamedElementImpl
	 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link turtlebotmission.impl.TurtleBotImpl <em>Turtle Bot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see turtlebotmission.impl.TurtleBotImpl
	 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getTurtleBot()
	 * @generated
	 */
	int TURTLE_BOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__AREA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Waypointtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__WAYPOINTTYPES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bot start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__BOT_START = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Waypoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__WAYPOINTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__MISSIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Turtle Bot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Turtle Bot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link turtlebotmission.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see turtlebotmission.impl.AreaImpl
	 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 2;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__XMAX = 0;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__YMAX = 1;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link turtlebotmission.impl.WaypointTypeImpl <em>Waypoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see turtlebotmission.impl.WaypointTypeImpl
	 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getWaypointType()
	 * @generated
	 */
	int WAYPOINT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Waypoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Waypoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link turtlebotmission.impl.WayPointImpl <em>Way Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see turtlebotmission.impl.WayPointImpl
	 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getWayPoint()
	 * @generated
	 */
	int WAY_POINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Coord x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__COORD_X = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coord y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__COORD_Y = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waypointtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__WAYPOINTTYPES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Way Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Way Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link turtlebotmission.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see turtlebotmission.impl.MissionImpl
	 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__TASK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link turtlebotmission.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see turtlebotmission.impl.TaskImpl
	 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 6;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link turtlebotmission.impl.LineTaskImpl <em>Line Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see turtlebotmission.impl.LineTaskImpl
	 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getLineTask()
	 * @generated
	 */
	int LINE_TASK = 7;

	/**
	 * The feature id for the '<em><b>Waypoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TASK__WAYPOINTS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link turtlebotmission.impl.ShortestPathTaskImpl <em>Shortest Path Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see turtlebotmission.impl.ShortestPathTaskImpl
	 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getShortestPathTask()
	 * @generated
	 */
	int SHORTEST_PATH_TASK = 8;

	/**
	 * The feature id for the '<em><b>Waypoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTEST_PATH_TASK__WAYPOINTS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shortest Path Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTEST_PATH_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shortest Path Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTEST_PATH_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link turtlebotmission.impl.ReturnToStartTaskImpl <em>Return To Start Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see turtlebotmission.impl.ReturnToStartTaskImpl
	 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getReturnToStartTask()
	 * @generated
	 */
	int RETURN_TO_START_TASK = 9;

	/**
	 * The number of structural features of the '<em>Return To Start Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_START_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return To Start Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_START_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link turtlebotmission.TurtleBot <em>Turtle Bot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turtle Bot</em>'.
	 * @see turtlebotmission.TurtleBot
	 * @generated
	 */
	EClass getTurtleBot();

	/**
	 * Returns the meta object for the containment reference '{@link turtlebotmission.TurtleBot#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Area</em>'.
	 * @see turtlebotmission.TurtleBot#getArea()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Area();

	/**
	 * Returns the meta object for the containment reference list '{@link turtlebotmission.TurtleBot#getWaypointtypes <em>Waypointtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Waypointtypes</em>'.
	 * @see turtlebotmission.TurtleBot#getWaypointtypes()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Waypointtypes();

	/**
	 * Returns the meta object for the reference '{@link turtlebotmission.TurtleBot#getBot_start <em>Bot start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bot start</em>'.
	 * @see turtlebotmission.TurtleBot#getBot_start()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Bot_start();

	/**
	 * Returns the meta object for the containment reference list '{@link turtlebotmission.TurtleBot#getWaypoints <em>Waypoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Waypoints</em>'.
	 * @see turtlebotmission.TurtleBot#getWaypoints()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Waypoints();

	/**
	 * Returns the meta object for the containment reference list '{@link turtlebotmission.TurtleBot#getMissions <em>Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Missions</em>'.
	 * @see turtlebotmission.TurtleBot#getMissions()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Missions();

	/**
	 * Returns the meta object for class '{@link turtlebotmission.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see turtlebotmission.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link turtlebotmission.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see turtlebotmission.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link turtlebotmission.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see turtlebotmission.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the attribute '{@link turtlebotmission.Area#getXmax <em>Xmax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmax</em>'.
	 * @see turtlebotmission.Area#getXmax()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Xmax();

	/**
	 * Returns the meta object for the attribute '{@link turtlebotmission.Area#getYmax <em>Ymax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ymax</em>'.
	 * @see turtlebotmission.Area#getYmax()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Ymax();

	/**
	 * Returns the meta object for class '{@link turtlebotmission.WaypointType <em>Waypoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waypoint Type</em>'.
	 * @see turtlebotmission.WaypointType
	 * @generated
	 */
	EClass getWaypointType();

	/**
	 * Returns the meta object for class '{@link turtlebotmission.WayPoint <em>Way Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way Point</em>'.
	 * @see turtlebotmission.WayPoint
	 * @generated
	 */
	EClass getWayPoint();

	/**
	 * Returns the meta object for the attribute '{@link turtlebotmission.WayPoint#getCoord_x <em>Coord x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord x</em>'.
	 * @see turtlebotmission.WayPoint#getCoord_x()
	 * @see #getWayPoint()
	 * @generated
	 */
	EAttribute getWayPoint_Coord_x();

	/**
	 * Returns the meta object for the attribute '{@link turtlebotmission.WayPoint#getCoord_y <em>Coord y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord y</em>'.
	 * @see turtlebotmission.WayPoint#getCoord_y()
	 * @see #getWayPoint()
	 * @generated
	 */
	EAttribute getWayPoint_Coord_y();

	/**
	 * Returns the meta object for the reference list '{@link turtlebotmission.WayPoint#getWaypointtypes <em>Waypointtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Waypointtypes</em>'.
	 * @see turtlebotmission.WayPoint#getWaypointtypes()
	 * @see #getWayPoint()
	 * @generated
	 */
	EReference getWayPoint_Waypointtypes();

	/**
	 * Returns the meta object for class '{@link turtlebotmission.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see turtlebotmission.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the containment reference list '{@link turtlebotmission.Mission#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see turtlebotmission.Mission#getTask()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Task();

	/**
	 * Returns the meta object for class '{@link turtlebotmission.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see turtlebotmission.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link turtlebotmission.LineTask <em>Line Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Task</em>'.
	 * @see turtlebotmission.LineTask
	 * @generated
	 */
	EClass getLineTask();

	/**
	 * Returns the meta object for the reference list '{@link turtlebotmission.LineTask#getWaypoints <em>Waypoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Waypoints</em>'.
	 * @see turtlebotmission.LineTask#getWaypoints()
	 * @see #getLineTask()
	 * @generated
	 */
	EReference getLineTask_Waypoints();

	/**
	 * Returns the meta object for class '{@link turtlebotmission.ShortestPathTask <em>Shortest Path Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shortest Path Task</em>'.
	 * @see turtlebotmission.ShortestPathTask
	 * @generated
	 */
	EClass getShortestPathTask();

	/**
	 * Returns the meta object for the reference list '{@link turtlebotmission.ShortestPathTask#getWaypoints <em>Waypoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Waypoints</em>'.
	 * @see turtlebotmission.ShortestPathTask#getWaypoints()
	 * @see #getShortestPathTask()
	 * @generated
	 */
	EReference getShortestPathTask_Waypoints();

	/**
	 * Returns the meta object for class '{@link turtlebotmission.ReturnToStartTask <em>Return To Start Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return To Start Task</em>'.
	 * @see turtlebotmission.ReturnToStartTask
	 * @generated
	 */
	EClass getReturnToStartTask();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TurtlebotmissionFactory getTurtlebotmissionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link turtlebotmission.impl.TurtleBotImpl <em>Turtle Bot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see turtlebotmission.impl.TurtleBotImpl
		 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getTurtleBot()
		 * @generated
		 */
		EClass TURTLE_BOT = eINSTANCE.getTurtleBot();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__AREA = eINSTANCE.getTurtleBot_Area();

		/**
		 * The meta object literal for the '<em><b>Waypointtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__WAYPOINTTYPES = eINSTANCE.getTurtleBot_Waypointtypes();

		/**
		 * The meta object literal for the '<em><b>Bot start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__BOT_START = eINSTANCE.getTurtleBot_Bot_start();

		/**
		 * The meta object literal for the '<em><b>Waypoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__WAYPOINTS = eINSTANCE.getTurtleBot_Waypoints();

		/**
		 * The meta object literal for the '<em><b>Missions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__MISSIONS = eINSTANCE.getTurtleBot_Missions();

		/**
		 * The meta object literal for the '{@link turtlebotmission.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see turtlebotmission.impl.NamedElementImpl
		 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link turtlebotmission.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see turtlebotmission.impl.AreaImpl
		 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Xmax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__XMAX = eINSTANCE.getArea_Xmax();

		/**
		 * The meta object literal for the '<em><b>Ymax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__YMAX = eINSTANCE.getArea_Ymax();

		/**
		 * The meta object literal for the '{@link turtlebotmission.impl.WaypointTypeImpl <em>Waypoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see turtlebotmission.impl.WaypointTypeImpl
		 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getWaypointType()
		 * @generated
		 */
		EClass WAYPOINT_TYPE = eINSTANCE.getWaypointType();

		/**
		 * The meta object literal for the '{@link turtlebotmission.impl.WayPointImpl <em>Way Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see turtlebotmission.impl.WayPointImpl
		 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getWayPoint()
		 * @generated
		 */
		EClass WAY_POINT = eINSTANCE.getWayPoint();

		/**
		 * The meta object literal for the '<em><b>Coord x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAY_POINT__COORD_X = eINSTANCE.getWayPoint_Coord_x();

		/**
		 * The meta object literal for the '<em><b>Coord y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAY_POINT__COORD_Y = eINSTANCE.getWayPoint_Coord_y();

		/**
		 * The meta object literal for the '<em><b>Waypointtypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAY_POINT__WAYPOINTTYPES = eINSTANCE.getWayPoint_Waypointtypes();

		/**
		 * The meta object literal for the '{@link turtlebotmission.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see turtlebotmission.impl.MissionImpl
		 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__TASK = eINSTANCE.getMission_Task();

		/**
		 * The meta object literal for the '{@link turtlebotmission.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see turtlebotmission.impl.TaskImpl
		 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link turtlebotmission.impl.LineTaskImpl <em>Line Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see turtlebotmission.impl.LineTaskImpl
		 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getLineTask()
		 * @generated
		 */
		EClass LINE_TASK = eINSTANCE.getLineTask();

		/**
		 * The meta object literal for the '<em><b>Waypoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_TASK__WAYPOINTS = eINSTANCE.getLineTask_Waypoints();

		/**
		 * The meta object literal for the '{@link turtlebotmission.impl.ShortestPathTaskImpl <em>Shortest Path Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see turtlebotmission.impl.ShortestPathTaskImpl
		 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getShortestPathTask()
		 * @generated
		 */
		EClass SHORTEST_PATH_TASK = eINSTANCE.getShortestPathTask();

		/**
		 * The meta object literal for the '<em><b>Waypoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORTEST_PATH_TASK__WAYPOINTS = eINSTANCE.getShortestPathTask_Waypoints();

		/**
		 * The meta object literal for the '{@link turtlebotmission.impl.ReturnToStartTaskImpl <em>Return To Start Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see turtlebotmission.impl.ReturnToStartTaskImpl
		 * @see turtlebotmission.impl.TurtlebotmissionPackageImpl#getReturnToStartTask()
		 * @generated
		 */
		EClass RETURN_TO_START_TASK = eINSTANCE.getReturnToStartTask();

	}

} //TurtlebotmissionPackage
