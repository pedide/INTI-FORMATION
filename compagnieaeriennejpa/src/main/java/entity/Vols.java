package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vols")
public class Vols {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="dateVol")
	private String dateVol;
	@Column(name="departVol")
	private String departVol;
	@Column(name="arriveVol")
	private String arriveVol;
	@Column(name="heureDepart")
	private String heureDepart;
	@Column(name="heureArrive")
	private String heureArrive;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="idAvion")
	private Avions avion;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="idPil")
	private Pilotes pil;
	public Vols() {}
	public Vols(String dateVol, String departVol, String arriveVol, String heureDepart, String heureArrive,Avions avion,Pilotes pil) {
		super();
		this.dateVol = dateVol;
		this.departVol = departVol;
		this.arriveVol = arriveVol;
		this.heureDepart = heureDepart;
		this.heureArrive = heureArrive;
		this.avion=avion;
		this.pil=pil;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateVol() {
		return dateVol;
	}
	public void setDateVol(String dateVol) {
		this.dateVol = dateVol;
	}
	public String getDepartVol() {
		return departVol;
	}
	public void setDepartVol(String departVol) {
		this.departVol = departVol;
	}
	public String getArriveVol() {
		return arriveVol;
	}
	public void setArriveVol(String arriveVol) {
		this.arriveVol = arriveVol;
	}
	public String getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}
	public String getHeureArrive() {
		return heureArrive;
	}
	public void setHeureArrive(String heureArrive) {
		this.heureArrive = heureArrive;
	}
	public Avions getVol() {
		return avion;
	}
	public void setVol(Avions avion) {
		this.avion = avion;
	}
	public Pilotes getPil() {
		return pil;
	}
	public void setPil(Pilotes pil) {
		this.pil = pil;
	}
	
}
