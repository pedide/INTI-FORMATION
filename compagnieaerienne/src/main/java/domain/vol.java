package domain;

public class vol {
	private int idVol;
	private String dateVol;
	private String destinationArrive;
	private String destinationDepart;
	private String heureDepart;
	private String heureArrive;
	
	
	
	public vol() {
		super();
	}
	public vol(int idVol, String dateVol, String destinationArrive, String destinationDepart, String heureDepart,
			String heureArrive) {
		super();
		this.idVol = idVol;
		this.dateVol = dateVol;
		this.destinationArrive = destinationArrive;
		this.destinationDepart = destinationDepart;
		this.heureDepart = heureDepart;
		this.heureArrive = heureArrive;
	}
	public int getIdVol() {
		return idVol;
	}
	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}
	public String getDateVol() {
		return dateVol;
	}
	public void setDateVol(String dateVol) {
		this.dateVol = dateVol;
	}
	public String getDestinationArrive() {
		return destinationArrive;
	}
	public void setDestinationArrive(String destinationArrive) {
		this.destinationArrive = destinationArrive;
	}
	public String getDestinationDepart() {
		return destinationDepart;
	}
	public void setDestinationDepart(String destinationDepart) {
		this.destinationDepart = destinationDepart;
	}
	public String getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}
	public String getHeureArrive() {
		return heureArrive;
	}
	public void setHeureArrive(String heureArrive) {
		this.heureArrive = heureArrive;
	}
	
	
	

}
