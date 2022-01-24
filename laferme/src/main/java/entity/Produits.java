package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="produits")
public class Produits {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idprod")
	private int idprod;
	
	@Column(name="pronom")
	private String pronom;
	
	@Column(name="proprix")
	private double proprix;
	
	@Column(name="designation")
	private String designation;
	
	@OneToMany(mappedBy="produits")
	private List<Clients>clients = new ArrayList<Clients>();
	
	public Produits(String pronom, double proprix, String designation, List<Clients> clients) {
		super();
		this.pronom = pronom;
		this.proprix = proprix;
		this.designation = designation;
		this.clients = clients;
	}
	public Produits() {
		super();
	}
	public Produits(String pronom, double proprix, String designation) {
		super();
		this.pronom = pronom;
		this.proprix = proprix;
		this.designation = designation;
	}
	public int getIdprod() {
		return idprod;
	}
	public void setIdprod(int idprod) {
		this.idprod = idprod;
	}
	public String getPronom() {
		return pronom;
	}
	public void setPronom(String pronom) {
		this.pronom = pronom;
	}
	public double getProprix() {
		return proprix;
	}
	public void setProprix(double proprix) {
		this.proprix = proprix;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
