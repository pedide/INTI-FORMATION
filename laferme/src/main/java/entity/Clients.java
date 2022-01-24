package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class Clients {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcli")
	private int idcli;
	
	@Column(name="nomcli")
	private String nomcli;
	
	@Column(name="prenomcli")
	private String prenomcli;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="cp")
	private String cp;
	
	@Column(name="ville")
	private String ville;
	
	@ManyToOne
	@JoinColumn(name="idprod")
	private Produits produits;
	
	@OneToMany(mappedBy="idachat")
	private List<Achat>achats = new ArrayList<Achat>();
	
	@OneToMany(mappedBy="idadoption")
	private List<Adoption>adoptions = new ArrayList<Adoption>();
	
	public Clients() {
		super();
	}
	public Clients(String nomcli, String prenomcli, String adresse, String cp, String ville, Produits produits,
			List<Achat> achats, List<Adoption> adoptions) {
		super();
		this.nomcli = nomcli;
		this.prenomcli = prenomcli;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.produits = produits;
		this.achats = achats;
		this.adoptions = adoptions;
	}

	public Clients(String nomcli, String prenomcli, String adresse, String cp, String ville) {
		super();
		this.nomcli = nomcli;
		this.prenomcli = prenomcli;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
	}
	public int getIdcli() {
		return idcli;
	}
	public void setIdcli(int idcli) {
		this.idcli = idcli;
	}
	public String getNomcli() {
		return nomcli;
	}
	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}
	public String getPrenomcli() {
		return prenomcli;
	}
	public void setPrenomcli(String prenomcli) {
		this.prenomcli = prenomcli;
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
