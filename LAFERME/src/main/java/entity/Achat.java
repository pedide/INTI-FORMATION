package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "achat")
public class Achat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAchat")
	private int idAchat;
	@Column(name="prixAchat")
	private double prixAchat;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="clients_idCli")
	private Clients cli;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="voiture_idVoiture")
	private Voiture Voit;
	
	public Achat() {
		super();
	}
	public Achat(double prixAchat, Clients cli, Voiture voit) {
		super();
		this.prixAchat = prixAchat;
		this.cli = cli;
		Voit = voit;
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
	
	
}
