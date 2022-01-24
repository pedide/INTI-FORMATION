package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="passager")
@PrimaryKeyJoinColumn(name="idIndividu")
public class Passager extends Individu {
	@Column(name="nbPoints")
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
