/*
 * 2. Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
 * месяце и корректно определялись все високосные года.
 */

package by.epamtc.sinitsyna.task2.logic;

import by.epamtc.sinitsyna.task2.exception.NoSuchMonthException;

/**
 * The class contains methods for working with date.
 * 
 * @author Lizaveta Sinitsyna
 * @version 1.0
 */
public class CalendarLogic {
	/**
	 * Coefficient for {@code isLeapYear()} method calculation.
	 */
	private static final int FOUR_YEARS = 4;
	/**
	 * Coefficient for {@code isLeapYear()} method calculation.
	 */
	private static final int HUNDRED_YEARS = 100;
	/**
	 * Coefficient for {@code isLeapYear()} method calculation.
	 */
	private static final int FOUR_HUNDRED_YEARS = 400;
	/**
	 * Minimum month value.
	 */
	private static final int MIN_MONTH_VALUE = 1;
	/**
	 * Maximum month value.
	 */
	private static final int MAX_MONTH_VALUE = 12;
	/**
	 * February month value.
	 */
	private static final int FEBRUARY_VALUE = 2;
	/**
	 * Days amount for each month in accordance with {@code daysInMonth} array
	 * indices. The index 0 of the array contains amount of days for February in
	 * leap year.
	 */
	private final int[] daysInMonth = new int[] { 29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	/**
	 * Detects whether the passed {@code year} is leap or not.
	 * 
	 * @param year the year for which leap check is performed
	 * @return {@code true} if the passed {@code year} is leap or {@code false} in
	 *         other case
	 */
	public boolean isLeapYear(int year) {
		return (year % FOUR_YEARS == 0) && (year % HUNDRED_YEARS != 0) || (year % FOUR_HUNDRED_YEARS == 0);
	}

	public int retrieveMonthDays(int month, int year) throws NoSuchMonthException {
		if (month < MIN_MONTH_VALUE || month > MAX_MONTH_VALUE) {
			throw new NoSuchMonthException("The amount of months must be in range [1; 12].");
		}

		if (month == FEBRUARY_VALUE && isLeapYear(year)) {
			return daysInMonth[0];
		}
		return daysInMonth[month];
	}

}
