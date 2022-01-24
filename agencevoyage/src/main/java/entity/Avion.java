package entity;

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
public class Avion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="aviid")
	private int AviID;
	
	@Column(name="avimodel")
	private String AviModel;
	
	@Column(name="avinombredeplace")
	private int AviNombreDePlace;
	
	@Column(name="avilocalite")
	private String AviLocalite;
	
	@OneToMany(mappedBy="avion",fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	private List<Vol>vols = new ArrayList<Vol>();
	
	public String getAviModel() {
		return AviModel;
	}
	public void setAviModel(String aviModel) {
		AviModel = aviModel;
	}
	public int getAviNombreDePlace() {
		return AviNombreDePlace;
	}
	public void setAviNombreDePlace(int aviNombreDePlace) {
		AviNombreDePlace = aviNombreDePlace;
	}
	public String getAviLocalite() {
		return AviLocalite;
	}
	public void setAviLocalite(String aviLocalite) {
		AviLocalite = aviLocalite;
	}
	public Avion(String aviModel, int aviNombreDePlace, String aviLocalite) {
		super();
		AviModel = aviModel;
		AviNombreDePlace = aviNombreDePlace;
		AviLocalite = aviLocalite;
	}
	public Avion() {
		super();
	}
	
}
