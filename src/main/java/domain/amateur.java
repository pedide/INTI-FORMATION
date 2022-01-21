package domain;

public class amateur {
	
	private String CertificatMedical;
	private String nomMedecin;
	
	
	public amateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public amateur(String certificatMedical, String nomMedecin) {
		CertificatMedical = certificatMedical;
		this.nomMedecin = nomMedecin;
	}




	public String getCertificatMedical() {
		return CertificatMedical;
	}




	public void setCertificatMedical(String certificatMedical) {
		CertificatMedical = certificatMedical;
	}




	public String getNomMedecin() {
		return nomMedecin;
	}




	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	
	
	
	

}
