package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="competitions")
public class competitions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCompetitions")
	private int idCompetitions;
	
	private String dateCompet;
	private String nomCompet;
	private String villeCompet;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="compet")
   private List<epreuve> listEpr;

    @OneToMany
    private List<inscription> listInscr;
	
	
	public competitions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public competitions(String dateCompet, String nomCompet, String villeCompet) {
	
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
	}


	public int getIdCompetitions() {
		return idCompetitions;
	}


	public void setIdCompetitions(int idCompetitions) {
		this.idCompetitions = idCompetitions;
	}


	public String getDateCompet() {
		return dateCompet;
	}


	public void setDateCompet(String dateCompet) {
		this.dateCompet = dateCompet;
	}


	public String getNomCompet() {
		return nomCompet;
	}


	public void setNomCompet(String nomCompet) {
		this.nomCompet = nomCompet;
	}


	public String getVilleCompet() {
		return villeCompet;
	}


	public void setVilleCompet(String villeCompet) {
		this.villeCompet = villeCompet;
	}

	
	

	
	
	
	
	
}

