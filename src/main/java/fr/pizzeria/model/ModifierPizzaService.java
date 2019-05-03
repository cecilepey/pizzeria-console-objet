package fr.pizzeria.model;

import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

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

		if (dao.pizzaExists(code) == false) {

			throw new UpdatePizzaException("Le code saisie n'existe pas !");

		} else {
			System.out.println("\nVeuillez saisir le nouveau code : ");
			newCode = scanner.nextLine();

			if (newCode.length() != 3) {

				throw new UpdatePizzaException("Vous n'avez pas entré de code de 3 caractères");
			} else {
				System.out.println("Veuillez saisir le nom sans espace :");
				nom = scanner.nextLine();

				if (nom.isEmpty()) {
					throw new UpdatePizzaException("Vous n'avez pas entré de nom");
				} else {
					System.out.println("Veuillez saisir le prix : ");
					prixStr = scanner.nextLine();
					if (!NumberUtils.isCreatable(prixStr)) {
						throw new UpdatePizzaException("Vous n'avez pas entré un prix valide");
					} else {
						Double prix = Double.parseDouble(prixStr);

						dao.updatePizza(code, new Pizza(nom, newCode, prix));
						System.out.println("\nLa pizza a bien été modifiée !");

					}
				}

			}

		}

	}

}
