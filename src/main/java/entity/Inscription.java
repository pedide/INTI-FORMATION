package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="inscription")

public class Inscription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idInscription")
	private int idInscription;
	
	@Column(name="dossardCompet")
	private int dossardCompet;
	
	@ManyToOne
	@JoinColumn(name="idSportif")
	private Sportifs sportifs;
	
	@ManyToOne
	@JoinColumn(name="idCompet")
	private Competition competition;

	
	public Inscription(int dossardCompet, Sportifs sportif, Competition competition) {
		super();
		this.dossardCompet = dossardCompet;
		this.sportifs = sportif;
		this.competition = competition;
	}

	
	public Inscription() {
		super();
	}

	public Inscription(int dossardCompet) {
		super();
		this.dossardCompet = dossardCompet;
	}

	public int getDossardCompet() {
		return dossardCompet;
	}

	public void setDossardCompet(int dossardCompet) {
		this.dossardCompet = dossardCompet;
	}

	public Sportifs getSportifs() {
		return sportifs;
	}

	public void setSportifs(Sportifs sportifs) {
		this.sportifs = sportifs;
	}

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
	
	
	
}
