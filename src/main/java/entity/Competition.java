package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="competition")
public class Competition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCompetition")
	private int idCompetition;
	
	@Column(name="dateCompet")
	private String dateCompet;
	
	@Column(name="nomCompet")
	private String nomCompet;
	
	@Column(name="villeCompet")
	private String villeCompet;
	
	@OneToMany(mappedBy="competition")
    private List<Inscription> listInscription = new ArrayList<Inscription>();
	
	public Competition(String dateCompet, String nomCompet, String villeCompet) {
		super();
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
	}
	
	public Competition() {
		super();
	}
	
	public int getIdCompetition() {
		return idCompetition;
	}
	
	public void setIdCompetition(int idCompetition) {
		this.idCompetition = idCompetition;
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

	public List<Inscription> getListInscription() {
		return listInscription;
	}

	public void setListInscription(List<Inscription> listInscription) {
		this.listInscription = listInscription;
	}
}
