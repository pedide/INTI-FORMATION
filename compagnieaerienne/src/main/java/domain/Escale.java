package domain;

public class Escale {
	private String heureDepart;
	private String heureArrive;
	private int noEscale;
	
	
	public Escale() {
		super();
	}
	public Escale(String heureDepart, String heureArrive, int noEscale) {
		super();
		this.heureDepart = heureDepart;
		this.heureArrive = heureArrive;
		this.noEscale = noEscale;
	}
	public String getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}
	public String getHeureArrive() {
		return heureArrive;
	}
	public void setHeureArrive(String heureArrive) {
		this.heureArrive = heureArrive;
	}
	public int getNoEscale() {
		return noEscale;
	}
	public void setNoEscale(int noEscale) {
		this.noEscale = noEscale;
	}
	
	
	
	

}
