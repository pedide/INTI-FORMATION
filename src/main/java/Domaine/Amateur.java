package Domaine;

public class Amateur extends Sportif{
	private Boolean certifMed;
	private String nomMed;
	
	
	
	
	public Amateur() {
		super();
	}
	public Amateur(Boolean certifMed, String nomMed) {
		super();
		this.certifMed = certifMed;
		this.nomMed = nomMed;
	}
	
	
	public Amateur(String nom, String prenom, String adresse, int cp, String ville, String pays, String tel, String fax,
			int dossard, Boolean certifMed, String nomMed) {
		super(nom, prenom, adresse, cp, ville, pays, tel, fax, dossard);
		this.certifMed = certifMed;
		this.nomMed = nomMed;
	}
	
	
	public Boolean getCertifMed() {
		return certifMed;
	}
	public void setCertifMed(Boolean certifMed) {
		this.certifMed = certifMed;
	}
	public String getNomMed() {
		return nomMed;
	}
	public void setNomMed(String nomMed) {
		this.nomMed = nomMed;
	}
	
	
}
