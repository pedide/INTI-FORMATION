package entity;

public class CompagnieAerienne {
	private String codeCie;
	private String nomCie;
	
	public CompagnieAerienne() {
		super();
	}
	public CompagnieAerienne(String codeCie, String nomCie) {
		super();
		this.codeCie = codeCie;
		this.nomCie = nomCie;
	}
	public String getCodeCie() {
		return codeCie;
	}
	public void setCodeCie(String codeCie) {
		this.codeCie = codeCie;
	}
	public String getNomCie() {
		return nomCie;
	}
	public void setNomCie(String nomCie) {
		this.nomCie = nomCie;
	}
	
	

}
