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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAdoption")
	private int idAvions;
	
	@Column(name="dateAdoption")
	private String dateAdoption;
	
	@Column(name = "prixAdoption")
	private int prixAdoption;
	
	@Column(name = "certificatAdoption")
	private String certificatAdoption;
	
	

	public Adoption() {
		super();
	}

	public Adoption(String dateAdoption, int prixAdoption, String certificatAdoption) {
		super();
		this.dateAdoption = dateAdoption;
		this.prixAdoption = prixAdoption;
		this.certificatAdoption = certificatAdoption;
	}

	public int getIdAvions() {
		return idAvions;
	}

	public void setIdAvions(int idAvions) {
		this.idAvions = idAvions;
	}

	public String getDateAdoption() {
		return dateAdoption;
	}

	public void setDateAdoption(String dateAdoption) {
		this.dateAdoption = dateAdoption;
	}

	public int getPrixAdoption() {
		return prixAdoption;
	}

	public void setPrixAdoption(int prixAdoption) {
		this.prixAdoption = prixAdoption;
	}

	public String getCertificatAdoption() {
		return certificatAdoption;
	}

	public void setCertificatAdoption(String certificatAdoption) {
		this.certificatAdoption = certificatAdoption;
	}
	
	
}
