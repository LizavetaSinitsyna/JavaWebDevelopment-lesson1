package by.epamtc.sinitsyna.task10.exception;

public class IncorrectIntervalBoundsException extends Exception {

	private static final long serialVersionUID = 1L;

	public IncorrectIntervalBoundsException() {
		super();
	}

	public IncorrectIntervalBoundsException(String message) {
		super(message);
	}

	public IncorrectIntervalBoundsException(String message, Throwable cause) {
		super(message, cause);
	}
}