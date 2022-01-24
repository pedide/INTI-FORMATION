package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idReservation")
	private int idReservation;
	
	@Column(name="dateReservation")
	private String dateReservation;
	
	@ManyToOne
	@JoinColumn(name="idClientRes")
	private ClientRes clientRes;
	
	@ManyToOne
	@JoinColumn(name="idPassager")
	private Passager passager;
	
	@ManyToOne
	@JoinColumn(name="idVol")
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
