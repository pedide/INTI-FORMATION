package domain;

public class Epreuve {
	private Long idep;
	private String typeep;
	private int distanceep;
	private String conditionep;
	
	
	public Epreuve() {
		super();
	}
	
	public Epreuve(Long idep, String typeep) {
		super();
		this.idep = idep;
		this.typeep = typeep;
	}
	
	public Epreuve(Long idep, String typeep, int distanceep, String conditionep) {
		super();
		this.idep = idep;
		this.typeep = typeep;
		this.distanceep = distanceep;
		this.conditionep = conditionep;
	}
	
	
	public Long getIdep() {
		return idep;
	}
	public void setIdep(Long idep) {
		this.idep = idep;
	}
	public String getTypeep() {
		return typeep;
	}
	public void setTypeep(String typeep) {
		this.typeep = typeep;
	}
	public int getDistanceep() {
		return distanceep;
	}
	public void setDistanceep(int distanceep) {
		this.distanceep = distanceep;
	}
	public String getConditionep() {
		return conditionep;
	}
	public void setConditionep(String conditionep) {
		this.conditionep = conditionep;
	}
	
	
}
