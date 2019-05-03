/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

import fr.pizzeria.exception.SavePizzaException;

/**
 * Classe qui gère l'exécution de l'ajout d'une pizza
 * 
 * @author Cécile Peyras
 *
 */
public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) throws SavePizzaException {

		String code;
		String nom;
		String prixStr;
		String categorie;
		CategoriePizza categoriePizza;

		System.out.println("\nVeuillez saisir le code de la pizza à ajouter : ");
		code = scanner.nextLine();

		if (code.length() != 3) {

			throw new SavePizzaException("Vous n'avez pas entré de code de 3 caractères");
		} else {
			System.out.println("Veuillez saisir le nom sans espace :");
			nom = scanner.nextLine();

			if (nom.isEmpty()) {
				throw new SavePizzaException("Vous n'avez pas entré de nom");
			} else {
				System.out.println("Veuillez saisir le prix : ");
				prixStr = scanner.nextLine();
				if (!NumberUtils.isCreatable(prixStr)) {
					throw new SavePizzaException("Vous n'avez pas entré un prix valide");
				} else {
					Double prix = Double.parseDouble(prixStr);
					System.out.println("Veuillez saisir la catégorie : VIANDE, POISSON, SANS_VIANDE :");
					categorie = scanner.nextLine();

					if (!CategoriePizza.categorieExists(categorie)) {
						throw new SavePizzaException("Vous n'avez pas entré un nom de catégorie correct");

					} else {
						categoriePizza = CategoriePizza.valueOf(categorie);
						Pizza pizza = new Pizza(nom, code, prix, categoriePizza);

						dao.saveNewPizza(pizza);
						System.out.println("La pizza est bien ajouté ! ");

					}

				}
			}

		}

	}

}
