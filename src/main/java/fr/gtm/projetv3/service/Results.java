package fr.gtm.projetv3.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.ClientRepository;
import fr.gtm.projetv3.model.Client;
import fr.gtm.projetv3.web.IndexController;

/**
 * 
 * @author Azeri, Ussunet, Aitelhara
 *
 */
public class Results {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	private Integer id;
	private String nom;
	private String prenom;
<<<<<<< HEAD
	private Integer idClient;
=======
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335

	@Autowired
	ClientRepository repo;

<<<<<<< HEAD
=======
	/**
	 * 
	 * @param id
	 * @return
	 */
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	// Methode de traitement

	public List<String> getResultsById(Integer id) {
		List<String> result = new ArrayList<>();
		result.add(this.getNom());
		result.add(this.getPrenom());
		return result;
	}

<<<<<<< HEAD
=======
	/**
	 * 
	 * @param dateNaissance
	 * @return
	 */
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	public Integer getIdClient(LocalDate dateNaissance) {
		List<Client> clients = this.repo.findAll();
		Integer idClient = null;
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getDateNaissance().equals(dateNaissance)) {
				idClient = clients.get(i).getId();
			}
		}
		return idClient;
	}

<<<<<<< HEAD
=======
	/**
	 * 
	 * @param nom
	 * @return
	 */
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	public List<Client> searchByName(String nom) {
		this.nom = nom;
		return this.repo.getAllByName(nom);
	}

	public List<Client> searchByFirstName(String prenom) {
		this.prenom = prenom;
		return this.repo.getAllByName(prenom);
	}

<<<<<<< HEAD
=======
	/**
	 * 
	 * @param nom
	 * @param dateNaissance
	 * @return
	 */
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	// Methode de comparaison client par nom avec prenom entré
	public Client compare(String nom, LocalDate dateNaissance) {
		int i;
		Client result = null;
		List<Client> c1 = this.repo.getAllByName(nom);
		for (i = 0; i < c1.size(); i++)
			if (c1.get(i).getDateNaissance().equals(dateNaissance)) {
				result = c1.get(i);
			}
		LOGGER.info("compare" + c1.get(0).getPrenom());
		return result;
	}

<<<<<<< HEAD
	// Constructeur par d�fault

	public Results() {
	}

	// Getters & Setters

=======
	/**
	 * Constructeur par défault
	 */
	public Results() {
	}

	/**
	 * 
	 * @return Id Identifiant Client aprés la Recherche
	 */
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	public Integer getId() {
		return id;
	}

<<<<<<< HEAD
	public void setId(Integer id) {
		this.id = id;
	}

=======
	/**
	 * 
	 * @param id Id Identifiant Client aprés la Recherche
	 */
	public void setId(Integer id) {
		this.id = id;
	}
/**
 * 
 * @return nom Client aprés la Recherche
 */
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	public String getNom() {
		return nom;
	}

<<<<<<< HEAD
=======
	/**
	 * 
	 * @param nom Nom client aprés la Recherche
	 */
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	public void setNom(String nom) {
		this.nom = nom;
	}

<<<<<<< HEAD
=======
	/**
	 * 
	 * @return Prénom client aprés la Recherche
	 */
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	public String getPrenom() {
		return prenom;
	}

<<<<<<< HEAD
=======
	/**
	 * 
	 * @param prenom prénom client aprés la Recherche
	 */
>>>>>>> db1daa90baa9b450545326323a6eaa28f28ee335
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

}