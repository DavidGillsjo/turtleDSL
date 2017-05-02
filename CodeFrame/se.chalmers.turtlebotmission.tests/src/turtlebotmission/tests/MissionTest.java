/**
 */
package turtlebotmission.tests;

import junit.textui.TestRunner;

import turtlebotmission.Mission;
import turtlebotmission.TurtlebotmissionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MissionTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MissionTest.class);
	}

	/**
	 * Constructs a new Mission test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mission test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mission getFixture() {
		return (Mission)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TurtlebotmissionFactory.eINSTANCE.createMission());
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

} //MissionTest
