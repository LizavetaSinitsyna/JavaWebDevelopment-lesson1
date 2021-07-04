package by.epamtc.sinitsyna.input;

import java.util.Scanner;

public class UserDataInput {
	private Scanner scanner = new Scanner(System.in);

	public int requestInt(String message) {

		int number;

		System.out.println(message);

		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println(message);
		}

		number = scanner.nextInt();
		scanner.nextLine();

		return number;
	}

	public long requestLong(String message) {

		long number;

		System.out.println(message);

		while (!scanner.hasNextLong()) {
			scanner.nextLine();
			System.out.println(message);
		}

		number = scanner.nextLong();
		scanner.nextLine();

		return number;
	}

	public double requestDouble(String message) {

		double number;

		do {
			System.out.println(message);

			while (!scanner.hasNextDouble()) {
				scanner.nextLine();
				System.out.println(message);
			}

			number = scanner.nextDouble();
			scanner.nextLine();
		} while (!сheckDoubleValidation(number));

		return number;
	}

	public boolean сheckDoubleValidation(double value) {

		if (value > Double.MAX_VALUE || value < -Double.MAX_VALUE) {
			return false;
		}
		return true;
	}

}
