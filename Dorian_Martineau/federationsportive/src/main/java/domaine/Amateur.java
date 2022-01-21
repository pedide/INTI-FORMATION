package domaine;

public class Amateur extends Sportif{
	private boolean certificat;
	
	public Amateur() {
		super();
	}
	
	public Amateur(String nom,String prenom,boolean certificat) {
		super(nom,prenom);
		this.certificat = certificat;
	}

	public boolean isCertificat() {
		return certificat;
	}

	public void setCertificat(boolean certificat) {
		this.certificat = certificat;
	}
	
	
}
