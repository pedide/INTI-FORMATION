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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="competitions")
public class Competitions implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcompet")
	private int idcompet;
	@Column(name="datecompet")
	private String datecompet;
	@Column(name="nomcompet")
	private String nomcompet;
	@Column(name="villecompet")
	private String villecompet;
	@Column(name="cp")
	private int cp;
	
	@OneToMany(mappedBy="competitions", fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST})
	private List<Epreuve>listepreuve = new ArrayList<Epreuve>();
	
	@OneToMany(mappedBy="competitions", fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST})
	private List<Inscription>listeinscription = new ArrayList<Inscription>();
	
	public Competitions() {
		super();
	}

	public Competitions(String datecompet, String nomcompet, String villecompet, int cp) {
		super();
		this.datecompet = datecompet;
		this.nomcompet = nomcompet;
		this.villecompet = villecompet;
		this.cp = cp;
	}
	
	
	public Competitions(String datecompet, String nomcompet, String villecompet, int cp, List<Epreuve> epreuves, List<Inscription>inscriptions) {
	    this(datecompet, nomcompet, villecompet, cp);
	    listepreuve = epreuves;
	    listeinscription = inscriptions;	   
	    
	    for (Epreuve e : epreuves)
	    {
	        e.setCompetitions(this);
	    }
	    
	    for (Inscription i : inscriptions)
	    {
	        i.setCompetitions(this);
	    }
	}

	public int getIdcompet() {
		return idcompet;
	}

	public void setIdcompet(int idcompet) {
		this.idcompet = idcompet;
	}

	public String getDatecompet() {
		return datecompet;
	}

	public void setDatecompet(String datecompet) {
		this.datecompet = datecompet;
	}

	public String getNomcomptet() {
		return nomcompet;
	}

	public void setNomcomptet(String nomcomptet) {
		this.nomcompet = nomcomptet;
	}

	public String getVillecompet() {
		return villecompet;
	}

	public void setVillecompet(String villecompet) {
		this.villecompet = villecompet;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	
	
	
}
