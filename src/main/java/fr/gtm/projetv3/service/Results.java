package fr.gtm.projetv3.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.ClientRepository;
import fr.gtm.projetv3.model.Client;

public class Results {

	private Integer id;
	private String nom;
	private String prenom;
	
	@Autowired
	ClientRepository repo;
	
	

	
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
	public Client setNom(String nom) {
		this.nom = nom;
		return this.repo.getAllByName(nom);
	}
	public String getPrenom() {
		return prenom;
	}
	public Client setPrenom(String prenom) {
		this.prenom = prenom;
		return this.repo.getAllByFirstName(prenom);
	}
	
}
