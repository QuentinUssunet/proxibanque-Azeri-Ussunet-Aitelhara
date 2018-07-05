package fr.gtm.projetv3.model;

import java.time.LocalDate;

public class CarteBleue {

	private Integer idCb;
	private Long numeroCarte;
	private LocalDate dateExpiration;
	private Boolean type;

	/**
	 * @param idCb
	 * @param nueroCarte
	 * @param dateExpiration
	 * @param type
	 */
	public CarteBleue(Integer idCb, Long nueroCarte, LocalDate dateExpiration, Boolean type) {
		super();
		this.idCb = idCb;
		this.numeroCarte = nueroCarte;
		this.dateExpiration = dateExpiration;
		this.type = type;
	}

	/**
	 * 
	 */
	public CarteBleue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdCb() {
		return idCb;
	}

	public void setIdCb(Integer idCb) {
		this.idCb = idCb;
	}

	public Long getNueroCarte() {
		return numeroCarte;
	}

	public void setNueroCarte(Long nueroCarte) {
		this.numeroCarte = nueroCarte;
	}

	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public Boolean getType() {
		return type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CarteBleue [idCb=" + idCb + ", nueroCarte=" + numeroCarte + ", dateExpiration=" + dateExpiration
				+ ", type=" + type + "]";
	}
}