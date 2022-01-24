package Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vols")
public class Vols implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idVols")
	private int idVols;
	private String dateVols;
	private String departVols;
	private String arriveeVols;
	private String heureDepVols;
	private String heureArrVols;
	
	
	
	public Vols() {
		super();
	}
	public Vols(String dateVols, String departVols, String arriveeVols, String heureDepVols, String heureArrVols) {
		super();
		this.dateVols = dateVols;
		this.departVols = departVols;
		this.arriveeVols = arriveeVols;
		this.heureDepVols = heureDepVols;
		this.heureArrVols = heureArrVols;
	}
	
	
	
	public Vols(String dateVols, String departVols, String arriveeVols, String heureDepVols, String heureArrVols,
			Avions avions, Pilote pilote) {
		super();
		this.dateVols = dateVols;
		this.departVols = departVols;
		this.arriveeVols = arriveeVols;
		this.heureDepVols = heureDepVols;
		this.heureArrVols = heureArrVols;
		this.avions = avions;
		this.pilote = pilote;
	}



	@ManyToOne
	@JoinColumn(name="idAvion")
	private Avions avions;
	
	@ManyToOne
	@JoinColumn(name="idPilote")
	private Pilote pilote;
	
	
	public int getIdVols() {
		return idVols;
	}
	public void setIdVols(int idVols) {
		this.idVols = idVols;
	}
	public String getDateVols() {
		return dateVols;
	}
	public void setDateVols(String dateVols) {
		this.dateVols = dateVols;
	}
	public String getDepartVols() {
		return departVols;
	}
	public void setDepartVols(String departVols) {
		this.departVols = departVols;
	}
	public String getArriveeVols() {
		return arriveeVols;
	}
	public void setArriveeVols(String arriveeVols) {
		this.arriveeVols = arriveeVols;
	}
	public String getHeureDepVols() {
		return heureDepVols;
	}
	public void setHeureDepVols(String heureDepVols) {
		this.heureDepVols = heureDepVols;
	}
	public String getHeureArrVols() {
		return heureArrVols;
	}
	public void setHeureArrVols(String heureArrVols) {
		this.heureArrVols = heureArrVols;
	}
	public Avions getAvions() {
		return avions;
	}
	public void setAvions(Avions avions) {
		this.avions = avions;
	}
	public Pilote getPilote() {
		return pilote;
	}
	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}
	
	
	
}
