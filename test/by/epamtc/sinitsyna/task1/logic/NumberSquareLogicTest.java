package by.epamtc.sinitsyna.task1.logic;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class NumberSquareLogicTest {
	private NumberSquareLogic logic;

	@Before
	public void initLogic() {
		logic = new NumberSquareLogic();
	}

	@Test
	public void testDetectLastDigitOfNumberSquareByPassingPositiveNumber() {
		int number = 526;
		int expected = 6;
		int actual = logic.detectLastDigitOfNumberSquare(number);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testDetectLastDigitOfNumberSquareByPassingNegativeNumber() {
		int number = -527;
		int expected = 9;
		int actual = logic.detectLastDigitOfNumberSquare(number);
		Assert.assertEquals(expected, actual);
	}

}
