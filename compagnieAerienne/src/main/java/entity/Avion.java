package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="aviID")
	private int idAvion;
	@Column(name="aviModel")
	private String aviModel;
	@Column(name="aviNbPlace")
	private int aviPlace;
	@Column(name="aviLocalite")
	private String aviLocalite;
	
	public Avion(String aviModel, int aviPlace, String aviLocalite) {
		super();
		this.aviModel = aviModel;
		this.aviPlace = aviPlace;
		this.aviLocalite = aviLocalite;
	}
	
	@OneToMany
	private List<Vol> listVols;
	
	public int getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}
	public String getAviModel() {
		return aviModel;
	}
	public void setAviModel(String aviModel) {
		this.aviModel = aviModel;
	}
	public int getAviPlace() {
		return aviPlace;
	}
	public void setAviPlace(int aviPlace) {
		this.aviPlace = aviPlace;
	}
	public String getAviLocalite() {
		return aviLocalite;
	}
	public void setAviLocalite(String aviLocalite) {
		this.aviLocalite = aviLocalite;
	}
	public List<Vol> getListVols() {
		return listVols;
	}
	public void setListVols(List<Vol> listVols) {
		this.listVols = listVols;
	}
	
}
