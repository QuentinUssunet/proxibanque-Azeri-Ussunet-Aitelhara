package fr.gtm.projetv3.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.ClientRepository;
import fr.gtm.projetv3.model.Client;
import fr.gtm.projetv3.web.IndexController;

public class Results {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
	
	private Integer id;
	private String nom;
	private String prenom;
	
	
	@Autowired
	ClientRepository repo;
	
	// Methode de traitement 
	
	public List<String> getResultsById(Integer id){
		List<String> result = new ArrayList<>();
		result.add(this.getNom());
		result.add(this.getPrenom());
		return result;
	}
	
	public List<Client> searchByName(String nom) {
		this.nom = nom;
		return this.repo.getAllByName(nom);
	}
	
	public List<Client> searchByFirstName(String prenom) {
		this.nom = prenom;
		return this.repo.getAllByName(prenom);
	}
	
	// Methode de comparaison client par nom avec prenom entré
	public Client compare(String nom, LocalDate dateNaissance) {
		int i;
		Client result = null;
		List<Client> c1 = this.repo.getAllByName(nom);
		for(i=0;i<c1.size();i++)
			if(c1.get(i).getDateNaissance().equals(dateNaissance)) {
				result = c1.get(i);
			}
		LOGGER.info("compare"+c1.get(0).getPrenom());
		return result;		
	}
	
	// Constructeur par d�fault
	
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