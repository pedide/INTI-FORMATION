package domain;

public class Competition {
	private int idCompetition;
	private String dateCompet;
	private String nomCompet;
	private String villeCompet;
	
	public Competition(int idCompetition, String dateCompet, String nomCompet, String villeCompet) {
		super();
		this.idCompetition = idCompetition;
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
	}
	
	public Competition() {
		super();
	}
	
	public int getIdCompetition() {
		return idCompetition;
	}
	
	public void setIdCompetition(int idCompetition) {
		this.idCompetition = idCompetition;
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
