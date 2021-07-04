/*
 * 9. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

package by.epamtc.sinitsyna.task9.logic;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;
import by.epamtc.sinitsyna.validation.ValidationHelper;

public class CircleLogic {
	private static final String NEGATIVE_RADIUS_EXCEPTION_MESSAGE = "The radius can't be negative.";

	public static double calculateCircleArea(double radius) throws NonPositiveParameterException {
		if (ValidationHelper.isNegative(radius)) {
			throw new NonPositiveParameterException(NEGATIVE_RADIUS_EXCEPTION_MESSAGE);
		}
		return Math.PI * radius * radius;
	}

	public static double calculateCircleLength(double radius) throws NonPositiveParameterException {
		if (ValidationHelper.isNegative(radius)) {
			throw new NonPositiveParameterException(NEGATIVE_RADIUS_EXCEPTION_MESSAGE);
		}
		return 2 * Math.PI * radius;
	}
}
