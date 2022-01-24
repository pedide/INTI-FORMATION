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
	@Column(name="idClients")
	private int idClients;
	private String nomCli;
	private String prenomCLi;
	private String adresse;
	private int cp;
	
	

	
	public Clients(String nomCli, String prenomCLi, String adresse, int cp,Produits prod) {
		super();
		this.nomCli = nomCli;
		this.prenomCLi = prenomCLi;
		this.adresse = adresse;
		this.cp = cp;
		
		
	}




	public int getIdClients() {
		return idClients;
	}




	public void setIdClients(int idClients) {
		this.idClients = idClients;
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

	

}