package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="inscription")
public class inscription {
	@Id
	@Column(name ="dossard")
	private String dossard;
	
	@ManyToOne(cascade= {CascadeType.PERSIST})
	//@JoinColumn(name="idsportif")
	private sportifs sport;
	
	@ManyToOne(cascade= {CascadeType.PERSIST})
	@JoinColumn(name="idCompetitions")
	private competitions compet;

	public inscription() {
		super();
	
	}
	
	
	
	public inscription(sportifs sport,competitions compet ,String dossars) {
		this.compet = compet;
		this.sport = sport;
		this.dossard = dossars;
		
	
	}

	public inscription(String dossard) {
		this.dossard = dossard;
	}

	public String getDossard() {
		return dossard;
	}

	public void setDossard(String dossard) {
		this.dossard = dossard;
	}
	
	

	
}
