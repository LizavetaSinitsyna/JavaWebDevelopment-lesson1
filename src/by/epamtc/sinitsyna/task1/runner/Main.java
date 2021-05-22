/*
 * 1. Написать программу, позволяющую по последней цифре числа определить последнюю цифру его
 * квадрата.
*/

package by.epamtc.sinitsyna.task1.runner;

import by.epamtc.sinitsyna.input.UserDataInput;
import by.epamtc.sinitsyna.task1.logic.NumberSquareLogic;

public class Main {

	public static void main(String[] args) {
		int number;
		int result;
		UserDataInput input = new UserDataInput();
		NumberSquareLogic logic = new NumberSquareLogic();

		number = input.requestInt("Пожалуйста, введите целое число >>");
		result = logic.detectLastDigitOfNumberSquare(number);

		System.out.printf("Последняя цифра квадрата числа %d равна %d.", number, result);

	}

}
