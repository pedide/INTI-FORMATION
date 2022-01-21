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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sportifs")
@Inheritance(strategy=InheritanceType.JOINED)

public class Sportifs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idsportif")
	private int idSportif; 
	
	@Column(name="nomsportif")
	protected String nomSportif; 
	
	@Column(name="prenomsportif")
	protected String prenomSportif; 
	
	@Column(name="adressesportif")
	protected String adresseSportif; 
	
	@Column(name="cpsportif")
	protected int cpSportif; 
	
	@Column(name="villesportif")
	protected String villeSportif; 
	
	@Column(name="payssportif")
	protected String paysSportif; 
	
	@Column(name="email")
	protected String email; 
	
	@Column(name="tel")
	protected String tel; 
	
	@Column(name="dossardcompet")
	protected int dossardCompet;
	
	@OneToMany(mappedBy="sportifs",fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	private List<Inscrire>inscrire = new ArrayList<Inscrire>();
	
	public Sportifs() {
		super();
	}

	public Sportifs(String nomSportif, String prenomSportif, String adresseSportif, int cpSportif, String villeSportif,
			String paysSportif, String email, String tel, int dossardCompet) {
		super();
		this.nomSportif = nomSportif;
		this.prenomSportif = prenomSportif;
		this.adresseSportif = adresseSportif;
		this.cpSportif = cpSportif;
		this.villeSportif = villeSportif;
		this.paysSportif = paysSportif;
		this.email = email;
		this.tel = tel;
		this.dossardCompet = dossardCompet;
	}


	public Sportifs(String nomSportif, String prenomSportif, int dossardCompet) {
		super();
		this.nomSportif = nomSportif;
		this.prenomSportif = prenomSportif;
		this.dossardCompet = dossardCompet;
	}
		

	public List<Inscrire> getInscrire() {
		return inscrire;
	}

	public void setInscrire(List<Inscrire> inscrire) {
		this.inscrire = inscrire;
	}

	public int getIdSportif() {
		return idSportif;
	}

	public void setIdSportif(int idSportif) {
		this.idSportif = idSportif;
	}

	public String getNomSportif() {
		return nomSportif;
	}

	public void setNomSportif(String nomSportif) {
		this.nomSportif = nomSportif;
	}

	public String getPrenomSportif() {
		return prenomSportif;
	}

	public void setPrenomSportif(String prenomSportif) {
		this.prenomSportif = prenomSportif;
	}

	public String getAdresseSportif() {
		return adresseSportif;
	}

	public void setAdresseSportif(String adresseSportif) {
		this.adresseSportif = adresseSportif;
	}

	public int getCpSportif() {
		return cpSportif;
	}

	public void setCpSportif(int cpSportif) {
		this.cpSportif = cpSportif;
	}

	public String getVilleSportif() {
		return villeSportif;
	}

	public void setVilleSportif(String villeSportif) {
		this.villeSportif = villeSportif;
	}

	public String getPaysSportif() {
		return paysSportif;
	}

	public void setPaysSportif(String paysSportif) {
		this.paysSportif = paysSportif;
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

	public int getDossardCompet() {
		return dossardCompet;
	}

	public void setDossardCompet(int dossardCompet) {
		this.dossardCompet = dossardCompet;
	} 
	
	
}
