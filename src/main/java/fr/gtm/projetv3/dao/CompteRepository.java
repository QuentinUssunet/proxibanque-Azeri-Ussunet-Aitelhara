package fr.gtm.projetv3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.gtm.projetv3.model.Compte;

public interface CompteRepository extends JpaRepository<Compte, Integer>{

	@Query(value = " UPDATE `compte` SET `solde`= ?1 WHERE `id`= ?2", nativeQuery= true)
	Compte saveSolde(Double solde, Integer idCompte);
	
}
