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
	@Column(name="idinscription")
	private int idinscription;
	@Column(name="dossardcompet")
	private int dossardcompet;
	
	@ManyToOne()
	@JoinColumn(name="competition_id")
	private Competitions competitions;
	
	@ManyToOne()
	@JoinColumn(name="sportif_id")
	private Sportifs sportifs;

	public Inscription() {
		super();
	}

	public Inscription(int dossardcompet) {
		super();
		this.dossardcompet = dossardcompet;
	}
	
	

	public int getDossardcompet() {
		return dossardcompet;
	}

	public void setDossardcompet(int dossardcompet) {
		this.dossardcompet = dossardcompet;
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
	
	
	
}
