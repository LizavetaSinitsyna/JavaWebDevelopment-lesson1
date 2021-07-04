package by.epamtc.sinitsyna.validation;

public class ValidationHelper {
	public static boolean isNegativeOrZero(double number) {
		return isNegative(number) || isZero(number);
	}

	public static boolean isNegative(double number) {
		return number < 0;
	}

	public static boolean isZero(double number) {
		return number == 0;
	}

	public static boolean isNull(Object object) {
		return object == null;
	}

}
