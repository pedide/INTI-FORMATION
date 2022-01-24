package Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pilote")
public class Pilote implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idPilote")
	private int idPilote;
	private String nomPi;
	private String prenomPi;
	private String villePi;
	private double salairePi;
	
	
	
	public Pilote() {
		super();
	}



	public Pilote(String nomPi, String prenomPi, String villePi, double salairePi) {
		super();
		this.nomPi = nomPi;
		this.prenomPi = prenomPi;
		this.villePi = villePi;
		this.salairePi = salairePi;
	}



	public int getIdPilote() {
		return idPilote;
	}

	@OneToMany (mappedBy="pilote", cascade= {CascadeType.PERSIST})
	private List<Vols> listvols = new ArrayList<Vols>();


	public void setIdPilote(int idPilote) {
		this.idPilote = idPilote;
	}



	public String getNomPi() {
		return nomPi;
	}



	public void setNomPi(String nomPi) {
		this.nomPi = nomPi;
	}



	public String getPrenomPi() {
		return prenomPi;
	}



	public void setPrenomPi(String prenomPi) {
		this.prenomPi = prenomPi;
	}



	public String getVillePi() {
		return villePi;
	}



	public void setVillePi(String villePi) {
		this.villePi = villePi;
	}



	public double getSalairePi() {
		return salairePi;
	}



	public void setSalairePi(double salairePi) {
		this.salairePi = salairePi;
	}



	public List<Vols> getListvols() {
		return listvols;
	}



	public void setListvols(List<Vols> listvols) {
		this.listvols = listvols;
	}




	
}
