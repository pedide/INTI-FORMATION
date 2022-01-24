package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="animal")
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAnim")
	private int idAnim;
	
	@Column(name="espece")
	private String espece;
	
	@Column(name="sexe")
	private String sexe;
	
	@Column(name="dateNaissance")
	private String dateNaissance;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="commentaire")
	private String commentaire;

	public Animal(String espece, String sexe, String dateNaissance, String nom, String commentaire) {
		super();
		this.espece = espece;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.nom = nom;
		this.commentaire = commentaire;
	}

	public int getIdAnim() {
		return idAnim;
	}

	public void setIdAnim(int idAnim) {
		this.idAnim = idAnim;
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
