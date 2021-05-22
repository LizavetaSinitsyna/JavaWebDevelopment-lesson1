/*
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */

package by.epamtc.sinitsyna.task4.runner;

import by.epamtc.sinitsyna.input.UserDataInput;
import by.epamtc.sinitsyna.task4.logic.StatementLogic;

public class Main {

	public static void main(String[] args) {
		long a;
		long b;
		long c;
		long d;
		boolean result;
		StatementLogic logic = new StatementLogic();
		UserDataInput input = new UserDataInput();

		a = input.requestLong("Введите a >>");
		b = input.requestLong("Введите b >>");
		c = input.requestLong("Введите c >>");
		d = input.requestLong("Введите d >>");

		result = logic.isAtLeast2Even(a, b, c, d);

		System.out.println(result);

	}

}
