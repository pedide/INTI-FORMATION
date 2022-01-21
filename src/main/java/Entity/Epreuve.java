package Entity;

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
public class Epreuve implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int idEpreuve;
	
	@Column(name="typeEp")
	private String typeEp;
	
	@Column(name="distance")
	private int distance;
	
	@Column(name="conditionEp")
	private String conditionEp;
	
	@ManyToOne
	@JoinColumn(name="competition_id")
	private Competition competition;
	
	public Epreuve() {
		super();
	}

	
	
	public Epreuve(String typeEp, int distance, String conditionEp) {
		super();
		this.typeEp = typeEp;
		this.distance = distance;
		this.conditionEp = conditionEp;
	}



	public Epreuve(String typeEp, int distance, String conditionEp, Competition competition) {
		super();
		this.typeEp = typeEp;
		this.distance = distance;
		this.conditionEp = conditionEp;
		this.competition = competition;
	}



	public int getIdEpreuve() {
		return idEpreuve;
	}



	public void setIdEpreuve(int idEpreuve) {
		this.idEpreuve = idEpreuve;
	}



	public String getTypeEp() {
		return typeEp;
	}



	public void setTypeEp(String typeEp) {
		this.typeEp = typeEp;
	}



	public int getDistance() {
		return distance;
	}



	public void setDistance(int distance) {
		this.distance = distance;
	}



	public String getConditionEp() {
		return conditionEp;
	}



	public void setConditionEp(String conditionEp) {
		this.conditionEp = conditionEp;
	}



	public Competition getCompetition() {
		return competition;
	}



	public void setCompetition(Competition competition) {
		this.competition = competition;
	}


	
	
	
	
	

	
	

	
	
}
