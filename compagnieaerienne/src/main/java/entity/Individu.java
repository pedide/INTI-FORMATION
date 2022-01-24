package entity;

public class Individu {
	private Long noIndividu;
	private String nom;
	private String prenom;
	private String adresse;
	private String cp;
	private String ville;
	
	
	public Individu() {
		super();
	}
	public Individu(Long noIndividu, String nom, String prenom, String adresse, String cp, String ville) {
		super();
		this.noIndividu = noIndividu;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
	}
	public Long getNoIndividu() {
		return noIndividu;
	}
	public void setNoIndividu(Long noIndividu) {
		this.noIndividu = noIndividu;
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
	
	
	

}
