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
@Table(name="epreuve")
public class Epreuve implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idepreuve")
	private int idepreuve;
	@Column(name="typeepreuve")
	private String typeepreuve;
	@Column(name="distanceepreuve")
	private int distanceepreuve;
	@Column(name="conditionepreuve")
	private String conditionepreuve;
	
	@ManyToOne()
	@JoinColumn(name="competition_id")
	private Competitions competitions;
	
	
	
	public Epreuve() {
		super();
	}
	

	public Epreuve(String typeepreuve, int distanceepreuve, String conditionepreuve) {
		super();
		this.typeepreuve = typeepreuve;
		this.distanceepreuve = distanceepreuve;
		this.conditionepreuve = conditionepreuve;
	}



	public int getIdepreuve() {
		return idepreuve;
	}


	public void setIdepreuve(int idepreuve) {
		this.idepreuve = idepreuve;
	}



	public Competitions getCompetitions() {
		return competitions;
	}


	public void setCompetitions(Competitions competitions) {
		this.competitions = competitions;
	}


	public String getTypeepreuve() {
		return typeepreuve;
	}

	public void setTypeepreuve(String typeepreuve) {
		this.typeepreuve = typeepreuve;
	}

	public int getDistanceepreuve() {
		return distanceepreuve;
	}

	public void setDistanceepreuve(int distanceepreuve) {
		this.distanceepreuve = distanceepreuve;
	}

	public String getConditionepreuve() {
		return conditionepreuve;
	}

	public void setConditionepreuve(String conditionepreuve) {
		this.conditionepreuve = conditionepreuve;
	}


	
}
