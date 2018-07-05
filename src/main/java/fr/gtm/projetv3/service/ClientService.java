package fr.gtm.projetv3.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.ClientRepository;
import fr.gtm.projetv3.model.Client;
import fr.gtm.projetv3.model.Compte;

/**
 * 
 * @author Azeri, Ussunet, Aitelhara
 *
 */

public class ClientService {

	
	@Autowired
	ClientRepository repo;
	
	@Autowired
	ObjectFactory<Results> res;
	
	Integer id;
	Map<Integer,Results> getResult = new HashMap<Integer,Results>(); 
		
	
	/**
	 * 
	 * @param idClient
	 * @return
	 */
	// Affichage des comptes du client
	public List<Compte> listComptes(Integer idClient){
		List<Compte> comptes = new ArrayList<Compte>();		
		return comptes;		
	}
	
	
	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @return
	 */
	// Authentification du client par son nom
	public List<Client> findByEntry(String nom, String prenom) {
		Results object = this.res.getObject();
		object.setId(id);
		getResult.put(id, object);
		List<Client> c1 = object.searchByName(nom);
		return c1;		
	}
	
	
	/**
	 * 
	 * @param dateNaissance
	 * @return
	 */
	// Check dateNaissance + nom/prenom
	public Client checkDate(LocalDate dateNaissance) {
		Results object = getResult.get(id);
		String nom = object.getNom();		
		Client client = object.compare(nom, dateNaissance);
		return client;
	}

	/**
	 * 
	 * @param dateNaissance
	 * @return
	 */
	public Integer getId(LocalDate dateNaissance) {
		Results object = getResult.get(id);
		Integer idClient = object.getIdClient(dateNaissance);
		return idClient;
	}
	

		
		
		
		
		
		
		
}
