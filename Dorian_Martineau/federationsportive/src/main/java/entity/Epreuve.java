package entity;

import javax.persistence.CascadeType;
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
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int id;
	
	@Column(name="typeEpreuve")
	private String typeEpreuve;
	
	@Column(name="distance")
	private double distance;
	
	@Column(name="conditions")
	private String condition;
	
	@ManyToOne(cascade= CascadeType.PERSIST)
	@JoinColumn(name="idCompet")
	private Competition compet;
	
	public Epreuve() {}
	
	public Epreuve(String typeEpreuve, double distance, String condition) {
		super();
		this.typeEpreuve = typeEpreuve;
		this.distance = distance;
		this.condition = condition;
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

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Competition getCompet() {
		return compet;
	}

	public void setCompet(Competition compet) {
		this.compet = compet;
	}
	
}
