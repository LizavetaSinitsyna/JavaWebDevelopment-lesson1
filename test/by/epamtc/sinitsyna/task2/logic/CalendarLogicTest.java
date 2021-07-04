package by.epamtc.sinitsyna.task2.logic;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import by.epamtc.sinitsyna.task2.exception.NoSuchMonthException;

public class CalendarLogicTest {
	private CalendarLogic logic;

	@Before
	public void initLogic() {
		logic = new CalendarLogic();
	}

	@Test
	public void testIsLeapYearByPassingLeapYear() {
		int year = 2000;
		boolean actual = logic.isLeapYear(year);
		Assert.assertTrue(actual);
	}

	@Test
	public void testIsLeapYearByPassingNegativeNonLeapYear() {
		int year = -2017;
		boolean actual = logic.isLeapYear(year);
		Assert.assertFalse(actual);
	}

	@Test
	public void testRetrieveMonthDaysByPassingFebruaryMonthValueInNegativeLeapYear() throws NoSuchMonthException {
		int year = -2020;
		int month = 2;
		int expected = 29;
		int actual = logic.retrieveMonthDays(month, year);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testRetrieveMonthDaysByPassingFebruaryMonthValueInPositiveNonLeapYear() throws NoSuchMonthException {
		int year = 2100;
		int month = 2;
		int expected = 28;
		int actual = logic.retrieveMonthDays(month, year);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testRetrieveMonthDaysByPassingNotFebruaryMonthValueInLeapYear() throws NoSuchMonthException {
		int year = 1996;
		int month = 3;
		int expected = 31;
		int actual = logic.retrieveMonthDays(month, year);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testRetrieveMonthDaysByPassingNotFebruaryMonthValueInNonLeapYear() throws NoSuchMonthException {
		int year = 1998;
		int month = 6;
		int expected = 30;
		int actual = logic.retrieveMonthDays(month, year);
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = NoSuchMonthException.class)
	public void testRetrieveMonthDaysByPassingNegativeMonthValue() throws NoSuchMonthException {
		int year = 2100;
		int month = -2;
		logic.retrieveMonthDays(month, year);
	}

	@Test(expected = NoSuchMonthException.class)
	public void testRetrieveMonthDaysByPassingInvalidPositiveMonthValue() throws NoSuchMonthException {
		int year = 2100;
		int month = 13;
		logic.retrieveMonthDays(month, year);
	}

}
