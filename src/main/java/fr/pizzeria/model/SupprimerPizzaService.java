/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

/**
 * Classe qui gère l'exécution de la suppression d'une pizza
 * 
 * @author Cécile Peyras
 *
 */
public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) {

		System.out.println("Veuillez choisir le code de la pizza à modifier : ");

		String code = scanner.nextLine();

		if (dao.pizzaExists(code)) {
			dao.deletePizza(code);

			System.out.println("\nLa pizza a bien été supprimée !");

		} else {
			System.out.println("Vous n'avez pas entré un code valide");

		}

	}

}
