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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAchat")
	private int idAchat;
	
	@Column(name="prixAchat")
	private double prixAchat;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Clients client;
	
	@ManyToOne
	@JoinColumn(name="idVoiture")
	private Voiture voiture;

	public Achat(double prixAchat, Clients client, Voiture voiture) {
		super();
		this.prixAchat = prixAchat;
		this.client = client;
		this.voiture = voiture;
	}

	public int getIdAchat() {
		return idAchat;
	}

	public void setIdAchat(int idAchat) {
		this.idAchat = idAchat;
	}

	public double getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
}
