package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class Clients {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idclients")
	private int idclients;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="adresse")
	private String adresse;
	@Column(name="cp")
	private String cp;
	@Column(name="ville")
	private String ville;
	
	
	public Clients() {
		super();
	}
	
	public Clients(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Clients(int idclients, String nom, String prenom) {
		super();
		this.idclients = idclients;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public int getIdclients() {
		return idclients;
	}
	public void setIdclients(int idclients) {
		this.idclients = idclients;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}
