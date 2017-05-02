/**
 */
package turtlebotmission;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shortest Path Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turtlebotmission.ShortestPathTask#getWaypoints <em>Waypoints</em>}</li>
 * </ul>
 *
 * @see turtlebotmission.TurtlebotmissionPackage#getShortestPathTask()
 * @model
 * @generated
 */
public interface ShortestPathTask extends Task {

	/**
	 * Returns the value of the '<em><b>Waypoints</b></em>' reference list.
	 * The list contents are of type {@link turtlebotmission.WayPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waypoints</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypoints</em>' reference list.
	 * @see turtlebotmission.TurtlebotmissionPackage#getShortestPathTask_Waypoints()
	 * @model required="true"
	 * @generated
	 */
	EList<WayPoint> getWaypoints();
} // ShortestPathTask
