package domain;

public class Reservation {
	private Long numero;
	private String date;
	
	
	public Reservation() {
		super();
	}
	public Reservation(Long numero, String date) {
		super();
		this.numero = numero;
		this.date = date;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
