/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

/**
 * 
 * Classe qui gère l'exécution de l'affichage des pizza
 * 
 * @author Cécile Peyras
 *
 */
public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) {

		System.out.println("\n\nVoici la liste des pizzas : \n");

		for (Pizza list : dao.findAllPizzas()) {
			System.out.println(list);
		}

	}
}