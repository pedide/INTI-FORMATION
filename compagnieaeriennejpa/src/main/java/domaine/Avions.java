package domaine;

public class Avions {
	private int id;
	private String model;
	private int nbPlace;
	private String loc;
	public Avions() {}
	public Avions(String model, int nbPlace, String loc) {
		super();
		this.model = model;
		this.nbPlace = nbPlace;
		this.loc = loc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
