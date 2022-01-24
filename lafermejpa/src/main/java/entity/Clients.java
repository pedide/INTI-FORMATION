package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class Clients {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idClient")
	private int idClient;
	@Column(name="nom")
    private String nom;
	@Column(name="prenom")
    private String prenom;
	@Column(name="adresse")
    private String adresse;
	@Column(name="cp")
    private String codePostal;
	@Column(name="ville")
    private String ville;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="produit_idProduit")
	private Produit prod;
	@OneToOne(mappedBy="cli")
	private Adoption adopt;
	@OneToOne(mappedBy="cli")
	private Achat ach;
    
    public Clients(String nom,String prenom,String adresse,String codePostal,String ville){
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.codePostal=codePostal;
        this.ville=ville;
    }
    
    
    public Clients(String nom, String prenom,Produit prod) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.prod=prod;
	}


	public int getIdClient(){
        return idClient;
    }
    
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
