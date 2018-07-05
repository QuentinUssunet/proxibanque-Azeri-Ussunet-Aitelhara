package fr.gtm.projetv3.model;

import java.time.LocalDate;

public class Compte {
	
	private Integer idCompte;
	private Long numCC;
	private String libeller;
	private LocalDate dateOuverture;
	private CarteBleue cb;
	private Chequier cheque;
	private Double solde;
	private String typeCompte;
	
	/**
	 * @param idCompte
	 * @param numCC
	 * @param libeller
	 * @param dateOuverture
	 * @param cb
	 * @param cheque
	 * @param solde
	 * @param typeCompte
	 */
	public Compte(Integer idCompte, Long numCC, String libeller, LocalDate dateOuverture, CarteBleue cb,
			Chequier cheque, Double solde, String typeCompte) {
		super();
		this.idCompte = idCompte;
		this.numCC = numCC;
		this.libeller = libeller;
		this.dateOuverture = dateOuverture;
		this.cb = cb;
		this.cheque = cheque;
		this.solde = solde;
		this.typeCompte = typeCompte;
	}

	/**
	 * 
	 */
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Integer idCompte) {
		this.idCompte = idCompte;
	}

	public Long getNumCC() {
		return numCC;
	}

	public void setNumCC(Long numCC) {
		this.numCC = numCC;
	}

	public String getLibeller() {
		return libeller;
	}

	public void setLibeller(String libeller) {
		this.libeller = libeller;
	}

	public LocalDate getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public CarteBleue getCb() {
		return cb;
	}

	public void setCb(CarteBleue cb) {
		this.cb = cb;
	}

	public Chequier getCheque() {
		return cheque;
	}

	public void setCheque(Chequier cheque) {
		this.cheque = cheque;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", numCC=" + numCC + ", libeller=" + libeller + ", dateOuverture="
				+ dateOuverture + ", cb=" + cb + ", cheque=" + cheque + ", solde=" + solde + ", typeCompte="
				+ typeCompte + "]";
	}	
}