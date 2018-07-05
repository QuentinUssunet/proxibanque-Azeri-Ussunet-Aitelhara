package fr.gtm.projetv3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.ClientRepository;
import fr.gtm.projetv3.model.Client;
import fr.gtm.projetv3.model.Compte;

public class ClientService {

	@Autowired
	ClientRepository repo;
		
	
	public List<Compte> listComptes(Integer idClient){
		List<Compte> comptes = new ArrayList<Compte>();		
		return comptes;		
	}
	
	public Client findByName(String nom) {
		return this.repo.getByName(nom);
	}
}
