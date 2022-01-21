package Entity;

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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sportif")
@Inheritance(strategy=InheritanceType.JOINED)
public class Sportif {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	protected int idSpo;
	
	protected String nom;
	protected String prenom;
	protected String adresse;
	protected int cp;
	protected String ville;
	protected String pays;
	protected String tel;
	protected String fax;
	protected int dossardCompet;
	
	
	
	
	public Sportif() {
		super();
	}
	
	
	public Sportif(String nom, String prenom, String adresse, int cp, String ville, String pays, String tel, String fax,
			int dossardCompet) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.tel = tel;
		this.fax = fax;
		this.dossardCompet = dossardCompet;
	}
	
	/*@OneToMany (mappedBy="sportif", cascade= {CascadeType.PERSIST})
    private List<Inscription> listeInsc = new ArrayList<Inscription>();
	
	
	
	public Sportif(String nom, String prenom, String adresse, int cp, String ville, String pays, String tel, String fax,
			int dossardCompet, List<Inscription> listeInsc) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.tel = tel;
		this.fax = fax;
		this.dossardCompet = dossardCompet;
		this.listeInsc = listeInsc;
	}*/

	public int getIdSpo() {
		return idSpo;
	}
	public void setIdSpo(int idSpo) {
		this.idSpo = idSpo;
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


	/*public List<Inscription> getListeInsc() {
		return listeInsc;
	}


	public void setListCompet(List<Inscription> listeInsc) {
		this.listeInsc = listeInsc;
	}
	*/
	
}
