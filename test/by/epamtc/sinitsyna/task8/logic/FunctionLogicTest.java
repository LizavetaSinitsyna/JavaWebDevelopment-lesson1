package by.epamtc.sinitsyna.task8.logic;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class FunctionLogicTest {
	private FunctionLogic logic;

	@Before
	public void initLogic() {
		logic = new FunctionLogic();
	}

	@Test
	public void testCalculateFunctionWhenParameterIsLargerThan3() {
		double number = 4;
		double expected = 5;
		double actual = logic.calculateFunction(number);
		Assert.assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testCalculateFunctionWhenParameterIsEqualTo3() {
		double number = 3;
		double expected = 9;
		double actual = logic.calculateFunction(number);
		Assert.assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testCalculateFunctionWhenParameterIsLessThan3() {
		double number = -3;
		double expected = -0.03030303;
		double actual = logic.calculateFunction(number);
		Assert.assertEquals(expected, actual, 0.0001);
	}

}
