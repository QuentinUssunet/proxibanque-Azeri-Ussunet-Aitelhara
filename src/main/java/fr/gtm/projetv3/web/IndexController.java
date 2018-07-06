package fr.gtm.projetv3.web;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.gtm.projetv3.model.Client;
import fr.gtm.projetv3.model.Compte;
import fr.gtm.projetv3.service.CarteBleueService;
import fr.gtm.projetv3.service.ClientService;
import fr.gtm.projetv3.service.CompteService;

/**
 * 
 * @author Azeri, Ussunet, Aitelhara
 *
 */

@Controller
public class IndexController {

	@Autowired
	ClientService clientService;

	@Autowired
	CompteService compteService;

	@Autowired
	CarteBleueService carteBleueService;

	/**
	 *
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView index() {
		final ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	/**
	 *
	 * @param nomprenom
	 * @return
	 */
	@PostMapping("/index")
	public String authentification(@RequestParam("nom-prenom") String nomprenom) {

		String nom = nomprenom.split(" ")[0];

		String prenom = nomprenom.split(" ")[1];

		List<Client> listCli = this.clientService.findByEntry(nom, prenom);
		if (listCli.size() != 0) {
			// final ModelAndView mav = new ModelAndView("authen");
			// mav.addObject("searchid", listCli);
			return "redirect:/authen.html";
		} else {
			// TODO message erreur user inconnu réidentification nécessaire.
			return null;
		}

	}

	/**
	 *
	 * @return
	 */
	@GetMapping
	public ModelAndView date() {
		final ModelAndView mav = new ModelAndView("authen");
		return mav;
	}

	/**
	 * @param dateNaissance
	 * @return
	 */
	@PostMapping("/authen")
	public ModelAndView date(
			@RequestParam("dateNaissance") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateNaissance) {

		Client result = this.clientService.checkDate(dateNaissance);
		Integer idClient = this.clientService.getId(dateNaissance);
		ModelAndView renvoi = null;
		if (result != null) {
			List<Compte> listComtes = this.compteService.listComptes(idClient);
			final ModelAndView mav = new ModelAndView("accueil");
			mav.addObject("list", listComtes);
			mav.addObject("idClient", idClient);
			renvoi = mav;
		} else {
			// TODO Mauvaise date de naissance merci de recommencer l'authentification.
			// TODO redirect /index
		}
		return renvoi;
	}

	// mise a jour adresse
	@RequestMapping("/editClient")
	public ModelAndView vueSubmit() {
		final ModelAndView mav = new ModelAndView("editClient");
		return mav;
	}

	@GetMapping("/virement")
	public ModelAndView virement(@RequestParam("id") Integer idClient) {
		final ModelAndView mav = new ModelAndView("virement");
		
		List<Compte> listComptesCli = this.compteService.listComptes(idClient);
		List<Compte> listComtes = this.compteService.listAll();
		
		mav.addObject("listClient", listComptesCli);
		mav.addObject("listAllComptes", listComtes);
		return mav;
	}
	
	@PostMapping("/virement")
	public ModelAndView virement(@RequestParam("montant") Double montant, 
			Integer debiteurId, Integer crediteurId) {
		
		final ModelAndView mav = new ModelAndView("virement");
		
		
		
		
		
		return mav;
	}
	
	
	
	
}