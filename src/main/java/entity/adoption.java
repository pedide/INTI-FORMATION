package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="adoption")
public class adoption {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAdoption;
	private String dateAdoption;
	private double prixAdoption;
	private int certificatAdoption;
	
	@ManyToOne()
	@JoinColumn(name="client_id")
	private clients clients;
	
	@ManyToOne()
	@JoinColumn(name="animal_id")
	private animal animal;
	
	public adoption() {
		super();
	}

	public adoption(String dateAdoption, double prixAdoption, int certificatAdoption) {
		super();
		this.dateAdoption = dateAdoption;
		this.prixAdoption = prixAdoption;
		this.certificatAdoption = certificatAdoption;
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

	public clients getClients() {
		return clients;
	}

	public void setClients(clients clients) {
		this.clients = clients;
	}

	public animal getAnimal() {
		return animal;
	}

	public void setAnimal(animal animal) {
		this.animal = animal;
	}
	
	

}
