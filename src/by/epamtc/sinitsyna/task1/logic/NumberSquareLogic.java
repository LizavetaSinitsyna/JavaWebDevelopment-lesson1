/*
 * 1. Написать программу, позволяющую по последней цифре числа определить последнюю цифру его
 * квадрата.
*/

package by.epamtc.sinitsyna.task1.logic;

/**
 * The class contains methods for working with number's square.
 * 
 * @author Lizaveta Sinitsyna
 * @version 1.0
 */
public class NumberSquareLogic {
	/**
	 * Contains all possible last digits of square in accordance with the last digit
	 * of passed number.
	 */
	private final int[] lastDigitsOfSquares = new int[] { 0, 1, 4, 9, 6, 5, 6, 9, 4, 1 };

	/**
	 * Detect the last digit of number's square.
	 * 
	 * @param number the {@code number} for square of which the last digit is
	 *               detected
	 * @return the last digit of passed number's square
	 */
	public int detectLastDigitOfNumberSquare(int number) {
		int lastDigitOfNumber = Math.abs(number % 10);
		return lastDigitsOfSquares[lastDigitOfNumber];

	}

}
