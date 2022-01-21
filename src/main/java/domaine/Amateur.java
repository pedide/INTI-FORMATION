package domaine;

public class Amateur {
	
	private int idAmateur;
	private String certifMedical;
	private String nomMedecin;
	
	
	
	
	public Amateur() {
		this("", "");
		
	}
	public Amateur(String certifMedical, String nomMedecin) {
		super();
		this.certifMedical = certifMedical;
		this.nomMedecin = nomMedecin;
	}
	public Amateur(int idAmateur, String certifMedical, String nomMedecin) {
		super();
		this.idAmateur = idAmateur;
		this.certifMedical = certifMedical;
		this.nomMedecin = nomMedecin;
	}
	public int getIdAmateur() {
		return idAmateur;
	}
	public void setIdAmateur(int idAmateur) {
		this.idAmateur = idAmateur;
	}
	public String getCertifMedical() {
		return certifMedical;
	}
	public void setCertifMedical(String certifMedical) {
		this.certifMedical = certifMedical;
	}
	public String getNomMedecin() {
		return nomMedecin;
	}
	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	
	

}
