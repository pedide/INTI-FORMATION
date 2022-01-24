package domain;

public class Achat {

	private int idachat;
	private double prixAchat;
	
	
	public Achat(double prixAchat) {
		super();
		this.prixAchat = prixAchat;
	}
	
	public Achat() {
		super();
	}
	
	public Achat(int idachat, double prixAchat) {
		super();
		this.idachat = idachat;
		this.prixAchat = prixAchat;
	}
	
	
	public int getIdachat() {
		return idachat;
	}
	public void setIdachat(int idachat) {
		this.idachat = idachat;
	}
	public double getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}
	
	
}
