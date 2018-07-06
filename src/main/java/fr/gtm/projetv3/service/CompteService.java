package fr.gtm.projetv3.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.CompteRepository;
import fr.gtm.projetv3.model.Compte;

/**
 * 
 * @author Azeri, Ussunet, Aitelhara
 *
 */

public class CompteService {

	@Autowired
	CompteRepository repo;
<<<<<<< HEAD

	// Trouver un compte
=======
	
	
	/**
	 * 
	 * @param idCompte
	 * @return
	 */
	// Trouver un compte 
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	public Compte findById(Integer idCompte) {
		return this.repo.getOne(idCompte);
	}
<<<<<<< HEAD

=======
	
	/**
	 * 
	 * @param mt
	 * @param idCompte
	 * @return
	 */
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	// D�bit compte pour retraits ou virements.
	public Compte debitCompte(Double mt, Integer idCompte) {
		Double solde = this.findById(idCompte).getSolde();
		if (mt < solde) {
			solde -= mt;
		} else {
			// TODO ExceptionSoldeInsuffisant
		}
		return this.repo.saveSolde(solde, idCompte);
	}
<<<<<<< HEAD

=======
	
	
	/**
	 * 
	 * @param mt
	 * @param idCompte
	 * @return
	 */
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	// Cr�dit compte pour virements.
	public Compte creditCompte(Double mt, Integer idCompte) {
		Double solde = this.findById(idCompte).getSolde();
		solde += mt;
		return this.repo.saveSolde(solde, idCompte);
	}

}
