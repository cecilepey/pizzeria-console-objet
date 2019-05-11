package fr.pizzeria.service;

import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.IPizzaDao;
import fr.pizzeria.model.Pizza;

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
		String categorie;
		CategoriePizza categoriePizza;

		System.out.println("\nVeuillez choisir le code de la pizza à modifier :");
		String code = scanner.nextLine();

		if (!dao.pizzaExists(code)) {

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

						System.out.println("Veuillez saisir la catégorie : VIANDE, POISSON, SANS_VIANDE :");
						categorie = scanner.nextLine();

						if (!CategoriePizza.categorieExists(categorie)) {
							throw new UpdatePizzaException("Vous n'avez pas entré un nom de catégorie correct");

						} else {
							categoriePizza = CategoriePizza.valueOf(categorie);
							dao.updatePizza(code, new Pizza(nom, newCode, prix, categoriePizza));
							System.out.println("\nLa pizza a bien été modifiée !");

						}

					}
				}

			}

		}

	}

	@Override
	public void executer(String param) {
		LOG.info("Traitement = {}", param);

	}

}
