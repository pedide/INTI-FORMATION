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
public class Competitions implements Serializable{
	
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
    
	@OneToMany(mappedBy="competitions", fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST})
	private List<Epreuve>epreuves = new ArrayList<Epreuve>();
	
	@OneToMany(mappedBy="competitions", fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST})
	private List<Inscription>inscriptions = new ArrayList<Inscription>();
	
	public Competitions() {
		super();
	}
	
	public Competitions(String datecompet, String nomcompet, String villecompet, List<Epreuve> epreuves) {
		super();
		this.datecompet = datecompet;
		this.nomcompet = nomcompet;
		this.villecompet = villecompet;
		this.epreuves = epreuves;
		
	}
	

	public Competitions( String datecompet, String nomcompet, String villecompet, List<Epreuve> epreuves, List<Inscription> listeinscription) {
		super();
		this.datecompet = datecompet;
		this.nomcompet = nomcompet;
		this.villecompet = villecompet;
		this.epreuves = epreuves;
		this.inscriptions = listeinscription;

		for (Epreuve l : epreuves) {
			l.setCompetitions(this);
		}

        for (Inscription i : listeinscription)
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

}
