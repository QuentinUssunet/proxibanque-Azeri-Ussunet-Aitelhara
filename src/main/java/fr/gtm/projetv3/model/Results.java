package fr.gtm.projetv3.model;

public class Results {

	private Integer id;
	private String nom;
	private String prenom;
	
	
	// Constructeur par défault
	
	public Results() {		
	}
	
	// Getters & Setters
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
