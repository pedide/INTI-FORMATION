package domaine;

public class Licencier {
	private int numLicence;
	private String nomClub;
	
	
	
	public Licencier() {
		super();
	}
	public Licencier(int numLicence, String nomClub) {
		super();
		this.numLicence = numLicence;
		this.nomClub = nomClub;
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
