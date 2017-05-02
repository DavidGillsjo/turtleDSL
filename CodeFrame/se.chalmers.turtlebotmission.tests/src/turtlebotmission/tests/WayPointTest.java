/**
 */
package turtlebotmission.tests;

import junit.textui.TestRunner;

import turtlebotmission.TurtlebotmissionFactory;
import turtlebotmission.WayPoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Way Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WayPointTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WayPointTest.class);
	}

	/**
	 * Constructs a new Way Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Way Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WayPoint getFixture() {
		return (WayPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TurtlebotmissionFactory.eINSTANCE.createWayPoint());
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

} //WayPointTest
