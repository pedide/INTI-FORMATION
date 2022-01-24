package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vol")

public class Vol {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idvol")
	private int idVol; 
	
	@Column(name="datevol")
	private String dateVol; 
	
	@Column(name="destinationdepart")
	private String volDepart; 
	
	@Column(name="destinationarrivee")
	private String volArrivee; 
	
	@Column(name="heuredepart")
	private String volHeureDepart; 
	
	@Column(name="heurearrivee")
	private String volHeureArrivee;
	
	@ManyToOne
	@JoinColumn(name="idpilote")
    private Pilote pilote;
	
	@ManyToOne
	@JoinColumn(name="idavion")
    private Avion avion;

	public Vol() {
		super();
	}

	
	public Vol(String dateVol, String volDepart, String volArrivee, String volHeureDepart, String volHeureArrivee) {
		super();
		this.dateVol = dateVol;
		this.volDepart = volDepart;
		this.volArrivee = volArrivee;
		this.volHeureDepart = volHeureDepart;
		this.volHeureArrivee = volHeureArrivee;
	}


	public Vol(String dateVol, String volDepart, String volArrivee, String volHeureDepart, String volHeureArrivee,
			Pilote pilote, Avion avion) {
		super();
		this.dateVol = dateVol;
		this.volDepart = volDepart;
		this.volArrivee = volArrivee;
		this.volHeureDepart = volHeureDepart;
		this.volHeureArrivee = volHeureArrivee;
		this.pilote = pilote;
		this.avion = avion;
	}


	public int getIdVol() {
		return idVol;
	}

	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}

	public String getDateVol() {
		return dateVol;
	}

	public void setDateVol(String dateVol) {
		this.dateVol = dateVol;
	}

	public String getVolDepart() {
		return volDepart;
	}

	public void setVolDepart(String volDepart) {
		this.volDepart = volDepart;
	}

	public String getVolArrivee() {
		return volArrivee;
	}

	public void setVolArrivee(String volArrivee) {
		this.volArrivee = volArrivee;
	}

	public String getVolHeureDepart() {
		return volHeureDepart;
	}

	public void setVolHeureDepart(String volHeureDepart) {
		this.volHeureDepart = volHeureDepart;
	}

	public String getVolHeureArrivee() {
		return volHeureArrivee;
	}

	public void setVolHeureArrivee(String volHeureArrivee) {
		this.volHeureArrivee = volHeureArrivee;
	}
}
