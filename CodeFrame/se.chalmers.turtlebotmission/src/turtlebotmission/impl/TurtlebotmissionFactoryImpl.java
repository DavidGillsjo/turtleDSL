/**
 */
package turtlebotmission.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import turtlebotmission.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtlebotmissionFactoryImpl extends EFactoryImpl implements TurtlebotmissionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TurtlebotmissionFactory init() {
		try {
			TurtlebotmissionFactory theTurtlebotmissionFactory = (TurtlebotmissionFactory)EPackage.Registry.INSTANCE.getEFactory(TurtlebotmissionPackage.eNS_URI);
			if (theTurtlebotmissionFactory != null) {
				return theTurtlebotmissionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TurtlebotmissionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtlebotmissionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TurtlebotmissionPackage.TURTLE_BOT: return createTurtleBot();
			case TurtlebotmissionPackage.AREA: return createArea();
			case TurtlebotmissionPackage.WAYPOINT_TYPE: return createWaypointType();
			case TurtlebotmissionPackage.WAY_POINT: return createWayPoint();
			case TurtlebotmissionPackage.MISSION: return createMission();
			case TurtlebotmissionPackage.LINE_TASK: return createLineTask();
			case TurtlebotmissionPackage.SHORTEST_PATH_TASK: return createShortestPathTask();
			case TurtlebotmissionPackage.RETURN_TO_START_TASK: return createReturnToStartTask();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtleBot createTurtleBot() {
		TurtleBotImpl turtleBot = new TurtleBotImpl();
		return turtleBot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaypointType createWaypointType() {
		WaypointTypeImpl waypointType = new WaypointTypeImpl();
		return waypointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPoint createWayPoint() {
		WayPointImpl wayPoint = new WayPointImpl();
		return wayPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineTask createLineTask() {
		LineTaskImpl lineTask = new LineTaskImpl();
		return lineTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortestPathTask createShortestPathTask() {
		ShortestPathTaskImpl shortestPathTask = new ShortestPathTaskImpl();
		return shortestPathTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnToStartTask createReturnToStartTask() {
		ReturnToStartTaskImpl returnToStartTask = new ReturnToStartTaskImpl();
		return returnToStartTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtlebotmissionPackage getTurtlebotmissionPackage() {
		return (TurtlebotmissionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TurtlebotmissionPackage getPackage() {
		return TurtlebotmissionPackage.eINSTANCE;
	}

} //TurtlebotmissionFactoryImpl
