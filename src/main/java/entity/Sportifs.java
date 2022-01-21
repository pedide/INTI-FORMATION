package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="sportifs")
@Inheritance(strategy=InheritanceType.JOINED)

public class Sportifs{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idsportif")
	protected int idsportif;
	
	@Column(name="nomsportif")
	protected String nomsportif;
	
	@Column(name="prenomsportif")
	protected String prenomsportif;
	
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
	
	@Column(name="dossardcompet")
	protected int dossardcompet;
	
	public Sportifs() {
		super();
	}

	public Sportifs(String nomsportif, String prenomsportif, int dossardcompet) {
		super();
		this.nomsportif = nomsportif;
		this.prenomsportif = prenomsportif;
		this.dossardcompet = dossardcompet;
	}	

	public Sportifs(String nomsportif, String prenomsportif, String adresse, int cp, String ville, String pays,
		 String tel, String fax) {
		super();
		this.nomsportif = nomsportif;
		this.prenomsportif = prenomsportif;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.tel = tel;
		this.fax = fax;
	}

	public Sportifs(String nomsportif, String prenomsportif, String adresse, int cp, String ville, String pays,
			String email, String tel, String fax, int dossardcompet) {
		super();
		this.nomsportif = nomsportif;
		this.prenomsportif = prenomsportif;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.email = email;
		this.tel = tel;
		this.fax = fax;
		this.dossardcompet = dossardcompet;
	}
	public int getIdsportif() {
		return idsportif;
	}
	public void setIdsportif(int idsportif) {
		this.idsportif = idsportif;
	}
	public String getNomsportif() {
		return nomsportif;
	}
	public void setNomsportif(String nomsportif) {
		this.nomsportif = nomsportif;
	}
	public String getPrenomsportif() {
		return prenomsportif;
	}
	public void setPrenomsportif(String prenomsportif) {
		this.prenomsportif = prenomsportif;
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
	public int getDossardcompet() {
		return dossardcompet;
	}
	public void setDossardcompet(int dossardcompet) {
		this.dossardcompet = dossardcompet;
	}
	
}
