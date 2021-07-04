/*
 * 3. Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
 * окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */

package by.epamtc.sinitsyna.task3.logic;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;
import by.epamtc.sinitsyna.validation.ValidationHelper;

public class SquareLogic {
	private static final String NEGATIVE_AREA_EXCEPTION_MESSAGE = "The area can't be negative.";
	private static final String NEGATIVE_RADIUS_EXCEPTION_MESSAGE = "The radius can't be negative.";

	/**
	 * Detect the radius of the circle inscribed in square of passed {@code area}.
	 * 
	 * @param area The area of square for inscribed circle of which the radius is
	 *             detected.
	 * @return The radius of the circle inscribed in square of passed {@code area}.
	 * @throws NonPositiveParameterException If the passed {@code area} is negative
	 *                                       or equal to 0.
	 */
	public double retrieveIncircleRadius(double area) throws NonPositiveParameterException {
		if (ValidationHelper.isNegative(area)) {
			throw new NonPositiveParameterException(NEGATIVE_AREA_EXCEPTION_MESSAGE);
		}
		return Math.sqrt(area) / 2;
	}

	/**
	 * Detect the area of the square inscribed in circle of passed {@code radius}.
	 * 
	 * @param radius The radius of circle for inscribed square of which the area is
	 *               detected.
	 * @return The area of the square inscribed in circle of passed {@code radius}.
	 * @throws NonPositiveParameterException If the passed {@code radius} is
	 *                                       negative or equal to 0.
	 */
	public double retrieveInscribedSquareArea(double radius) throws NonPositiveParameterException {
		if (ValidationHelper.isNegative(radius)) {
			throw new NonPositiveParameterException(NEGATIVE_RADIUS_EXCEPTION_MESSAGE);
		}
		return (radius * radius * 2);
	}

	/**
	 * Calculates the difference between passed {@code area1} and {@code area2} in
	 * times.
	 * 
	 * @param area1 The area of one square.
	 * @param area2 The area of another square.
	 * @return The difference between passed {@code area1} and {@code area2} in
	 *         times.
	 * @throws NonPositiveParameterException If the passed {@code area1} or
	 *                                       {@code area2} is negative or equal to
	 *                                       0.
	 */
	public double retrieveAreaDifferenceInTimes(double area1, double area2) throws NonPositiveParameterException {
		if (ValidationHelper.isNegative(area1) || ValidationHelper.isNegative(area2)) {
			throw new NonPositiveParameterException(NEGATIVE_AREA_EXCEPTION_MESSAGE);
		}
		if (ValidationHelper.isZero(area1) || ValidationHelper.isZero(area2)) {
			return 0;
		}
		return area1 / area2;
	}
}
