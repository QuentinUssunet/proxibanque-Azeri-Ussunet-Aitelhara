package fr.gtm.projetv3.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.CarteBleueRepository;
import fr.gtm.projetv3.model.CarteBleue;

public class CarteBleueService {

	@Autowired
	CarteBleueRepository repo;
	
	public CarteBleue create(CarteBleue carteBleue) {
		//TODO Condition créer ssi le compte ne dispose pas déjà d'une carte
		return this.repo.save(carteBleue);		
	}
}
