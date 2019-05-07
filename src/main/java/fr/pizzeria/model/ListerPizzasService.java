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
	public void executeUC(Scanner scanner, IPizzaDao dao) {

		System.out.println("\nVoici la liste des pizzas : \n");

		for (Pizza list : dao.findAllPizzas()) {
			System.out.println(list);
		}

	}

	@Override
	public void executer(String param) {
		LOG.info("Traitement = {}", param);

	}
}