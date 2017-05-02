/**
 */
package turtlebotmission.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import turtlebotmission.TurtlebotmissionPackage;
import turtlebotmission.WayPoint;
import turtlebotmission.WaypointType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Way Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link turtlebotmission.impl.WayPointImpl#getCoord_x <em>Coord x</em>}</li>
 *   <li>{@link turtlebotmission.impl.WayPointImpl#getCoord_y <em>Coord y</em>}</li>
 *   <li>{@link turtlebotmission.impl.WayPointImpl#getWaypointtypes <em>Waypointtypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WayPointImpl extends NamedElementImpl implements WayPoint {
	/**
	 * The default value of the '{@link #getCoord_x() <em>Coord x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoord_x()
	 * @generated
	 * @ordered
	 */
	protected static final int COORD_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoord_x() <em>Coord x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoord_x()
	 * @generated
	 * @ordered
	 */
	protected int coord_x = COORD_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoord_y() <em>Coord y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoord_y()
	 * @generated
	 * @ordered
	 */
	protected static final int COORD_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoord_y() <em>Coord y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoord_y()
	 * @generated
	 * @ordered
	 */
	protected int coord_y = COORD_Y_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWaypointtypes() <em>Waypointtypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaypointtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<WaypointType> waypointtypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WayPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotmissionPackage.Literals.WAY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoord_x() {
		return coord_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoord_x(int newCoord_x) {
		int oldCoord_x = coord_x;
		coord_x = newCoord_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotmissionPackage.WAY_POINT__COORD_X, oldCoord_x, coord_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoord_y() {
		return coord_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoord_y(int newCoord_y) {
		int oldCoord_y = coord_y;
		coord_y = newCoord_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotmissionPackage.WAY_POINT__COORD_Y, oldCoord_y, coord_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WaypointType> getWaypointtypes() {
		if (waypointtypes == null) {
			waypointtypes = new EObjectResolvingEList<WaypointType>(WaypointType.class, this, TurtlebotmissionPackage.WAY_POINT__WAYPOINTTYPES);
		}
		return waypointtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TurtlebotmissionPackage.WAY_POINT__COORD_X:
				return getCoord_x();
			case TurtlebotmissionPackage.WAY_POINT__COORD_Y:
				return getCoord_y();
			case TurtlebotmissionPackage.WAY_POINT__WAYPOINTTYPES:
				return getWaypointtypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TurtlebotmissionPackage.WAY_POINT__COORD_X:
				setCoord_x((Integer)newValue);
				return;
			case TurtlebotmissionPackage.WAY_POINT__COORD_Y:
				setCoord_y((Integer)newValue);
				return;
			case TurtlebotmissionPackage.WAY_POINT__WAYPOINTTYPES:
				getWaypointtypes().clear();
				getWaypointtypes().addAll((Collection<? extends WaypointType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TurtlebotmissionPackage.WAY_POINT__COORD_X:
				setCoord_x(COORD_X_EDEFAULT);
				return;
			case TurtlebotmissionPackage.WAY_POINT__COORD_Y:
				setCoord_y(COORD_Y_EDEFAULT);
				return;
			case TurtlebotmissionPackage.WAY_POINT__WAYPOINTTYPES:
				getWaypointtypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TurtlebotmissionPackage.WAY_POINT__COORD_X:
				return coord_x != COORD_X_EDEFAULT;
			case TurtlebotmissionPackage.WAY_POINT__COORD_Y:
				return coord_y != COORD_Y_EDEFAULT;
			case TurtlebotmissionPackage.WAY_POINT__WAYPOINTTYPES:
				return waypointtypes != null && !waypointtypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (coord_x: ");
		result.append(coord_x);
		result.append(", coord_y: ");
		result.append(coord_y);
		result.append(')');
		return result.toString();
	}

} //WayPointImpl
