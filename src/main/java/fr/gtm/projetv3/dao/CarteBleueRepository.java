package fr.gtm.projetv3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gtm.projetv3.model.CarteBleue;

@Repository
public interface CarteBleueRepository extends JpaRepository<CarteBleue, Integer> {

}
