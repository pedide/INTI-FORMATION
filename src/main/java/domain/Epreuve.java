package domain;

public class Epreuve {
	private int idEpreuve;
	private String typeEpreuve;
	private int distanceEpreuve;
	private String conditionEpreuve;
	
	public Epreuve(int idEpreuve, String typeEpreuve, int distanceEpreuve, String conditionEpreuve) {
		super();
		this.idEpreuve = idEpreuve;
		this.typeEpreuve = typeEpreuve;
		this.distanceEpreuve = distanceEpreuve;
		this.conditionEpreuve = conditionEpreuve;
	}
	
	public Epreuve() {
		super();
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
	
	public int getDistanceEpreuve() {
		return distanceEpreuve;
	}
	
	public void setDistanceEpreuve(int distanceEpreuve) {
		this.distanceEpreuve = distanceEpreuve;
	}
	
	public String getConditionEpreuve() {
		return conditionEpreuve;
	}
	
	public void setConditionEpreuve(String conditionEpreuve) {
		this.conditionEpreuve = conditionEpreuve;
	}
}
