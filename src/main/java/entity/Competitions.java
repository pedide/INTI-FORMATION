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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="competitions")
public class Competitions implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long idcompet;
	@Column(name="DATE_COMPET")
	private String date;
	@Column(name="NOM_COMPET")
	private String nomcompet;
	@Column(name="VILLE_COMPET")
	private String villecompet;
	
	@OneToMany(mappedBy="competition",fetch=FetchType.LAZY,cascade= {CascadeType.ALL})
	private List<Epreuve> epreuve = new ArrayList<Epreuve>();
	
	@OneToMany(mappedBy="competition",fetch=FetchType.LAZY,cascade= {CascadeType.ALL})
	private List<Inscription> inscription = new ArrayList<Inscription>();

	
	public Competitions() {
		super();
	}
	
	public Competitions(Long idcompet, String date, String nomcompet, String villecompet) {
		super();
		this.idcompet = idcompet;
		this.date = date;
		this.nomcompet = nomcompet;
		this.villecompet = villecompet;
	}
	
	public Competitions(String date, String nomcompet, String villecompet, List<Epreuve> liste) {
		super();
		this.date = date;
		this.nomcompet = nomcompet;
		this.villecompet = villecompet;
	    epreuve = liste;
	        
	    for (Epreuve l : liste)
	    {
	        l.setCompetition(this);
	    }
	}
	

	public Competitions(String date, String nomcompet, String villecompet, List<Epreuve> list_ep,
			List<Inscription> list_insc) {
		super();
		this.date = date;
		this.nomcompet = nomcompet;
		this.villecompet = villecompet;
		epreuve = list_ep;
		inscription = list_insc;
		
		for (Epreuve l : list_ep)
	    {
	        l.setCompetition(this);
	    }
		for (Inscription ins : list_insc)
	    {
	        ins.setCompetition(this);
	    }
	}

	public Long getIdcompet() {
		return idcompet;
	}
	public void setIdcompet(Long idcompet) {
		this.idcompet = idcompet;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNomcompet() {
		return nomcompet;
	}
	public void setNomcompet(String nomcompet) {
		this.nomcompet = nomcompet;
	}
	public String getVillecompet() {
		return villecompet;
	}
	public void setVillecompet(String villecompet) {
		this.villecompet = villecompet;
	}
	public List<Epreuve> getEpreuve() {
		return epreuve;
	}
	public void setEpreuve(List<Epreuve> epreuve) {
		this.epreuve = epreuve;
	}

	public List<Inscription> getInscription() {
		return inscription;
	}

	public void setInscription(List<Inscription> inscription) {
		this.inscription = inscription;
	}
	
	
}
