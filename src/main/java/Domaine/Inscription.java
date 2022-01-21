package Domaine;

public class Inscription {
	private int id;
	private int dossardCompet;
	
	public Inscription() {
		super();
	}

	public Inscription(int dossardCompet) {
		super();
		this.dossardCompet = dossardCompet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDossardCompet() {
		return dossardCompet;
	}

	public void setDossardCompet(int dossardCompet) {
		this.dossardCompet = dossardCompet;
	}
	
	
}
