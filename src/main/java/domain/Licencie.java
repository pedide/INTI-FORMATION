package domain;

public class Licencie {
	private int numlicence;
	private String nomclub;
		

	public Licencie() {
		super();
	}
	
	public Licencie(int numlicence, String nomclub) {
		super();
		this.numlicence = numlicence;
		this.nomclub = nomclub;
	}
	
	
	public int getNumlicence() {
		return numlicence;
	}
	public void setNumlicence(int numlicence) {
		this.numlicence = numlicence;
	}
	public String getNomclub() {
		return nomclub;
	}
	public void setNomclub(String nomclub) {
		this.nomclub = nomclub;
	}
	
	
}
