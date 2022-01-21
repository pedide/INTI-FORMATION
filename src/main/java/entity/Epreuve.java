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
@Table(name="epreuve")
public class Epreuve {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idEpreuve")
	private int idEpreuve;
	
	@Column(name="typeEpreuve")
	private String typeEpreuve;
	
	@Column(name="distanceEpreuve")
	private int distanceEpreuve;
	
	@Column(name="conditionEpreuve")
	private String conditionEpreuve;
	
	@ManyToOne
	@JoinColumn(name="idCompetition")
	private Competition competition;
	
	public Epreuve(String typeEpreuve, int distanceEpreuve, String conditionEpreuve, Competition competition) {
		super();
		this.typeEpreuve = typeEpreuve;
		this.distanceEpreuve = distanceEpreuve;
		this.conditionEpreuve = conditionEpreuve;
		this.competition = competition;
	}
	
	public Epreuve() {
		super();
	}
	
	public int getIdEpreuve() {
		return idEpreuve;
	}
	
	public void setIdEpreuve(int idEpreuve) {
		this.idEpreuve = idEpreuve;
	}
	
	public String getTypeEpreuve() {
		return typeEpreuve;
	}
	
	public void setTypeEpreuve(String typeEpreuve) {
		this.typeEpreuve = typeEpreuve;
	}
	
	public int getDistanceEpreuve() {
		return distanceEpreuve;
	}
	
	public void setDistanceEpreuve(int distanceEpreuve) {
		this.distanceEpreuve = distanceEpreuve;
	}
	
	public String getConditionEpreuve() {
		return conditionEpreuve;
	}
	
	public void setConditionEpreuve(String conditionEpreuve) {
		this.conditionEpreuve = conditionEpreuve;
	}

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
}
