package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="individu")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Individu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idIndividu")
	private int idIndividu;
	
	@Column(name="nomIndividu")
	private String nomIndividu;
	
	@Column(name="prenomIndividu")
	private String prenomIndividu;
	
	@Column(name="adresseIndividu")
	private String adresseIndividu;
	
	@Column(name="cpIndividu")
	private int cpIndividu;
	
	@Column(name="villeIndividu")
	private String villeIndividu;
	
	public Individu(String nomIndividu, String prenomIndividu, String adresseIndividu, int cpIndividu,
			String villeIndividu) {
		super();
		this.nomIndividu = nomIndividu;
		this.prenomIndividu = prenomIndividu;
		this.adresseIndividu = adresseIndividu;
		this.cpIndividu = cpIndividu;
		this.villeIndividu = villeIndividu;
	}
	
	public int getIdIndividu() {
		return idIndividu;
	}
	
	public void setIdIndividu(int idIndividu) {
		this.idIndividu = idIndividu;
	}
	
	public String getNomIndividu() {
		return nomIndividu;
	}
	
	public void setNomIndividu(String nomIndividu) {
		this.nomIndividu = nomIndividu;
	}
	
	public String getPrenomIndividu() {
		return prenomIndividu;
	}
	
	public void setPrenomIndividu(String prenomIndividu) {
		this.prenomIndividu = prenomIndividu;
	}
	
	public String getAdresseIndividu() {
		return adresseIndividu;
	}
	
	public void setAdresseIndividu(String adresseIndividu) {
		this.adresseIndividu = adresseIndividu;
	}
	
	public int getCpIndividu() {
		return cpIndividu;
	}
	
	public void setCpIndividu(int cpIndividu) {
		this.cpIndividu = cpIndividu;
	}
	
	public String getVilleIndividu() {
		return villeIndividu;
	}
	
	public void setVilleIndividu(String villeIndividu) {
		this.villeIndividu = villeIndividu;
	}
}
