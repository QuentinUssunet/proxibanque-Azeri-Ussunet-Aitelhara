package fr.gtm.projetv3.model;

import java.time.LocalDate;
import java.util.List;

public class Client {

	private Integer id;
	private Long numCl;
	private String nom;
	private String penom;
	private LocalDate dateNaissance;
	private Adresse adresse;
	private List<Compte> comptes;
	
	/**
	 * 
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param numCl
	 * @param nom
	 * @param penom
	 * @param dateNaissance
	 * @param adresse
	 * @param comptes
	 */
	public Client(Integer id, Long numCl, String nom, String penom, LocalDate dateNaissance, Adresse adresse,
			List<Compte> comptes) {
		super();
		this.id = id;
		this.numCl = numCl;
		this.nom = nom;
		this.penom = penom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.comptes = comptes;
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

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", numCl=" + numCl + ", nom=" + nom + ", penom=" + penom + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", comptes=" + comptes + "]";
	}
}