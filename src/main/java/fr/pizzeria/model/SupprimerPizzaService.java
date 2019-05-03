/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;

/**
 * Classe qui gère l'exécution de la suppression d'une pizza
 * 
 * @author Cécile Peyras
 *
 */
public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) throws DeletePizzaException {

		System.out.println("\nVeuillez choisir le code de la pizza à modifier : ");

		String code = scanner.nextLine();

		if (!dao.pizzaExists(code)) {

			throw new DeletePizzaException("Cette pizza n'existe pas");

		} else {
			dao.deletePizza(code);

			System.out.println("\nLa pizza a bien été supprimée !");

		}

	}

}
