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
public class inscription implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int idEpreuve;
	@Column(name = "dossard")
	private String dossard;
	
	@ManyToOne
	@JoinColumn(name = "Competition_id")
	private Competitions competition;
	
	@ManyToOne
	@JoinColumn(name = "Sportifs_id")
	private Sportifs sportifs;
	
	public inscription() {
		super();
	}



	public inscription(String dossard) {
		super();
		this.dossard = dossard;
	}




	public Competitions getCompetitions() {
		return competition;
	}



	public void setCompetitions(Competitions competitions) {
		this.competition = competitions;
	}



	public Sportifs getSportifs() {
		return sportifs;
	}



	public void setSportifs(Sportifs sportifs) {
		this.sportifs = sportifs;
	}



	public String getDossard() {
		return dossard;
	}

	public void setDossard(String dossard) {
		this.dossard = dossard;
	}


	
	
	
	
}
