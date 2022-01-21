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
@Table(name="amateur")
public class Amateur extends Sportifs{
	
	@Column(name="certificatmedical")
	private int certificatMedical;
	
	@Column(name="nommedecin")
	private String nomMedecin;
	
	@OneToMany(mappedBy="sportifs", fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST})
	private List<Inscription>inscriptions = new ArrayList<Inscription>();

	 Amateur(int certificatMedical, String nomMedecin) {
			super();
			this.certificatMedical = certificatMedical;
			this.nomMedecin = nomMedecin;
		} 

	public Amateur(String nomsportif, String prenomsportif, String adresse, int cp, String ville, String pays,
			 String tel, String fax, int certificatMedical, String nomMedecin, List<Inscription> inscriptions) {
			super(nomsportif, prenomsportif, adresse, cp, ville, pays, tel, fax);
			this.certificatMedical = certificatMedical;
			this.nomMedecin = nomMedecin;
			this.inscriptions = inscriptions;
			for(Inscription ins : inscriptions) {
				ins.setSportifs(this);
			}
		}
 
	public int getCertificatMedical() {
		return certificatMedical;
	}
	public void setCertificatMedical(int certificatMedical) {
		this.certificatMedical = certificatMedical;
	}
	public String getNomMedecin() {
		return nomMedecin;
	}
	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}

	public List<Inscription> getInscriptions() {
		return inscriptions;
	}

	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	
}
