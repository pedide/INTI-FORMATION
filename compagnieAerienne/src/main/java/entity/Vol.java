package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vols")
public class Vol {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="volID")
	private int idVol;
	@Column(name="volDate")
	private String volDate;
	@Column(name="volDestinationDepart")
	private String volDestDep;
	@Column(name="volDestinationArrive")
	private String volDestArriv;
	@Column(name="volHeureDepart")
	private String volHDep;
	@Column(name="volHeureArrive")
	private String volArriv;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="avion_aviID")
	private Avion avi;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pilote_pilID")
	private Pilote pil;
	
	public Vol(Avion avi, Pilote pil, String volDate, String volDestDep, String volDestArriv, String volHDep, String volArriv) {
		super();
		this.volDate = volDate;
		this.volDestDep = volDestDep;
		this.volDestArriv = volDestArriv;
		this.volHDep = volHDep;
		this.volArriv = volArriv;
		this.avi = avi;
		this.pil = pil;
	}
	public int getIdVol() {
		return idVol;
	}
	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}
	public String getVolDate() {
		return volDate;
	}
	public void setVolDate(String volDate) {
		this.volDate = volDate;
	}
	public String getVolDestDep() {
		return volDestDep;
	}
	public void setVolDestDep(String volDestDep) {
		this.volDestDep = volDestDep;
	}
	public String getVolDestArriv() {
		return volDestArriv;
	}
	public void setVolDestArriv(String volDestArriv) {
		this.volDestArriv = volDestArriv;
	}
	public String getVolHDep() {
		return volHDep;
	}
	public void setVolHDep(String volHDep) {
		this.volHDep = volHDep;
	}
	public String getVolArriv() {
		return volArriv;
	}
	public void setVolArriv(String volArriv) {
		this.volArriv = volArriv;
	}
}
