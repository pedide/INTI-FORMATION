package domain;

public class Pilotes {
	
	private Long idPilotes;
	private String PilNom;
	private String PilPrenom;
	private String PilVille;
	private String PilSalaire;
	
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
