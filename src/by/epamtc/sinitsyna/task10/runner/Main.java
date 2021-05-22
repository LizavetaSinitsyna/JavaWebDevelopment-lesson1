/*
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
 * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
 * значения функции.
 * F(x) = tg(x)
 */

package by.epamtc.sinitsyna.task10.runner;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;
import by.epamtc.sinitsyna.input.UserDataInput;
import by.epamtc.sinitsyna.task10.bean.ArgumentAndFunctionValuePair;
import by.epamtc.sinitsyna.task10.exception.IncorrectIntervalBoundsException;
import by.epamtc.sinitsyna.task10.logic.FunctionLogic;
import by.epamtc.sinitsyna.task10.presentation.FunctionView;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int h;
		ArgumentAndFunctionValuePair[] result;

		UserDataInput input = new UserDataInput();

		a = input.requestInt("Введите начало отрезка а >>");
		b = input.requestInt("Введите конец отрезка b >>");
		h = input.requestInt("Введите шаг h >>");

		try {
			result = FunctionLogic.calculateFunction(a, b, h);
			FunctionView.printResultTable(result);
		} catch (NonPositiveParameterException | IncorrectIntervalBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
