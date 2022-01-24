package domain;

public class Avions {
	private int idAvions;
	private String modelAvions;
	private int nombreDePlaceAvions;
	private String localiteAvions;
	
	
	public Avions() {
		super();
	}
	public Avions(int idAvions, String modelAvions, int nombreDePlaceAvions, String localiteAvions) {
		super();
		this.idAvions = idAvions;
		this.modelAvions = modelAvions;
		this.nombreDePlaceAvions = nombreDePlaceAvions;
		this.localiteAvions = localiteAvions;
	}
	public int getIdAvions() {
		return idAvions;
	}
	public void setIdAvions(int idAvions) {
		this.idAvions = idAvions;
	}
	public String getModelAvions() {
		return modelAvions;
	}
	public void setModelAvions(String modelAvions) {
		this.modelAvions = modelAvions;
	}
	public int getNombreDePlaceAvions() {
		return nombreDePlaceAvions;
	}
	public void setNombreDePlaceAvions(int nombreDePlaceAvions) {
		this.nombreDePlaceAvions = nombreDePlaceAvions;
	}
	public String getLocaliteAvions() {
		return localiteAvions;
	}
	public void setLocaliteAvions(String localiteAvions) {
		this.localiteAvions = localiteAvions;
	}
	
	

}
