/*
 * Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
 * моменту.
 */

package by.epamtc.sinitsyna.task6.logic;

import by.epamtc.sinitsyna.exception.NegativeParameterException;

public class TimeLogic {
	private static final int HOURS_PER_DAY = 24;
	private static final int MINUTES_PER_HOUR = 60;
	private static final int SECONDS_PER_MINUTE = 60;
	private static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
	private static final int SECONDS_PER_DAY = SECONDS_PER_HOUR * HOURS_PER_DAY;

	public long retrieveDays(long seconds) throws NegativeParameterException {
		if (seconds < 0) {
			throw new NegativeParameterException("Seconds can't be less than 0.");
		}
		return seconds / SECONDS_PER_DAY;
	}

	public int retrieveHours(long seconds) throws NegativeParameterException {
		if (seconds < 0) {
			throw new NegativeParameterException("Seconds can't be less than 0.");
		}
		int restOfSeconds = (int) (seconds - retrieveDays(seconds) * SECONDS_PER_DAY);
		return restOfSeconds / SECONDS_PER_HOUR;

	}

	public int retrieveMinutes(long seconds) throws NegativeParameterException {
		if (seconds < 0) {
			throw new NegativeParameterException("Seconds can't be less than 0.");
		}
		int restOfSeconds = (int) (seconds - retrieveDays(seconds) * SECONDS_PER_DAY) - retrieveHours(seconds) * SECONDS_PER_HOUR;
		return restOfSeconds / SECONDS_PER_MINUTE;
	}

	public int retrieveOnlySeconds(long seconds) throws NegativeParameterException {
		if (seconds < 0) {
			throw new NegativeParameterException("Seconds can't be less than 0.");
		}
		return (int) (seconds % SECONDS_PER_MINUTE);
	}
}
