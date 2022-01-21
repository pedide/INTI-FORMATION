package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="sportif")
@Inheritance(strategy=InheritanceType.JOINED)
public class Sportif implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDSP")
	protected Long idsp;
	@Column(name="NOM")
	protected String nomsp;
	@Column(name="PRENOM")
	protected String prenomsp;
	@Column(name="ADRESSE")
	protected String adresse;
	@Column(name="CP")
	protected String cp;
	@Column(name="VILLE")
	protected String ville;
	@Column(name="PAYS")
	protected String pays;
	@Column(name="EMAIL")
	protected String email;
	@Column(name="TEL")
	protected String tel;
	@Column(name="FAX")
	protected String fax;
	@Column(name="NUM_DOSSARD")
	protected int dossardCompet;
	
	//@OneToMany(mappedBy="sportif",fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST})
	//private List<Inscription> inscription = new ArrayList<Inscription>();
		
	public Sportif() {
		super();
	}
	
	public Sportif(Long idsp, String nomsp, String prenomsp, int dossardCompet) {
		super();
		this.idsp = idsp;
		this.nomsp = nomsp;
		this.prenomsp = prenomsp;
		this.dossardCompet = dossardCompet;
	}
	
	public Sportif(String nomsp, String prenomsp, int dossardCompet) {
		super();
		this.nomsp = nomsp;
		this.prenomsp = prenomsp;
		this.dossardCompet = dossardCompet;
	}
	
	public Sportif(String nomsp, String prenomsp) {
		super();
		this.nomsp = nomsp;
		this.prenomsp = prenomsp;
	}
	
	/*public Sportif(String nomsp, String prenomsp, List<Inscription> inscription) {
		super();
		this.nomsp = nomsp;
		this.prenomsp = prenomsp;
		this.inscription = inscription;
		for (Inscription i : inscription)
	    {
	        i.setSportif(this);
	    }
	}*/

	public Sportif(Long idsp, String nomsp, String prenomsp, String adresse, String cp, String ville, String pays,
			String email, String tel, String fax, int dossardCompet) {
		super();
		this.idsp = idsp;
		this.nomsp = nomsp;
		this.prenomsp = prenomsp;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.email = email;
		this.tel = tel;
		this.fax = fax;
		this.dossardCompet = dossardCompet;
	}
	
	
	public Long getIdsp() {
		return idsp;
	}
	public void setIdsp(Long idsp) {
		this.idsp = idsp;
	}
	public String getNomsp() {
		return nomsp;
	}
	public void setNomsp(String nomsp) {
		this.nomsp = nomsp;
	}
	public String getPrenomsp() {
		return prenomsp;
	}
	public void setPrenomsp(String prenomsp) {
		this.prenomsp = prenomsp;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
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
	public int getDossardCompet() {
		return dossardCompet;
	}
	public void setDossardCompet(int dossardCompet) {
		this.dossardCompet = dossardCompet;
	}

	/*public List<Inscription> getInscription() {
		return inscription;
	}

	public void setInscription(List<Inscription> inscription) {
		this.inscription = inscription;
	}*/

}
