package domain;

public class Animal {

	private int idanimal;
	private String espece;
	private String sexe;
	private String dateNaissance;
	private String nom;
	private String commentaire;
	
	
	public Animal() {
		super();
	}
	
	public Animal(String espece, String sexe, String dateNaissance, String nom, String commentaire) {
		super();
		this.espece = espece;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.nom = nom;
		this.commentaire = commentaire;
	}
	
	public Animal(int idanimal, String espece, String sexe, String dateNaissance, String nom, String commentaire) {
		super();
		this.idanimal = idanimal;
		this.espece = espece;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.nom = nom;
		this.commentaire = commentaire;
	}
	
	
	public int getIdanimal() {
		return idanimal;
	}
	public void setIdanimal(int idanimal) {
		this.idanimal = idanimal;
	}
	public String getEspece() {
		return espece;
	}
	public void setEspece(String espece) {
		this.espece = espece;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
}
