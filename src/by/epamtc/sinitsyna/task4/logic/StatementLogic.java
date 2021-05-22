/*
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */

package by.epamtc.sinitsyna.task4.logic;

public class StatementLogic {
	public boolean isEven(long number) {
		return number % 2 == 0;
	}

	public boolean isAtLeast2Even(long... array) {
		int evenCounter = 0;

		for (long element : array) {
			evenCounter += isEven(element) ? 1 : 0;
		}

		return evenCounter >= 2;

	}
}
