package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="competitions")

public class Competitions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcompet")
	private int idCompet; 
	
	@Column(name="datecompet")
	private String dateCompet; 
	
	@Column(name="nomcompet")
	private String nomCompet; 
	
	@Column(name="villecompet")
	private String villeCompet;
	
	//@Column(name="dossardcompet")
	//private int dossardCompet; 
	
	public List<Epreuves> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuves> epreuves) {
		this.epreuves = epreuves;
	}

	public List<Inscrire> getInscrire() {
		return inscrire;
	}

	public void setInscrire(List<Inscrire> inscrire) {
		this.inscrire = inscrire;
	}


	@OneToMany(mappedBy="competitions",fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	private List<Epreuves>epreuves = new ArrayList<Epreuves>();
	
	@OneToMany(mappedBy="competitions",fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	private List<Inscrire>inscrire = new ArrayList<Inscrire>();
	
	
	public Competitions() {
		super();
	}

	public Competitions(String dateCompet, String nomCompet, String villeCompet, List<Epreuves> epreuves) {
		super();
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
		this.epreuves = epreuves;
		//this.sportifs = sportifs; 
		
		for(Epreuves ep : epreuves)
		{
			ep.setCompetitions(this);
		}
		
	}


	public Competitions(String dateCompet, String nomCompet, String villeCompet) {
		super();
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
	}


	public int getIdCompet() {
		return idCompet;
	}


	public void setIdCompet(int idCompet) {
		this.idCompet = idCompet;
	}


	public String getDateCompet() {
		return dateCompet;
	}


	public void setDateCompet(String dateCompet) {
		this.dateCompet = dateCompet;
	}


	public String getNomCompet() {
		return nomCompet;
	}


	public void setNomCompet(String nomCompet) {
		this.nomCompet = nomCompet;
	}


	public String getVilleCompet() {
		return villeCompet;
	}


	public void setVilleCompet(String villeCompet) {
		this.villeCompet = villeCompet;
	}
	
}
