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
@Table(name="avions")
public class Avions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idavions")
	private Long idavions;
	private String AviModel;
	private String AviNbPlace;
	private String AviLocalite;
	
	
	@OneToMany(mappedBy="avions")
	private List<Vol> listVols;
	
	public Avions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Avions(String aviModel, String aviNbPlace, String aviLocalite) {
		AviModel = aviModel;
		AviNbPlace = aviNbPlace;
		AviLocalite = aviLocalite;
	}
	
	public Long getIdavions() {
		return idavions;
	}
	
	public void setIdavions(Long idavions) {
		this.idavions = idavions;
	}
	public String getAviModel() {
		return AviModel;
	}
	public void setAviModel(String aviModel) {
		AviModel = aviModel;
	}
	public String getAviNbPlace() {
		return AviNbPlace;
	}
	public void setAviNbPlace(String aviNbPlace) {
		AviNbPlace = aviNbPlace;
	}
	public String getAviLocalite() {
		return AviLocalite;
	}
	public void setAviLocalite(String aviLocalite) {
		AviLocalite = aviLocalite;
	}
	
	
	
	
}
