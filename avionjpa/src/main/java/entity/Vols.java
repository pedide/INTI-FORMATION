package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vols")
public class Vols implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idvols")
	private int idvols;
	@Column(name="date")
	private String date;
	@Column(name="destD")
	private String destD;
	@Column(name="destA")
	private String destA;
	@Column(name="heureD")
	private String heureD;
	@Column(name="heureA")
	private String heureA;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_pilote", unique=true)
	private Pilotes pilotes;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_avion", unique=true)
	private Avion avion;
	
	public Vols() {
		super();
	}
	
	public Vols(String date, String destD, String destA, String heureD, String heureA) {
		super();
		this.date = date;
		this.destD = destD;
		this.destA = destA;
		this.heureD = heureD;
		this.heureA = heureA;
	}
	
	public Vols(String date, String destD, String destA, String heureD, String heureA, Avion avion) {
		super();
		this.date = date;
		this.destD = destD;
		this.destA = destA;
		this.heureD = heureD;
		this.heureA = heureA;
		this.avion = avion;
	}

	public Vols(String date, String destD, String destA, String heureD, String heureA, Pilotes pilotes) {
		super();
		this.date = date;
		this.destD = destD;
		this.destA = destA;
		this.heureD = heureD;
		this.heureA = heureA;
		this.pilotes = pilotes;
	}

	public Vols(int idvols, String date, String destD, String destA, String heureD, String heureA) {
		super();
		this.idvols = idvols;
		this.date = date;
		this.destD = destD;
		this.destA = destA;
		this.heureD = heureD;
		this.heureA = heureA;
	}

	public int getIdvols() {
		return idvols;
	}

	public void setIdvols(int idvols) {
		this.idvols = idvols;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDestD() {
		return destD;
	}

	public void setDestD(String destD) {
		this.destD = destD;
	}

	public String getDestA() {
		return destA;
	}

	public void setDestA(String destA) {
		this.destA = destA;
	}

	public String getHeureD() {
		return heureD;
	}

	public void setHeureD(String heureD) {
		this.heureD = heureD;
	}

	public String getHeureA() {
		return heureA;
	}

	public void setHeureA(String heureA) {
		this.heureA = heureA;
	}

	public Pilotes getPilotes() {
		return pilotes;
	}

	public void setPilotes(Pilotes pilotes) {
		this.pilotes = pilotes;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	
	
}
