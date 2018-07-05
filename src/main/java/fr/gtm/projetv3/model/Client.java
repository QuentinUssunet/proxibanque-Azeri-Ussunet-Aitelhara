package fr.gtm.projetv3.model;

import java.time.LocalDate;

public class Client {

	private Integer id;
	private Long numCl;
	private String nom;
	private String penom;
	private LocalDate dateNaissance;
	private Adresse adresse;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	
	/**
	 * @param id
	 * @param numCl
	 * @param nom
	 * @param penom
	 * @param dateNaissance
	 * @param adresse
	 * @param compteCourant
	 * @param compteEpargne
	 */
	public Client(Integer id, Long numCl, String nom, String penom, LocalDate dateNaissance, Adresse adresse,
			CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super();
		this.id = id;
		this.numCl = numCl;
		this.nom = nom;
		this.penom = penom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}

	/**
	 * 
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getNumCl() {
		return numCl;
	}

	public void setNumCl(Long numCl) {
		this.numCl = numCl;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPenom() {
		return penom;
	}

	public void setPenom(String penom) {
		this.penom = penom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", numCl=" + numCl + ", nom=" + nom + ", penom=" + penom + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", compteCourant=" + compteCourant + ", compteEpargne="
				+ compteEpargne + "]";
	}
}