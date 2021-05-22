package by.epamtc.sinitsyna.exception;

public class NonPositiveParameterException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public NonPositiveParameterException() {
		super();
	}

	public NonPositiveParameterException(String message) {
		super(message);
	}

	public NonPositiveParameterException(String message, Throwable cause) {
		super(message, cause);
	}
}
