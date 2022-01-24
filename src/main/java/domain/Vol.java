package domain;

public class Vol {
	private int idVol; 
	private String dateVol; 
	private String volDepart; 
	private String volArrivee; 
	private String volHeureDepart; 
	private String volHeureArrivee;
	

	public Vol() {
		super();
	}

	
	public Vol(String dateVol, String volDepart, String volArrivee, String volHeureDepart, String volHeureArrivee) {
		super();
		this.dateVol = dateVol;
		this.volDepart = volDepart;
		this.volArrivee = volArrivee;
		this.volHeureDepart = volHeureDepart;
		this.volHeureArrivee = volHeureArrivee;
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

	public String getVolDepart() {
		return volDepart;
	}

	public void setVolDepart(String volDepart) {
		this.volDepart = volDepart;
	}

	public String getVolArrivee() {
		return volArrivee;
	}

	public void setVolArrivee(String volArrivee) {
		this.volArrivee = volArrivee;
	}

	public String getVolHeureDepart() {
		return volHeureDepart;
	}

	public void setVolHeureDepart(String volHeureDepart) {
		this.volHeureDepart = volHeureDepart;
	}

	public String getVolHeureArrivee() {
		return volHeureArrivee;
	}

	public void setVolHeureArrivee(String volHeureArrivee) {
		this.volHeureArrivee = volHeureArrivee;
	} 
	
}
