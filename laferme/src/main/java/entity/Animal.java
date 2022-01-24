package entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="animal")
public class Animal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="espece")
	private String espece;
	
	@Column(name="sexe")
	private String sexe;
	
	@Column(name="date_naissance")
	private String date_naissance;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="commentaire")
	private String commentaire;
	
	@OneToMany(mappedBy="animal")
	private List<Adoption>adoptions = new ArrayList<Adoption>();
	
	public Animal() {
		super();
	}
	
	public Animal(String espece, String sexe, String date_naissance, String nom, String commentaire) {
		super();
		this.espece = espece;
		this.sexe = sexe;
		this.date_naissance = date_naissance;
		this.nom = nom;
		this.commentaire = commentaire;
	}

	public Animal(String espece, String sexe, String date_naissance, String nom, String commentaire,
			List<Adoption> adoptions) {
		super();
		this.espece = espece;
		this.sexe = sexe;
		this.date_naissance = date_naissance;
		this.nom = nom;
		this.commentaire = commentaire;
		this.adoptions = adoptions;
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
