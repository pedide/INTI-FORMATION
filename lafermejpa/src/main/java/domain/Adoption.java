package domain;

public class Adoption {

	private int idadoption;
	private String dateAdopt;
	private double prixAdopt;
	private String certifAdopt;
	
	
	public Adoption() {
		super();
	}
	
	public Adoption(String dateAdopt, double prixAdopt, String certifAdopt) {
		super();
		this.dateAdopt = dateAdopt;
		this.prixAdopt = prixAdopt;
		this.certifAdopt = certifAdopt;
	}

	public Adoption(int idadoption, String dateAdopt, double prixAdopt, String certifAdopt) {
		super();
		this.idadoption = idadoption;
		this.dateAdopt = dateAdopt;
		this.prixAdopt = prixAdopt;
		this.certifAdopt = certifAdopt;
	}
	
	
	public int getIdadoption() {
		return idadoption;
	}
	public void setIdadoption(int idadoption) {
		this.idadoption = idadoption;
	}
	public String getDateAdopt() {
		return dateAdopt;
	}
	public void setDateAdopt(String dateAdopt) {
		this.dateAdopt = dateAdopt;
	}
	public double getPrixAdopt() {
		return prixAdopt;
	}
	public void setPrixAdopt(double prixAdopt) {
		this.prixAdopt = prixAdopt;
	}
	public String getCertifAdopt() {
		return certifAdopt;
	}
	public void setCertifAdopt(String certifAdopt) {
		this.certifAdopt = certifAdopt;
	}
	
	
}
