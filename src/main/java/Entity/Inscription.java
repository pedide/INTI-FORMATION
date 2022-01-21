package Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;



@Entity
@Table(name="inscription")
public class Inscription implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="dossardCompet")
	private int dossardCompet;
	
	public Inscription() {
		super();
	}

	public Inscription(int dossardCompet) {
		super();
		this.dossardCompet = dossardCompet;
	}

	
	
	@ManyToOne
	@JoinColumn(name="idCompet")
	private Competition competion;
	
	@ManyToOne
	@JoinColumn(name="idSpo")
	private Sportif sportif;
	
	
	
	public Inscription(int dossardCompet, Competition competion, Sportif sportif) {
		super();
		this.dossardCompet = dossardCompet;
		this.competion = competion;
		this.sportif = sportif;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDossardCompet() {
		return dossardCompet;
	}

	public void setDossardCompet(int dossardCompet) {
		this.dossardCompet = dossardCompet;
	}

	public Competition getCompetion() {
		return competion;
	}

	public void setCompetion(Competition competion) {
		this.competion = competion;
	}

	public Sportif getSportif() {
		return sportif;
	}

	public void setSportif(Sportif sportif) {
		this.sportif = sportif;
	}


	
	
}
