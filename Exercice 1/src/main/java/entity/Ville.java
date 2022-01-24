package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ville")
public class Ville {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idVille")
	private int idVille;
	
	@Column(name="nomVille")
	private String nomVille;
	
	@ManyToOne
	@JoinColumn(name="idAeroport")
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
