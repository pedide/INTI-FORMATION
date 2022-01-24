package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pilotes")
public class pilotes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPilote;
	private String nomPilote;
	private String prenomPilote;
	private String villePilote;
	private double salairePilote;
	
	@OneToMany(mappedBy="pilotes", fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST})
	private List<vols>listeVols = new ArrayList<vols>();
	
	public pilotes() {
		super();
	}
	

	public pilotes(String nomPilote, String prenomPilote, String villePilote, double salairePilote) {
		super();
		this.nomPilote = nomPilote;
		this.prenomPilote = prenomPilote;
		this.villePilote = villePilote;
		this.salairePilote = salairePilote;
	}

	public pilotes(String nomPilote, String prenomPilote, double salairePilote, List<vols>listevols) {
		super();
		this.nomPilote = nomPilote;
		this.prenomPilote = prenomPilote;
		this.salairePilote = salairePilote;
		listeVols = listevols;
		
	    for (vols v : listevols)
	    {
	        v.setPilote(this);
	    }
	}

	public pilotes(String nomPilote, String prenomPilote, String villePilote, double salairePilote, List<vols>listeVols) {
		super();
		this.nomPilote = nomPilote;
		this.prenomPilote = prenomPilote;
		this.villePilote = villePilote;
		this.salairePilote = salairePilote;
		listeVols = listeVols;
		
	    for (vols v : listeVols)
	    {
	        v.setPilote(this);
	    }
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
