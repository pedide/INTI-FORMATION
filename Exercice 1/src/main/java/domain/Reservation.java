package domain;

public class Reservation {
	private int idReservation;
	private String dateReservation;
	private ClientRes clientRes;
	private Passager passager;
	private Vol vol;
	
	public Reservation(String dateReservation, ClientRes clientRes, Passager passager,
			Vol vol) {
		super();
		this.dateReservation = dateReservation;
		this.clientRes = clientRes;
		this.passager = passager;
		this.vol = vol;
	}

	public int getIdReservation() {
		return idReservation;
	}
	
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	
	public String getDateReservation() {
		return dateReservation;
	}
	
	public void setDateReservation(String dateReservation) {
		this.dateReservation = dateReservation;
	}

	public ClientRes getClientRes() {
		return clientRes;
	}

	public void setClientRes(ClientRes clientRes) {
		this.clientRes = clientRes;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}
}
