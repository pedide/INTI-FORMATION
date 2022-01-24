package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="animal")
public class animal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAni;
	private String espece;
	private String sexe;
	private String datenaissance;
	private String nom;
	private String commentaire;
	
	@OneToMany(mappedBy="animal", fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST})
	private List<adoption>listeAdop = new ArrayList<adoption>();
	
	public animal() {
		super();
	}

	public animal(String espece, String sexe, String datenaissance, String nom, String commentaire) {
		super();
		this.espece = espece;
		this.sexe = sexe;
		this.datenaissance = datenaissance;
		this.nom = nom;
		this.commentaire = commentaire;
	}

	
	
	public animal(String espece, String sexe, String datenaissance, String nom, String commentaire,
			List<adoption> listeAdoption) {
		super();
		this.espece = espece;
		this.sexe = sexe;
		this.datenaissance = datenaissance;
		this.nom = nom;
		this.commentaire = commentaire;
		this.listeAdop = listeAdoption;
		
	    for (adoption a : listeAdoption)
	    {
	        a.setAnimal(this);
	    }
	}

	public int getIdAni() {
		return idAni;
	}

	public void setIdAni(int idAni) {
		this.idAni = idAni;
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
