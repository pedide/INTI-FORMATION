package domaine;

public class Epreuve {
	private int id;
	private String typeEpreuve;
	private double distance;
	private String condition;
	
	public Epreuve() {}
	
	public Epreuve(String typeEpreuve, double distance, String condition) {
		super();
		this.typeEpreuve = typeEpreuve;
		this.distance = distance;
		this.condition = condition;
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

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
}
