package fr.gtm.projetv3.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.CompteRepository;
import fr.gtm.projetv3.model.Compte;

public class CompteService {

	@Autowired
	CompteRepository repo;
	
	public Compte findById(Integer idCompte) {
		return this.repo.getOne(idCompte);		
	}
	
	public Compte debitCompte(Double solde, Double mt, Integer idCompte) {
		return this.repo.saveSolde(solde, idCompte);
	}
	
}
