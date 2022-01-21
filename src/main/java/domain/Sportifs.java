package domain;

public class Sportifs {
	private int idSportif;
	private String nomSportif;
	private String prenomSportif;
	private String adresse;
	private int cp;
	private String ville;
	private String pays;
	private String email;
	private String fax;
	private String tel;
	
	
	
	public Sportifs() {
		super();
	}
	public Sportifs(int idSportif, String nomSportif, String prenomSportif, String adresse, int cp, String ville,
			String pays, String email, String fax, String tel) {
		super();
		this.idSportif = idSportif;
		this.nomSportif = nomSportif;
		this.prenomSportif = prenomSportif;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.email = email;
		this.fax = fax;
		this.tel = tel;
	}
	public int getIdSportif() {
		return idSportif;
	}
	public void setIdSportif(int idSportif) {
		this.idSportif = idSportif;
	}
	public String getNomSportif() {
		return nomSportif;
	}
	public void setNomSportif(String nomSportif) {
		this.nomSportif = nomSportif;
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
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	

}
