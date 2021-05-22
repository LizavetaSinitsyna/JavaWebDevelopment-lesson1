/*
 * 2. Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
 * месяце и корректно определялись все високосные года.
 */

package by.epamtc.sinitsyna.task2.logic;

import by.epamtc.sinitsyna.task2.exception.NoSuchMonthException;

public class CalendarLogic {
	private final int[] daysInMonth = new int[] { 29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
	}

	public int retrieveMonthDays(int month, int year) throws NoSuchMonthException {
		if (month < 1 || month > 12) {
			throw new NoSuchMonthException("The amount of months must be in range [1; 12].");
		}

		if (month == 2 && isLeapYear(year)) {
			return daysInMonth[0];
		}
		return daysInMonth[month];
	}

}
