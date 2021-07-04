/*
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
 * ближе к началу координат. x y.
 */

package by.epamtc.sinitsyna.task7.presentation;

import by.epamtc.sinitsyna.exception.NullParameterException;
import by.epamtc.sinitsyna.task7.bean.Point;
import by.epamtc.sinitsyna.validation.ValidationHelper;

public class PointView {
	public String printPoint(Point point) throws NullParameterException {
		if (ValidationHelper.isNull(point)) {
			throw new NullParameterException("Point can't be equal to null.");
		}
		return String.format("(%f, %f)", point.getX(), point.getY());
	}
}
