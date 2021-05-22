/*-
 * Вычислить значение функции:
 * -x * x + 3 * x + 9, если х >= 3;
 * 1 / (x ^ 3) - 6, если х < 3.
 */

package by.epamtc.sinitsyna.task8.runner;

import by.epamtc.sinitsyna.input.UserDataInput;
import by.epamtc.sinitsyna.task8.logic.FunctionLogic;

public class Main {
	public static void main(String[] args) {
		double x;
		UserDataInput input = new UserDataInput();
		FunctionLogic functionLogic = new FunctionLogic();

		x = input.requestDouble("Введите х >>");
		System.out.println("Результат: " + functionLogic.calculateFunction(x));
	}
}
