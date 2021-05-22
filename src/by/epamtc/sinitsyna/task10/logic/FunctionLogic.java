/*
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
 * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
 * значения функции.
 * F(x) = tg(x)
 */

package by.epamtc.sinitsyna.task10.logic;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;
import by.epamtc.sinitsyna.task10.bean.ArgumentAndFunctionValuePair;
import by.epamtc.sinitsyna.task10.exception.IncorrectIntervalBoundsException;

public class FunctionLogic {

	public static ArgumentAndFunctionValuePair[] calculateFunction(int a, int b, int h)
			throws NonPositiveParameterException, IncorrectIntervalBoundsException {
		if (h <= 0) {
			throw new NonPositiveParameterException("h can't be equal to 0 or negative.");
		}

		if (a >= b) {
			throw new IncorrectIntervalBoundsException("b can't be less than or equal to a.");
		}

		ArgumentAndFunctionValuePair[] result = new ArgumentAndFunctionValuePair[(b - a) / h + 1];
		int arrayIterator = 0;

		for (int i = a; i <= b && arrayIterator < result.length; i += h) {
			result[arrayIterator] = new ArgumentAndFunctionValuePair(i, Math.tan(i));
			arrayIterator++;
		}

		return result;
	}

}
