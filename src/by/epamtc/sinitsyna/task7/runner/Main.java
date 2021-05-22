/*
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
 * ближе к началу координат. x y.
 */

package by.epamtc.sinitsyna.task7.runner;

import by.epamtc.sinitsyna.input.UserDataInput;
import by.epamtc.sinitsyna.task7.bean.Point;
import by.epamtc.sinitsyna.task7.logic.PointLogic;
import by.epamtc.sinitsyna.task7.presentation.PointView;

public class Main {
	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		Point point1;
		Point point2;
		Point result;
		UserDataInput input = new UserDataInput();
		PointLogic logic = new PointLogic();
		PointView view = new PointView();

		x1 = input.requestDouble("Введите x1 >>");
		y1 = input.requestDouble("Введите y1 >>");
		x2 = input.requestDouble("Введите x2 >>");
		y2 = input.requestDouble("Введите y2 >>");

		point1 = new Point(x1, y1);
		point2 = new Point(x2, y2);

		result = logic.retrieveClosestToOriginPoint(point1, point2);

		System.out.println("Ближе к началу координат находится точка с кординатами " + view.retrievePointForPrint(result) + ".");

	}

}
