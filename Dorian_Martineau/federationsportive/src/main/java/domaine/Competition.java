package domaine;

public class Competition {
	private int id;
	private String date;
	private String ville;
	private String nom;
	
	public Competition() {}
	
	public Competition(String date, String ville, String nom) {
		super();
		this.date = date;
		this.ville = ville;
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
