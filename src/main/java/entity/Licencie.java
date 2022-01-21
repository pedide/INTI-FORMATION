package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="licencie")
public class Licencie extends Sportif {
	@Column(name="NUM_LICENCE")
	private int numlicence;
	@Column(name="NOM_CLUB")
	private String nomclub;
		

	public Licencie() {
		super();
	}
	
	public Licencie(int numlicence, String nomclub) {
		super();
		this.numlicence = numlicence;
		this.nomclub = nomclub;
	}
	
	public Licencie(String nomsp, String prenomsp,int numlicence, String nomclub) {
		super(nomsp, prenomsp);
		// TODO Auto-generated constructor stub
		this.numlicence = numlicence;
		this.nomclub = nomclub;
	}
	
	public Licencie(String nomsp, String prenomsp, int dossardCompet,int numlicence, String nomclub) {
		super(nomsp, prenomsp, dossardCompet);
		// TODO Auto-generated constructor stub
		this.numlicence = numlicence;
		this.nomclub = nomclub;
	}

	public int getNumlicence() {
		return numlicence;
	}
	public void setNumlicence(int numlicence) {
		this.numlicence = numlicence;
	}
	public String getNomclub() {
		return nomclub;
	}
	public void setNomclub(String nomclub) {
		this.nomclub = nomclub;
	}
	
	
}
