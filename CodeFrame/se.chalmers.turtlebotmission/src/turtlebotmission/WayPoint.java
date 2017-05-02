/**
 */
package turtlebotmission;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Way Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turtlebotmission.WayPoint#getCoord_x <em>Coord x</em>}</li>
 *   <li>{@link turtlebotmission.WayPoint#getCoord_y <em>Coord y</em>}</li>
 *   <li>{@link turtlebotmission.WayPoint#getWaypointtypes <em>Waypointtypes</em>}</li>
 * </ul>
 *
 * @see turtlebotmission.TurtlebotmissionPackage#getWayPoint()
 * @model
 * @generated
 */
public interface WayPoint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Coord x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coord x</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord x</em>' attribute.
	 * @see #setCoord_x(int)
	 * @see turtlebotmission.TurtlebotmissionPackage#getWayPoint_Coord_x()
	 * @model
	 * @generated
	 */
	int getCoord_x();

	/**
	 * Sets the value of the '{@link turtlebotmission.WayPoint#getCoord_x <em>Coord x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord x</em>' attribute.
	 * @see #getCoord_x()
	 * @generated
	 */
	void setCoord_x(int value);

	/**
	 * Returns the value of the '<em><b>Coord y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coord y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord y</em>' attribute.
	 * @see #setCoord_y(int)
	 * @see turtlebotmission.TurtlebotmissionPackage#getWayPoint_Coord_y()
	 * @model
	 * @generated
	 */
	int getCoord_y();

	/**
	 * Sets the value of the '{@link turtlebotmission.WayPoint#getCoord_y <em>Coord y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord y</em>' attribute.
	 * @see #getCoord_y()
	 * @generated
	 */
	void setCoord_y(int value);

	/**
	 * Returns the value of the '<em><b>Waypointtypes</b></em>' reference list.
	 * The list contents are of type {@link turtlebotmission.WaypointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waypointtypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypointtypes</em>' reference list.
	 * @see turtlebotmission.TurtlebotmissionPackage#getWayPoint_Waypointtypes()
	 * @model required="true"
	 * @generated
	 */
	EList<WaypointType> getWaypointtypes();

} // WayPoint
