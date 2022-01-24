package domain;

public class Clients {

	private int idclient;
	private String nom;
	private String prenom;
	private String adresse;
	private String cp;
	private String ville;
	
	
	public Clients() {
		super();
	}
	
	public Clients(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Clients(int idclient, String nom, String prenom) {
		super();
		this.idclient = idclient;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public int getIdclient() {
		return idclient;
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
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
