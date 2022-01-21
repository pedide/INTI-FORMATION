package domain;

public class Inscription {
	private int dossardCompet;

	public Inscription(int dossardCompet) {
		super();
		this.dossardCompet = dossardCompet;
	}
	
	public Inscription() {
		super();
	}

	public int getDossardCompet() {
		return dossardCompet;
	}

	public void setDossardCompet(int dossardCompet) {
		this.dossardCompet = dossardCompet;
	}
}
