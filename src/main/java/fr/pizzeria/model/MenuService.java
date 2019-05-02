/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

import fr.pizzeria.exception.StockageException;

/**
 * Classe qui appelle la dao pour faire une action sur la liste des pizza
 * 
 * @author Cécile Peyras
 *
 */
public abstract class MenuService {

	/**
	 * Méthode qui appelle la dao pour faire une action sur la liste des pizza
	 * UC : Use Case
	 * 
	 * @param scanner
	 * @param dao
	 * @throws StockageException
	 */
	public abstract void executeUC(Scanner scanner, IPizzaDao dao) throws StockageException;

}
