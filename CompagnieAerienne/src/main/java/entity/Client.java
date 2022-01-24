package entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("Client")
public class Client extends Individu {

	//private Long idclient;
	private String nomClient;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Client(String nomClient) {
		this.nomClient = nomClient;
	}
	
	public Client(String nom, String prenom, String adresse, String cp, String ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
	}
	
	/*
	public Long getIdclient() {
		return idclient;
	}
	public void setIdclient(Long idclient) {
		this.idclient = idclient;
	}
	*/
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	
	

	
	
	
	
	
	
}
