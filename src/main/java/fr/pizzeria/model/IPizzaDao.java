/**
 * 
 */
package fr.pizzeria.model;

import java.util.List;

/**
 * Interface qui gère les méthodes faire des actions sur la liste de pizza
 * 
 * @author Cécile Peyras
 *
 */
public interface IPizzaDao {

	/**
	 * Méthode qui permet de retourner la liste de toutes les pizza
	 * 
	 * @return
	 */
	List<Pizza> findAllPizzas();

	/**
	 * Méthode qui permet d'ajouter une nouvelle pizza à la liste
	 * 
	 * @param pizza
	 */
	void saveNewPizza(Pizza pizza);

	/**
	 * Méthode qui modifie une pizza
	 * 
	 * @param codePizza
	 * @param pizza
	 */
	void updatePizza(String codePizza, Pizza pizza);

	/**
	 * Méthode qui supprime une pizza
	 * 
	 * @param codePizza
	 */
	void deletePizza(String codePizza);

	/**
	 * Méthode qui trouve une pizza avec son code
	 * 
	 * @param codePizza
	 * @return
	 */
	Pizza findPizzaByCode(String codePizza);

	/**
	 * Méthode qui vérifie que la pizza existe
	 * 
	 * @param codePizza
	 * @return
	 */
	boolean pizzaExists(String codePizza);

}
