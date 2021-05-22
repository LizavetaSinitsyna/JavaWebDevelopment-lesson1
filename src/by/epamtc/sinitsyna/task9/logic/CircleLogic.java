/*
 * 9. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

package by.epamtc.sinitsyna.task9.logic;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;

public class CircleLogic {
	public static double calculateArea(double radius) throws NonPositiveParameterException {
		if (radius <= 0) {
			throw new NonPositiveParameterException("The radius can't be equal to 0 or negative.");
		}
		return Math.PI * radius * radius;
	}

	public static double calculateCircleLength(double radius) throws NonPositiveParameterException {
		if (radius <= 0) {
			throw new NonPositiveParameterException("The radius can't be equal to 0 or negative.");
		}
		return 2 * Math.PI * radius;
	}
}
