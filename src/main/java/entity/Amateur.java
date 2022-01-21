package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Amateur")
public class Amateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAmateur;
	private String certifMedical;
	private String nomMedecin;
	
	@OneToOne 
    @JoinColumn( name="sportif_idSportif" )
    private Sportif sportif;
	
	public Amateur() {
		this("", "");
		
	}
	
	
	
	public Amateur(String certifMedical, String nomMedecin, Sportif sportif) {
		super();
		this.certifMedical = certifMedical;
		this.nomMedecin = nomMedecin;
		this.sportif = sportif;
	}



	public Amateur(String certifMedical, String nomMedecin) {
		super();
		this.certifMedical = certifMedical;
		this.nomMedecin = nomMedecin;
	}
	public Amateur(int idAmateur, String certifMedical, String nomMedecin) {
		super();
		this.idAmateur = idAmateur;
		this.certifMedical = certifMedical;
		this.nomMedecin = nomMedecin;
	}
	public int getIdAmateur() {
		return idAmateur;
	}
	public void setIdAmateur(int idAmateur) {
		this.idAmateur = idAmateur;
	}
	public String getCertifMedical() {
		return certifMedical;
	}
	public void setCertifMedical(String certifMedical) {
		this.certifMedical = certifMedical;
	}
	public String getNomMedecin() {
		return nomMedecin;
	}
	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	public Sportif getSportif() {
		return sportif;
	}
	public void setSportif(Sportif sportif) {
		this.sportif = sportif;
	}
	
	

}
