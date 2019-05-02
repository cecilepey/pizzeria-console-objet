package fr.pizzeria.exception;

public class UpdatePizzaException extends StockageException {

	/**
	 * Constructeur
	 * 
	 */
	public UpdatePizzaException() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param msg
	 */
	public UpdatePizzaException(String msg) {
		super(msg);
	}

}
