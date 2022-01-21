package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="inscrire")

public class Inscrire {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idinscription")
	private int idInscription; 
	
	@Column(name="dossardcompet")
	private int dossardCompet;
	
	@ManyToOne
	@JoinColumn(name="idcompet")
    private Competitions competitions;
	
	@ManyToOne
	@JoinColumn(name="idsportif")
    private Sportifs sportifs;
	
	public Inscrire() {
		super();
	}

	public Inscrire(int idInscription, int dossardCompet) {
		super();
		this.idInscription = idInscription;
		this.dossardCompet = dossardCompet;
	}

	
	public Inscrire(int dossardCompet, Competitions competitions, Sportifs sportifs) {
		super();
		this.dossardCompet = dossardCompet;
		this.competitions = competitions;
		this.sportifs = sportifs;
	}

	public Competitions getCompetitions() {
		return competitions;
	}

	public void setCompetitions(Competitions competitions) {
		this.competitions = competitions;
	}

	public Sportifs getSportifs() {
		return sportifs;
	}

	public void setSportifs(Sportifs sportifs) {
		this.sportifs = sportifs;
	}

	public int getIdInscription() {
		return idInscription;
	}

	public void setIdInscription(int idInscription) {
		this.idInscription = idInscription;
	}

	public int getDossardCompet() {
		return dossardCompet;
	}

	public void setDossardCompet(int dossardCompet) {
		this.dossardCompet = dossardCompet;
	} 
	
	
}