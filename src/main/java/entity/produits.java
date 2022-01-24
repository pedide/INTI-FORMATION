package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="produits")
public class produits {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProd;
	private String proNom;
	private double proPrix;
	private String designation;
	
	public produits(String proNom, double proPrix, String designation) {
		super();
		this.proNom = proNom;
		this.proPrix = proPrix;
		this.designation = designation;
	}


	public produits() {
		super();
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
	
	
}
