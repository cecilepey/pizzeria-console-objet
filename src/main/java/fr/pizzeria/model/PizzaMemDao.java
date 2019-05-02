/**
 * 
 */
package fr.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui contient les différentes méthodes pour gérer les actions sur la
 * liste de pizza
 * 
 * @author Cécile Peyras
 *
 */
public class PizzaMemDao implements IPizzaDao {

	private List<Pizza> listePizza = new ArrayList<Pizza>();

	/**
	 * Constructeur
	 * 
	 * @param listePizza
	 */
	public PizzaMemDao() {

		listePizza.add(new Pizza("Pépéroni", "PEP", 12.50));
		listePizza.add(new Pizza("Margherita", "MAR", 14));
		listePizza.add(new Pizza("La Reine", "REIN", 11.50));
		listePizza.add(new Pizza("La 4 fromages", "FRO", 12));
		listePizza.add(new Pizza("La cannibale", "CAN", 12.50));
		listePizza.add(new Pizza("La savoyarde", "SAV", 13));
		listePizza.add(new Pizza("L’orientale", "ORI", 13.50));
		listePizza.add(new Pizza("L’indienne", "IND", 14));

	}

	@Override
	public List<Pizza> findAllPizzas() {

		return listePizza;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		listePizza.add(pizza);

	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		Pizza pizzaOrigin = findPizzaByCode(codePizza);
		pizzaOrigin.setCode(pizza.getCode());
		pizzaOrigin.setLibelle(pizza.getLibelle());
		pizzaOrigin.setPrix(pizza.getPrix());

	}

	@Override
	public void deletePizza(String codePizza) {
		Pizza pizzaASuppr = findPizzaByCode(codePizza);
		listePizza.remove(pizzaASuppr);

	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		Pizza pizzaFound = null;

		for (Pizza liste : listePizza) {
			if (liste.getCode().equals(codePizza)) {

				pizzaFound = liste;
			}
		}
		return pizzaFound;
	}

	@Override
	public boolean pizzaExists(String codePizza) {

		for (Pizza liste : listePizza) {

			if (liste.getCode().equals(codePizza)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Getter
	 * 
	 * @return the listePizza
	 */
	public List<Pizza> getListePizza() {
		return listePizza;
	}

	/**
	 * Setter
	 * 
	 * @param listePizza
	 *            the listePizza to set
	 */
	public void setListePizza(List<Pizza> listePizza) {
		this.listePizza = listePizza;
	}

}
