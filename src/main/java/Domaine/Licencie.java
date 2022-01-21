package Domaine;

public class Licencie extends Sportif {
	private int numLicence;
	private String nomClub;
	
	
	
	public Licencie() {
		super();
	}
	
	
	public Licencie(int numLicence, String nomClub) {
		super();
		this.numLicence = numLicence;
		this.nomClub = nomClub;
	}
	
	
	
	public Licencie(String nom, String prenom, String adresse, int cp, String ville, String pays, String tel,
			String fax, int dossard, int numLicence, String nomClub) {
		super(nom, prenom, adresse, cp, ville, pays, tel, fax, dossard);
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
