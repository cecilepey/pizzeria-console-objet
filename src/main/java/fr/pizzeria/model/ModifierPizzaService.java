package fr.pizzeria.model;

import java.util.Scanner;

import fr.pizzeria.exception.UpdatePizzaException;

/**
 * Classe qui gère l'exécution de la modification de la pizza
 * 
 * @author Cécile Peyras
 *
 */
public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) throws UpdatePizzaException {

		String nom;
		String prixStr;
		String newCode;

		System.out.println("\nVeuillez choisir le code de la pizza à modifier :");
		String code = scanner.nextLine();

		if (dao.pizzaExists(code)) {
			System.out.println("\nVeuillez saisir le nouveau code : ");
			newCode = scanner.nextLine();
			System.out.println("Veuillez saisir le nouveau nom sans espace :");
			nom = scanner.nextLine();
			System.out.println("Veuillez saisir le nouveau prix : ");
			prixStr = scanner.nextLine();
			double prix = Double.parseDouble(prixStr);

			dao.updatePizza(code, new Pizza(nom, newCode, prix));

			System.out.println("\nLa pizza a bien été modifiée !");

		} else {
			System.out.println("Modification impossible, vous n'avez pas entré un code valide");

		}

	}

}
