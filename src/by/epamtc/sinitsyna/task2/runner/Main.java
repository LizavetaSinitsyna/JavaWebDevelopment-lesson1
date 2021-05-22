/*
 * 2. Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
 * месяце и корректно определялись все високосные года.
 */

package by.epamtc.sinitsyna.task2.runner;

import by.epamtc.sinitsyna.input.UserDataInput;
import by.epamtc.sinitsyna.task2.exception.NoSuchMonthException;
import by.epamtc.sinitsyna.task2.logic.CalendarLogic;

public class Main {
	public static void main(String[] args) {
		int month;
		int year;
		int daysInMonth;
		String leap;
		UserDataInput input = new UserDataInput();
		CalendarLogic logic = new CalendarLogic();

		month = input.requestInt("Пожалуйста, введите номер месяца >>");
		year = input.requestInt("Пожалуйста, введите номер года >>");

		leap = logic.isLeapYear(year) ? "високосный" : "невисокосный";
		System.out.printf("Год %s.\n", leap);

		try {
			daysInMonth = logic.retrieveMonthDays(month, year);
			System.out.printf("Количество дней в месяце равно %d.", daysInMonth);
		} catch (NoSuchMonthException e) {
			System.out.println(e.getMessage());
			System.out.println("Введено некорректный номер месяца! Определить количество дней в месяце невозможно.");
		}

	}

}
