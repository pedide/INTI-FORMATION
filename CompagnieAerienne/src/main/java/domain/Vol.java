package domain;

public class Vol {
	
	private Long IdVol;
	private String VolDate;
	private String VolDestinationDepart;
	private String VolDestinationArrive;
	private String VolHeureDepart;
	private String VolHeureArrive;
	
	
	
	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Vol(String volDate, String volDestinationDepart, String volDestinationArrive, String volHeureDepart,
			String volHeureArrive) {
		VolDate = volDate;
		VolDestinationDepart = volDestinationDepart;
		VolDestinationArrive = volDestinationArrive;
		VolHeureDepart = volHeureDepart;
		VolHeureArrive = volHeureArrive;
		
		
	}



	public Long getIdVol() {
		return IdVol;
	}



	public void setIdVol(Long idVol) {
		IdVol = idVol;
	}



	public String getVolDate() {
		return VolDate;
	}



	public void setVolDate(String volDate) {
		VolDate = volDate;
	}



	public String getVolDestinationDepart() {
		return VolDestinationDepart;
	}



	public void setVolDestinationDepart(String volDestinationDepart) {
		VolDestinationDepart = volDestinationDepart;
	}



	public String getVolDestinationArrive() {
		return VolDestinationArrive;
	}



	public void setVolDestinationArrive(String volDestinationArrive) {
		VolDestinationArrive = volDestinationArrive;
	}



	public String getVolHeureDepart() {
		return VolHeureDepart;
	}



	public void setVolHeureDepart(String volHeureDepart) {
		VolHeureDepart = volHeureDepart;
	}



	public String getVolHeureArrive() {
		return VolHeureArrive;
	}



	public void setVolHeureArrive(String volHeureArrive) {
		VolHeureArrive = volHeureArrive;
	}
	
	
	
	
	
	
	
}
