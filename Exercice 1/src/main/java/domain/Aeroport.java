package domain;

public class Aeroport {
	private int idAeroport;
	private String nomAeroport;
	
	public Aeroport(String nomAeroport) {
		super();
		this.nomAeroport = nomAeroport;
	}
	
	public int getIdAeroport() {
		return idAeroport;
	}
	
	public void setIdAeroport(int idAeroport) {
		this.idAeroport = idAeroport;
	}
	
	public String getNomAeroport() {
		return nomAeroport;
	}
	
	public void setNomAeroport(String nomAeroport) {
		this.nomAeroport = nomAeroport;
	}
}
