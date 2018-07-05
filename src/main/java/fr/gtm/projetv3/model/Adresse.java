package fr.gtm.projetv3.model;

public class Adresse {

	private Integer id;
	private Integer codePostal;
	private String ville;
	private String nomRue;
	private String numRue;
	private String pays;
	private String adresseOpt;
	
	/**
	 * @param id
	 * @param codePostal
	 * @param ville
	 * @param nomRue
	 * @param numRue
	 * @param pays
	 * @param adresseOpt
	 */
	public Adresse(Integer id, Integer codePostal, String ville, String nomRue, String numRue, String pays,
			String adresseOpt) {
		super();
		this.id = id;
		this.codePostal = codePostal;
		this.ville = ville;
		this.nomRue = nomRue;
		this.numRue = numRue;
		this.pays = pays;
		this.adresseOpt = adresseOpt;
	}

	/**
	 * 
	 */
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public String getNumRue() {
		return numRue;
	}

	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getAdresseOpt() {
		return adresseOpt;
	}

	public void setAdresseOpt(String adresseOpt) {
		this.adresseOpt = adresseOpt;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", codePostal=" + codePostal + ", ville=" + ville + ", nomRue=" + nomRue
				+ ", numRue=" + numRue + ", pays=" + pays + ", adresseOpt=" + adresseOpt + "]";
	}
}