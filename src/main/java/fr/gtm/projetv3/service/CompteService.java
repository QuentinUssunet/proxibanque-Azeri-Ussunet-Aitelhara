package fr.gtm.projetv3.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.CompteRepository;
import fr.gtm.projetv3.model.Compte;

public class CompteService {

	@Autowired
	CompteRepository repo;
	
	// Trouver un compte 
	public Compte findById(Integer idCompte) {
		return this.repo.getOne(idCompte);		
	}
	
	// Débit compte pour retraits ou virements.
	public Compte debitCompte(Double mt, Integer idCompte) {
		Double solde = this.findById(idCompte).getSolde();
		if(mt<solde) {
			solde-=mt; 
		} else {
			// TODO ExceptionSoldeInsuffisant
		}
		return this.repo.saveSolde(solde, idCompte);
	}
	
	// Crédit compte pour virements.
	public Compte creditCompte(Double mt, Integer idCompte) {
		Double solde = this.findById(idCompte).getSolde();
		solde+=mt;
		return this.repo.saveSolde(solde, idCompte);
	}
}
