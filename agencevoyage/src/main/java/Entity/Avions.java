package Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="avions")
public class Avions implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAvion")
	private int idAvion;
	private String modele;
	@Column(name="nbPlace")
	private int nbPlaces;
	private String localite;
	
	
	
	public Avions() {
		super();
	}
	
	public Avions(String modele, int nbPlaces, String localite) {
		super();
		this.modele = modele;
		this.nbPlaces = nbPlaces;
		this.localite = localite;
	}
	
	@OneToMany (mappedBy="avions", cascade= {CascadeType.PERSIST})
	private List<Vols> listvols = new ArrayList<Vols>();
	
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
	public int getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	public String getLocalite() {
		return localite;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}

	public List<Vols> getListvols() {
		return listvols;
	}

	public void setListvols(List<Vols> listvols) {
		this.listvols = listvols;
	}


	
	
}
