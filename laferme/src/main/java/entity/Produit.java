package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produits")
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProd")
	private int idProd;
	
	@Column(name="proNom")
	private String proNom;
	@Column(name="proprix")
	private int proPrix;
	@Column(name="designation")
	private String designation;
	
	
	public Produit() {
		super();
	}
	public Produit(String proNom, int proPrix, String designation) {
		super();
		this.proNom = proNom;
		this.proPrix = proPrix;
		this.designation = designation;
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
	public int getProPrix() {
		return proPrix;
	}
	public void setProPrix(int proPrix) {
		this.proPrix = proPrix;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
