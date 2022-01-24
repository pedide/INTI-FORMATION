package domain;

public class Voiture {

	private int idvoiture;
	private String modele;
	private String couleur;
	private String immatriculation;
	private int puissance;
	
	
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
	
	public Voiture(int idvoiture, String modele, String couleur, String immatriculation, int puissance) {
		super();
		this.idvoiture = idvoiture;
		this.modele = modele;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
		this.puissance = puissance;
	}
	
	
	public int getIdvoiture() {
		return idvoiture;
	}
	public void setIdvoiture(int idvoiture) {
		this.idvoiture = idvoiture;
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
