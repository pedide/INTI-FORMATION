package domain;

public class Pilotes {

	private int idpilotes;
	private String nom;
	private String prenom;
	private String ville;
	private double salaire;
	
	
	public Pilotes() {
		super();
	}
	
	public Pilotes(String nom, String prenom, String ville, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.salaire = salaire;
	}
	
	public Pilotes(int idpilotes, String nom, String prenom, String ville, double salaire) {
		super();
		this.idpilotes = idpilotes;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.salaire = salaire;
	}
	
	
	public int getIdpilotes() {
		return idpilotes;
	}
	public void setIdpilotes(int idpilotes) {
		this.idpilotes = idpilotes;
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
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
}
