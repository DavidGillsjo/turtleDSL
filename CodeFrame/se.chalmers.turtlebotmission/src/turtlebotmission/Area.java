/**
 */
package turtlebotmission;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turtlebotmission.Area#getXmax <em>Xmax</em>}</li>
 *   <li>{@link turtlebotmission.Area#getYmax <em>Ymax</em>}</li>
 * </ul>
 *
 * @see turtlebotmission.TurtlebotmissionPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends EObject {
	/**
	 * Returns the value of the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xmax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmax</em>' attribute.
	 * @see #setXmax(int)
	 * @see turtlebotmission.TurtlebotmissionPackage#getArea_Xmax()
	 * @model
	 * @generated
	 */
	int getXmax();

	/**
	 * Sets the value of the '{@link turtlebotmission.Area#getXmax <em>Xmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmax</em>' attribute.
	 * @see #getXmax()
	 * @generated
	 */
	void setXmax(int value);

	/**
	 * Returns the value of the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ymax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ymax</em>' attribute.
	 * @see #setYmax(int)
	 * @see turtlebotmission.TurtlebotmissionPackage#getArea_Ymax()
	 * @model
	 * @generated
	 */
	int getYmax();

	/**
	 * Sets the value of the '{@link turtlebotmission.Area#getYmax <em>Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ymax</em>' attribute.
	 * @see #getYmax()
	 * @generated
	 */
	void setYmax(int value);

} // Area
