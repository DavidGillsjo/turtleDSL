/**
 */
package turtlebotmission.tests;

import junit.textui.TestRunner;

import turtlebotmission.TurtleBot;
import turtlebotmission.TurtlebotmissionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Turtle Bot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtleBotTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TurtleBotTest.class);
	}

	/**
	 * Constructs a new Turtle Bot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtleBotTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Turtle Bot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TurtleBot getFixture() {
		return (TurtleBot)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TurtlebotmissionFactory.eINSTANCE.createTurtleBot());
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

} //TurtleBotTest
