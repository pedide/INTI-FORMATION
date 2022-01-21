package domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


public class licencier extends sportifs {

	private int numLicence;
	private String nomClub;
	
	
	

	public licencier() {
		super();
		// TODO Auto-generated constructor stub
	}


	public licencier(int numLicence, String nomClub) {
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
