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
	@Column(name="idAnimal")
	private int idAnimal;
	private String espece;
	private String sexe;
	private String date_naissance;
	private String nomAnimal;
	private String commentaire;
	
	

	public Animal(String espece, String sexe, String date_naissance, String nomAnimal, String commentaire) {
		super();
		this.espece = espece;
		this.sexe = sexe;
		this.date_naissance = date_naissance;
		this.nomAnimal = nomAnimal;
		this.commentaire = commentaire;
	}



	public int getIdAnimal() {
		return idAnimal;
	}



	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
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



	public String getDate_naissance() {
		return date_naissance;
	}



	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}



	public String getNomAnimal() {
		return nomAnimal;
	}



	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}



	public String getCommentaire() {
		return commentaire;
	}



	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	
}
