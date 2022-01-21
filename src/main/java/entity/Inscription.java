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
@Table
public class Inscription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idinscription")
	private int idinscription;
	
	@Column(name="dossardCompet")
	private int dossardCompet;

	@ManyToOne
	@JoinColumn(name="idsportif")
	private Sportifs sportifs;
	
	@ManyToOne
	@JoinColumn(name="idcompet")
	private Competitions competitions;
	
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

	public Competitions getCompetitions() {
		return competitions;
	}

	public void setCompetitions(Competitions competitions) {
		this.competitions = competitions;
	}
	
}
