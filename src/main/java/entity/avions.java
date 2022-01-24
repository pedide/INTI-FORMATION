package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="avions")
public class avions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAvion;
	private String modeleAvion;
	private int placesAvion;
	private String localiteAvion;
	
	@OneToMany(mappedBy="avions", fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST})
	private List<vols>listeVols = new ArrayList<vols>();
	
	public avions() {
		super();
	}
	
	

	public avions(String modeleAvion, int placesAvion, String localiteAvion) {
		super();
		this.modeleAvion = modeleAvion;
		this.placesAvion = placesAvion;
		this.localiteAvion = localiteAvion;
	}



	public avions(String modeleAvion, int placesAvion, String localiteAvion, List<vols>listevols) {
		super();
		this.modeleAvion = modeleAvion;
		this.placesAvion = placesAvion;
		this.localiteAvion = localiteAvion;
		listeVols = listevols;
		
	    for (vols v : listevols)
	    {
	        v.setAvion(this);
	    }
	}
	
	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getModeleAvion() {
		return modeleAvion;
	}

	public void setModeleAvion(String modeleAvion) {
		this.modeleAvion = modeleAvion;
	}

	public int getPlacesAvion() {
		return placesAvion;
	}

	public void setPlacesAvion(int placesAvion) {
		this.placesAvion = placesAvion;
	}

	public String getLocaliteAvion() {
		return localiteAvion;
	}

	public void setLocaliteAvion(String localiteAvion) {
		this.localiteAvion = localiteAvion;
	}
	
	
	
}
