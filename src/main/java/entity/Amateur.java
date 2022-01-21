package entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="amateur") // fait le lien avec la table clients dans mysql
public class Amateur extends Sportifs {
	
	@Column(name="certificatMedical")
	private int certificatMedical;
	@Column(name="nomMedecin")
	private String nomMedecin;
	
	public Amateur() {
		super();
	}
	

	public Amateur(String nomSportif, String prenomSportif, String adresse, int cp, String ville, String pays,
			String email, String tel, String fax, int certificatMedical, String nomMedecin) {
		super(nomSportif, prenomSportif, adresse, cp, ville, pays, email, tel, fax);
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
