package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="epreuve")
public class Epreuve implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long idep;
	@Column(name="TYPE_EP")
	private String typeep;
	@Column(name="DISTANCE_EP")
	private int distanceep;
	@Column(name="CONDITION_EP")
	private String conditionep;
	
	@ManyToOne
	@JoinColumn(name="nom_competition", referencedColumnName="NOM_COMPET")
	
	private Competitions competition;
	
	public Epreuve() {
		super();
	}
	
	public Epreuve(String typeep) {
		super();
		this.typeep = typeep;
	}

	public Epreuve(Long idep, String typeep) {
		super();
		this.idep = idep;
		this.typeep = typeep;
	}
	
	public Epreuve(Long idep, String typeep, int distanceep, String conditionep) {
		super();
		this.idep = idep;
		this.typeep = typeep;
		this.distanceep = distanceep;
		this.conditionep = conditionep;
	}
	
	
	public Long getIdep() {
		return idep;
	}
	public void setIdep(Long idep) {
		this.idep = idep;
	}
	public String getTypeep() {
		return typeep;
	}
	public void setTypeep(String typeep) {
		this.typeep = typeep;
	}
	public int getDistanceep() {
		return distanceep;
	}
	public void setDistanceep(int distanceep) {
		this.distanceep = distanceep;
	}
	public String getConditionep() {
		return conditionep;
	}
	public void setConditionep(String conditionep) {
		this.conditionep = conditionep;
	}

	public Competitions getCompetition() {
		return competition;
	}

	public void setCompetition(Competitions competition) {
		this.competition = competition;
	}
	
}
