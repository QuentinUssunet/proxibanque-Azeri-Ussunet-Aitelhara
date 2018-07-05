package fr.gtm.projetv3.web;

import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.service.CarteBleueService;
import fr.gtm.projetv3.service.ClientService;
import fr.gtm.projetv3.service.CompteService;

public class IndexController {

	@Autowired
	ClientService clientService;
	
	@Autowired
	CompteService compteService;
	
	@Autowired
	CarteBleueService carteBleueService;
	
	
}
