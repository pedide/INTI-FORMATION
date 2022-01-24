package domain;

public class Avion {

	private int idavion;
	private String modele;
	private int nbrePlace;
	private String localite;
	
	
	public Avion() {
		super();
	}
	
	public Avion(String modele, int nbrePlace, String localite) {
		super();
		this.modele = modele;
		this.nbrePlace = nbrePlace;
		this.localite = localite;
	}
	
	public Avion(int idavion, String modele, int nbrePlace, String localite) {
		super();
		this.idavion = idavion;
		this.modele = modele;
		this.nbrePlace = nbrePlace;
		this.localite = localite;
	}
	
	
	public int getIdavion() {
		return idavion;
	}
	public void setIdavion(int idavion) {
		this.idavion = idavion;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getNbrePlace() {
		return nbrePlace;
	}
	public void setNbrePlace(int nbrePlace) {
		this.nbrePlace = nbrePlace;
	}
	public String getLocalite() {
		return localite;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	
	
}
