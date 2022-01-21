package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="epreuve") 
public class epreuve {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idEpreuve")
	private int idEpreuve;
	private String typeEpreuve;
	private String distanceEpreuve;
	private String conditEpreuve;
	
	
	
	@ManyToOne 
    private competitions compet;
	
	
	
	
	public epreuve() {
		super();
		
	}
	
	public epreuve( String typeEpreuve, String distanceEpreuve, String conditEpreuve, competitions compet) {
		
		this.typeEpreuve = typeEpreuve;
		this.distanceEpreuve = distanceEpreuve;
		this.conditEpreuve = conditEpreuve;
		this.compet =compet;
	}
	
	public epreuve( String typeEpreuve, String distanceEpreuve, String conditEpreuve) {
	
		this.typeEpreuve = typeEpreuve;
		this.distanceEpreuve = distanceEpreuve;
		this.conditEpreuve = conditEpreuve;
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
	public String getDistanceEpreuve() {
		return distanceEpreuve;
	}
	public void setDistanceEpreuve(String distanceEpreuve) {
		this.distanceEpreuve = distanceEpreuve;
	}
	public String getConditEpreuve() {
		return conditEpreuve;
	}
	public void setConditEpreuve(String conditEpreuve) {
		this.conditEpreuve = conditEpreuve;
	}
	
	
	

}
