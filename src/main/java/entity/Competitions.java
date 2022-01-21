package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
public class Competitions implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idCompetitions")
	private int idCompet;
	@Column(name= "dateCompet")
	private String dateCompet;
	@Column( name = "nomCompet")
	private String nomCompet;
	@Column(name = "villeCompet")
	private String villeCompet;
	
	@OneToMany(mappedBy="competitions",fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST})
	private List<Epreuves>epreuves = new ArrayList<Epreuves>();
	
	
	
	@OneToMany(mappedBy="competition",fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST})
	private List<inscription>inscriptionc = new ArrayList<inscription>();
	
	public Competitions() {
		super();
	}
	
	
	public Competitions(String dateCompet, String nomCompet, String villeCompet, List<Epreuves> epreuves,
			List<entity.inscription> inscription) {
		super();
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
		this.epreuves = epreuves;
		this.inscriptionc = inscription;
		for (Epreuves sdc : epreuves) {
            sdc.setCompetitions(this);
        }
		for (inscription sdc : inscription) {
            sdc.setCompetitions(this);
        }
	}	

	public List<inscription> getInscription() {
		return inscriptionc;
	}


	public void setInscription(List<inscription> inscription) {
		this.inscriptionc = inscription;
	}


	public List<Epreuves> getEpreuves() {
		return epreuves;
	}
	public void setEpreuves(List<Epreuves> epreuves) {
		this.epreuves = epreuves;
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
