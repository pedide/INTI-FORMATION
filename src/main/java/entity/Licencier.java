package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="licencier")
public class Licencier extends Sportifs {

	@Column(name="numlicence")
	private int numlicence;
	@Column(name="nomclub")
	private String nomclub;
	
	@OneToMany(mappedBy="sportifs", fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST})
	private List<Inscription>listeinscription = new ArrayList<Inscription>();
	
	public Licencier() {
		super();
	}

	public Licencier(int numlicence, String nomclub) {
		super();
		this.numlicence = numlicence;
		this.nomclub = nomclub;
	}

	public Licencier(String nomsportif, String prenomsportif, String adresse, int cp, String ville,
			String pays, String tel, String fax, int numlicence, String nomclub, List<Inscription>inscriptions) {
		super(nomsportif, prenomsportif, adresse, cp, ville, pays, tel, fax);
		this.numlicence = numlicence;
		this.nomclub = nomclub;
	    listeinscription = inscriptions;	   
	    
	    for (Inscription i : inscriptions)
	    {
	        i.setSportifs(this);
	    }
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
