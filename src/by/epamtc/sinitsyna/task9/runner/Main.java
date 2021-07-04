/*
 * 9. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

package by.epamtc.sinitsyna.task9.runner;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;
import by.epamtc.sinitsyna.input.UserDataInput;
import by.epamtc.sinitsyna.task9.logic.CircleLogic;

public class Main {
	public static void main(String[] args) {
		double radius;
		UserDataInput input = new UserDataInput();

		radius = input.requestDouble("Введите радиус >>");

		try {
			System.out.printf("Длина окружности %f, площадь круга %f.", CircleLogic.calculateCircleLength(radius),
					CircleLogic.calculateCircleArea(radius));
		} catch (NonPositiveParameterException e) {
			System.out.println(e.getMessage());
		}

	}
}
