package domaine;

public class Epreuves {
	private int idEperuve;
	private String typeEpreuve;
	private int distanceEpreuve;
	private String conditionEpreuve;
	
	
	public Epreuves() {
		super();
	}
	public Epreuves(int idEperuve, String typeEpreuve, int distanceEpreuve, String conditionEpreuve) {
		super();
		this.idEperuve = idEperuve;
		this.typeEpreuve = typeEpreuve;
		this.distanceEpreuve = distanceEpreuve;
		this.conditionEpreuve = conditionEpreuve;
	}
	public int getIdEperuve() {
		return idEperuve;
	}
	public void setIdEperuve(int idEperuve) {
		this.idEperuve = idEperuve;
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
