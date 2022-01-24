package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vols")
public class vols {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idVol;
	private String volDate;
	private String volDestinationDepart;
	private String volDestinationArrivee;
	private String volHeureDepart;
	private String volHeureArrivee;
	
	@ManyToOne()
	@JoinColumn(name="avion_id")
	private avions avions;
	
	@ManyToOne()
	@JoinColumn(name="pilote_id")
	private pilotes pilotes;
	
	public vols() {
		super();
	}

	public vols(String volDate, String volDestinationDepart, String volDestinationArrivee, String volHeureDepart,
			String volHeureArrivee) {
		super();
		this.volDate = volDate;
		this.volDestinationDepart = volDestinationDepart;
		this.volDestinationArrivee = volDestinationArrivee;
		this.volHeureDepart = volHeureDepart;
		this.volHeureArrivee = volHeureArrivee;
	}

	
	public vols(String volDate) {
		super();
		this.volDate = volDate;
	}
	
	
	public vols(String volDate, String volDestinationArrivee, String volHeureDepart, String volHeureArrivee) {
		super();
		this.volDate = volDate;
		this.volDestinationArrivee = volDestinationArrivee;
		this.volHeureDepart = volHeureDepart;
		this.volHeureArrivee = volHeureArrivee;
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

	public String getVolDestinationDepart() {
		return volDestinationDepart;
	}

	public void setVolDestinationDepart(String volDestinationDepart) {
		this.volDestinationDepart = volDestinationDepart;
	}

	public String getVolDestinationArrivee() {
		return volDestinationArrivee;
	}

	public void setVolDestinationArrivee(String volDestinationArrivee) {
		this.volDestinationArrivee = volDestinationArrivee;
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

	public avions getAvion() {
		return avions;
	}

	public void setAvion(avions avion) {
		this.avions = avion;
	}

	public pilotes getPilote() {
		return pilotes;
	}

	public void setPilote(pilotes pilote) {
		this.pilotes = pilote;
	}
	
	
	
	
	
}
