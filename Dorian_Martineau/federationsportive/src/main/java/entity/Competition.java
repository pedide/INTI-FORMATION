package entity;

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
@Table(name="competition")
public class Competition {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="date")
	private String date;
	@Column(name="ville")
	private String ville;
	@Column(name="nom")
	private String nom;
	@OneToMany(mappedBy="compet",cascade=CascadeType.PERSIST)
	private List<Dossard> ltDossard=new ArrayList<Dossard>();
	@OneToMany(mappedBy="compet",cascade= CascadeType.PERSIST)
	private List<Epreuve> ltEpreuve=new ArrayList<Epreuve>();
	
	public Competition() {}
	
	public Competition(String date, String ville, String nom,List<Dossard> ltDossard,List<Epreuve> ltEpreuve) {
		super();
		this.date = date;
		this.ville = ville;
		this.nom = nom;
		this.ltDossard=ltDossard;
		for (Dossard s:ltDossard) {
			s.setCompet(this);
		}
		for (Epreuve e:ltEpreuve) {
			e.setCompet(this);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Epreuve> getLtEpreuve() {
		return ltEpreuve;
	}

	public void setLtEpreuve(List<Epreuve> ltEpreuve) {
		this.ltEpreuve = ltEpreuve;
	}

	public List<Dossard> getLtDossard() {
		return ltDossard;
	}

	public void setLtDossard(List<Dossard> ltDossard) {
		this.ltDossard = ltDossard;
	}
	
	
}
