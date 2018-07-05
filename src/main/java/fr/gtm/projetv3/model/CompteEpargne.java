package fr.gtm.projetv3.model;

import java.time.LocalDate;

public class CompteEpargne {

	private Integer id;
	private Long numeroCompte;
	private String Libelle;
	private LocalDate dateOuverture;
	private Double solde;
	
	/**
	 * @param id
	 * @param numeroCompte
	 * @param libelle
	 * @param dateOuverture
	 * @param solde
	 */
	public CompteEpargne(Integer id, Long numeroCompte, String libelle, LocalDate dateOuverture, Double solde) {
		super();
		this.id = id;
		this.numeroCompte = numeroCompte;
		Libelle = libelle;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
	}

	/**
	 * 
	 */
	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(Long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public LocalDate getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "CompteEpargne [id=" + id + ", numeroCompte=" + numeroCompte + ", Libelle=" + Libelle
				+ ", dateOuverture=" + dateOuverture + ", solde=" + solde + "]";
	}
}