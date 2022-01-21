package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sportif")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Sportif {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idSportif")
	private int idSportif;
	
	@Column(name="nomSPortif")
	private String nomSPortif;
	
	@Column(name="prenomSportif")
	private String prenomSportif;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="cp")
	private int cp;
	
	@Column(name="ville")
	private String ville;
	
	@Column(name="pays")
	private String pays;
	
	@Column(name="email")
	private String email;
	
	@Column(name="tel")
	private String tel;
	
	@Column(name="fax")
	private String fax;
	
	@OneToMany(mappedBy="sportif")
    private List<Inscription> listInscription = new ArrayList<Inscription>();
	
	public Sportif(String nomSPortif, String prenomSportif, String adresse, int cp, String ville,
			String pays, String email, String tel, String fax) {
		super();
		this.nomSPortif = nomSPortif;
		this.prenomSportif = prenomSportif;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.email = email;
		this.tel = tel;
		this.fax = fax;
	}

	public Sportif() {
		super();
	}

	public int getIdSportif() {
		return idSportif;
	}

	public void setIdSportif(int idSportif) {
		this.idSportif = idSportif;
	}

	public String getNomSPortif() {
		return nomSPortif;
	}

	public void setNomSPortif(String nomSPortif) {
		this.nomSPortif = nomSPortif;
	}

	public String getPrenomSportif() {
		return prenomSportif;
	}

	public void setPrenomSportif(String prenomSportif) {
		this.prenomSportif = prenomSportif;
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

	public List<Inscription> getListInscription() {
		return listInscription;
	}

	public void setListInscription(List<Inscription> listInscription) {
		this.listInscription = listInscription;
	}
}
