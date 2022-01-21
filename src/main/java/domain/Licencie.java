package domain;

public class Licencie {
	private int idLicencie;
	private String nomClub;
	
	
	
	
	public Licencie() {
		super();
	}
	public Licencie(int idLicencie, String nomClub) {
		super();
		this.idLicencie = idLicencie;
		this.nomClub = nomClub;
	}
	public int getIdLicencie() {
		return idLicencie;
	}
	public void setIdLicencie(int idLicencie) {
		this.idLicencie = idLicencie;
	}
	public String getNomClub() {
		return nomClub;
	}
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	
	

}
