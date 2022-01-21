package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sportifs")

public abstract class Sportifs {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idSportif")
	private int idSportif;
	
	@Column(name="nomSportif")
	private String nomSportif;
	
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
	
	@Column(name="fax")
	private String fax;
	
	@Column(name="tel")
	private String tel;
	
	@OneToMany(mappedBy="sportifs", fetch=FetchType.LAZY)
	private List<Inscription> inscriptions = new ArrayList<Inscription>();
	
	/**@OneToOne(cascade= {CascadeType.PERSIST})
	@JoinColumn(name="licencie", unique=true)
	private Licencie licencie;
	
	@OneToOne(cascade= {CascadeType.PERSIST})
	@JoinColumn(name="amateur", unique=true)
	private Amateur amateur;**/
	
	
	/**Sportifs to inscription : OneToMany
	Sportifs to Licencie : OneToOne
	Sportifs to Amateur : OneToOne**/
	
	
	
	public Sportifs() {
		super();
	}
	
	
	
	/**public Sportifs(String nomSportif, String prenomSportif, String ville, String pays, List<Inscription> inscriptions) {
		super();
		this.nomSportif = nomSportif;
		this.prenomSportif = prenomSportif;
		this.ville = ville;
		this.pays = pays;
		this.inscriptions = inscriptions;
	}**/

	


	public Sportifs(String nomSportif, String prenomSportif, String ville, String pays) {
		super();
		this.nomSportif = nomSportif;
		this.prenomSportif = prenomSportif;
		this.ville = ville;
		this.pays = pays;
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
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}

