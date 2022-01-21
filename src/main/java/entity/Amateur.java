package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="amateur")

public class Amateur extends Sportifs {
	
	@Column(name="certificatMedical")
	private int certificatMedical;
	
	@Column(name="nomMedecin")
	private String nomMedecin;
	
	
	
	
	
	public Amateur() {
		super();
	}
	
	public Amateur(String nomSportif, String prenomSportif, String ville, String pays, int certificatMedical, String nomMedecin) {
		super(nomSportif, prenomSportif, ville, pays);
		this.certificatMedical = certificatMedical;
		this.nomMedecin = nomMedecin;
	}
	public int getCertificatMedical() {
		return certificatMedical;
	}
	public void setCertificatMedical(int certificatMedical) {
		this.certificatMedical = certificatMedical;
	}
	public String getNomMedecin() {
		return nomMedecin;
	}
	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}

	
	

}
