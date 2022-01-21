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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Sportif")
public class Sportif {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSportif;
	private String nom;
	private String prenom;
	private String adresse;
	private int cp;
	private String ville;
	private String pays;
	private String email;
	private String tel;
	private String fax;
	
	@OneToMany
	List<Inscrire> inscrires = new ArrayList<Inscrire>();	
	

	public Sportif() {
		this("", "", "", 0, "", "", "", "", "");
	}
	
	
	
	
	public Sportif(String nom, String prenom, List<Inscrire> inscrires) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.inscrires = inscrires;
		
		for (Inscrire inscrire : inscrires) {
			inscrire.setSportif(this);
		}
	}




	public Sportif(String nom, String prenom, String adresse, int cp, String ville) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
	}
	
	public Sportif(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Sportif(String nom, String prenom, String adresse, int cp, String ville, String pays, String email,
			String tel, String fax) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.email = email;
		this.tel = tel;
		this.fax = fax;
	}
	
	public Sportif(int idSportif, String nom, String prenom, String adresse, int cp, String ville, String pays,
			String email, String tel, String fax) {
		super();
		this.idSportif = idSportif;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.email = email;
		this.tel = tel;
		this.fax = fax;
	}
	
	public int getIdSportif() {
		return idSportif;
	}
	public void setIdSportif(int idSportif) {
		this.idSportif = idSportif;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public List<Inscrire> getInscrires() {
		return inscrires;
	}

	public void setInscrires(List<Inscrire> inscrires) {
		this.inscrires = inscrires;
	}

}
