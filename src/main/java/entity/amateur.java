package entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("amateur")
public class amateur extends sportifs{
	
	private String CertificatMedical;
	private String nomMedecin;
	
	
	
	
	public amateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	




	public amateur(String certificatMedical, String nomMedecin) {
		this.CertificatMedical = certificatMedical;
		this.nomMedecin = nomMedecin;
		
	}
	
	
	public amateur(String nom,String prenom, String Adresse,String certificatMedical, String nomMedecin) {
		super();
		this.nomMedecin = nomMedecin;
		this.nom = nom;
		this.prenom= prenom; 
		this.Adresse = Adresse ;
		this.CertificatMedical = certificatMedical;
		this.nomMedecin = nomMedecin;
		
	}






	public String getCertificatMedical() {
		return CertificatMedical;
	}




	public void setCertificatMedical(String certificatMedical) {
		CertificatMedical = certificatMedical;
	}




	public String getNomMedecin() {
		return nomMedecin;
	}




	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	
	
	
	

}
