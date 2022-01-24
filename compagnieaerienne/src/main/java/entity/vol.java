package entity;

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
public class vol implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdVol")
	private int idVol;
	@Column(name="dateVol")
	private String dateVol;
	@Column(name="destinationArrive")
	private String destinationArrive;
	@Column(name="destignationDepart")
	private String destinationDepart;
	@Column(name="heureDepart")
	private String heureDepart;
	@Column(name="heureArrive")
	private String heureArrive;
	
	@ManyToOne
	@JoinColumn(name = "Pilotes_id")
	private Pilotes pilotes;
	
	@ManyToOne
	@JoinColumn(name = "Avions_id")
	private Avions avions;
	
	
	
	public vol() {
		super();
	}
	public vol(String dateVol, String destinationArrive, String destinationDepart, String heureDepart,
			String heureArrive) {
		super();
		this.dateVol = dateVol;
		this.destinationArrive = destinationArrive;
		this.destinationDepart = destinationDepart;
		this.heureDepart = heureDepart;
		this.heureArrive = heureArrive;
	}
	
	
	public Avions getAvions() {
		return avions;
	}
	public void setAvions(Avions avions) {
		this.avions = avions;
	}
	public Pilotes getPilotes() {
		return pilotes;
	}
	public void setPilotes(Pilotes pilotes) {
		this.pilotes = pilotes;
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
	public String getDestinationArrive() {
		return destinationArrive;
	}
	public void setDestinationArrive(String destinationArrive) {
		this.destinationArrive = destinationArrive;
	}
	public String getDestinationDepart() {
		return destinationDepart;
	}
	public void setDestinationDepart(String destinationDepart) {
		this.destinationDepart = destinationDepart;
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
	
	
	

}
