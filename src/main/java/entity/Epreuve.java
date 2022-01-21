package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="epreuve")

public class Epreuve {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="idEpreuve")
	private int id;
	
	@Column(name="typeEpreuve")
	private String typeEpreuve;
	
	@Column(name="distanceEpreuve")
	private int distanceEpreuve;
	
	@Column(name="conditionEpreuve")
	private String conditionEpreuve;
	
	@ManyToOne
	@JoinColumn(name="idCompet")
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
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	/**public int getIdCompet() {
		return idCompet;
	}
	public void setIdCompet(int idCompet) {
		this.idCompet = idCompet;
	}**/
	
	
	
}
