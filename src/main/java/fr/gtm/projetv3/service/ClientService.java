package fr.gtm.projetv3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.ClientRepository;
import fr.gtm.projetv3.model.Client;
import fr.gtm.projetv3.model.Compte;
import fr.gtm.projetv3.model.Results;

public class ClientService {

	@Autowired
	ClientRepository repo;
	
	@Autowired
	Results res;
		
	// Affichage des comptes du client
	public List<Compte> listComptes(Integer idClient){
		List<Compte> comptes = new ArrayList<Compte>();		
		return comptes;		
	}
	
	// Authentification du client par son nom
	public Client findByName(String nom) {
		this.res.setNom(nom);
		return this.repo.getByName(nom);
	}
	
	public Client findByFirstName(String prenom) {
		this.res.setPrenom(prenom);
		return this.repo.getByFirstName(prenom);
	}
	
	
}
