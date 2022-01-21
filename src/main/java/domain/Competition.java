package domain;

public class Competition {
	private int idCompet;
	private String dateCompet;
	private String nomCompet;
	private String villeCompet;
	
	
	public Competition(String dateCompet, String nomCompet, String villeCompet) {
		super();
		this.dateCompet = dateCompet;
		this.nomCompet = nomCompet;
		this.villeCompet = villeCompet;
	}
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
	
}
