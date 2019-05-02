package fr.pizzeria.exception;

public class SavePizzaException extends StockageException {

	/**
	 * Constructeur
	 * 
	 */
	public SavePizzaException() {
		super();

	}

	/**
	 * Constructeur
	 * 
	 * @param msg
	 */
	public SavePizzaException(String msg) {
		super(msg);

	}

}
