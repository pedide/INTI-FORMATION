package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Licencie")
public class Licencie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLicencie;
	private int numLicence;
	private String nomClub;
	
	@OneToOne 
    @JoinColumn( name="sportif_idSportif" )
    private Sportif sportif;
	
	public Licencie() {
		this(0, "");
	}

	
	public Licencie(int numLicence, String nomClub, Sportif sportif) {
		super();
		this.numLicence = numLicence;
		this.nomClub = nomClub;
		this.sportif = sportif;
	}



	public Licencie(int numLicence, String nomClub) {
		super();
		this.numLicence = numLicence;
		this.nomClub = nomClub;
	}
	public Licencie(int idLicencie, int numLicence, String nomClub) {
		super();
		this.idLicencie = idLicencie;
		this.numLicence = numLicence;
		this.nomClub = nomClub;
	}
	public int getIdLicencie() {
		return idLicencie;
	}
	public void setIdLicencie(int idLicencie) {
		this.idLicencie = idLicencie;
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
	public Sportif getSportif() {
		return sportif;
	}
	public void setSportif(Sportif sportif) {
		this.sportif = sportif;
	}
	
	
	
	
}
