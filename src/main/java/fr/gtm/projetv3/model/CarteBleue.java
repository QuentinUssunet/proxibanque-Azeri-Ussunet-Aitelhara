package fr.gtm.projetv3.model;

import java.time.LocalDate;

public class CarteBleue {

	private Integer id;
	private Long numeroCarte;
	private LocalDate dateExpiration;
	private Boolean type;
	
	/**
	 * 
	 */
	public CarteBleue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param numeroCarte
	 * @param dateExpiration
	 * @param type
	 */
	public CarteBleue(Integer id, Long numeroCarte, LocalDate dateExpiration, Boolean type) {
		super();
		this.id = id;
		this.numeroCarte = numeroCarte;
		this.dateExpiration = dateExpiration;
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(Long numeroCarte) {
		this.numeroCarte = numeroCarte;
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
		return "CarteBleue [id=" + id + ", numeroCarte=" + numeroCarte + ", dateExpiration=" + dateExpiration
				+ ", type=" + type + "]";
	}
}