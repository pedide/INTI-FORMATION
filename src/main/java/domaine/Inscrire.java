package domaine;

public class Inscrire {
	
	private int idInscrire;
	
	private int DossardCompet;

	
	
	public Inscrire() {
		this(0);
	}

	public Inscrire(int idInscrire, int dossardCompet) {
		super();
		this.idInscrire = idInscrire;
		DossardCompet = dossardCompet;
	}

	public int getIdInscrire() {
		return idInscrire;
	}

	public void setIdInscrire(int idInscrire) {
		this.idInscrire = idInscrire;
	}

	public Inscrire(int dossardCompet) {
		super();
		DossardCompet = dossardCompet;
	}

	public int getDossardCompet() {
		return DossardCompet;
	}

	public void setDossardCompet(int dossardCompet) {
		DossardCompet = dossardCompet;
	}
	
	
	
}
