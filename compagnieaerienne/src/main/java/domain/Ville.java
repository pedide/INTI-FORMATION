package domain;

public class Ville {
	private int noVille;
	private String nomVille;
	
	
	public Ville() {
		super();
	}
	public Ville(int noVille, String nomVille) {
		super();
		this.noVille = noVille;
		this.nomVille = nomVille;
	}
	public int getNoVille() {
		return noVille;
	}
	public void setNoVille(int noVille) {
		this.noVille = noVille;
	}
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	
	

}
