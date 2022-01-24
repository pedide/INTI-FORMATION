package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pilotes")
public class Pilotes implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idpilotes")
	private int idpilotes;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="ville")
	private String ville;
	@Column(name="salaire")
	private double salaire;
	
	// j'associe à un vol, un pilote
	@OneToOne(mappedBy="pilotes")
	private Vols vols;
	
	public Pilotes() {
		super();
	}
	
	
	public Pilotes(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
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

	public Vols getVols() {
		return vols;
	}

	public void setVols(Vols vols) {
		this.vols = vols;
	}
	
	
}
