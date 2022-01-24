package domain;

public class Client {

	private Long idclient;
	private String nomClient;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Client(String nomClient) {
		this.nomClient = nomClient;
	}
	
	
	public Long getIdclient() {
		return idclient;
	}
	public void setIdclient(Long idclient) {
		this.idclient = idclient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	
	

	
	
	
	
	
	
}
