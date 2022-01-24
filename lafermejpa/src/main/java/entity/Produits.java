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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idproduits")
	private int idproduits;
	@Column(name="nomPro")
	private String nomPro;
	@Column(name="prixPro")
	private String prixPro;
	@Column(name="designation")
	private String designation;
	
	
	public Produits() {
		super();
	}
	
	public Produits(String nomPro, String prixPro, String designation) {
		super();
		this.nomPro = nomPro;
		this.prixPro = prixPro;
		this.designation = designation;
	}

	public Produits(int idproduits, String nomPro, String prixPro, String designation) {
		super();
		this.idproduits = idproduits;
		this.nomPro = nomPro;
		this.prixPro = prixPro;
		this.designation = designation;
	}
	
	
	public int getIdproduits() {
		return idproduits;
	}
	public void setIdproduits(int idproduits) {
		this.idproduits = idproduits;
	}
	public String getNomPro() {
		return nomPro;
	}
	public void setNomPro(String nomPro) {
		this.nomPro = nomPro;
	}
	public String getPrixPro() {
		return prixPro;
	}
	public void setPrixPro(String prixPro) {
		this.prixPro = prixPro;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
