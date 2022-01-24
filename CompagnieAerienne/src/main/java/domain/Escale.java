package domain;

public class Escale {
	
	private Long idescale;
	private String EscHeureDepart;
	private String EscHeureArrive;
	
	
	public Escale(String escHeureDepart, String escHeureArrive) {
		EscHeureDepart = escHeureDepart;
		EscHeureArrive = escHeureArrive;
	}

	
	public Long getIdescale() {
		return idescale;
	}


	public void setIdescale(Long idescale) {
		this.idescale = idescale;
	}


	public String getEscHeureDepart() {
		return EscHeureDepart;
	}


	public void setEscHeureDepart(String escHeureDepart) {
		EscHeureDepart = escHeureDepart;
	}


	public String getEscHeureArrive() {
		return EscHeureArrive;
	}


	public void setEscHeureArrive(String escHeureArrive) {
		EscHeureArrive = escHeureArrive;
	}
	
	
	
	
	
	

}
