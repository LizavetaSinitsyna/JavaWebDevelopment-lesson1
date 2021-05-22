/*
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
 * ближе к началу координат. x y.
 */

package by.epamtc.sinitsyna.task7.presentation;

import by.epamtc.sinitsyna.task7.bean.Point;

public class PointView {
	public String retrievePointForPrint(Point point) {
		return String.format("(%f, %f)", point.getX(), point.getY());
	}
}
