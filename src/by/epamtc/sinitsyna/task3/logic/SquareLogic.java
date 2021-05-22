/*
 * 3. Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
 * окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */

package by.epamtc.sinitsyna.task3.logic;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;

public class SquareLogic {
	public double retrieveIncircleRadius(double area) throws NonPositiveParameterException {
		if (area <= 0) {
			throw new NonPositiveParameterException("The area can't be equal to 0 or negative.");
		}
		return Math.sqrt(area) / 2;
	}

	public double retrieveInscribedSquareArea(double radius) throws NonPositiveParameterException {
		if (radius <= 0) {
			throw new NonPositiveParameterException("The radius can't be equal to 0 or negative.");
		}
		return (radius * radius * 2);
	}

	public double retrieveAreaDifferenceInTimes(double area1, double area2) throws NonPositiveParameterException {
		if (area1 <= 0 || area2 <= 0) {
			throw new NonPositiveParameterException("The area can't be equal to 0 or negative.");
		}
		return area1 / area2;
	}
}
