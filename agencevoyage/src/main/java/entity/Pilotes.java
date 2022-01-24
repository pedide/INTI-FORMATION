package entity;

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
@Table(name="pilotes")
public class Pilotes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pilid")
	private int pilid;	
	
	@Column(name="pilnom")
	private String pilNom;
	
	@Column(name="pilprenom")
	private String pilprenom;
	
	@Column(name="pilville")
	private String pilville;
	
	@Column(name="pilsalaire")
	private double pilSalaire;
	
	@OneToMany(mappedBy="pilotes", fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	private List<Vol>vols = new ArrayList<Vol>();

	public String getPilNom() {
		return pilNom;
	}
	public void setPilNom(String pilNom) {
		this.pilNom = pilNom;
	}
	public String getPilville() {
		return pilville;
	}
	public void setPilville(String pilville) {
		this.pilville = pilville;
	}
	public double getPilSalaire() {
		return pilSalaire;
	}
	public void setPilSalaire(double pilSalaire) {
		this.pilSalaire = pilSalaire;
	}
	public int getPilid() {
		return pilid;
	}
	public void setPilid(int pilid) {
		this.pilid = pilid;
	}
	public String getPilprenom() {
		return pilprenom;
	}
	public void setPilprenom(String pilprenom) {
		this.pilprenom = pilprenom;
	}

	public Pilotes(String pilNom, String pilprenom, String pilville, double pilSalaire) {
		super();
		this.pilNom = pilNom;
		this.pilprenom = pilprenom;
		this.pilville = pilville;
		this.pilSalaire = pilSalaire;
	}
	public Pilotes() {
		super();
	}
	
}
