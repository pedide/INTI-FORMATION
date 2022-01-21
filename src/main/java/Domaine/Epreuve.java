package Domaine;

public class Epreuve {
	private int idEpreuve;
	private String type;
	private int distance;
	private String condition;
	
	
	
	public Epreuve() {
		super();
	}


	public Epreuve(String type, int distance, String condition) {
		super();
		this.type = type;
		this.distance = distance;
		this.condition = condition;
	}
	
	
	public int getIdEpreuve() {
		return idEpreuve;
	}
	public void setIdEpreuve(int idEpreuve) {
		this.idEpreuve = idEpreuve;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
	
	

	
	
}
