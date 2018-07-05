package fr.gtm.projetv3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.ClientRepository;
import fr.gtm.projetv3.model.Client;
import fr.gtm.projetv3.model.Compte;

public class ClientService {

	@Autowired
	ClientRepository repo;
	
	@Autowired
	ObjectFactory<Results> res;
		
	// Affichage des comptes du client
	public List<Compte> listComptes(Integer idClient){
		List<Compte> comptes = new ArrayList<Compte>();		
		return comptes;		
	}
	
	// Authentification du client par son nom
	public Client findByName(String nom) {
		return this.res.getObject().setNom(nom);
	}
	
	// Authentification du client par son prenom
	public Client findByFirstName(String prenom) {		
		return this.res.getObject().setPrenom(prenom);
	}
	
	// Methode de comparaison client par nom, client par prenom
	public Client compare(Client c1,Client c2) {
		Client result = null;
		if(c1.equals(c2)) {
			result = c1;
		} else {
			// TODO message client combinaison nom+prenom inexistant veuillez ressaisir
		}
		return result;
	}
}
