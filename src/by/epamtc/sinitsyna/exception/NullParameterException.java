package by.epamtc.sinitsyna.exception;

public class NullParameterException extends Exception {

	private static final long serialVersionUID = 1L;

	public NullParameterException() {
		super();
	}

	public NullParameterException(String message) {
		super(message);
	}

	public NullParameterException(String message, Throwable cause) {
		super(message, cause);
	}
}