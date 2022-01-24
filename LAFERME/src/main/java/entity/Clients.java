package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Clients implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCli")
	private int idCli;
	@Column(name="nomCli")
	private String nomCli;
	@Column(name="prenomCli")
	private String prenomCli;
	@Column(name="adresseCi")
	private String adresseCi;
	@Column(name="cp")
	private String cp;
	@Column(name="ville")
	private String ville;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="produits_idProd")
	private Produit prod;
	
	@OneToMany
	private List<Adoption> listAdopt;
	
	@OneToMany
	private List<Achat> listAchat;
	
	
	
	public Clients() {
		super();
	}
	public Clients(String nomCli, String prenomCli, String adresseCi, String cp, String ville, Produit prod) {
		super();
		this.nomCli = nomCli;
		this.prenomCli = prenomCli;
		this.adresseCi = adresseCi;
		this.cp = cp;
		this.ville = ville;
		this.prod = prod;
	}
	public int getIdCli() {
		return idCli;
	}
	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}
	public String getNomCli() {
		return nomCli;
	}
	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}
	public String getPrenomCli() {
		return prenomCli;
	}
	public void setPrenomCli(String prenomCli) {
		this.prenomCli = prenomCli;
	}
	public String getAdresseCi() {
		return adresseCi;
	}
	public void setAdresseCi(String adresseCi) {
		this.adresseCi = adresseCi;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Clients [nomCli=" + nomCli + ", prenomCli=" + prenomCli + "]";
	}
}
