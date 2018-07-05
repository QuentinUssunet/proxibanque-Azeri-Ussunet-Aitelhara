package fr.gtm.projetv3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.gtm.projetv3.model.Compte;

/**
 * 
 * @author Azeri, Ussunet, Aitelhara
 * 
 * 		   Cette Interface qui communique avec la base de données et qui permet
 *         de remonter les infos de Compte du client sotcker en base
 *         de données
 */

@Repository
public interface CompteRepository extends JpaRepository<Compte, Integer>{

	/**
	 * 
	 * @param solde  Solde de Compte
	 * @param idCompte Identifiant du compte
	 * @return mise a jour du compte
	 */
	@Query(value = " UPDATE `compte` SET `solde`= ?1 WHERE `id`= ?2", nativeQuery= true)
	Compte saveSolde(Double solde, Integer idCompte);
	
}
