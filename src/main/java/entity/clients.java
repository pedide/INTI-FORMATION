package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class clients {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCli;
	private String nomCli;
	private String prenomCli;
	private String adresse;
	private String cp;
	private String ville;
	
	
	@OneToMany(mappedBy="clients", fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST})
	private List<adoption>listeAdop = new ArrayList<adoption>();
	
	public clients() {
		super();
	}

	public clients(String nomCli, String prenomCli, String adresse, String cp, String ville) {
		super();
		this.nomCli = nomCli;
		this.prenomCli = prenomCli;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
	}

	
	
	public clients(String nomCli, String prenomCli, String adresse, String cp, String ville,
			List<adoption> listeAdoption) {
		super();
		this.nomCli = nomCli;
		this.prenomCli = prenomCli;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.listeAdop = listeAdoption;
		
	    for (adoption a : listeAdoption)
	    {
	        a.setClients(this);
	    }
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
