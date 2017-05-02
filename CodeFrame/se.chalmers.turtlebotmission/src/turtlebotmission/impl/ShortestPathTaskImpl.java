/**
 */
package turtlebotmission.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import turtlebotmission.ShortestPathTask;
import turtlebotmission.TurtlebotmissionPackage;
import turtlebotmission.WayPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shortest Path Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link turtlebotmission.impl.ShortestPathTaskImpl#getWaypoints <em>Waypoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortestPathTaskImpl extends TaskImpl implements ShortestPathTask {
	/**
	 * The cached value of the '{@link #getWaypoints() <em>Waypoints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaypoints()
	 * @generated
	 * @ordered
	 */
	protected EList<WayPoint> waypoints;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortestPathTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotmissionPackage.Literals.SHORTEST_PATH_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WayPoint> getWaypoints() {
		if (waypoints == null) {
			waypoints = new EObjectResolvingEList<WayPoint>(WayPoint.class, this, TurtlebotmissionPackage.SHORTEST_PATH_TASK__WAYPOINTS);
		}
		return waypoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TurtlebotmissionPackage.SHORTEST_PATH_TASK__WAYPOINTS:
				return getWaypoints();
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
			case TurtlebotmissionPackage.SHORTEST_PATH_TASK__WAYPOINTS:
				getWaypoints().clear();
				getWaypoints().addAll((Collection<? extends WayPoint>)newValue);
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
			case TurtlebotmissionPackage.SHORTEST_PATH_TASK__WAYPOINTS:
				getWaypoints().clear();
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
			case TurtlebotmissionPackage.SHORTEST_PATH_TASK__WAYPOINTS:
				return waypoints != null && !waypoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShortestPathTaskImpl
