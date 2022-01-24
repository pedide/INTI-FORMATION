package domaine;

public class Vols {
	private int id;
	private String dateVol;
	private String departVol;
	private String arriveVol;
	private String heureDepart;
	private String heureArrive;
	private int idVol;
	private int idPil;
	public Vols() {}
	public Vols(String dateVol, String departVol, String arriveVol, String heureDepart, String heureArrive, int idVol,
			int idPil) {
		super();
		this.dateVol = dateVol;
		this.departVol = departVol;
		this.arriveVol = arriveVol;
		this.heureDepart = heureDepart;
		this.heureArrive = heureArrive;
		this.idVol = idVol;
		this.idPil = idPil;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateVol() {
		return dateVol;
	}
	public void setDateVol(String dateVol) {
		this.dateVol = dateVol;
	}
	public String getDepartVol() {
		return departVol;
	}
	public void setDepartVol(String departVol) {
		this.departVol = departVol;
	}
	public String getArriveVol() {
		return arriveVol;
	}
	public void setArriveVol(String arriveVol) {
		this.arriveVol = arriveVol;
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
	public int getIdVol() {
		return idVol;
	}
	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}
	public int getIdPil() {
		return idPil;
	}
	public void setIdPil(int idPil) {
		this.idPil = idPil;
	}
	
}
