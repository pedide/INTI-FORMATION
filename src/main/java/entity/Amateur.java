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

	@Column(name="certificatMedical")
	private int certificatMedical;
	@Column(name="nommedecin")
	private String nommedecin;
	
	@OneToMany(mappedBy="sportifs", fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST})
	private List<Inscription>listeinscription = new ArrayList<Inscription>();
	
	public Amateur() {
		super();
	}

	public Amateur(int certificatMedical, String nommedecin) {
		super();
		this.certificatMedical = certificatMedical;
		this.nommedecin = nommedecin;
	}
	
	public Amateur(String nomsportif, String prenomsportif, String adresse, int cp, String ville,
			String pays, String tel, String fax, int certificatMedical, String nommedecin, List<Inscription>inscriptions) {
		super(nomsportif, prenomsportif, adresse, cp, ville, pays, tel, fax);
		this.certificatMedical = certificatMedical;
		this.nommedecin = nommedecin;
	    listeinscription = inscriptions;	   
	    
	    for (Inscription i : inscriptions)
	    {
	        i.setSportifs(this);
	    }
	}
	
	

	public int getCertificatMedical() {
		return certificatMedical;
	}

	public void setCertificatMedical(int certificatMedical) {
		this.certificatMedical = certificatMedical;
	}

	public String getNommedecin() {
		return nommedecin;
	}

	public void setNommedecin(String nommedecin) {
		this.nommedecin = nommedecin;
	}

	
	
}
