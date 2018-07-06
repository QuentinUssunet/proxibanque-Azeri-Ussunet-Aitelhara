package fr.gtm.projetv3.service;

import java.time.LocalDate;
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
	private ObjectFactory<Results> res;

	Integer id;

	public Map<Integer, Results> getResult = new HashMap<Integer, Results>();

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
		List<Client> c2 = object.searchByFirstName(prenom);
		if (c1.isEmpty()) {
			return c2;
		} else {
			return c1;
		}

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
		object.setIdClient(idClient);
		return idClient;
	}


}
