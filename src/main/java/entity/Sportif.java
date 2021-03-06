package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="sportif")
@Inheritance(strategy=InheritanceType.JOINED)
public class Sportif {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idSportif")
	private int idSportif;
	@Column(name="nomSportif")
	protected String nomSportif;
	@Column(name="prenomSportif")
	protected String prenomSportif;
	@Column(name="adresse")
	protected String adresse;
	@Column(name="cp")
	protected int cp;
	@Column(name="ville")
	protected String ville;
	@Column(name="pays")
	protected String pays;
	@Column(name="email")
	protected String email;
	@Column(name="tel")
	protected String tel;
	@Column(name="fax")
	protected String fax;
	
	@ManyToMany
	protected List<Inscription> listInscr;
	
	public Sportif(String nomSportif, String prenomSportif, String adresse, int cp, String ville, String pays,
			String email, String tel, String fax) {
		super();
		this.nomSportif = nomSportif;
		this.prenomSportif = prenomSportif;
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
	
}
