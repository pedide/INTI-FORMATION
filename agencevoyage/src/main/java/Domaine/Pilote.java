package Domaine;

public class Pilote {
	private int idPilote;
	private String nomPi;
	private String prenomPi;
	private String villePi;
	private double salairePi;
	
	
	
	public Pilote() {
		super();
	}



	public Pilote(String nomPi, String prenomPi, String villePi, double salairePi) {
		super();
		this.nomPi = nomPi;
		this.prenomPi = prenomPi;
		this.villePi = villePi;
		this.salairePi = salairePi;
	}



	public int getIdPilote() {
		return idPilote;
	}



	public void setIdPilote(int idPilote) {
		this.idPilote = idPilote;
	}



	public String getNomPi() {
		return nomPi;
	}



	public void setNomPi(String nomPi) {
		this.nomPi = nomPi;
	}



	public String getPrenomPi() {
		return prenomPi;
	}



	public void setPrenomPi(String prenomPi) {
		this.prenomPi = prenomPi;
	}



	public String getVillePi() {
		return villePi;
	}



	public void setVillePi(String villePi) {
		this.villePi = villePi;
	}



	public double getSalairePi() {
		return salairePi;
	}



	public void setSalairePi(double salairePi) {
		this.salairePi = salairePi;
	}
	
	
}
