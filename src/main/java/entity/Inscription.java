package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="inscription")
public class Inscription {
	@Id
	@Column(name="numDossard")
	private int numDossard;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_Compet")
	private Competition compet;
	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_Sport")
	private Sportif sport;
	
	
	public Inscription(int numDossard, Competition compet, Sportif sport) {
		super();
		this.numDossard = numDossard;
		this.compet = compet;
		this.sport = sport;
	}

	public Competition getCompet() {
		return compet;
	}

	public void setCompet(Competition compet) {
		this.compet = compet;
	}

	public Sportif getSport() {
		return sport;
	}

	public void setSport(Sportif sport) {
		this.sport = sport;
	}

	public int getNumDossard() {
		return numDossard;
	}

	public void setNumDossard(int numDossard) {
		this.numDossard = numDossard;
	}
	
}
