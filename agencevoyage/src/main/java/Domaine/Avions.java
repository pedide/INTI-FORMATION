package Domaine;

public class Avions {
	private int idAvion;
	private String modele;
	private int nbPlaces;
	private String localite;
	
	
	
	public Avions() {
		super();
	}
	
	public Avions(String modele, int nbPlaces, String localite) {
		super();
		this.modele = modele;
		this.nbPlaces = nbPlaces;
		this.localite = localite;
	}
	
	
	public int getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	public String getLocalite() {
		return localite;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	
	
}
