package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="licencier")
@PrimaryKeyJoinColumn(name="idSportif")
public class Licencier extends Sportif{
	@Column(name="numLicence")
	private int numLicence;

	@Column(name="nomClub")
	private String nomClub;
	
	public Licencier(String nomSPortif, String prenomSportif, String adresse, int cp, String ville,
			String pays, String email, String tel, String fax, int numLicence, String nomClub) {
		super(nomSPortif, prenomSportif, adresse, cp, ville, pays, email, tel, fax);
		this.numLicence = numLicence;
		this.nomClub = nomClub;
	}
	
	public Licencier() {
		super();
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
