package fr.pizzeria.exception;

/**
 * Classe mère pour les exceptions
 * 
 * @author Cécile Peyras
 *
 */
public class StockageException extends Exception {

	/**
	 * Constructeur
	 * 
	 */
	public StockageException() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param arg0
	 */
	public StockageException(String msg) {
		super(msg);
	}

}
