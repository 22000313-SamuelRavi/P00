import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubstract() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);

		int expected = 3087;
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiple() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);

		int expected = 5332114;
		assertEquals(expected, actual);
	}

	@Test
	public void testDevide() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.devide(a, b);

		int expected = 3;
		assertEquals(expected, actual);
	}

	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
