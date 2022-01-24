package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAnim")
	private int idAnim;
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
	
	@OneToOne
	private Adoption adopt;
	
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

	@Override
	public String toString() {
		return "Animal [espece=" + espece + ", sexe=" + sexe + ", date_naissance=" + date_naissance + ", nom=" + nom
				+ ", commentaire=" + commentaire + "]";
	}
	
}
