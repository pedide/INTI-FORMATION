package domain;

public class Ville {
	private int idVille;
	private String nomVille;
	private Aeroport aeroport;
	
	public Ville(String nomVille, Aeroport aeroport) {
		super();
		this.nomVille = nomVille;
		this.aeroport = aeroport;
	}

	public int getIdVille() {
		return idVille;
	}
	
	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}
	
	public String getNomVille() {
		return nomVille;
	}
	
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
}
