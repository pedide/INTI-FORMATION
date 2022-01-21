package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sportifs")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn(name ="type")


public class sportifs {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idsportifs")
	private int idsportifs;
	protected String nom;
	protected String prenom;
	protected String Adresse;
	
	@OneToMany
    private List<inscription> listinscription;
    
	

	
	public sportifs() {	
		super();
		// TODO Auto-generated constructor stub
	}

	

	public sportifs(String nom, String prenom, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		Adresse = adresse;
	}



	public int getIdsportifs() {
		return idsportifs;
	}


	public void setIdsportifs(int idsportifs) {
		this.idsportifs = idsportifs;
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
		return Adresse;
	}


	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	
	
	
	
	
	
}
