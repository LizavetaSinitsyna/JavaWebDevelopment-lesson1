/*
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
 * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
 * значения функции.
 * F(x) = tg(x)
 */

package by.epamtc.sinitsyna.task10.presentation;

import by.epamtc.sinitsyna.task10.bean.ArgumentAndFunctionValuePair;

public class FunctionView {

	public static void printResultTable(ArgumentAndFunctionValuePair[] table) {
		if (table.length == 0) {
			System.out.println("Таблица пуста, данные для отображения отсутствуют");
			return;
		}
		System.out.println("+-------------+--------------------+");
		System.out.println("|  Аргумент   +  Значение функции  +");
		System.out.println("+-------------+--------------------+");

		for (int i = 0; i < table.length; i++) {
			System.out.format("| %- 11d | %- 18f |%n", table[i].getX(), table[i].getY());
		}

		System.out.println("+-------------+--------------------+");
	}
}
