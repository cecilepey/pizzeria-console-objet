/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

/**
 * Classe qui appelle la dao pour faire une action sur la liste des pizza
 * 
 * @author Cécile Peyras
 *
 */
public abstract class MenuService {

	/**
	 * Méthode qui appelle la dao pour faire une action sur la liste des pizza
	 * 
	 * @param scanner
	 * @param dao
	 */
	public abstract void executeUC(Scanner scanner, PizzaMemDao dao);

}
