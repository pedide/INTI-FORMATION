package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="avion")
public class Avion implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idavion")
	private int idavion;
	@Column(name="modele")
	private String modele;
	@Column(name="nbrePlace")
	private int nbrePlace;
	@Column(name="localite")
	private String localite;
	
	// j'associe à un vol, un avion
	@OneToOne(mappedBy="avion")
	private Vols vols;
	
	public Avion() {
		super();
	}
	
	public Avion(String modele, int nbrePlace, String localite) {
		super();
		this.modele = modele;
		this.nbrePlace = nbrePlace;
		this.localite = localite;
	}
	
	public Avion(int idavion, String modele, int nbrePlace, String localite) {
		super();
		this.idavion = idavion;
		this.modele = modele;
		this.nbrePlace = nbrePlace;
		this.localite = localite;
	}
	
	
	public int getIdavion() {
		return idavion;
	}
	public void setIdavion(int idavion) {
		this.idavion = idavion;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getNbrePlace() {
		return nbrePlace;
	}
	public void setNbrePlace(int nbrePlace) {
		this.nbrePlace = nbrePlace;
	}
	public String getLocalite() {
		return localite;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	
	
}
