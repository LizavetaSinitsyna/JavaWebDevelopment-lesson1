package by.epamtc.sinitsyna.task2.exception;

public class NoSuchMonthException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoSuchMonthException() {
		super();
	}

	public NoSuchMonthException(String message) {
		super(message);
	}

	public NoSuchMonthException(String message, Throwable cause) {
		super(message, cause);
	}
}
