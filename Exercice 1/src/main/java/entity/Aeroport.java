package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aeroport")
public class Aeroport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAeroport")
	private int idAeroport;
	
	@Column(name="nomAeroport")
	private String nomAeroport;
	
	public Aeroport(String nomAeroport) {
		super();
		this.nomAeroport = nomAeroport;
	}
	
	public int getIdAeroport() {
		return idAeroport;
	}
	
	public void setIdAeroport(int idAeroport) {
		this.idAeroport = idAeroport;
	}
	
	public String getNomAeroport() {
		return nomAeroport;
	}
	
	public void setNomAeroport(String nomAeroport) {
		this.nomAeroport = nomAeroport;
	}
}
