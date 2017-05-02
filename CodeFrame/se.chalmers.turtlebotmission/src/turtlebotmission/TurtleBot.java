/**
 */
package turtlebotmission;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turtle Bot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turtlebotmission.TurtleBot#getArea <em>Area</em>}</li>
 *   <li>{@link turtlebotmission.TurtleBot#getWaypointtypes <em>Waypointtypes</em>}</li>
 *   <li>{@link turtlebotmission.TurtleBot#getBot_start <em>Bot start</em>}</li>
 *   <li>{@link turtlebotmission.TurtleBot#getWaypoints <em>Waypoints</em>}</li>
 *   <li>{@link turtlebotmission.TurtleBot#getMissions <em>Missions</em>}</li>
 * </ul>
 *
 * @see turtlebotmission.TurtlebotmissionPackage#getTurtleBot()
 * @model
 * @generated
 */
public interface TurtleBot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference.
	 * @see #setArea(Area)
	 * @see turtlebotmission.TurtlebotmissionPackage#getTurtleBot_Area()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Area getArea();

	/**
	 * Sets the value of the '{@link turtlebotmission.TurtleBot#getArea <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' containment reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(Area value);

	/**
	 * Returns the value of the '<em><b>Waypointtypes</b></em>' containment reference list.
	 * The list contents are of type {@link turtlebotmission.WaypointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waypointtypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypointtypes</em>' containment reference list.
	 * @see turtlebotmission.TurtlebotmissionPackage#getTurtleBot_Waypointtypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WaypointType> getWaypointtypes();

	/**
	 * Returns the value of the '<em><b>Bot start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bot start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bot start</em>' reference.
	 * @see #setBot_start(WayPoint)
	 * @see turtlebotmission.TurtlebotmissionPackage#getTurtleBot_Bot_start()
	 * @model required="true"
	 * @generated
	 */
	WayPoint getBot_start();

	/**
	 * Sets the value of the '{@link turtlebotmission.TurtleBot#getBot_start <em>Bot start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bot start</em>' reference.
	 * @see #getBot_start()
	 * @generated
	 */
	void setBot_start(WayPoint value);

	/**
	 * Returns the value of the '<em><b>Waypoints</b></em>' containment reference list.
	 * The list contents are of type {@link turtlebotmission.WayPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waypoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypoints</em>' containment reference list.
	 * @see turtlebotmission.TurtlebotmissionPackage#getTurtleBot_Waypoints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WayPoint> getWaypoints();

	/**
	 * Returns the value of the '<em><b>Missions</b></em>' containment reference list.
	 * The list contents are of type {@link turtlebotmission.Mission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missions</em>' containment reference list.
	 * @see turtlebotmission.TurtlebotmissionPackage#getTurtleBot_Missions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mission> getMissions();

} // TurtleBot
