package Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;




@Entity
@Table(name="competition")
public class Competition implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int idCompet;
	private String dateCompet;
	private String nomCompet;
	private String villeCompet;
	//private int dossardCompet;
	
	@OneToMany(mappedBy="competition",cascade= {CascadeType.PERSIST})
	private List<Epreuve> listEpreuve = new ArrayList<Epreuve>();
	
	public Competition() {
		super();
	}


	public Competition(String dateCompet, String nomCompet, String villeCompet) {
		super();
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
	}
	
	
	
	public Competition(String dateCompet, String nomCompet, String villeCompet, List<Epreuve> listEpreuve) {
		super();
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
		this.listEpreuve = listEpreuve;
		
		for (Epreuve ep : listEpreuve)
		{
	        ep.setCompetition(this);
	    
	}
	}
	
/*	@OneToMany (mappedBy="competition", cascade= {CascadeType.PERSIST})
    private List<Inscription> listeInsc = new ArrayList<Inscription>();
	
	
	

	public Competition(String dateCompet, String nomCompet, String villeCompet,
			List<Epreuve> listEpreuve, List<Inscription> listeInsc) {
		super();
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
		//this.dossardCompet = dossardCompet;
		this.listEpreuve = listEpreuve;
		this.listeInsc = listeInsc;
		
	}
*/

	public int getIdCompet() {
		return idCompet;
	}
	public void setIdCompet(int idCompet) {
		this.idCompet = idCompet;
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


	public List<Epreuve> getListEpreuve() {
		return listEpreuve;
	}


	public void setListEpreuve(List<Epreuve> listEpreuve) {
		this.listEpreuve = listEpreuve;
	}





/*	public List<Inscription> getListeInsc() {
		return listeInsc;
	}


	public void setListeInsc(List<Inscription> listeInsc) {
		this.listeInsc = listeInsc;
	}
*/


	
	
}
