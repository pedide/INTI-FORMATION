package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="avion")
public class Avions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column(name="aviModel")
	private String model;
	@Column(name="nombrePlace")
	private int nbPlace;
	@Column(name="Localisation")
	private String loc;
	@OneToOne(mappedBy="avion",cascade=CascadeType.PERSIST)
	private Vols vol;
	public Avions() {}
	public Avions(String model, int nbPlace, String loc) {
		super();
		this.model = model;
		this.nbPlace = nbPlace;
		this.loc = loc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
