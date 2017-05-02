/**
 */
package turtlebotmission.tests;

import junit.textui.TestRunner;

import turtlebotmission.LineTask;
import turtlebotmission.TurtlebotmissionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Line Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LineTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LineTaskTest.class);
	}

	/**
	 * Constructs a new Line Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Line Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LineTask getFixture() {
		return (LineTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TurtlebotmissionFactory.eINSTANCE.createLineTask());
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

} //LineTaskTest
