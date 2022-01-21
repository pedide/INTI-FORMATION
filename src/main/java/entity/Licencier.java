package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="licencier")
public class Licencier extends Sportifs{
	
	@Column(name="numlicencier")
	private int numLicencier;
	
	@Column(name="nomclub")
	private String nomClub;

	@OneToMany(mappedBy="sportifs", fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST})
	private List<Inscription>inscriptions = new ArrayList<Inscription>();
	
	public Licencier(String nomsportif, String prenomsportif, int dossardcompet) {
		super(nomsportif, prenomsportif, dossardcompet);
	}
	public Licencier() {
		super();
	}
	public Licencier(int numLicencier, String nomClub) {
		super();
		this.numLicencier = numLicencier;
		this.nomClub = nomClub;
	}

	 public Licencier(String nomsportif, String prenomsportif, String adresse, int cp, String ville, String pays,
			 String tel, String fax, int numLicencier, String nomClub, List<Inscription> inscriptions) {
			super(nomsportif, prenomsportif, adresse, cp, ville, pays, tel, fax);
			this.numLicencier = numLicencier;
			this.nomClub = nomClub;
			this.inscriptions = inscriptions;
			
			for(Inscription ins : inscriptions) {
				ins.setSportifs(this);
			}
			
		}
	public int getNumLicencier() {
		return numLicencier;
	}
	public void setNumLicencier(int numLicencier) {
		this.numLicencier = numLicencier;
	}
	public String getNomClub() {
		return nomClub;
	}
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	
}
