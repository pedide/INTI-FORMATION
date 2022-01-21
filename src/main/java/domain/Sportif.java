package domain;

public class Sportif {
	private int idSportif;
	private String nomSPortif;
	private String prenomSportif;
	private String adresse;
	private int cp;
	private String ville;
	private String pays;
	private String email;
	private String tel;
	private String fax;
	
	public Sportif(int idSportif, String nomSPortif, String prenomSportif, String adresse, int cp, String ville,
			String pays, String email, String tel, String fax) {
		super();
		this.idSportif = idSportif;
		this.nomSPortif = nomSPortif;
		this.prenomSportif = prenomSportif;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.email = email;
		this.tel = tel;
		this.fax = fax;
	}

	public Sportif() {
		super();
	}

	public int getIdSportif() {
		return idSportif;
	}

	public void setIdSportif(int idSportif) {
		this.idSportif = idSportif;
	}

	public String getNomSPortif() {
		return nomSPortif;
	}

	public void setNomSPortif(String nomSPortif) {
		this.nomSPortif = nomSPortif;
	}

	public String getPrenomSportif() {
		return prenomSportif;
	}

	public void setPrenomSportif(String prenomSportif) {
		this.prenomSportif = prenomSportif;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
}
