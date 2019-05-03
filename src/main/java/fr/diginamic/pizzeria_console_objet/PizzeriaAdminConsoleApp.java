/**
 * 
 */
package fr.diginamic.pizzeria_console_objet;

import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.AjouterPizzaService;
import fr.pizzeria.model.IPizzaDao;
import fr.pizzeria.model.ListerPizzasService;
import fr.pizzeria.model.ModifierPizzaService;
import fr.pizzeria.model.PizzaMemDao;
import fr.pizzeria.model.SupprimerPizzaService;

/**
 * Classe qui controle le menu pour les actions sur la liste des pizza
 * 
 * @author Cécile Peyras
 *
 */
public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) throws SavePizzaException, UpdatePizzaException, DeletePizzaException {

		Scanner sc = new Scanner(System.in);

		IPizzaDao pizzaDao = new PizzaMemDao();

		String menu = "\n***** Pizzeria Administration *****\n1. Lister les pizzas\n2. Ajouter une nouvelle pizza\n3. Mettre à jour une pizza\n4. Supprimer une pizza\n99. Sortir\nMerci de choisir une option :\n";

		String choix = "1";

		while (!choix.equals("99")) {

			System.out.println(menu);

			choix = sc.nextLine();

			switch (choix) {
			case "1":

				ListerPizzasService lister = new ListerPizzasService();

				lister.executeUC(sc, pizzaDao);

				break;
			case "2":

				AjouterPizzaService ajouter = new AjouterPizzaService();

				try {
					ajouter.executeUC(sc, pizzaDao);
				} catch (SavePizzaException e) {
					System.out.println(e.getMessage());
				}

				break;
			case "3":

				ModifierPizzaService modifier = new ModifierPizzaService();

				try {
					modifier.executeUC(sc, pizzaDao);
				} catch (UpdatePizzaException e) {
					System.out.println(e.getMessage());
				}

				break;
			case "4":

				SupprimerPizzaService supprimer = new SupprimerPizzaService();

				try {
					supprimer.executeUC(sc, pizzaDao);
				} catch (DeletePizzaException e) {
					System.out.println(e.getMessage());
				}

				break;

			default:
				if (choix.equals("99")) {
					break;
				} else {
					System.out.println("Vous n'avez pas fait un choix valide");
				}
				break;
			}
		}

		if (choix.equals("99"))

		{
			System.out.println("\nAu revoir !");
		}

	}

}
