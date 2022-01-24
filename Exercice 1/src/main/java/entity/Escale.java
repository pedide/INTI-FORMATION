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
@Table(name="escale")
public class Escale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idEscale")
	private int idEscale;
	
	@Column(name="heureArrivee")
	private String heureArrivee;
	
	@Column(name="heureDepart")
	private String heureDepart;
	
	@ManyToOne
	@JoinColumn(name="idAeroport")
	private Aeroport aeroport;
	
	@ManyToOne
	@JoinColumn(name="idVol")
	private Vol vol;
	
	public Escale(String heureArrivee, String heureDepart, Aeroport aeroport, Vol vol) {
		super();
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
		this.aeroport = aeroport;
		this.vol = vol;
	}

	public int getIdEscale() {
		return idEscale;
	}
	
	public void setIdEscale(int idEscale) {
		this.idEscale = idEscale;
	}
	
	public String getHeureArrivee() {
		return heureArrivee;
	}
	
	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	
	public String getHeureDepart() {
		return heureDepart;
	}
	
	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}
}
