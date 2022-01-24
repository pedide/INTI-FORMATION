package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="animal")
public class Animaux {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAnimal")
	private int idAnimal;
	@Column(name="espece")
    private String espece;
	@Column(name="sexe")
	private String sexe;
	@Column(name="dateNaissance")
    private String date;
	@Column(name="nom")
    private String nom;
	@Column(name="commentaire")
    private String commentaire;
	@OneToOne(mappedBy="ani")
	private Adoption adopt;
    
    public Animaux(String espece,String sexe,String date,String nom,String commentaire){
        this.espece=espece;
        this.sexe=sexe;
        this.date=date;
        this.nom=nom;
        this.commentaire=commentaire;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
