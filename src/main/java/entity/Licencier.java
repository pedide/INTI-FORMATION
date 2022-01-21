package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="licencier")
public class Licencier extends Sportif{
	@Column(name="numLicence")
	private int numLicence;
	@Column(name="nomClub")
	private String nomClub;
	
	public Licencier(Sportif sport, int numLicence, String nomClub) {
		super(sport.nomSportif, sport.prenomSportif, sport.adresse, sport.cp, sport.ville, sport.pays, sport.email, sport.tel, sport.fax);
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
