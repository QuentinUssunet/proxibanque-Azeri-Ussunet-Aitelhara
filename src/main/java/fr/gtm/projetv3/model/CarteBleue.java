package fr.gtm.projetv3.model;

import java.time.LocalDate;

public class CarteBleue {

	private Integer id;
	private LocalDate dateExpiration;
	private Boolean type;
	
	/**
	 * @param id
	 * @param dateExpiration
	 * @param type
	 */
	public CarteBleue(Integer id, LocalDate dateExpiration, Boolean type) {
		super();
		this.id = id;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "CarteBleue [id=" + id + ", dateExpiration=" + dateExpiration + ", type=" + type + "]";
	}
}