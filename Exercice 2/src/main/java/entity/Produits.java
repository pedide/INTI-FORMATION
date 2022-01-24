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
@Table(name="produits")
public class Produits {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProd")
	private int idProd;
	
	@Column(name="proNom")
	private String proNom;
	
	@Column(name="proPrix")
	private double proPrix;
	
	@Column(name="designation")
	private String designation;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Clients client;

	public Produits(String proNom, double proPrix, String designation, Clients client) {
		super();
		this.proNom = proNom;
		this.proPrix = proPrix;
		this.designation = designation;
		this.client = client;
	}

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}

	public String getProNom() {
		return proNom;
	}

	public void setProNom(String proNom) {
		this.proNom = proNom;
	}

	public double getProPrix() {
		return proPrix;
	}

	public void setProPrix(double proPrix) {
		this.proPrix = proPrix;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}
}
