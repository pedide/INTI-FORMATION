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
@Table(name="vol")
public class Vol {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdVol")
	private int IdVol;
	private String VolDate;
	private String VolDestinationDepart;
	private String VolDestinationArrive;
	private String VolHeureDepart;
	private String VolHeureArrive;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Avions avions;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Pilotes pilotes;
	
	
	
	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public Vol(String volDate, String volDestinationDepart, String volDestinationArrive, String volHeureDepart,
			String volHeureArrive, Avions avions, Pilotes pilote) {
		VolDate = volDate;
		VolDestinationDepart = volDestinationDepart;
		VolDestinationArrive = volDestinationArrive;
		VolHeureDepart = volHeureDepart;
		VolHeureArrive = volHeureArrive;
		this.avions = avions;
		this.pilotes = pilotes;
	}



	public Vol(String volDate, String volDestinationDepart, String volDestinationArrive, String volHeureDepart,
			String volHeureArrive) {
		VolDate = volDate;
		VolDestinationDepart = volDestinationDepart;
		VolDestinationArrive = volDestinationArrive;
		VolHeureDepart = volHeureDepart;
		VolHeureArrive = volHeureArrive;
		
		
	}



	public int getIdVol() {
		return IdVol;
	}



	public void setIdVol(int idVol) {
		IdVol = idVol;
	}



	public String getVolDate() {
		return VolDate;
	}



	public void setVolDate(String volDate) {
		VolDate = volDate;
	}



	public String getVolDestinationDepart() {
		return VolDestinationDepart;
	}



	public void setVolDestinationDepart(String volDestinationDepart) {
		VolDestinationDepart = volDestinationDepart;
	}



	public String getVolDestinationArrive() {
		return VolDestinationArrive;
	}



	public void setVolDestinationArrive(String volDestinationArrive) {
		VolDestinationArrive = volDestinationArrive;
	}



	public String getVolHeureDepart() {
		return VolHeureDepart;
	}



	public void setVolHeureDepart(String volHeureDepart) {
		VolHeureDepart = volHeureDepart;
	}



	public String getVolHeureArrive() {
		return VolHeureArrive;
	}



	public void setVolHeureArrive(String volHeureArrive) {
		VolHeureArrive = volHeureArrive;
	}
	
	
	
	
	
	
	
}
