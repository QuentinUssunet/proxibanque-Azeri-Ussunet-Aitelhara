package fr.gtm.projetv3.web;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.gtm.projetv3.model.Client;
import fr.gtm.projetv3.service.CarteBleueService;
import fr.gtm.projetv3.service.ClientService;
import fr.gtm.projetv3.service.CompteService;

@Controller
public class IndexController {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

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
	
	@PostMapping("/index")
	public String authentification(@RequestParam ("nom-prenom")String nomprenom) {
		LOGGER.info(nomprenom);
		String nom = nomprenom.split(" ")[0];
		LOGGER.info(nom);
		String prenom = nomprenom.split(" ")[1];
		LOGGER.info(prenom);
		List<Client> listCli = this.clientService.findByEntry(nom, prenom);
		if(listCli.size()!=0) {
//			final ModelAndView mav = new ModelAndView("authen");
//			mav.addObject("searchid", listCli);
			return "redirect:/authen.html";
		} else {
			// TODO message erreur user inconnu réidentification nécessaire.
			return null;
		}
		
	}
	
	@GetMapping
	public ModelAndView date() {
		final ModelAndView mav = new ModelAndView("authen");
		return mav;
	}
	
	@PostMapping("/authen")
	public ModelAndView date(@RequestParam ("dateNaissance") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dateNaissance) {
		
		Client result = this.clientService.checkDate(dateNaissance);
		ModelAndView renvoi = null;
		if(result!=null) {
			final ModelAndView mav = new ModelAndView("accueil");
			renvoi = mav;
		} else {
			// TODO Mauvaise date de naissance merci de recommencer l'authentification.
			// TODO redirect /index
		}
		
	return renvoi;
	}
	
	
	
	
}