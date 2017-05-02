/**
 */
package turtlebotmission;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see turtlebotmission.TurtlebotmissionPackage
 * @generated
 */
public interface TurtlebotmissionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TurtlebotmissionFactory eINSTANCE = turtlebotmission.impl.TurtlebotmissionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Turtle Bot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turtle Bot</em>'.
	 * @generated
	 */
	TurtleBot createTurtleBot();

	/**
	 * Returns a new object of class '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area</em>'.
	 * @generated
	 */
	Area createArea();

	/**
	 * Returns a new object of class '<em>Waypoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Waypoint Type</em>'.
	 * @generated
	 */
	WaypointType createWaypointType();

	/**
	 * Returns a new object of class '<em>Way Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Way Point</em>'.
	 * @generated
	 */
	WayPoint createWayPoint();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns a new object of class '<em>Line Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Task</em>'.
	 * @generated
	 */
	LineTask createLineTask();

	/**
	 * Returns a new object of class '<em>Shortest Path Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shortest Path Task</em>'.
	 * @generated
	 */
	ShortestPathTask createShortestPathTask();

	/**
	 * Returns a new object of class '<em>Return To Start Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return To Start Task</em>'.
	 * @generated
	 */
	ReturnToStartTask createReturnToStartTask();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TurtlebotmissionPackage getTurtlebotmissionPackage();

} //TurtlebotmissionFactory
