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
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProduit")
	private int idProd;
	@Column(name="nom")
    private String nom;
	@Column(name="prixProd")
    private double prix;
	@Column(name="designation")
    private String designation;
	@OneToMany(mappedBy="prod",cascade=CascadeType.PERSIST)
	private List<Clients> cli=new ArrayList<Clients>();;
    
    public Produit(String nom,double prix,String designation){
        this.nom=nom;
        this.prix=prix;
        this.designation=designation;
    }
    
    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
