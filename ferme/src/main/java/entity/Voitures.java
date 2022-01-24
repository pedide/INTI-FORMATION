package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="voitures")
public class Voitures {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idVoitures")
	private int idVoitures;
	private String model;
	private String couleur;
	private String immatriculation;
	private int puissance;

	public Voitures(String model, String couleur, String immatriculation, int puissance) {
		super();
		this.model= model;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
		this.puissance = puissance;
	}



	
	public int getIdVoitures() {
		return idVoitures;
	}




	public void setIdVoitures(int idVoitures) {
		this.idVoitures = idVoitures;
	}




	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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