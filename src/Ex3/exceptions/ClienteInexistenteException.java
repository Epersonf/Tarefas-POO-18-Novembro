package Ex3.exceptions;

public class ClienteInexistenteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClienteInexistenteException(String message) {
		super(message);
	}
}
