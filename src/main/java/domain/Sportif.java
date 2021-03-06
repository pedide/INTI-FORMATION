package domain;

public class Sportif {
	private int idSportif;
	protected String nomSportif;
	protected String prenomSportif;
	protected String adresse;
	protected int cp;
	protected String ville;
	protected String pays;
	protected String email;
	protected String tel;
	protected String fax;
	protected int dossardCompet;
	
	
	public Sportif(String nomSportif, String prenomSportif, String adresse, int cp, String ville, String pays,
			String email, String tel, String fax, int dossardCompet) {
		super();
		this.nomSportif = nomSportif;
		this.prenomSportif = prenomSportif;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.email = email;
		this.tel = tel;
		this.fax = fax;
		this.dossardCompet = dossardCompet;
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
	public int getDossardCompet() {
		return dossardCompet;
	}
	public void setDossardCompet(int dossardCompet) {
		this.dossardCompet = dossardCompet;
	}
	
}
