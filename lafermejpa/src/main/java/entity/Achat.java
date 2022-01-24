package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="achat")
public class Achat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAchat")
	private int idAchat;
	@Column(name="prixAchat")
    private double prixAchat;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="client_idClient")
	private Clients cli;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="voiture_idVoit")
	private Voiture voit;
    
    
    public Achat(){}
    
    public Achat(Clients cli,Voiture voit){
        this.cli=cli;
        this.voit=voit;
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
