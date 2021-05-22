/*
 * 5. Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
 * числу).
 */

package by.epamtc.sinitsyna.task5.logic;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;

public class StatementLogic {
	public boolean isPerfect(long number) throws NonPositiveParameterException {
		if (number < 1) {
			throw new NonPositiveParameterException("The number isn't natural.");
		}
		int divisorsSum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				divisorsSum += i;
			}
		}
		return divisorsSum == number;
	}

}
