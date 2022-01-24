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
@Table(name="voiture")
public class Voiture {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idvoit")
	private int idvoit;
	
	@Column(name="modele")
	private String modele;
	
	@Column(name="couleur")
	private String couleur;
	
	@Column(name="immatriculation")
	private String immatriculation;
	
	@Column(name="puissance")
	private int puissance;
	
	@OneToMany(mappedBy="voiture")
	private List<Achat>achats = new ArrayList<Achat>();

	public Voiture() {
		super();
	}
	public Voiture(String modele, String couleur, String immatriculation, int puissance) {
		super();
		this.modele = modele;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
		this.puissance = puissance;
	}
	public int getIdvoit() {
		return idvoit;
	}
	public void setIdvoit(int idvoit) {
		this.idvoit = idvoit;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
}
