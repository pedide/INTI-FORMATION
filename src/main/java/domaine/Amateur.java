package domaine;

public class Amateur {
	private int certificatMedical;
	private String nomMedecin;
	
	
	
	
	public Amateur() {
		super();
	}
	
	public Amateur(int certificatMedical, String nomMedecin) {
		super();
		this.certificatMedical = certificatMedical;
		this.nomMedecin = nomMedecin;
	}
	
	public int getCertificatMedical() {
		return certificatMedical;
	}
	public void setCertificatMedical(int certificatMedical) {
		this.certificatMedical = certificatMedical;
	}
	public String getNomMedecin() {
		return nomMedecin;
	}
	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	
	
	

}
