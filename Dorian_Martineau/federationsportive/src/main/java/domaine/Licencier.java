package domaine;

public class Licencier extends Sportif{
	private String nomLicence;
	private String nomClub;
	
	public Licencier() {
		super();
	}
	
	public Licencier(String nom,String prenom,String nomLicence, String nomClub) {
		super(nom,prenom);
		this.nomLicence = nomLicence;
		this.nomClub = nomClub;
	}

	public String getNomLicence() {
		return nomLicence;
	}

	public void setNomLicence(String nomLicence) {
		this.nomLicence = nomLicence;
	}

	public String getNomClub() {
		return nomClub;
	}

	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	
	
}
