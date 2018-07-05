package fr.gtm.projetv3.model;

import java.time.LocalDate;
import java.util.List;

public class Client {

	private Integer idClient;
	private Long numCl;
	private String nom;
	private String prenom;
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

	public Integer getIdClient() {
		return idClient;
	}

	/**
	 * @param idClient
	 * @param numCl
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param adresse
	 * @param comptes
	 */
	public Client(Integer idClient, Long numCl, String nom, String prenom, LocalDate dateNaissance, Adresse adresse,
			List<Compte> comptes) {
		super();
		this.idClient = idClient;
		this.numCl = numCl;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.comptes = comptes;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
		return "Client [idClient=" + idClient + ", numCl=" + numCl + ", nom=" + nom + ", prenom=" + prenom
				+ ", dateNaissance=" + dateNaissance + ", adresse=" + adresse + ", comptes=" + comptes + "]";
	}

	
}