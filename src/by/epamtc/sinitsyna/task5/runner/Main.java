/*
 * 5. Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
 * числу).
 */

package by.epamtc.sinitsyna.task5.runner;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;
import by.epamtc.sinitsyna.input.UserDataInput;
import by.epamtc.sinitsyna.task5.logic.StatementLogic;

public class Main {

	public static void main(String[] args) {
		long number;
		boolean result;
		StatementLogic logic = new StatementLogic();
		UserDataInput input = new UserDataInput();

		number = input.requestLong("Введите натуральное число >>");

		try {
			result = logic.isPerfect(number);
			System.out.println(result);
		} catch (NonPositiveParameterException e) {
			System.out.println(e.getMessage());
		}

	}

}
