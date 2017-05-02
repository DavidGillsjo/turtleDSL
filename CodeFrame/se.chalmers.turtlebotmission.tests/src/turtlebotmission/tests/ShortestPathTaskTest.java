/**
 */
package turtlebotmission.tests;

import junit.textui.TestRunner;

import turtlebotmission.ShortestPathTask;
import turtlebotmission.TurtlebotmissionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shortest Path Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShortestPathTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShortestPathTaskTest.class);
	}

	/**
	 * Constructs a new Shortest Path Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortestPathTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Shortest Path Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ShortestPathTask getFixture() {
		return (ShortestPathTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TurtlebotmissionFactory.eINSTANCE.createShortestPathTask());
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

} //ShortestPathTaskTest
