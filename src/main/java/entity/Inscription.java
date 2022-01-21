package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idInscription")
	private int idInscription;
	
	
	@Column(name="dossardCompet")
	private int dossardCompet;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idSportif")
	private Sportif sportif;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCompetition")
	private Competition competition;
	
	public Inscription(int dossardCompet, Sportif sportif, Competition competition) {
		super();
		this.dossardCompet = dossardCompet;
		this.sportif = sportif;
		this.competition = competition;
	}

	public Inscription() {
		super();
	}

	public int getDossardCompet() {
		return dossardCompet;
	}

	public void setDossardCompet(int dossardCompet) {
		this.dossardCompet = dossardCompet;
	}

	public Sportif getSportif() {
		return sportif;
	}

	public void setSportif(Sportif sportif) {
		this.sportif = sportif;
	}

	public Competition getCompetition() {
		return competition;
	}
	
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
}
