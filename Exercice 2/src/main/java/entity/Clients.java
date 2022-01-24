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
	
	@Column(name="nomCli")
	private String nomCli;
	
	@Column(name="prenomCLi")
	private String prenomCLi;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="cp")
	private int cp;
	
	@Column(name="ville")
	private String ville;

	public Clients(String nomCli, String prenomCLi, String adresse, int cp, String ville) {
		super();
		this.nomCli = nomCli;
		this.prenomCLi = prenomCLi;
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

	public String getPrenomCLi() {
		return prenomCLi;
	}

	public void setPrenomCLi(String prenomCLi) {
		this.prenomCLi = prenomCLi;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
}
