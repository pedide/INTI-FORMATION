package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avion")

public class Avion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idavion")
	private int idAvion; 
	
	@Column(name="modelavion")
	private String modelAvion;
	
	@Column(name="nbplaceavion")
	private int nbplacesAvion; 
	
	@Column(name="localiteavion")
	private String localisationAvion;
	

	
	public Avion() {
		super();
	}

	public Avion(String modelAvion, int nbplacesAvion, String localisationAvion) {
		super();
		this.modelAvion = modelAvion;
		this.nbplacesAvion = nbplacesAvion;
		this.localisationAvion = localisationAvion;
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getModelAvion() {
		return modelAvion;
	}

	public void setModelAvion(String modelAvion) {
		this.modelAvion = modelAvion;
	}

	public int getNbplacesAvion() {
		return nbplacesAvion;
	}

	public void setNbplacesAvion(int nbplacesAvion) {
		this.nbplacesAvion = nbplacesAvion;
	}

	public String getLocalisationAvion() {
		return localisationAvion;
	}

	public void setLocalisationAvion(String localisationAvion) {
		this.localisationAvion = localisationAvion;
	} 
	
	
}
