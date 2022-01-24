package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="adoption")
public class Adoption {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAdoption")
	private int idAdoption;
	
	@Column(name="dateAdoption")
	private String dateAdoption;
	
	@Column(name="prixAdoption")
	private double prixAdoption;
	
	@Column(name="certificatAdoption")
	private int certificatAdoption;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Clients client;
	
	@ManyToOne
	@JoinColumn(name="idAnimal")
	private Animal animal;

	public Adoption(String dateAdoption, double prixAdoption, int certificatAdoption, Clients client,
			Animal animal) {
		super();
		this.dateAdoption = dateAdoption;
		this.prixAdoption = prixAdoption;
		this.certificatAdoption = certificatAdoption;
		this.client = client;
		this.animal = animal;
	}

	public int getIdAdoption() {
		return idAdoption;
	}

	public void setIdAdoption(int idAdoption) {
		this.idAdoption = idAdoption;
	}

	public String getDateAdoption() {
		return dateAdoption;
	}

	public void setDateAdoption(String dateAdoption) {
		this.dateAdoption = dateAdoption;
	}

	public double getPrixAdoption() {
		return prixAdoption;
	}

	public void setPrixAdoption(double prixAdoption) {
		this.prixAdoption = prixAdoption;
	}

	public int getCertificatAdoption() {
		return certificatAdoption;
	}

	public void setCertificatAdoption(int certificatAdoption) {
		this.certificatAdoption = certificatAdoption;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
