package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pilotes")
public class Pilotes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idPilotes")
	private Long idPilotes;
	private String PilNom;
	private String PilPrenom;
	private String PilVille;
	private String PilSalaire;
	
	@OneToMany(mappedBy= "pilotes")
	private List<Vol> listVols;
	
		
	
	public Pilotes() {
		super();
		// TODO Auto-generated constructor stub
	}
			
	public Pilotes(String pilNom, String pilPrenom, String pilVille, String pilSalaire) {
		PilNom = pilNom;
		PilPrenom = pilPrenom;
		PilVille = pilVille;
		PilSalaire = pilSalaire;
	}
	

	public Long getIdPilotes() {
		return idPilotes;
	}

	public void setIdPilotes(Long idPilotes) {
		this.idPilotes = idPilotes;
	}

	public String getPilNom() {
		return PilNom;
	}

	public void setPilNom(String pilNom) {
		PilNom = pilNom;
	}

	public String getPilPrenom() {
		return PilPrenom;
	}

	public void setPilPrenom(String pilPrenom) {
		PilPrenom = pilPrenom;
	}

	public String getPilVille() {
		return PilVille;
	}

	public void setPilVille(String pilVille) {
		PilVille = pilVille;
	}

	public String getPilSalaire() {
		return PilSalaire;
	}

	public void setPilSalaire(String pilSalaire) {
		PilSalaire = pilSalaire;
	}
	
	
	

}
