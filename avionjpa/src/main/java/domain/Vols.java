package domain;

public class Vols {

	private int idvols;
	private String date;
	private String destD;
	private String destA;
	private String heureD;
	private String heureA;
	
	
	public Vols() {
		super();
	}
	
	public Vols(String date, String destD, String destA, String heureD, String heureA) {
		super();
		this.date = date;
		this.destD = destD;
		this.destA = destA;
		this.heureD = heureD;
		this.heureA = heureA;
	}

	public Vols(int idvols, String date, String destD, String destA, String heureD, String heureA) {
		super();
		this.idvols = idvols;
		this.date = date;
		this.destD = destD;
		this.destA = destA;
		this.heureD = heureD;
		this.heureA = heureA;
	}

	public int getIdvols() {
		return idvols;
	}

	public void setIdvols(int idvols) {
		this.idvols = idvols;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDestD() {
		return destD;
	}

	public void setDestD(String destD) {
		this.destD = destD;
	}

	public String getDestA() {
		return destA;
	}

	public void setDestA(String destA) {
		this.destA = destA;
	}

	public String getHeureD() {
		return heureD;
	}

	public void setHeureD(String heureD) {
		this.heureD = heureD;
	}

	public String getHeureA() {
		return heureA;
	}

	public void setHeureA(String heureA) {
		this.heureA = heureA;
	}
	
	
	
}
