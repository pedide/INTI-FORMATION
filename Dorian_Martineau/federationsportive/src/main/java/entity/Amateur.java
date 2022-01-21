package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="amateur")
public class Amateur extends Sportif{
	@Column(name="certificat")
	private boolean certificat;
	
	public Amateur() {
		super();
	}
	
	public Amateur(String nom,String prenom,boolean certificat,Dossard dossard) {
		super(nom,prenom,dossard);
		this.certificat = certificat;
	}

	public boolean isCertificat() {
		return certificat;
	}

	public void setCertificat(boolean certificat) {
		this.certificat = certificat;
	}
	
	
}
