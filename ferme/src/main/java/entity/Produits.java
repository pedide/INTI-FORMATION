package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produits")
public class Produits {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProduits")
	private int idProduits;
	private String proNom;
	private double proPrix;
	private String designation;
	


	public Produits(String proNom, double proPrix, String designation) {
		super();
		this.proNom = proNom;
		this.proPrix = proPrix;
		this.designation = designation;
		
	}

	public int getIdProduits() {
		return idProduits;
	}

	public void setIdProduits(int idProduits) {
		this.idProduits = idProduits;
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


}