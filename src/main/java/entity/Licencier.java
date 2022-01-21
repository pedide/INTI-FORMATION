package entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="licencier") // fait le lien avec la table clients dans mysql


public class Licencier extends Sportifs{
	@Column(name = "numLicence")
	private int numLicence;
	@Column(name = "nomClub")
	private String nomClub;
	
	public Licencier() {
		super();
	}
	
	
	
	public Licencier(String nomSportif, String prenomSportif, String adresse, int cp, String ville, String pays,
			String email, String tel, String fax, int numLicence, String nomClub) {
		super(nomSportif, prenomSportif, adresse, cp, ville, pays, email, tel, fax);
		this.numLicence = numLicence;
		this.nomClub = nomClub;
	}


	public int getNumLicence() {
		return numLicence;
	}
	public void setNumLicence(int numLicence) {
		this.numLicence = numLicence;
	}
	public String getNomClub() {
		return nomClub;
	}
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	
	

}
