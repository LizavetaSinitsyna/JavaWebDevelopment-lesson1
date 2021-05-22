/*
 * 1. Написать программу, позволяющую по последней цифре числа определить последнюю цифру его
 * квадрата.
*/

package by.epamtc.sinitsyna.task1.logic;

public class NumberSquareLogic {
	private final int[] lastDigitsOfSquares = new int[] { 0, 1, 4, 9, 6, 5, 6, 9, 4, 1 };

	public int detectLastDigitOfNumberSquare(int number) {
		int lastDigitOfNumber = Math.abs(number % 10);
		return lastDigitsOfSquares[lastDigitOfNumber];

	}

}
