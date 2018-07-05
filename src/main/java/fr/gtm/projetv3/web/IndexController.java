package fr.gtm.projetv3.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.gtm.projetv3.service.CarteBleueService;
import fr.gtm.projetv3.service.ClientService;
import fr.gtm.projetv3.service.CompteService;

@Controller
public class IndexController {

	@Autowired
	ClientService clientService;
	
	@Autowired
	CompteService compteService;
	
	@Autowired
	CarteBleueService carteBleueService;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		final ModelAndView mav = new ModelAndView("index");
		return mav;
	}
}