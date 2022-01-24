package domain;

public class Passager extends Individu {
	private int nbPoints;

	public Passager(String nomIndividu, String prenomIndividu, String adresseIndividu, int cpIndividu,
			String villeIndividu, int nbPoints) {
		super(nomIndividu, prenomIndividu, adresseIndividu, cpIndividu, villeIndividu);

		this.nbPoints = nbPoints;
	}

	public int getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}
}
