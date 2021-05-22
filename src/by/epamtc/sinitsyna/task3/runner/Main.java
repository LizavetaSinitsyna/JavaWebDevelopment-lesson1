/*
 * 3. Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
 * окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */

package by.epamtc.sinitsyna.task3.runner;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;
import by.epamtc.sinitsyna.input.UserDataInput;
import by.epamtc.sinitsyna.task3.logic.SquareLogic;

public class Main {
	public static void main(String[] args) {
		double squareArea;
		double radius;
		double inscribedSquareArea;
		double areaDif;
		SquareLogic logic = new SquareLogic();
		UserDataInput input = new UserDataInput();

		squareArea = input.requestDouble("Пожалуйста, введите площадь квадрата, в который вписана окружность >>");

		try {
			radius = logic.retrieveIncircleRadius(squareArea);
			inscribedSquareArea = logic.retrieveInscribedSquareArea(radius);
			areaDif = logic.retrieveAreaDifferenceInTimes(squareArea, inscribedSquareArea);

			System.out.printf(
					"Площадь квадрата, вписанного в окружность, которая вписана в квадрат площадью %.2f, равна %.2f.\n"
							+ "Площадь вписанного квадрата меньше площади заданного в %.2f раза.",
					squareArea, inscribedSquareArea, areaDif);
		} catch (NonPositiveParameterException e) {
			System.out.println(e.getMessage());
		}

	}
}
