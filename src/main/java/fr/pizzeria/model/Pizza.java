package fr.pizzeria.model;

/**
 * Classe qui représente une pizza
 * 
 * @author Cécile Peyras
 *
 */
public class Pizza {

	/** id : int */
	private static int id = 0;
	/** code : String */
	private String code;
	/** libelle : String */
	private String libelle;
	/** prix : double */
	private double prix;

	/**
	 * Constructeur
	 * 
	 * @param code
	 * @param libelle
	 * @param prix
	 */
	public Pizza(String libelle, String code, double prix) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		id++;
	}

	@Override
	public String toString() {
		return code + "->" + libelle + " (" + prix + ")";
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Setter
	 * 
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * 
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * Setter
	 * 
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
