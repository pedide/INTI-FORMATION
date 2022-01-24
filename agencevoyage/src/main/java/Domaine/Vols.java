package Domaine;

public class Vols {
	private int idVols;
	private String dateVols;
	private String departVols;
	private String arriveeVols;
	private String heureDepVols;
	private String heureArrVols;
	
	
	
	public Vols() {
		super();
	}
	public Vols(String dateVols, String departVols, String arriveeVols, String heureDepVols, String heureArrVols) {
		super();
		this.dateVols = dateVols;
		this.departVols = departVols;
		this.arriveeVols = arriveeVols;
		this.heureDepVols = heureDepVols;
		this.heureArrVols = heureArrVols;
	}
	public int getIdVols() {
		return idVols;
	}
	public void setIdVols(int idVols) {
		this.idVols = idVols;
	}
	public String getDateVols() {
		return dateVols;
	}
	public void setDateVols(String dateVols) {
		this.dateVols = dateVols;
	}
	public String getDepartVols() {
		return departVols;
	}
	public void setDepartVols(String departVols) {
		this.departVols = departVols;
	}
	public String getArriveeVols() {
		return arriveeVols;
	}
	public void setArriveeVols(String arriveeVols) {
		this.arriveeVols = arriveeVols;
	}
	public String getHeureDepVols() {
		return heureDepVols;
	}
	public void setHeureDepVols(String heureDepVols) {
		this.heureDepVols = heureDepVols;
	}
	public String getHeureArrVols() {
		return heureArrVols;
	}
	public void setHeureArrVols(String heureArrVols) {
		this.heureArrVols = heureArrVols;
	}
	
	
	
}
