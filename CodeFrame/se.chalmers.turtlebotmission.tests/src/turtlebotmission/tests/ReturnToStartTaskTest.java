/**
 */
package turtlebotmission.tests;

import junit.textui.TestRunner;

import turtlebotmission.ReturnToStartTask;
import turtlebotmission.TurtlebotmissionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Return To Start Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnToStartTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReturnToStartTaskTest.class);
	}

	/**
	 * Constructs a new Return To Start Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnToStartTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Return To Start Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReturnToStartTask getFixture() {
		return (ReturnToStartTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TurtlebotmissionFactory.eINSTANCE.createReturnToStartTask());
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

} //ReturnToStartTaskTest
