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

	VIANDE("Viande"), POISSON("Poisson"), SANS_VIANDE("Sans Viande");

	private String categorie;

	/**
	 * Constructeur
	 * 
	 * @param categorie
	 */
	private CategoriePizza(String categorie) {
		this.categorie = categorie;
	}

	static boolean categorieExists(String categorie) {

		CategoriePizza[] cate = CategoriePizza.values();
		for (CategoriePizza j : cate) {
			if (j.name().equals(categorie)) {
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
