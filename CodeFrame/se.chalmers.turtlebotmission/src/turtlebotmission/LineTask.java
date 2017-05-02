/**
 */
package turtlebotmission;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turtlebotmission.LineTask#getWaypoints <em>Waypoints</em>}</li>
 * </ul>
 *
 * @see turtlebotmission.TurtlebotmissionPackage#getLineTask()
 * @model
 * @generated
 */
public interface LineTask extends Task {

	/**
	 * Returns the value of the '<em><b>Waypoints</b></em>' reference list.
	 * The list contents are of type {@link turtlebotmission.WayPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waypoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypoints</em>' reference list.
	 * @see turtlebotmission.TurtlebotmissionPackage#getLineTask_Waypoints()
	 * @model required="true"
	 * @generated
	 */
	EList<WayPoint> getWaypoints();
} // LineTask
