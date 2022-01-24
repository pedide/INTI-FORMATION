package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="voiture")
public class voiture {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idVoit;
	private String modele;
	private String couleur;
	private String immatriculation;
	private int puissance;
	
	public voiture() {
		super();
	}

	public voiture(String modele, String couleur, String immatriculation, int puissance) {
		super();
		this.modele = modele;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
		this.puissance = puissance;
	}

	public int getIdVoit() {
		return idVoit;
	}

	public void setIdVoit(int idVoit) {
		this.idVoit = idVoit;
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
