package fr.gtm.projetv3.model;

import java.time.LocalDate;

public class CompteCourant {

	private Integer id;
	private Long numeroCompte;
	private String Libelle;
	private LocalDate dateOuverture;
	private Double solde;
	private CarteBleue cb;
	private Chequier chequier;
	
	/**
	 * @param id
	 * @param numeroCompte
	 * @param libelle
	 * @param dateOuverture
	 * @param solde
	 * @param cb
	 * @param chequier
	 */
	public CompteCourant(Integer id, Long numeroCompte, String libelle, LocalDate dateOuverture, Double solde,
			CarteBleue cb, Chequier chequier) {
		super();
		this.id = id;
		this.numeroCompte = numeroCompte;
		Libelle = libelle;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.cb = cb;
		this.chequier = chequier;
	}

	/**
	 * 
	 */
	public CompteCourant() {
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

	public CarteBleue getCb() {
		return cb;
	}

	public void setCb(CarteBleue cb) {
		this.cb = cb;
	}

	public Chequier getChequier() {
		return chequier;
	}

	public void setChequier(Chequier chequier) {
		this.chequier = chequier;
	}

	@Override
	public String toString() {
		return "CompteCourant [id=" + id + ", numeroCompte=" + numeroCompte + ", Libelle=" + Libelle
				+ ", dateOuverture=" + dateOuverture + ", solde=" + solde + ", cb=" + cb + ", chequier=" + chequier
				+ "]";
	}
}