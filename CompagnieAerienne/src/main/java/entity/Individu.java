package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="individu")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn(name ="type")

public class Individu {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idindividu")
	private int idindividu ;
	protected String nom; 
	protected String prenom; 
	protected String adresse; 
	protected String cp; 
	protected String ville;
	
	public Individu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Individu(String nom, String prenom, String adresse, String cp, String ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
	}
	
	



	public int getIdindividu() {
		return idindividu;
	}

	public void setIdindividu(int idindividu) {
		this.idindividu = idindividu;
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
