package fr.gtm.projetv3.model;

import java.time.LocalDate;

public class Chequier {

	private Integer idChequier;
	private LocalDate dateEnvoi;
	private LocalDate dateReception;
	
	/**
	 * @param idChequier
	 * @param dateEnvoi
	 * @param dateReception
	 */
	public Chequier(Integer idChequier, LocalDate dateEnvoi, LocalDate dateReception) {
		super();
		this.idChequier = idChequier;
		this.dateEnvoi = dateEnvoi;
		this.dateReception = dateReception;
	}
	
	/**
	 * 
	 */
	public Chequier() {
		super();
	}

	public Integer getIdChequier() {
		return idChequier;
	}

	public void setIdChequier(Integer idChequier) {
		this.idChequier = idChequier;
	}

	public LocalDate getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(LocalDate dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	public LocalDate getDateReception() {
		return dateReception;
	}

	public void setDateReception(LocalDate dateReception) {
		this.dateReception = dateReception;
	}

	@Override
	public String toString() {
		return "Chequier [idChequier=" + idChequier + ", dateEnvoi=" + dateEnvoi + ", dateReception=" + dateReception
				+ "]";
	}
}