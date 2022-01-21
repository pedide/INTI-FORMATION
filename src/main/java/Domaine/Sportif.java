package Domaine;

public class Sportif {
	protected int idSpo;
	protected String nom;
	protected String prenom;
	protected String adresse;
	protected int cp;
	protected String ville;
	protected String pays;
	protected String tel;
	protected String fax;
	protected int dossard;
	
	
	
	
	public Sportif() {
		super();
	}
	
	
	public Sportif(String nom, String prenom, String adresse, int cp, String ville, String pays, String tel, String fax,
			int dossard) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.tel = tel;
		this.fax = fax;
		this.dossard = dossard;
	}
	
	
	public int getIdSpo() {
		return idSpo;
	}
	public void setIdSpo(int idSpo) {
		this.idSpo = idSpo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	public int getDossard() {
		return dossard;
	}
	public void setDossard(int dossard) {
		this.dossard = dossard;
	}
	
	
}
