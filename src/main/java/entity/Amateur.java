package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="amateur")

public class Amateur extends Sportifs{
	private boolean certifMed; 
	private String nomMed;
	
	
	public Amateur() {
		super();
	}

	public Amateur(boolean certifMed, String nomMed) {
		super();
		this.certifMed = certifMed;
		this.nomMed = nomMed;
	}

	public Amateur(String nomSportif, String prenomSportif, int dossardCompet) {
		super(nomSportif, prenomSportif, dossardCompet);
		// TODO Auto-generated constructor stub
	}

	public Amateur(String nomSportif, String prenomSportif, String adresseSportif, int cpSportif, String villeSportif,
			String paysSportif, String email, String tel, int dossardCompet, boolean certifMed, String nomMed) {
		super(nomSportif, prenomSportif, adresseSportif, cpSportif, villeSportif, paysSportif, email, tel, dossardCompet);
		this.certifMed = certifMed;
		this.nomMed = nomMed;
		// TODO Auto-generated constructor stub
	}
	
	

	public Amateur(String nomSportif, String prenomSportif, String adresseSportif, int cpSportif, String villeSportif,
			String paysSportif, String email, String tel, int dossardCompet, List<Competitions> competitions) {
		super(nomSportif, prenomSportif, adresseSportif, cpSportif, villeSportif, paysSportif, email, tel, dossardCompet);
		// TODO Auto-generated constructor stub
	}

	public boolean isCertifMed() {
		return certifMed;
	}

	public void setCertifMed(boolean certifMed) {
		this.certifMed = certifMed;
	}

	public String getNomMed() {
		return nomMed;
	}

	public void setNomMed(String nomMed) {
		this.nomMed = nomMed;
	} 
	
	
}
