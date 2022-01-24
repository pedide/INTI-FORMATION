package domain;

public class Pilote {
	private int idPilote; 
	private String nomPilote; 
	private String prenomPilote; 
	private String villePilote; 
	private double salairePilote;
	
	public Pilote() {
		super();
	}

	public Pilote(String nomPilote, String prenomPilote, String villePilote, double salairePilote) {
		super();
		this.nomPilote = nomPilote;
		this.prenomPilote = prenomPilote;
		this.villePilote = villePilote;
		this.salairePilote = salairePilote;
	}

	public int getIdPilote() {
		return idPilote;
	}

	public void setIdPilote(int idPilote) {
		this.idPilote = idPilote;
	}

	public String getNomPilote() {
		return nomPilote;
	}

	public void setNomPilote(String nomPilote) {
		this.nomPilote = nomPilote;
	}

	public String getPrenomPilote() {
		return prenomPilote;
	}

	public void setPrenomPilote(String prenomPilote) {
		this.prenomPilote = prenomPilote;
	}

	public String getVillePilote() {
		return villePilote;
	}

	public void setVillePilote(String villePilote) {
		this.villePilote = villePilote;
	}

	public double getSalairePilote() {
		return salairePilote;
	}

	public void setSalairePilote(double salairePilote) {
		this.salairePilote = salairePilote;
	} 
	
	
}
