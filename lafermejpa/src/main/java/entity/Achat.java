package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="achat")
public class Achat {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idachat")
	private int idachat;
	@Column(name="prixAchat")
	private double prixAchat;
	
	
	public Achat(double prixAchat) {
		super();
		this.prixAchat = prixAchat;
	}
	
	public Achat() {
		super();
	}
	
	public Achat(int idachat, double prixAchat) {
		super();
		this.idachat = idachat;
		this.prixAchat = prixAchat;
	}
	
	
	public int getIdachat() {
		return idachat;
	}
	public void setIdachat(int idachat) {
		this.idachat = idachat;
	}
	public double getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}
	
	
}
