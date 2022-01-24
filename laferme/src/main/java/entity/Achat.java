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
@Table(name="achat")
public class Achat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idachat")
	private int idachat;
	
	@Column(name="prixachat")
	private double prixachat;
	
	@ManyToOne
	@JoinColumn(name="idcli")
	private Clients clients;
	
	@ManyToOne
	@JoinColumn(name="idvoit")
	private Voiture voiture;
	
	public Achat(double prixachat, Clients clients, Voiture voiture) {
		super();
		this.prixachat = prixachat;
		this.clients = clients;
		this.voiture = voiture;
	}
	public Achat() {
		super();
	}
	public Achat(double prixachat) {
		super();
		this.prixachat = prixachat;
	}
	public int getIdachat() {
		return idachat;
	}
	public void setIdachat(int idachat) {
		this.idachat = idachat;
	}
	public double getPrixachat() {
		return prixachat;
	}
	public void setPrixachat(double prixachat) {
		this.prixachat = prixachat;
	}
	
}
