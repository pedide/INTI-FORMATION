package domain;

public class Inscrire {
	private int idInscription; 
	private int dossardCompet;
	
	public Inscrire() {
		super();
	}

	public Inscrire(int idInscription, int dossardCompet) {
		super();
		this.idInscription = idInscription;
		this.dossardCompet = dossardCompet;
	}

	public int getIdInscription() {
		return idInscription;
	}

	public void setIdInscription(int idInscription) {
		this.idInscription = idInscription;
	}

	public int getDossardCompet() {
		return dossardCompet;
	}

	public void setDossardCompet(int dossardCompet) {
		this.dossardCompet = dossardCompet;
	} 
	
	
	
}
