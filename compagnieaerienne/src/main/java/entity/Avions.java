package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="avion")
public class Avions implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aviID")
	private int idAvions;
	@Column(name="aviMODEL")
	private String modelAvions;
	@Column(name="aviNombreDePlace")
	private int nombreDePlaceAvions;
	@Column(name="aviLocalite")
	private String localiteAvions;
	
	@OneToMany(mappedBy="avions",fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST})
	private List<vol>vol = new ArrayList<vol>();
	
	public Avions() {
		super();
	}
	public Avions(String modelAvions, int nombreDePlaceAvions, String localiteAvions,List<vol>vol) {
		super();
		this.modelAvions = modelAvions;
		this.nombreDePlaceAvions = nombreDePlaceAvions;
		this.localiteAvions = localiteAvions;
		this.vol=vol;
		for (vol sdc : vol) {
            sdc.setAvions(this);
        }
	}
	
	
	public List<vol> getVol() {
		return vol;
	}
	public void setVol(List<vol> vol) {
		this.vol = vol;
	}
	public int getIdAvions() {
		return idAvions;
	}
	public void setIdAvions(int idAvions) {
		this.idAvions = idAvions;
	}
	public String getModelAvions() {
		return modelAvions;
	}
	public void setModelAvions(String modelAvions) {
		this.modelAvions = modelAvions;
	}
	public int getNombreDePlaceAvions() {
		return nombreDePlaceAvions;
	}
	public void setNombreDePlaceAvions(int nombreDePlaceAvions) {
		this.nombreDePlaceAvions = nombreDePlaceAvions;
	}
	public String getLocaliteAvions() {
		return localiteAvions;
	}
	public void setLocaliteAvions(String localiteAvions) {
		this.localiteAvions = localiteAvions;
	}
	
	

}
