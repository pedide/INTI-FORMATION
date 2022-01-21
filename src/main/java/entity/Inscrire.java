package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Inscrire")
public class Inscrire {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idInscrire;
	
	private int DossardCompet;
	
	@ManyToOne
	@JoinColumn(name= "competition_idCompet")
	private Competition competition;
	
	@ManyToOne
	@JoinColumn(name= "sportif_idSportif")
	private Sportif sportif;
	
	public Inscrire() {
		this(0);
	}
	
	
	
	public Inscrire(int dossardCompet, Competition competition, Sportif sportif) {
		super();
		DossardCompet = dossardCompet;
		this.competition = competition;
		this.sportif = sportif;
	}



	public Inscrire(int idInscrire, int dossardCompet) {
		super();
		this.idInscrire = idInscrire;
		DossardCompet = dossardCompet;
	}

	public int getIdInscrire() {
		return idInscrire;
	}

	public void setIdInscrire(int idInscrire) {
		this.idInscrire = idInscrire;
	}

	public Inscrire(int dossardCompet) {
		super();
		DossardCompet = dossardCompet;
	}

	public int getDossardCompet() {
		return DossardCompet;
	}

	public void setDossardCompet(int dossardCompet) {
		DossardCompet = dossardCompet;
	}

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public Sportif getSportif() {
		return sportif;
	}

	public void setSportif(Sportif sportif) {
		this.sportif = sportif;
	}
	
	
	
}
