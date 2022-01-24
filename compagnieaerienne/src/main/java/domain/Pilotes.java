package domain;

public class Pilotes {
	private int idPilotes;
	private String nomPilotes;
	private String prenomPilotes;
	private String villePilotes;
	private String salairePilotes;
	
	
	public Pilotes() {
		super();
	}
	public Pilotes(int idPilotes, String nomPilotes, String prenomPilotes, String villePilotes, String salairePilotes) {
		super();
		this.idPilotes = idPilotes;
		this.nomPilotes = nomPilotes;
		this.prenomPilotes = prenomPilotes;
		this.villePilotes = villePilotes;
		this.salairePilotes = salairePilotes;
	}
	public int getIdPilotes() {
		return idPilotes;
	}
	public void setIdPilotes(int idPilotes) {
		this.idPilotes = idPilotes;
	}
	public String getNomPilotes() {
		return nomPilotes;
	}
	public void setNomPilotes(String nomPilotes) {
		this.nomPilotes = nomPilotes;
	}
	public String getPrenomPilotes() {
		return prenomPilotes;
	}
	public void setPrenomPilotes(String prenomPilotes) {
		this.prenomPilotes = prenomPilotes;
	}
	public String getVillePilotes() {
		return villePilotes;
	}
	public void setVillePilotes(String villePilotes) {
		this.villePilotes = villePilotes;
	}
	public String getSalairePilotes() {
		return salairePilotes;
	}
	public void setSalairePilotes(String salairePilotes) {
		this.salairePilotes = salairePilotes;
	}
	
	

}
