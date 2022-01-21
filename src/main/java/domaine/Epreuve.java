package domaine;

public class Epreuve {
	
	private int idEpr;
	private String typeEpr;
	private int distanceEpr;
	private int conditionEpr;
	
	
	
	public Epreuve() {
		this("", 0, 0);
		
	}
	public Epreuve(String typeEpr, int distanceEpr, int conditionEpr) {
		super();
		this.typeEpr = typeEpr;
		this.distanceEpr = distanceEpr;
		this.conditionEpr = conditionEpr;
	}
	public Epreuve(int idEpr, String typeEpr, int distanceEpr, int conditionEpr) {
		super();
		this.idEpr = idEpr;
		this.typeEpr = typeEpr;
		this.distanceEpr = distanceEpr;
		this.conditionEpr = conditionEpr;
	}
	public int getIdEpr() {
		return idEpr;
	}
	public void setIdEpr(int idEpr) {
		this.idEpr = idEpr;
	}
	public String getTypeEpr() {
		return typeEpr;
	}
	public void setTypeEpr(String typeEpr) {
		this.typeEpr = typeEpr;
	}
	public int getDistanceEpr() {
		return distanceEpr;
	}
	public void setDistanceEpr(int distanceEpr) {
		this.distanceEpr = distanceEpr;
	}
	public int getConditionEpr() {
		return conditionEpr;
	}
	public void setConditionEpr(int conditionEpr) {
		this.conditionEpr = conditionEpr;
	}
	
	
	
}
