package fr.gtm.projetv3.service;

import java.util.List;
import java.util.Optional;

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

	/**
	 * 
	 * @param idCompte
	 * @return
	 */
	// Trouver un compte
	public Compte findById(Integer idCompte) {
		return this.repo.getOne(idCompte);
	}
	
	public Optional<Compte> findByCc(Long cc) {
		return this.repo.getComptesByCc(cc);
	}

	
	
	/**
	 * 
	 * @param mt
	 * @param idCompte
	 * @return
	 */
	// D�bit compte pour retraits ou virements.
	public Compte debitCompte(Double mt, Integer idCompte, Integer id) {
		Double solde = this.findById(idCompte).getSolde();
		if (mt < solde) {
			solde -= mt;
		} else {
			// TODO ExceptionSoldeInsuffisant
		}
		return this.repo.saveSolde(solde, idCompte);
	}

	/**
	 * 
	 * @param mt
	 * @param idCompte
	 * @return
	 */
	// Cr�dit compte pour virements.
	public Compte creditCompte(Double mt, Integer idCompte) {
		Double solde = this.findById(idCompte).getSolde();
		solde += mt;
		return this.repo.saveSolde(solde, idCompte);
	}
	
	/**
	 * 
	 * @param idClient
	 * @return
	 */
	// Affichage des comptes du client
	public List<Compte> listComptes(Integer idClient) {
		List<Compte> comptes = this.repo.getComptesByIdClient(idClient);
		return comptes;
	}

	public List<Compte> listAll() {		
		return this.repo.findAll();
	}


}
