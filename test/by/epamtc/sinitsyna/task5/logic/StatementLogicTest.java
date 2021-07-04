package by.epamtc.sinitsyna.task5.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;

public class StatementLogicTest {
	private StatementLogic logic;

	@Before
	public void initLogic() {
		logic = new StatementLogic();
	}

	@Test
	public void testIsPerfectByPassingPerfectNumber() throws NonPositiveParameterException {
		long number = 33_550_336;
		boolean actual = logic.isPerfect(number);
		Assert.assertTrue(actual);
	}

	@Test
	public void testIsPerfectByPassingNonPerfectNumber() throws NonPositiveParameterException {
		long number = 33;
		boolean actual = logic.isPerfect(number);
		Assert.assertFalse(actual);
	}

	@Test(expected = NonPositiveParameterException.class)
	public void testIsPerfectByPassingInvalidNumber() throws NonPositiveParameterException {
		long number = -3;
		logic.isPerfect(number);
	}

}
