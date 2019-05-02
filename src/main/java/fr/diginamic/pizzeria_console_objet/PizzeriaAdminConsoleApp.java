/**
 * 
 */
package fr.diginamic.pizzeria_console_objet;

import java.util.Scanner;

import fr.pizzeria.model.AjouterPizzaService;
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

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PizzaMemDao pizzaDao = new PizzaMemDao();

		String menu = "\n***** Pizzeria Administration *****\n1. Lister les pizzas\n2. Ajouter une nouvelle pizza\n3. Mettre à jour une pizza\n4. Supprimer une pizza\n99. Sortir\n";

		System.out.println(menu);

		String choix = sc.nextLine();

		while (!choix.equals("99")) {

			switch (choix) {
			case "1":

				ListerPizzasService lister = new ListerPizzasService();

				lister.executeUC(sc, pizzaDao);

				System.out.println(menu);

				choix = sc.nextLine();

				break;
			case "2":

				AjouterPizzaService ajouter = new AjouterPizzaService();

				ajouter.executeUC(sc, pizzaDao);

				System.out.println(menu);

				choix = sc.nextLine();
				break;
			case "3":

				ModifierPizzaService modifier = new ModifierPizzaService();

				modifier.executeUC(sc, pizzaDao);

				System.out.println(menu);

				choix = sc.nextLine();

				break;
			case "4":

				SupprimerPizzaService supprimer = new SupprimerPizzaService();

				supprimer.executeUC(sc, pizzaDao);

				System.out.println(menu);
				choix = sc.nextLine();

				break;

			default:
				System.out.println(menu);
				choix = sc.nextLine();
				break;
			}
		}

		if (choix.equals("99"))

		{
			System.out.println("Au revoir :(");
		}

	}

}
