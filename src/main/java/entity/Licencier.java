package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="licencier")

public class Licencier extends Sportifs{
	@Column(name="numlicence")
	private int numLicence; 
	
	@Column(name="nomclub")
	private String nomClub;
	
	public Licencier() {
		super();
	}

	public Licencier(int numLicence, String nomClub) {
		super();
		this.numLicence = numLicence;
		this.nomClub = nomClub;
	}

	public Licencier(String nomSportif, String prenomSportif, int dossardCompet) {
		super(nomSportif, prenomSportif, dossardCompet);
		// TODO Auto-generated constructor stub
	}

	public Licencier(String nomSportif, String prenomSportif, String adresseSportif, int cpSportif, String villeSportif,
			String paysSportif, String email, String tel, int dossardCompet, int numLicence, String nomClub) {
		super(nomSportif, prenomSportif, adresseSportif, cpSportif, villeSportif, paysSportif, email, tel, dossardCompet);
		this.numLicence = numLicence;
		this.nomClub = nomClub;
		// TODO Auto-generated constructor stub
	}

	public Licencier(String nomSportif, String prenomSportif, String adresseSportif, int cpSportif, String villeSportif,
			String paysSportif, String email, String tel, int dossardCompet, List<Competitions> competitions) {
		super(nomSportif, prenomSportif, adresseSportif, cpSportif, villeSportif, paysSportif, email, tel, dossardCompet);
		// TODO Auto-generated constructor stub
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
	
}
