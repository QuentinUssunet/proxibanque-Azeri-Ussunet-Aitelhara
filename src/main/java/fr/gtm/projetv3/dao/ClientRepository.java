package fr.gtm.projetv3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.gtm.projetv3.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

	@Query(value = "SELECT * FROM client WHERE nom = ?1", nativeQuery= true)
	Client getByName(String nom);

	@Query(value = "SELECT * FROM client WHERE prenom = ?1", nativeQuery= true)
	Client getByFirstName(String prenom);

}
