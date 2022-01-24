package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pilote")
public class Pilote {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pilID")
	private int pilID;
	@Column(name="pilNom")
	private String pilNom;
	@Column(name="pilPrenom")
	private String pilPrenom;
	@Column(name="pilVille")
	private String pilVille;
	@Column(name="pilSalaire")
	private String pilSalaire;
	@Column(name="pilAdresse")
	private String pilAdresse;
	
	@OneToMany
	private List<Vol> listVols;
	
	public Pilote(String pilNom, String pilPrenom, String pilVille, String pilSalaire) {
		super();
		this.pilNom = pilNom;
		this.pilPrenom = pilPrenom;
		this.pilVille = pilVille;
		this.pilSalaire = pilSalaire;
	}
	
	public List<Vol> getListVols() {
		return listVols;
	}
	public void setListVols(List<Vol> listVols) {
		this.listVols = listVols;
	}
	public int getPilID() {
		return pilID;
	}
	public void setPilID(int pilID) {
		this.pilID = pilID;
	}
	public String getPilNom() {
		return pilNom;
	}
	public void setPilNom(String pilNom) {
		this.pilNom = pilNom;
	}
	public String getPilPrenom() {
		return pilPrenom;
	}
	public void setPilPrenom(String pilPrenom) {
		this.pilPrenom = pilPrenom;
	}
	public String getPilVille() {
		return pilVille;
	}
	public void setPilVille(String pilVille) {
		this.pilVille = pilVille;
	}
	public String getPilSalaire() {
		return pilSalaire;
	}
	public void setPilSalaire(String pilSalaire) {
		this.pilSalaire = pilSalaire;
	}
	public String getPilAdresse() {
		return pilAdresse;
	}
	public void setPilAdresse(String pilAdresse) {
		this.pilAdresse = pilAdresse;
	}
	
}
