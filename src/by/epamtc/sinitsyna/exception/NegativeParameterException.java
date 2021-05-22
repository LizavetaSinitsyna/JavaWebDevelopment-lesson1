package by.epamtc.sinitsyna.exception;

public class NegativeParameterException extends Exception {

	private static final long serialVersionUID = 1L;

	public NegativeParameterException() {
		super();
	}

	public NegativeParameterException(String message) {
		super(message);
	}

	public NegativeParameterException(String message, Throwable cause) {
		super(message, cause);
	}
}
