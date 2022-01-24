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
	private int idAdoption;
	private String dataAdoption;
	private int certificatAdoption;
	private double prixAdoption;
	
	public Adoption(String dateAdoption, double prixAdoption, int certificatAdoption, Clients client,
			Animal animal) {
		super();
		this.dataAdoption = dateAdoption;
		this.prixAdoption = prixAdoption;
		this.certificatAdoption = certificatAdoption;
	
	}

	public int getIdAdoption() {
		return idAdoption;
	}

	public void setIdAdoption(int idAdoption) {
		this.idAdoption = idAdoption;
	}

	public String getDataAdoption() {
		return dataAdoption;
	}

	public void setDataAdoption(String dataAdoption) {
		this.dataAdoption = dataAdoption;
	}

	public int getCertificatAdoption() {
		return certificatAdoption;
	}

	public void setCertificatAdoption(int certificatAdoption) {
		this.certificatAdoption = certificatAdoption;
	}

	public double getPrixAdoption() {
		return prixAdoption;
	}

	public void setPrixAdoption(double prixAdoption) {
		this.prixAdoption = prixAdoption;
	}


	
}