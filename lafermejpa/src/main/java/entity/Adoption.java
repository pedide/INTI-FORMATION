package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adoption")
public class Adoption {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idadoption")
	private int idadoption;
	@Column(name="dateAdopt")
	private String dateAdopt;
	@Column(name="prixAdopt")
	private double prixAdopt;
	@Column(name="certifAdopt")
	private String certifAdopt;
	
	
	public Adoption() {
		super();
	}
	
	public Adoption(String dateAdopt, double prixAdopt, String certifAdopt) {
		super();
		this.dateAdopt = dateAdopt;
		this.prixAdopt = prixAdopt;
		this.certifAdopt = certifAdopt;
	}

	public Adoption(int idadoption, String dateAdopt, double prixAdopt, String certifAdopt) {
		super();
		this.idadoption = idadoption;
		this.dateAdopt = dateAdopt;
		this.prixAdopt = prixAdopt;
		this.certifAdopt = certifAdopt;
	}
	
	
	public int getIdadoption() {
		return idadoption;
	}
	public void setIdadoption(int idadoption) {
		this.idadoption = idadoption;
	}
	public String getDateAdopt() {
		return dateAdopt;
	}
	public void setDateAdopt(String dateAdopt) {
		this.dateAdopt = dateAdopt;
	}
	public double getPrixAdopt() {
		return prixAdopt;
	}
	public void setPrixAdopt(double prixAdopt) {
		this.prixAdopt = prixAdopt;
	}
	public String getCertifAdopt() {
		return certifAdopt;
	}
	public void setCertifAdopt(String certifAdopt) {
		this.certifAdopt = certifAdopt;
	}
	
	
}
