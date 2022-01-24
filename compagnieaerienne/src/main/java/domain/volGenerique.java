package domain;

public class volGenerique {
	private int noVolGenerique;
	private String jour;
	private String heureDepart;
	private String heureArrive;
	
	
	public volGenerique() {
		super();
	}
	public volGenerique(int noVolGenerique, String jour, String heureDepart, String heureArrive) {
		super();
		this.noVolGenerique = noVolGenerique;
		this.jour = jour;
		this.heureDepart = heureDepart;
		this.heureArrive = heureArrive;
	}
	public int getNoVolGenerique() {
		return noVolGenerique;
	}
	public void setNoVolGenerique(int noVolGenerique) {
		this.noVolGenerique = noVolGenerique;
	}
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
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
