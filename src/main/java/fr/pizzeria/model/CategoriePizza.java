/**
 * 
 */
package fr.pizzeria.model;

/**
 * Enumération qui gère les catégories de Pizza
 * 
 * @author Cécile Peyras
 *
 */

public enum CategoriePizza {

	/** VIANDE : CategoriePizza = catégorie des pizzas avec viande */
	VIANDE("Viande"),
	/** POISSON : CategoriePizza = catégorie des pizzas au poisson */
	POISSON("Poisson"),
	/** SANS_VIANDE : CategoriePizza = catégorie des pizzas végétarienne */
	SANS_VIANDE("Sans Viande");
	/** categorie : String */
	private String categorie;

	/**
	 * Constructeur
	 * 
	 * @param categorie
	 */
	private CategoriePizza(String categorie) {
		this.categorie = categorie;
	}

	/**
	 * méthode qui vérifie qu'une catégorie existe bien
	 * 
	 * @param categorie
	 * @return booleen
	 */
	static boolean categorieExists(String categorie) {

		CategoriePizza[] cate = CategoriePizza.values();
		for (CategoriePizza c : cate) {
			if (c.name().equals(categorie)) {
				return true;
			}

		}
		return false;

	}

	/**
	 * Getter
	 * 
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}

	/**
	 * Setter
	 * 
	 * @param categorie
	 *            the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

}
