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
	@Column(name="idAvion")
	private int idAvion;
	
	@Column(name="modele")
	private String modele;
	
	@Column(name="nbrPlaces")
	private int nbrPlaces;
	
	@Column(name="localite")
	private String localite;
	
	public Avion(String modele, int nbrPlaces, String localite) {
		super();
		this.modele = modele;
		this.nbrPlaces = nbrPlaces;
		this.localite = localite;
	}
	
	public int getIdAvion() {
		return idAvion;
	}
	
	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}
	
	public String getModele() {
		return modele;
	}
	
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public int getNbrPlaces() {
		return nbrPlaces;
	}
	
	public void setNbrPlaces(int nbrPlaces) {
		this.nbrPlaces = nbrPlaces;
	}
	
	public String getLocalite() {
		return localite;
	}
	
	public void setLocalite(String localite) {
		this.localite = localite;
	}
}
