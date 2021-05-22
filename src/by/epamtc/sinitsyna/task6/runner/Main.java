/*
 * Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
 * моменту.
 */

package by.epamtc.sinitsyna.task6.runner;

import by.epamtc.sinitsyna.exception.NegativeParameterException;
import by.epamtc.sinitsyna.input.UserDataInput;
import by.epamtc.sinitsyna.task6.logic.TimeLogic;

public class Main {
	public static void main(String[] args) {
		long seconds;
		TimeLogic logic = new TimeLogic();
		UserDataInput input = new UserDataInput();

		seconds = input.requestLong("Введите количество секунд >>");

		try {
			System.out.printf("К указанному моменту прошло %d сут., %d ч., %d мин., %d сек.", logic.retrieveDays(seconds),
					logic.retrieveHours(seconds), logic.retrieveMinutes(seconds), logic.retrieveOnlySeconds(seconds));
		} catch (NegativeParameterException e) {
			System.out.println(e.getMessage());
		}

	}
}
