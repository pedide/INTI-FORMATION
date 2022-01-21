package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="inscription")
public class Inscription implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@Column(name="NUM_DOSSARD")
	private int dossardcompet;


	@ManyToOne
	@JoinColumn(name="nom_competition", referencedColumnName="NOM_COMPET")
	
	private Competitions competition;
	
	//@ManyToOne
	//@JoinColumn(name="nom_sportif", referencedColumnName="NOM")
	
	//private Sportif sportif;
	
	public Inscription() {
		super();
	}

	public Inscription(int dossardcompet) {
		super();
		this.dossardcompet = dossardcompet;
	}
	
	public Inscription(long id, int dossardcompet) {
		super();
		this.id = id;
		this.dossardcompet = dossardcompet;
	}
	


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDossardcompet() {
		return dossardcompet;
	}

	public void setDossardcompet(int dossardcompet) {
		this.dossardcompet = dossardcompet;
	}

	public Competitions getCompetition() {
		return competition;
	}

	public void setCompetition(Competitions competition) {
		this.competition = competition;
	}

	
	/*public Sportif getSportif() {
		return sportif;
	}

	public void setSportif(Sportif sportif) {
		this.sportif = sportif;
	}*/

	
	
	
	
}
