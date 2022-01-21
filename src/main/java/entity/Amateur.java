package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="amateur")
@PrimaryKeyJoinColumn(name="idSportif")
public class Amateur extends Sportif{
	@Column(name="certificatMedical")
	private boolean certificatMedecin;
	
	@Column(name="nomMedecin")
	private String nomMedecin;
	
	public Amateur(String nomSPortif, String prenomSportif, String adresse, int cp, String ville,
			String pays, String email, String tel, String fax, boolean certificatMedecin, String nomMedecin) {
		super(nomSPortif, prenomSportif, adresse, cp, ville, pays, email, tel, fax);
		this.certificatMedecin = certificatMedecin;
		this.nomMedecin = nomMedecin;
	}

	public Amateur() {
		super();
	}

	public boolean isCertificatMedecin() {
		return certificatMedecin;
	}

	public void setCertificatMedecin(boolean certificatMedecin) {
		this.certificatMedecin = certificatMedecin;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
}
