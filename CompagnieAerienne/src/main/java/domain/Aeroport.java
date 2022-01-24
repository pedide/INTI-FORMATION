package domain;

public class Aeroport {

	private Long idaeroport;
	private String nomAE;
	private String villeAE;
	
	
	
	
	
	
	public Aeroport() {
		super();
	
	}

	public Aeroport(String nomAE, String villeAE) {
		this.nomAE = nomAE;
		this.villeAE = villeAE;
	}
	
	public Long getIdaeroport() {
		return idaeroport;
	}
	public void setIdaeroport(Long idaeroport) {
		this.idaeroport = idaeroport;
	}
	public String getNomAE() {
		return nomAE;
	}
	public void setNomAE(String nomAE) {
		this.nomAE = nomAE;
	}
	public String getVilleAE() {
		return villeAE;
	}
	public void setVilleAE(String villeAE) {
		this.villeAE = villeAE;
	}
	
	
}
