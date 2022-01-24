package domain;

public class Avion {
	private int idAvion; 
	private String modelAvion; 
	private int nbplacesAvion; 
	private String localisationAvion;
	
	public Avion() {
		super();
	}

	public Avion(String modelAvion, int nbplacesAvion, String localisationAvion) {
		super();
		this.modelAvion = modelAvion;
		this.nbplacesAvion = nbplacesAvion;
		this.localisationAvion = localisationAvion;
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getModelAvion() {
		return modelAvion;
	}

	public void setModelAvion(String modelAvion) {
		this.modelAvion = modelAvion;
	}

	public int getNbplacesAvion() {
		return nbplacesAvion;
	}

	public void setNbplacesAvion(int nbplacesAvion) {
		this.nbplacesAvion = nbplacesAvion;
	}

	public String getLocalisationAvion() {
		return localisationAvion;
	}

	public void setLocalisationAvion(String localisationAvion) {
		this.localisationAvion = localisationAvion;
	} 
	
	
	
	
}
