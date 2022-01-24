package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produits")
public class Produit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProd")
	private int idProd;
	@Column(name="proNom")
	private String proNom;
	@Column(name="proPrix")
	private double proPrix;
	@Column(name="designation")
	private String designation;
	
	@OneToMany
	private List<Clients> listCli;
	
	public Produit() {
		super();
	}
	public Produit(String proNom, double proPrix, String designation) {
		super();
		this.proNom = proNom;
		this.proPrix = proPrix;
		this.designation = designation;
	}
	public List<Clients> getListCli() {
		return listCli;
	}
	public void setListCli(List<Clients> listCli) {
		this.listCli = listCli;
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
