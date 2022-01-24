package domain;

public abstract class Individu {
	private int idIndividu;
	private String nomIndividu;
	private String prenomIndividu;
	private String adresseIndividu;
	private int cpIndividu;
	private String villeIndividu;
	
	public Individu(String nomIndividu, String prenomIndividu, String adresseIndividu, int cpIndividu,
			String villeIndividu) {
		super();
		this.nomIndividu = nomIndividu;
		this.prenomIndividu = prenomIndividu;
		this.adresseIndividu = adresseIndividu;
		this.cpIndividu = cpIndividu;
		this.villeIndividu = villeIndividu;
	}
	
	public int getIdIndividu() {
		return idIndividu;
	}
	
	public void setIdIndividu(int idIndividu) {
		this.idIndividu = idIndividu;
	}
	
	public String getNomIndividu() {
		return nomIndividu;
	}
	
	public void setNomIndividu(String nomIndividu) {
		this.nomIndividu = nomIndividu;
	}
	
	public String getPrenomIndividu() {
		return prenomIndividu;
	}
	
	public void setPrenomIndividu(String prenomIndividu) {
		this.prenomIndividu = prenomIndividu;
	}
	
	public String getAdresseIndividu() {
		return adresseIndividu;
	}
	
	public void setAdresseIndividu(String adresseIndividu) {
		this.adresseIndividu = adresseIndividu;
	}
	
	public int getCpIndividu() {
		return cpIndividu;
	}
	
	public void setCpIndividu(int cpIndividu) {
		this.cpIndividu = cpIndividu;
	}
	
	public String getVilleIndividu() {
		return villeIndividu;
	}
	
	public void setVilleIndividu(String villeIndividu) {
		this.villeIndividu = villeIndividu;
	}
}
