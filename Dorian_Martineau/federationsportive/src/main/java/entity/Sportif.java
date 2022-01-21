package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sportif")
@Inheritance(strategy=InheritanceType.JOINED)
public class Sportif {
	@Id
	@Column(name="id")
	private int id;
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
	@Column(name="pays")
	private String pays;
	@Column(name="mail")
	private String mail;
	@Column(name="tel")
	private String tel;
	@Column(name="fax")
	private String fax;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="idDossard")
	private Dossard dossard;
	
	private static int id_num=1;
	
	public Sportif() {
		this(null,null,null);
	}
	
	public Sportif(String nom, String prenom,Dossard dossard) {
		this.nom = nom;
		this.prenom = prenom;
		this.id=id_num++;
		this.dossard=dossard;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Dossard getDossard() {
		return dossard;
	}

	public void setDossard(Dossard dossard) {
		this.dossard = dossard;
	}	
}
