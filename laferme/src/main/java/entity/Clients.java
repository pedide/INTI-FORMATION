package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class Clients {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCli")
	private int idCli;
	
	@Column(name="NomCli")
	private String nomCli;
	
	@Column(name="PrenomCli")
	private String prenomCli;
	
	@Column(name= "Adresse")
	private String adresse;
	
	@Column(name="CP")
	private String cp;
	
	@Column(name ="ville")
	private String ville;

	
	public Clients() {
		super();
	}

	public Clients(String nomCli, String prenomCli, String adresse, String cp, String ville) {
		super();
		this.nomCli = nomCli;
		this.prenomCli = prenomCli;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
	}

	public int getIdCli() {
		return idCli;
	}

	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}

	public String getNomCli() {
		return nomCli;
	}

	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}

	public String getPrenomCli() {
		return prenomCli;
	}

	public void setPrenomCli(String prenomCli) {
		this.prenomCli = prenomCli;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	

}
