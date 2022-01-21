package domain;

public class epreuve {
	
	private int idEpreuve;
	private String typeEpreuve;
	private String distanceEpreuve;
	private String conditEpreuve;
	
	
	
	
	
	public epreuve() {
		super();
		
	}
	public epreuve( String typeEpreuve, String distanceEpreuve, String conditEpreuve) {
	
		this.typeEpreuve = typeEpreuve;
		this.distanceEpreuve = distanceEpreuve;
		this.conditEpreuve = conditEpreuve;
	}
	public int getIdEpreuve() {
		return idEpreuve;
	}
	public void setIdEpreuve(int idEpreuve) {
		this.idEpreuve = idEpreuve;
	}
	public String getTypeEpreuve() {
		return typeEpreuve;
	}
	public void setTypeEpreuve(String typeEpreuve) {
		this.typeEpreuve = typeEpreuve;
	}
	public String getDistanceEpreuve() {
		return distanceEpreuve;
	}
	public void setDistanceEpreuve(String distanceEpreuve) {
		this.distanceEpreuve = distanceEpreuve;
	}
	public String getConditEpreuve() {
		return conditEpreuve;
	}
	public void setConditEpreuve(String conditEpreuve) {
		this.conditEpreuve = conditEpreuve;
	}
	
	
	

}
