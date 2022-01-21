package domaine;

public class Licencie {
	
	private int idLicencie;
	private int numLicence;
	private String nomClub;
	
	
	
	public Licencie() {
		this(0, "");
	}
	public Licencie(int numLicence, String nomClub) {
		super();
		this.numLicence = numLicence;
		this.nomClub = nomClub;
	}
	public Licencie(int idLicencie, int numLicence, String nomClub) {
		super();
		this.idLicencie = idLicencie;
		this.numLicence = numLicence;
		this.nomClub = nomClub;
	}
	public int getIdLicencie() {
		return idLicencie;
	}
	public void setIdLicencie(int idLicencie) {
		this.idLicencie = idLicencie;
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
