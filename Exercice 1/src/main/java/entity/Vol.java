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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idVol")
	private int idVol;
	
	@Column(name="jour")
	private String jour;
	
	@Column(name="heureDepartVol")
	private String heureDepartVol;
	
	@Column(name="heureArriveeVol")
	private String heureArriveeVol;
	
	@ManyToOne
	@JoinColumn(name="idCompagnie")
	private Compagnie compagnie;
	
	@ManyToOne
	@JoinColumn(name="idAeroportDepart")
	private Aeroport aeroportDepart;
	
	@ManyToOne
	@JoinColumn(name="idAeroportArrivee")
	private Aeroport aeroportArrivee;
	
	@ManyToOne
	@JoinColumn(name="idPilote")
	private Pilote pilote;
	
	@ManyToOne
	@JoinColumn(name="idAvion")
	private Avion avion;
	
	public Vol(String jour, String heureDepartVol, String heureArriveeVol, Compagnie compagnie,
			Aeroport aeroportDepart, Aeroport aeroportArrivee, Pilote pilote, Avion avion) {
		super();
		this.jour = jour;
		this.heureDepartVol = heureDepartVol;
		this.heureArriveeVol = heureArriveeVol;
		this.compagnie = compagnie;
		this.aeroportDepart = aeroportDepart;
		this.aeroportArrivee = aeroportArrivee;
		this.pilote = pilote;
		this.avion = avion;
	}

	public int getIdVol() {
		return idVol;
	}
	
	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}
	
	public String getJour() {
		return jour;
	}
	
	public void setJour(String jour) {
		this.jour = jour;
	}
	
	public String getHeureDepartVol() {
		return heureDepartVol;
	}
	
	public void setHeureDepartVol(String heureDepartVol) {
		this.heureDepartVol = heureDepartVol;
	}
	
	public String getHeureArriveeVol() {
		return heureArriveeVol;
	}
	
	public void setHeureArriveeVol(String heureArriveeVol) {
		this.heureArriveeVol = heureArriveeVol;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}

	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}

	public Aeroport getAeroportArrivee() {
		return aeroportArrivee;
	}

	public void setAeroportArrivee(Aeroport aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
	}

	public Pilote getPilote() {
		return pilote;
	}

	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}
}
