package by.epamtc.sinitsyna.task4.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StatementLogicTest {
	StatementLogic logic;

	@Before
	public void initLogic() {
		logic = new StatementLogic();
	}

	@Test
	public void testIsAtLeast2EvenByPassingTwoEvenNumbers() {
		long a = 4;
		long b = 3;
		long c = 5;
		long d = 6;
		boolean actual = logic.isAtLeast2Even(a, b, c, d);
		Assert.assertTrue(actual);
	}

	@Test
	public void testIsAtLeast2EvenByPassingThreeNegativeEvenNumbers() {
		long a = -6;
		long b = -4;
		long c = -8;
		long d = 3;
		boolean actual = logic.isAtLeast2Even(a, b, c, d);
		Assert.assertTrue(actual);
	}

	@Test
	public void testIsAtLeast2EvenByPassingOneNegativeEvenNumbers() {
		long a = 3;
		long b = 5;
		long c = 7;
		long d = -6;
		boolean actual = logic.isAtLeast2Even(a, b, c, d);
		Assert.assertFalse(actual);
	}

}
