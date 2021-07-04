/*
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
 * ближе к началу координат. x y.
 */

package by.epamtc.sinitsyna.task7.logic;

import by.epamtc.sinitsyna.exception.NullParameterException;
import by.epamtc.sinitsyna.task7.bean.Point;
import by.epamtc.sinitsyna.validation.ValidationHelper;

public class PointLogic {
	private static final String NULL_POINT_EXCEPTION_MESSAGE = "Point can't be equal to null.";

	public double calculateSquaredLengthBetween2Points(Point point1, Point point2) throws NullParameterException {
		if (ValidationHelper.isNull(point1) || ValidationHelper.isNull(point2)) {
			throw new NullParameterException(NULL_POINT_EXCEPTION_MESSAGE);
		}
		return Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2);
	}

	public Point retrieveClosestToOriginPoint(Point point1, Point point2) throws NullParameterException {
		if (ValidationHelper.isNull(point1) || ValidationHelper.isNull(point2)) {
			throw new NullParameterException(NULL_POINT_EXCEPTION_MESSAGE);
		}
		Point origin = new Point(0, 0);
		return calculateSquaredLengthBetween2Points(point1, origin) < calculateSquaredLengthBetween2Points(point2,
				origin) ? point1 : point2;

	}
}
