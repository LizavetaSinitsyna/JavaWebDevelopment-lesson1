package by.epamtc.sinitsyna.task6.logic;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import by.epamtc.sinitsyna.exception.NegativeParameterException;

public class TimeLogicTest {
	private TimeLogic logic;

	@Before
	public void initLogic() {
		logic = new TimeLogic();
	}

	@Test
	public void testExtractDays() throws NegativeParameterException {
		long seconds = 2_073_600;
		long expected = 24;
		long actual = logic.extractDays(seconds);
		Assert.assertEquals(expected, actual);

	}

	@Test(expected = NegativeParameterException.class)
	public void testExtractDaysByPassingInvalidSeconds() throws NegativeParameterException {
		long seconds = -2_073_600;
		logic.extractDays(seconds);
	}

	@Test
	public void testExtractHoursForFullDayTime() throws NegativeParameterException {
		long seconds = 86_451;
		long expected = 0;
		long actual = logic.extractHours(seconds);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testExtractHours() throws NegativeParameterException {
		long seconds = 129_651;
		long expected = 12;
		long actual = logic.extractHours(seconds);
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = NegativeParameterException.class)
	public void testExtractHoursByPassingInvalidSeconds() throws NegativeParameterException {
		long seconds = -86_451;
		logic.extractHours(seconds);
	}

	@Test
	public void testExtractMinutes() throws NegativeParameterException {
		long seconds = 3_660;
		long expected = 1;
		long actual = logic.extractMinutes(seconds);
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = NegativeParameterException.class)
	public void testExtractMinutesByPassingInvalidSeconds() throws NegativeParameterException {
		long seconds = -3_660;
		logic.extractMinutes(seconds);
	}

	@Test
	public void testExtractSeconds() throws NegativeParameterException {
		long seconds = 159;
		long expected = 39;
		long actual = logic.extractSeconds(seconds);
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = NegativeParameterException.class)
	public void testExtractSecondsByPassingInvalidSeconds() throws NegativeParameterException {
		long seconds = -159;
		logic.extractSeconds(seconds);
	}

}
