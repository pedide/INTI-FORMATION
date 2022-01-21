package domain;

public class Amateur extends Sportif{
	private boolean certificatMedecin;
	private String nomMedecin;
	
	public Amateur(int idSportif, String nomSPortif, String prenomSportif, String adresse, int cp, String ville,
			String pays, String email, String tel, String fax, boolean certificatMedecin, String nomMedecin) {
		super(idSportif, nomSPortif, prenomSportif, adresse, cp, ville, pays, email, tel, fax);
		this.certificatMedecin = certificatMedecin;
		this.nomMedecin = nomMedecin;
	}

	public Amateur() {
		super();
	}

	public boolean isCertificatMedecin() {
		return certificatMedecin;
	}

	public void setCertificatMedecin(boolean certificatMedecin) {
		this.certificatMedecin = certificatMedecin;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
}
