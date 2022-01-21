package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="licensier")
public class Licencier extends Sportif{
	@Column(name="nomLicence")
	private String nomLicence;
	@Column(name="nomClub")
	private String nomClub;
	
	public Licencier() {
		super();
	}
	
	public Licencier(String nom,String prenom,String nomLicence, String nomClub,Dossard dossard) {
		super(nom,prenom,dossard);
		this.nomLicence = nomLicence;
		this.nomClub = nomClub;
	}

	public String getNomLicence() {
		return nomLicence;
	}

	public void setNomLicence(String nomLicence) {
		this.nomLicence = nomLicence;
	}

	public String getNomClub() {
		return nomClub;
	}

	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	
	
}
