package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Epreuve")
public class Epreuve {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEpr;
	private String typeEpr;
	private int distanceEpr;
	private int conditionEpr;
	
	@ManyToOne
	@JoinColumn(name= "competition_idCompet")
	private Competition competition;	
	
	
	
	public Epreuve(String typeEpr, int distanceEpr, int conditionEpr, Competition competition) {
		super();
		this.typeEpr = typeEpr;
		this.distanceEpr = distanceEpr;
		this.conditionEpr = conditionEpr;
		this.competition = competition;
	}
	public Epreuve() {
		this("", 0, 0);
		
	}
	public Epreuve(String typeEpr, int distanceEpr, int conditionEpr) {
		super();
		this.typeEpr = typeEpr;
		this.distanceEpr = distanceEpr;
		this.conditionEpr = conditionEpr;
	}
	public Epreuve(int idEpr, String typeEpr, int distanceEpr, int conditionEpr) {
		super();
		this.idEpr = idEpr;
		this.typeEpr = typeEpr;
		this.distanceEpr = distanceEpr;
		this.conditionEpr = conditionEpr;
	}
	public int getIdEpr() {
		return idEpr;
	}
	public void setIdEpr(int idEpr) {
		this.idEpr = idEpr;
	}
	public String getTypeEpr() {
		return typeEpr;
	}
	public void setTypeEpr(String typeEpr) {
		this.typeEpr = typeEpr;
	}
	public int getDistanceEpr() {
		return distanceEpr;
	}
	public void setDistanceEpr(int distanceEpr) {
		this.distanceEpr = distanceEpr;
	}
	public int getConditionEpr() {
		return conditionEpr;
	}
	public void setConditionEpr(int conditionEpr) {
		this.conditionEpr = conditionEpr;
	}
	public Competition getCompetition() {
		return competition;
	}
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
	
	
	
}
