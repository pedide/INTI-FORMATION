package domain;

public class Sportif {
	private Long idsp;
	private String nomsp;
	private String prenomsp;
	private String adresse;
	private String cp;
	private String ville;
	private String pays;
	private String email;
	private String tel;
	private String fax;
	private int dossardCompet;
	
	
	public Sportif() {
		super();
	}
	
	public Sportif(Long idsp, String nomsp, String prenomsp, int dossardCompet) {
		super();
		this.idsp = idsp;
		this.nomsp = nomsp;
		this.prenomsp = prenomsp;
		this.dossardCompet = dossardCompet;
	}

	public Sportif(Long idsp, String nomsp, String prenomsp, String adresse, String cp, String ville, String pays,
			String email, String tel, String fax, int dossardCompet) {
		super();
		this.idsp = idsp;
		this.nomsp = nomsp;
		this.prenomsp = prenomsp;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.email = email;
		this.tel = tel;
		this.fax = fax;
		this.dossardCompet = dossardCompet;
	}
	
	
	public Long getIdsp() {
		return idsp;
	}
	public void setIdsp(Long idsp) {
		this.idsp = idsp;
	}
	public String getNomsp() {
		return nomsp;
	}
	public void setNomsp(String nomsp) {
		this.nomsp = nomsp;
	}
	public String getPrenomsp() {
		return prenomsp;
	}
	public void setPrenomsp(String prenomsp) {
		this.prenomsp = prenomsp;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
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
