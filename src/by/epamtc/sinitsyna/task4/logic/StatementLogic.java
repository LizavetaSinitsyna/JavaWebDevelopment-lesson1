/*
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */

package by.epamtc.sinitsyna.task4.logic;

public class StatementLogic {
	private boolean isEven(long number) {
		return number % 2 == 0;
	}

	public boolean isAtLeast2Even(long a, long b, long c, long d) {
		int evenCounter = 0;

		evenCounter += isEven(a) ? 1 : 0;
		evenCounter += isEven(b) ? 1 : 0;
		evenCounter += isEven(c) ? 1 : 0;
		evenCounter += isEven(d) ? 1 : 0;

		return evenCounter >= 2;

	}
}
