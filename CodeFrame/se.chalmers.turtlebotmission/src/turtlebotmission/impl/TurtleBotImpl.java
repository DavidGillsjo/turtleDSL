/**
 */
package turtlebotmission.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import turtlebotmission.Area;
import turtlebotmission.Mission;
import turtlebotmission.TurtleBot;
import turtlebotmission.TurtlebotmissionPackage;
import turtlebotmission.WayPoint;
import turtlebotmission.WaypointType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turtle Bot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link turtlebotmission.impl.TurtleBotImpl#getArea <em>Area</em>}</li>
 *   <li>{@link turtlebotmission.impl.TurtleBotImpl#getWaypointtypes <em>Waypointtypes</em>}</li>
 *   <li>{@link turtlebotmission.impl.TurtleBotImpl#getBot_start <em>Bot start</em>}</li>
 *   <li>{@link turtlebotmission.impl.TurtleBotImpl#getWaypoints <em>Waypoints</em>}</li>
 *   <li>{@link turtlebotmission.impl.TurtleBotImpl#getMissions <em>Missions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurtleBotImpl extends NamedElementImpl implements TurtleBot {
	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected Area area;

	/**
	 * The cached value of the '{@link #getWaypointtypes() <em>Waypointtypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaypointtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<WaypointType> waypointtypes;

	/**
	 * The cached value of the '{@link #getBot_start() <em>Bot start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBot_start()
	 * @generated
	 * @ordered
	 */
	protected WayPoint bot_start;

	/**
	 * The cached value of the '{@link #getWaypoints() <em>Waypoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaypoints()
	 * @generated
	 * @ordered
	 */
	protected EList<WayPoint> waypoints;

	/**
	 * The cached value of the '{@link #getMissions() <em>Missions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> missions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurtleBotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotmissionPackage.Literals.TURTLE_BOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArea(Area newArea, NotificationChain msgs) {
		Area oldArea = area;
		area = newArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurtlebotmissionPackage.TURTLE_BOT__AREA, oldArea, newArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(Area newArea) {
		if (newArea != area) {
			NotificationChain msgs = null;
			if (area != null)
				msgs = ((InternalEObject)area).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurtlebotmissionPackage.TURTLE_BOT__AREA, null, msgs);
			if (newArea != null)
				msgs = ((InternalEObject)newArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurtlebotmissionPackage.TURTLE_BOT__AREA, null, msgs);
			msgs = basicSetArea(newArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotmissionPackage.TURTLE_BOT__AREA, newArea, newArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WaypointType> getWaypointtypes() {
		if (waypointtypes == null) {
			waypointtypes = new EObjectContainmentEList<WaypointType>(WaypointType.class, this, TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTTYPES);
		}
		return waypointtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPoint getBot_start() {
		if (bot_start != null && bot_start.eIsProxy()) {
			InternalEObject oldBot_start = (InternalEObject)bot_start;
			bot_start = (WayPoint)eResolveProxy(oldBot_start);
			if (bot_start != oldBot_start) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TurtlebotmissionPackage.TURTLE_BOT__BOT_START, oldBot_start, bot_start));
			}
		}
		return bot_start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPoint basicGetBot_start() {
		return bot_start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBot_start(WayPoint newBot_start) {
		WayPoint oldBot_start = bot_start;
		bot_start = newBot_start;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotmissionPackage.TURTLE_BOT__BOT_START, oldBot_start, bot_start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WayPoint> getWaypoints() {
		if (waypoints == null) {
			waypoints = new EObjectContainmentEList<WayPoint>(WayPoint.class, this, TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTS);
		}
		return waypoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mission> getMissions() {
		if (missions == null) {
			missions = new EObjectContainmentEList<Mission>(Mission.class, this, TurtlebotmissionPackage.TURTLE_BOT__MISSIONS);
		}
		return missions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TurtlebotmissionPackage.TURTLE_BOT__AREA:
				return basicSetArea(null, msgs);
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTTYPES:
				return ((InternalEList<?>)getWaypointtypes()).basicRemove(otherEnd, msgs);
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTS:
				return ((InternalEList<?>)getWaypoints()).basicRemove(otherEnd, msgs);
			case TurtlebotmissionPackage.TURTLE_BOT__MISSIONS:
				return ((InternalEList<?>)getMissions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TurtlebotmissionPackage.TURTLE_BOT__AREA:
				return getArea();
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTTYPES:
				return getWaypointtypes();
			case TurtlebotmissionPackage.TURTLE_BOT__BOT_START:
				if (resolve) return getBot_start();
				return basicGetBot_start();
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTS:
				return getWaypoints();
			case TurtlebotmissionPackage.TURTLE_BOT__MISSIONS:
				return getMissions();
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
			case TurtlebotmissionPackage.TURTLE_BOT__AREA:
				setArea((Area)newValue);
				return;
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTTYPES:
				getWaypointtypes().clear();
				getWaypointtypes().addAll((Collection<? extends WaypointType>)newValue);
				return;
			case TurtlebotmissionPackage.TURTLE_BOT__BOT_START:
				setBot_start((WayPoint)newValue);
				return;
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTS:
				getWaypoints().clear();
				getWaypoints().addAll((Collection<? extends WayPoint>)newValue);
				return;
			case TurtlebotmissionPackage.TURTLE_BOT__MISSIONS:
				getMissions().clear();
				getMissions().addAll((Collection<? extends Mission>)newValue);
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
			case TurtlebotmissionPackage.TURTLE_BOT__AREA:
				setArea((Area)null);
				return;
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTTYPES:
				getWaypointtypes().clear();
				return;
			case TurtlebotmissionPackage.TURTLE_BOT__BOT_START:
				setBot_start((WayPoint)null);
				return;
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTS:
				getWaypoints().clear();
				return;
			case TurtlebotmissionPackage.TURTLE_BOT__MISSIONS:
				getMissions().clear();
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
			case TurtlebotmissionPackage.TURTLE_BOT__AREA:
				return area != null;
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTTYPES:
				return waypointtypes != null && !waypointtypes.isEmpty();
			case TurtlebotmissionPackage.TURTLE_BOT__BOT_START:
				return bot_start != null;
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTS:
				return waypoints != null && !waypoints.isEmpty();
			case TurtlebotmissionPackage.TURTLE_BOT__MISSIONS:
				return missions != null && !missions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TurtleBotImpl
