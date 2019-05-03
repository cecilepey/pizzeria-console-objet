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
	 *            scanner qui permet d'interagir avec l'utilisateur
	 * @param dao
	 *            gère la persistence des pizzas
	 * @throws StockageException
	 *             si l'utilisateur saisit une information incorrecte lors de
	 *             l'exécution d'un cas d'utilisation
	 */
	public abstract void executeUC(Scanner scanner, IPizzaDao dao) throws StockageException;

}
