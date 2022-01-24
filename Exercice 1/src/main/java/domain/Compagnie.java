package domain;

public class Compagnie {
	private int idCompagnie;
	private String nomCompagnie;
	
	public Compagnie(String nomCompagnie) {
		super();
		this.nomCompagnie = nomCompagnie;
	}
	
	public int getIdCompagnie() {
		return idCompagnie;
	}
	
	public void setIdCompagnie(int idCompagnie) {
		this.idCompagnie = idCompagnie;
	}
	
	public String getNomCompagnie() {
		return nomCompagnie;
	}
	
	public void setNomCompagnie(String nomCompagnie) {
		this.nomCompagnie = nomCompagnie;
	}
}
