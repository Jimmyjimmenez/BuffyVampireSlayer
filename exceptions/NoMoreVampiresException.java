package exceptions;

public class NoMoreVampiresException extends CommandExecuteException {

	private static final long serialVersionUID = 1L;

	public NoMoreVampiresException() {
		super();
	}
	
	public NoMoreVampiresException(String message) {
		super(message);
	}
	
	public NoMoreVampiresException(Throwable cause) {
		super(cause);
	}
	
	public NoMoreVampiresException(String message, Throwable cause) {
		super(message, cause);
	}
}
