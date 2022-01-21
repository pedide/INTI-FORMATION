package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="competition")
public class Competition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCompet")
	private int idCompet;
	@Column(name="dateCompet")
	private String dateCompet;
	@Column(name="nomCompet")
	private String nomCompet;
	@Column(name="villeCompet")
	private String villeCompet;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="compet")
	private List<Epreuve> listEpr;
	
	@ManyToMany
	private List<Sportif> listSport;
	
	public Competition(String dateCompet, String nomCompet, String villeCompet,List<Epreuve> listEpr) {
		super();
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
		this.listEpr = listEpr;
		for(Epreuve e : listEpr) {
			e.setCompet(this);
		}
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
