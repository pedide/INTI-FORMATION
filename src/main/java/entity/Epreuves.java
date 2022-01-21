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
@Table(name="epreuves")
public class Epreuves implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idEpreuve")
	private int idEpreuve;
	@Column(name="typeEpreuve")
	private String typeEpreuve;
	@Column(name="distanceEpreuve")
	private int distanceEpreuve;
	@Column(name="conditionEpreuve")
	private String conditionEpreuve;
	
	@ManyToOne
	@JoinColumn(name = "Competition_id")
	private Competitions competitions;
	
	public Epreuves() {
		super();
	}
	public Epreuves(String typeEpreuve, int distanceEpreuve, String conditionEpreuve) {
		super();
		this.typeEpreuve = typeEpreuve;
		this.distanceEpreuve = distanceEpreuve;
		this.conditionEpreuve = conditionEpreuve;
	}
	
	public Competitions getCompetitions() {
		return competitions;
	}
	public void setCompetitions(Competitions competitions) {
		this.competitions = competitions;
	}
	public int getIdEpreuve() {
		return idEpreuve;
	}
	public void setIdEpreuve(int idEperuve) {
		this.idEpreuve = idEperuve;
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
	
	

}
