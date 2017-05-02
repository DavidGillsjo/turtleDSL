/**
 */
package turtlebotmission;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turtlebotmission.Mission#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see turtlebotmission.TurtlebotmissionPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link turtlebotmission.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see turtlebotmission.TurtlebotmissionPackage#getMission_Task()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTask();

} // Mission
