package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="animale")
public class Animale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int idAnimale;
	
	@Column(name = "espece")
	private String espece;
	
	@Column(name = "sexe")
	private String sexe;
	
	@Column(name= "date_naissance")
	private String datenaissance;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="commentaire")
	private String commentaire;
	
	

	public Animale() {
		super();
	}

	public Animale(String espece, String sexe, String datenaissance, String nom, String commentaire) {
		super();
		this.espece = espece;
		this.sexe = sexe;
		this.datenaissance = datenaissance;
		this.nom = nom;
		this.commentaire = commentaire;
	}

	public int getIdAnimale() {
		return idAnimale;
	}

	public void setIdAnimale(int idAnimale) {
		this.idAnimale = idAnimale;
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

	public String getDatenaissance() {
		return datenaissance;
	}

	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
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
