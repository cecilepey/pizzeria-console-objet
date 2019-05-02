/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

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

		System.out.println("\nVeuillez saisir le code de la pizza à ajouter : ");
		code = scanner.nextLine();
		System.out.println("Veuillez saisir le nom sans espace :");
		nom = scanner.nextLine();
		System.out.println("Veuillez saisir le prix : ");
		prixStr = scanner.nextLine();
		Double prix = Double.parseDouble(prixStr);

		Pizza pizza = new Pizza(nom, code, prix);

		dao.saveNewPizza(pizza);
		System.out.println("La pizza est bien ajouté ! ");
	}

}