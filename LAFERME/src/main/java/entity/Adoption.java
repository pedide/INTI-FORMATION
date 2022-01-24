package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adoption")
public class Adoption {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAdopt")
	private int idAdopt;
	@Column(name="dateAdopt")
	private String dateAdopt;
	@Column(name="prixAdopt")
	private double prixAdopt;
	@Column(name="certifAdopt")
	private int certifAdopt;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="clients_idCli")
	private Clients cli;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="animal_idAnim")
	private Animal anim;
	
	public Adoption() {
		super();
	}
	public Adoption(String dateAdopt, double prixAdopt, int certifAdopt, Clients cli, Animal anim) {
		super();
		this.dateAdopt = dateAdopt;
		this.prixAdopt = prixAdopt;
		this.certifAdopt = certifAdopt;
		this.cli = cli;
		this.anim = anim;
	}
	public int getIdAdopt() {
		return idAdopt;
	}
	public void setIdAdopt(int idAdopt) {
		this.idAdopt = idAdopt;
	}
	public String getDateAdopt() {
		return dateAdopt;
	}
	public void setDateAdopt(String dateAdopt) {
		this.dateAdopt = dateAdopt;
	}
	public double getPrixAdopt() {
		return prixAdopt;
	}
	public void setPrixAdopt(double prixAdopt) {
		this.prixAdopt = prixAdopt;
	}
	public int getCertifAdopt() {
		return certifAdopt;
	}
	public void setCertifAdopt(int certifAdopt) {
		this.certifAdopt = certifAdopt;
	}
	
}
