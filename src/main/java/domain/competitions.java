package domain;

public class competitions {

	private int idCompetitions;
	private String dateCompet;
	private String nomCompet;
	private String villeCompet;
	
	
	public competitions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public competitions( String dateCompet, String nomCompet, String villeCompet) {
	
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

