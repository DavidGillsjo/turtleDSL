/**
 */
package turtlebotmission.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import turtlebotmission.Area;
import turtlebotmission.LineTask;
import turtlebotmission.Mission;
import turtlebotmission.NamedElement;
import turtlebotmission.ReturnToStartTask;
import turtlebotmission.ShortestPathTask;
import turtlebotmission.Task;
import turtlebotmission.TurtleBot;
import turtlebotmission.TurtlebotmissionFactory;
import turtlebotmission.TurtlebotmissionPackage;
import turtlebotmission.WayPoint;
import turtlebotmission.WaypointType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtlebotmissionPackageImpl extends EPackageImpl implements TurtlebotmissionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turtleBotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waypointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wayPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortestPathTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnToStartTaskEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see turtlebotmission.TurtlebotmissionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TurtlebotmissionPackageImpl() {
		super(eNS_URI, TurtlebotmissionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TurtlebotmissionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TurtlebotmissionPackage init() {
		if (isInited) return (TurtlebotmissionPackage)EPackage.Registry.INSTANCE.getEPackage(TurtlebotmissionPackage.eNS_URI);

		// Obtain or create and register package
		TurtlebotmissionPackageImpl theTurtlebotmissionPackage = (TurtlebotmissionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TurtlebotmissionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TurtlebotmissionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTurtlebotmissionPackage.createPackageContents();

		// Initialize created meta-data
		theTurtlebotmissionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTurtlebotmissionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TurtlebotmissionPackage.eNS_URI, theTurtlebotmissionPackage);
		return theTurtlebotmissionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurtleBot() {
		return turtleBotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Area() {
		return (EReference)turtleBotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Waypointtypes() {
		return (EReference)turtleBotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Bot_start() {
		return (EReference)turtleBotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Waypoints() {
		return (EReference)turtleBotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Missions() {
		return (EReference)turtleBotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArea_Xmax() {
		return (EAttribute)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArea_Ymax() {
		return (EAttribute)areaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaypointType() {
		return waypointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWayPoint() {
		return wayPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWayPoint_Coord_x() {
		return (EAttribute)wayPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWayPoint_Coord_y() {
		return (EAttribute)wayPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWayPoint_Waypointtypes() {
		return (EReference)wayPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMission() {
		return missionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_Task() {
		return (EReference)missionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineTask() {
		return lineTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineTask_Waypoints() {
		return (EReference)lineTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortestPathTask() {
		return shortestPathTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortestPathTask_Waypoints() {
		return (EReference)shortestPathTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnToStartTask() {
		return returnToStartTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtlebotmissionFactory getTurtlebotmissionFactory() {
		return (TurtlebotmissionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		turtleBotEClass = createEClass(TURTLE_BOT);
		createEReference(turtleBotEClass, TURTLE_BOT__AREA);
		createEReference(turtleBotEClass, TURTLE_BOT__WAYPOINTTYPES);
		createEReference(turtleBotEClass, TURTLE_BOT__BOT_START);
		createEReference(turtleBotEClass, TURTLE_BOT__WAYPOINTS);
		createEReference(turtleBotEClass, TURTLE_BOT__MISSIONS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		areaEClass = createEClass(AREA);
		createEAttribute(areaEClass, AREA__XMAX);
		createEAttribute(areaEClass, AREA__YMAX);

		waypointTypeEClass = createEClass(WAYPOINT_TYPE);

		wayPointEClass = createEClass(WAY_POINT);
		createEAttribute(wayPointEClass, WAY_POINT__COORD_X);
		createEAttribute(wayPointEClass, WAY_POINT__COORD_Y);
		createEReference(wayPointEClass, WAY_POINT__WAYPOINTTYPES);

		missionEClass = createEClass(MISSION);
		createEReference(missionEClass, MISSION__TASK);

		taskEClass = createEClass(TASK);

		lineTaskEClass = createEClass(LINE_TASK);
		createEReference(lineTaskEClass, LINE_TASK__WAYPOINTS);

		shortestPathTaskEClass = createEClass(SHORTEST_PATH_TASK);
		createEReference(shortestPathTaskEClass, SHORTEST_PATH_TASK__WAYPOINTS);

		returnToStartTaskEClass = createEClass(RETURN_TO_START_TASK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		turtleBotEClass.getESuperTypes().add(this.getNamedElement());
		waypointTypeEClass.getESuperTypes().add(this.getNamedElement());
		wayPointEClass.getESuperTypes().add(this.getNamedElement());
		missionEClass.getESuperTypes().add(this.getNamedElement());
		lineTaskEClass.getESuperTypes().add(this.getTask());
		shortestPathTaskEClass.getESuperTypes().add(this.getTask());
		returnToStartTaskEClass.getESuperTypes().add(this.getTask());

		// Initialize classes, features, and operations; add parameters
		initEClass(turtleBotEClass, TurtleBot.class, "TurtleBot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurtleBot_Area(), this.getArea(), null, "area", null, 1, 1, TurtleBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Waypointtypes(), this.getWaypointType(), null, "waypointtypes", null, 1, -1, TurtleBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Bot_start(), this.getWayPoint(), null, "bot_start", null, 1, 1, TurtleBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Waypoints(), this.getWayPoint(), null, "waypoints", null, 1, -1, TurtleBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Missions(), this.getMission(), null, "missions", null, 0, -1, TurtleBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArea_Xmax(), ecorePackage.getEInt(), "xmax", null, 0, 1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArea_Ymax(), ecorePackage.getEInt(), "ymax", null, 0, 1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waypointTypeEClass, WaypointType.class, "WaypointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wayPointEClass, WayPoint.class, "WayPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWayPoint_Coord_x(), ecorePackage.getEInt(), "coord_x", null, 0, 1, WayPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWayPoint_Coord_y(), ecorePackage.getEInt(), "coord_y", null, 0, 1, WayPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWayPoint_Waypointtypes(), this.getWaypointType(), null, "waypointtypes", null, 1, -1, WayPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMission_Task(), this.getTask(), null, "task", null, 1, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineTaskEClass, LineTask.class, "LineTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLineTask_Waypoints(), this.getWayPoint(), null, "waypoints", null, 1, -1, LineTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortestPathTaskEClass, ShortestPathTask.class, "ShortestPathTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShortestPathTask_Waypoints(), this.getWayPoint(), null, "waypoints", null, 1, -1, ShortestPathTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnToStartTaskEClass, ReturnToStartTask.class, "ReturnToStartTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TurtlebotmissionPackageImpl
