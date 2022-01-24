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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idadoption")
	private int idadoption;
	
	@Column(name="dateadoption")
	private String dateadoption;
	
	@Column(name="prixadoption")
	private double prixadoption;
	
	@Column(name="certificatadoption")
	private int certificatadoption;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Animal animal;
	
	@ManyToOne
	@JoinColumn(name="idcli")
	private Clients clients;	
	
	public Adoption() {
		super();
	}	
	public Adoption(String dateadoption, double prixadoption, int certificatadoption, Animal animal, Clients clients) {
		super();
		this.dateadoption = dateadoption;
		this.prixadoption = prixadoption;
		this.certificatadoption = certificatadoption;
		this.animal = animal;
		this.clients = clients;
	}


	public Adoption(String dateadoption, double prixadoption, int certificatadoption) {
		super();
		this.dateadoption = dateadoption;
		this.prixadoption = prixadoption;
		this.certificatadoption = certificatadoption;
	}
	public int getIdadoption() {
		return idadoption;
	}
	public void setIdadoption(int idadoption) {
		this.idadoption = idadoption;
	}
	public String getDateadoption() {
		return dateadoption;
	}
	public void setDateadoption(String dateadoption) {
		this.dateadoption = dateadoption;
	}
	public double getPrixadoption() {
		return prixadoption;
	}
	public void setPrixadoption(double prixadoption) {
		this.prixadoption = prixadoption;
	}
	public int getCertificatadoption() {
		return certificatadoption;
	}
	public void setCertificatadoption(int certificatadoption) {
		this.certificatadoption = certificatadoption;
	}
	
}
