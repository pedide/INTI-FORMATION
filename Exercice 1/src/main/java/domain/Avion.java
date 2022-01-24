package domain;

public class Avion {
	private int idAvion;
	private String modele;
	private int nbrPlaces;
	private String localite;
	
	public Avion(String modele, int nbrPlaces, String localite) {
		super();
		this.modele = modele;
		this.nbrPlaces = nbrPlaces;
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
	
	public int getNbrPlaces() {
		return nbrPlaces;
	}
	
	public void setNbrPlaces(int nbrPlaces) {
		this.nbrPlaces = nbrPlaces;
	}
	
	public String getLocalite() {
		return localite;
	}
	
	public void setLocalite(String localite) {
		this.localite = localite;
	}
}
