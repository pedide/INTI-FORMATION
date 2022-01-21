package domain;

public class Competitions {
	private Long idcompet;
	private String date;
	private String nomcompet;
	private String villecompet;
	
	
	public Competitions() {
		super();
	}
	
	public Competitions(Long idcompet, String date, String nomcompet, String villecompet) {
		super();
		this.idcompet = idcompet;
		this.date = date;
		this.nomcompet = nomcompet;
		this.villecompet = villecompet;
	}
	
	
	public Long getIdcompet() {
		return idcompet;
	}
	public void setIdcompet(Long idcompet) {
		this.idcompet = idcompet;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNomcompet() {
		return nomcompet;
	}
	public void setNomcompet(String nomcompet) {
		this.nomcompet = nomcompet;
	}
	public String getVillecompet() {
		return villecompet;
	}
	public void setVillecompet(String villecompet) {
		this.villecompet = villecompet;
	}
	
	
}
