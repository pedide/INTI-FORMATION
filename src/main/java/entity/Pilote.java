package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pilote")

public class Pilote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpilote")
	private int idPilote; 
	
	@Column(name="nompilote")
	private String nomPilote; 
	
	@Column(name="prenompilote")
	private String prenomPilote; 
	
	@Column(name="villepilote")
	private String villePilote; 
	
	@Column(name="salairepilote")
	private double salairePilote;
	
	
	public Pilote() {
		super();
	}

	public Pilote(String nomPilote, String prenomPilote, String villePilote, double salairePilote) {
		super();
		this.nomPilote = nomPilote;
		this.prenomPilote = prenomPilote;
		this.villePilote = villePilote;
		this.salairePilote = salairePilote;
	}

	public int getIdPilote() {
		return idPilote;
	}

	public void setIdPilote(int idPilote) {
		this.idPilote = idPilote;
	}

	public String getNomPilote() {
		return nomPilote;
	}

	public void setNomPilote(String nomPilote) {
		this.nomPilote = nomPilote;
	}

	public String getPrenomPilote() {
		return prenomPilote;
	}

	public void setPrenomPilote(String prenomPilote) {
		this.prenomPilote = prenomPilote;
	}

	public String getVillePilote() {
		return villePilote;
	}

	public void setVillePilote(String villePilote) {
		this.villePilote = villePilote;
	}

	public double getSalairePilote() {
		return salairePilote;
	}

	public void setSalairePilote(double salairePilote) {
		this.salairePilote = salairePilote;
	} 
}
