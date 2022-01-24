package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pilotes")
public class Pilotes implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pilID")
	private int idPilotes;
	@Column(name="pilNom")
	private String nomPilotes;
	@Column(name="pilPrenom")
	private String prenomPilotes;
	@Column(name="pilVille")
	private String villePilotes;
	@Column(name="pilSalaire")
	private String salairePilotes;
	
	@OneToMany(mappedBy="pilotes",fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST})
	private List<vol>vol = new ArrayList<vol>();
	
	public Pilotes() {
		super();
	}
	public Pilotes(String nomPilotes, String prenomPilotes, String villePilotes, String salairePilotes,List<vol>vol) {
		super();
		this.nomPilotes = nomPilotes;
		this.prenomPilotes = prenomPilotes;
		this.villePilotes = villePilotes;
		this.salairePilotes = salairePilotes;
		this.vol = vol;
		for (vol sdc : vol) {
            sdc.setPilotes(this);
        }
	}
	
	
	public List<vol> getVol() {
		return vol;
	}
	public void setVol(List<vol> vol) {
		this.vol = vol;
	}
	public int getIdPilotes() {
		return idPilotes;
	}
	public void setIdPilotes(int idPilotes) {
		this.idPilotes = idPilotes;
	}
	public String getNomPilotes() {
		return nomPilotes;
	}
	public void setNomPilotes(String nomPilotes) {
		this.nomPilotes = nomPilotes;
	}
	public String getPrenomPilotes() {
		return prenomPilotes;
	}
	public void setPrenomPilotes(String prenomPilotes) {
		this.prenomPilotes = prenomPilotes;
	}
	public String getVillePilotes() {
		return villePilotes;
	}
	public void setVillePilotes(String villePilotes) {
		this.villePilotes = villePilotes;
	}
	public String getSalairePilotes() {
		return salairePilotes;
	}
	public void setSalairePilotes(String salairePilotes) {
		this.salairePilotes = salairePilotes;
	}
	
	

}
