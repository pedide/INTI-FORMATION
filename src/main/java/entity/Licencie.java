package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="licencie")

public class Licencie extends Sportifs {
	
	
	@Column(name="numLicencie")
	private int numLicencie;
	
	@Column(name="nomClub")
	private String nomClub;
	
	
	
	
	public Licencie(String nomSportif, String prenomSportif, String ville, String pays, int numLicencie, String nomClub) {
		super(nomSportif, prenomSportif, ville, pays);
		this.numLicencie = numLicencie;
		this.nomClub = nomClub;
		
	}
	public Licencie() {
		super();
	}
	/**public Licencie(int numLicencie, String nomClub) {
		super();
		this.numLicencie = numLicencie;
		this.nomClub = nomClub;
	}**/
	public int getNumLicencie() {
		return numLicencie;
	}
	public void setNumLicencie(int numLicencie) {
		this.numLicencie = numLicencie;
	}
	public String getNomClub() {
		return nomClub;
	}
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	
	

}
