/**
 * 
 */
package fr.diginamic.pizzeria_console_objet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

/**
 * @author Cécile Peyras
 *
 */
public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");

		String choix = sc.nextLine();

		while (!choix.equals("99")) {

			switch (choix) {
			case "1":
				System.out.println("\n\nVoici la liste des pizzas : \n");

				List<Pizza> listePizza = new ArrayList<Pizza>();

				Pizza peperoni = new Pizza("Pépéroni", "PEP", 12.50);
				Pizza margherita = new Pizza("Margherita", "MAR", 14);
				Pizza reine = new Pizza("La Reine", "REIN", 11.50);
				Pizza fromages = new Pizza("La 4 fromages", "FRO", 12);
				Pizza cannibale = new Pizza("La cannibale", "CAN", 12.50);
				Pizza savoyarde = new Pizza("La savoyarde", "SAV", 13);
				Pizza orientale = new Pizza("L’orientale", "ORI", 13.50);
				Pizza indienne = new Pizza("L’indienne", "IND", 14);

				listePizza.add(peperoni);
				listePizza.add(margherita);
				listePizza.add(reine);
				listePizza.add(fromages);
				listePizza.add(cannibale);
				listePizza.add(savoyarde);
				listePizza.add(orientale);
				listePizza.add(indienne);

				for (int i = 0; i < listePizza.size(); i++) {
					System.out.println(listePizza.get(i).toString());
				}

				System.out.println("\n \n***** Pizzeria Administration *****");
				System.out.println("1. Lister les pizzas");
				System.out.println("2. Ajouter une nouvelle pizza");
				System.out.println("3. Mettre à jour une pizza");
				System.out.println("4. Supprimer une pizza");
				System.out.println("99. Sortir");

				choix = sc.nextLine();

				break;
			case "2":
				System.out.println("\nAjout d'une nouvelle pizza \n");

				System.out.println("***** Pizzeria Administration *****");
				System.out.println("1. Lister les pizzas");
				System.out.println("2. Ajouter une nouvelle pizza");
				System.out.println("3. Mettre à jour une pizza");
				System.out.println("4. Supprimer une pizza");
				System.out.println("99. Sortir");

				choix = sc.nextLine();
				break;
			case "3":
				System.out.println("\nMise à jour d'une pizza \n ");

				System.out.println("***** Pizzeria Administration *****");
				System.out.println("1. Lister les pizzas");
				System.out.println("2. Ajouter une nouvelle pizza");
				System.out.println("3. Mettre à jour une pizza");
				System.out.println("4. Supprimer une pizza");
				System.out.println("99. Sortir");

				choix = sc.nextLine();
				break;
			case "4":
				System.out.println("\nSuppression d'une pizza \n ");

				System.out.println("***** Pizzeria Administration *****");
				System.out.println("1. Lister les pizzas");
				System.out.println("2. Ajouter une nouvelle pizza");
				System.out.println("3. Mettre à jour une pizza");
				System.out.println("4. Supprimer une pizza");
				System.out.println("99. Sortir");

				choix = sc.nextLine();
				break;

			default:
				System.out.println("\nVous n'avez pas entré une valeur correcte, Merci de recommencer !");
				System.out.println("***** Pizzeria Administration *****");
				System.out.println("1. Lister les pizzas");
				System.out.println("2. Ajouter une nouvelle pizza");
				System.out.println("3. Mettre à jour une pizza");
				System.out.println("4. Supprimer une pizza");
				System.out.println("99. Sortir");
				choix = sc.nextLine();
				break;
			}
		}

		if (choix.equals("99")) {
			System.out.println("Au revoir :(");
		}

	}

}
