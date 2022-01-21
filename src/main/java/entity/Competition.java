package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Competition")
public class Competition {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCompet;
	private String dateCompet;
	private String nomCompet;
	private String villeCompet;
	
	@OneToMany
	List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	@OneToMany
	List<Inscrire> inscrires = new ArrayList<Inscrire>();	
	
	
	public Competition() {
		this("", "", "");
		
	}
	
	
	
	public Competition(int idCompet, String dateCompet, String nomCompet, String villeCompet,
			List<Inscrire> inscrires) {
		super();
		this.idCompet = idCompet;
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
		this.inscrires = inscrires;
		
		for (Inscrire inscrire : this.inscrires) {
			inscrire.setCompetition(this);
		}
	}



	public Competition(String dateCompet, String nomCompet, String villeCompet, List<Epreuve> epreuves) {
		super();
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
		this.epreuves = epreuves;
		
		for (Epreuve epreuve : this.epreuves) {
			epreuve.setCompetition(this);
		}
	}



	public Competition(String dateCompet, String nomCompet, String villeCompet) {
		super();
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
	}
	
	
	public Competition(int idCompet, String dateCompet, String nomCompet, String villeCompet) {
		super();
		this.idCompet = idCompet;
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

	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}



	public List<Inscrire> getInscrires() {
		return inscrires;
	}



	public void setInscrires(List<Inscrire> inscrires) {
		this.inscrires = inscrires;
	}


	
}
