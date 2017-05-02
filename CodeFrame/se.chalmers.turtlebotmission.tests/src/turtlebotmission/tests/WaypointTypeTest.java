/**
 */
package turtlebotmission.tests;

import junit.textui.TestRunner;

import turtlebotmission.TurtlebotmissionFactory;
import turtlebotmission.WaypointType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Waypoint Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaypointTypeTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WaypointTypeTest.class);
	}

	/**
	 * Constructs a new Waypoint Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaypointTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Waypoint Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WaypointType getFixture() {
		return (WaypointType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TurtlebotmissionFactory.eINSTANCE.createWaypointType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WaypointTypeTest
