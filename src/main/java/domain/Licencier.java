package domain;

public class Licencier extends Sportif{
	private int numLicence;
	private String nomClub;
	
	public Licencier(int idSportif, String nomSPortif, String prenomSportif, String adresse, int cp, String ville,
			String pays, String email, String tel, String fax, int numLicence, String nomClub) {
		super(idSportif, nomSPortif, prenomSportif, adresse, cp, ville, pays, email, tel, fax);
		this.numLicence = numLicence;
		this.nomClub = nomClub;
	}
	
	public Licencier() {
		super();
	}
	
	public int getNumLicence() {
		return numLicence;
	}
	
	public void setNumLicence(int numLicence) {
		this.numLicence = numLicence;
	}
	
	public String getNomClub() {
		return nomClub;
	}
	
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
}
