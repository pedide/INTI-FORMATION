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
	@Column(name="volid")
	private int volid;
	
	@Column(name="voldate")
	private String voldate;
	
	@Column(name="voldestinationdepart")
	private String voldestinationdepart;
	
	@Column(name="voldestinationarrive")
	private String voldestinationarrive;
	
	@Column(name="volheuredepart")
	private String volheuredepart;	
	
	@Column(name="volheurearrive")
	private String volheurearrive;
	
	@ManyToOne
	@JoinColumn(name="VolAviID")
	private Avion avion;
	
	@ManyToOne
	@JoinColumn(name="volpilid")
	private Pilotes pilotes;
	
	public Vol(Pilotes pilotes, String voldate, String voldestinationdepart, String voldestinationarrive, String volheuredepart,
			String volheurearrive, Avion avion) {
		super();
		this.pilotes = pilotes;
		this.voldate = voldate;
		this.voldestinationdepart = voldestinationdepart;
		this.voldestinationarrive = voldestinationarrive;
		this.volheuredepart = volheuredepart;
		this.volheurearrive = volheurearrive;
		this.avion = avion;
	}
	public int getVolid() {
		return volid;
	}
	public void setVolid(int volid) {
		this.volid = volid;
	}
	public String getVoldate() {
		return voldate;
	}
	public void setVoldate(String voldate) {
		this.voldate = voldate;
	}
	public String getVoldestinationdepart() {
		return voldestinationdepart;
	}
	public void setVoldestinationdepart(String voldestinationdepart) {
		this.voldestinationdepart = voldestinationdepart;
	}
	public String getVoldestinationarrive() {
		return voldestinationarrive;
	}
	public void setVoldestinationarrive(String voldestinationarrive) {
		this.voldestinationarrive = voldestinationarrive;
	}
	public String getVolheuredepart() {
		return volheuredepart;
	}
	public void setVolheuredepart(String volheuredepart) {
		this.volheuredepart = volheuredepart;
	}
	public String getVolheurearrive() {
		return volheurearrive;
	}
	public void setVolheurearrive(String volheurearrive) {
		this.volheurearrive = volheurearrive;
	}
	public Vol(String voldate, String voldestinationdepart, String voldestinationarrive,
			String volheuredepart, String volheurearrive, int volaviid) {
		super();
		this.voldate = voldate;
		this.voldestinationdepart = voldestinationdepart;
		this.voldestinationarrive = voldestinationarrive;
		this.volheuredepart = volheuredepart;
		this.volheurearrive = volheurearrive;
	}
	public Vol() {
		super();
	}
	
}
