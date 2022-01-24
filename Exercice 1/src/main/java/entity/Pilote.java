package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pilote")
public class Pilote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idPilote")
	private int idPilote;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="ville")
	private String ville;
	
	@Column(name="salaire")
	private String salaire;
	
	public Pilote(String nom, String prenom, String ville, String salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.salaire = salaire;
	}
	
	public int getIdPilote() {
		return idPilote;
	}
	
	public void setIdPilote(int idPilote) {
		this.idPilote = idPilote;
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
	
	public String getSalaire() {
		return salaire;
	}
	
	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}
}
