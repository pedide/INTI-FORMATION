package domain;

public class Amateur {
	private String certifmed;
	private String nommed;
	
	
	public Amateur() {
		super();
	}
	
	public Amateur(String certifmed, String nommed) {
		super();
		this.certifmed = certifmed;
		this.nommed = nommed;
	}
	
	
	public String getCertifmed() {
		return certifmed;
	}
	public void setCertifmed(String certifmed) {
		this.certifmed = certifmed;
	}
	public String getNommed() {
		return nommed;
	}
	public void setNommed(String nommed) {
		this.nommed = nommed;
	}
	
	
	
}
