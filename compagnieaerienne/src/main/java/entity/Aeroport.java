package entity;

public class Aeroport {
	private Long idAeroport;
	private String nomAeroport;
	
	
	
	public Aeroport() {
		super();
	}
	
	public Aeroport(Long idAeroport, String nomAeroport) {
		super();
		this.idAeroport = idAeroport;
		this.nomAeroport = nomAeroport;
	}
	public Long getIdAeroport() {
		return idAeroport;
	}
	public void setIdAeroport(Long idAeroport) {
		this.idAeroport = idAeroport;
	}
	public String getNomAeroport() {
		return nomAeroport;
	}
	public void setNomAeroport(String nomAeroport) {
		this.nomAeroport = nomAeroport;
	}
	
	
	

}
