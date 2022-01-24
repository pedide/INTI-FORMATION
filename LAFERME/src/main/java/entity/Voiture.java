package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "voiture")
public class Voiture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idVoiture")
	private int idVoiture;
	@Column(name="modele")
	private String modele;
	@Column(name="couleur")
	private String couleur;
	@Column(name="immat")
	private String immat;
	@Column(name="puissance")
	private int puissance;
	
	@OneToOne
	private Achat ach;
	
	public Voiture() {
		super();
	}
	
	public Voiture(String modele, String couleur, String immat, int puissance) {
		super();
		this.modele = modele;
		this.couleur = couleur;
		this.immat = immat;
		this.puissance = puissance;
	}
	public int getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
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
	public String getImmat() {
		return immat;
	}
	public void setImmat(String immat) {
		this.immat = immat;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return "Voiture [modele=" + modele + ", couleur=" + couleur + ", immat=" + immat + ", puissance=" + puissance
				+ "]";
	}
	
}
