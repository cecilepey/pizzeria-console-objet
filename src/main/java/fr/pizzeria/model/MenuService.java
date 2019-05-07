/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.exception.StockageException;

/**
 * Classe qui appelle la dao pour faire une action sur la liste des pizza
 * 
 * @author Cécile Peyras
 *
 */
public abstract class MenuService {

	/** LOG : Logger */
	protected static final Logger LOG = LoggerFactory.getLogger(MenuService.class);

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

	/**
	 * Méthode pour afficher les log
	 * 
	 * @param param
	 */
	public abstract void executer(String param);

}
