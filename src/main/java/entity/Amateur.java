package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="amateur")
public class Amateur extends Sportif{
	@Column(name="certificatMedical")
	private int certificatMedical;
	@Column(name="nomMedecin")
	private String nomMedecin;
	
	
	public Amateur(Sportif sport, int certificatMedical, String nomMedecin) {
		super(sport.nomSportif, sport.prenomSportif, sport.adresse, sport.cp, sport.ville, sport.pays, sport.email, sport.tel, sport.fax);
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
