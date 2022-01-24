package domain;

public class Escale {
	private int idEscale;
	private String heureArrivee;
	private String heureDepart;
	private Aeroport aeroport;
	private Vol vol;
	
	public Escale(String heureArrivee, String heureDepart, Aeroport aeroport, Vol vol) {
		super();
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
		this.aeroport = aeroport;
		this.vol = vol;
	}

	public int getIdEscale() {
		return idEscale;
	}
	
	public void setIdEscale(int idEscale) {
		this.idEscale = idEscale;
	}
	
	public String getHeureArrivee() {
		return heureArrivee;
	}
	
	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	
	public String getHeureDepart() {
		return heureDepart;
	}
	
	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}
}
