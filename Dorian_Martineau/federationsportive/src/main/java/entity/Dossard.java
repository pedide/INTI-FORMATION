package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dossard")
public class Dossard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dossard")
	private int dossard;
	@OneToOne(mappedBy="dossard",cascade=CascadeType.PERSIST)
	private Sportif sportif;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Competition compet;
	
	public Dossard() {}
	public Dossard(int dossard) {
		super();
		this.dossard = dossard;
	}
	public int getDossard() {
		return dossard;
	}
	public void setDossard(int dossard) {
		this.dossard = dossard;
	}
	public Sportif getSportif() {
		return sportif;
	}
	public void setSportif(Sportif sportif) {
		this.sportif = sportif;
	}
	public Competition getCompet() {
		return compet;
	}
	public void setCompet(Competition compet) {
		this.compet = compet;
	}
	
	
}
