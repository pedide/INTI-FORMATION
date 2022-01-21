package domain;

public class Epreuve {
	private int id;
	private String typeEpreuve;
	private int distanceEpreuve;
	private String conditionEpreuve;
	private int idCompet;
	
	
	
	
	public Epreuve() {
		super();
	}
	
	public Epreuve(int id, String typeEpreuve, int distanceEpreuve, String conditionEpreuve, int idCompet) {
		super();
		this.id = id;
		this.typeEpreuve = typeEpreuve;
		this.distanceEpreuve = distanceEpreuve;
		this.conditionEpreuve = conditionEpreuve;
		this.idCompet = idCompet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getIdCompet() {
		return idCompet;
	}
	public void setIdCompet(int idCompet) {
		this.idCompet = idCompet;
	}
	
	
	
}
