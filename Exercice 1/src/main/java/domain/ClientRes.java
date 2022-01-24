package domain;

public class ClientRes extends Individu {
	private String codeClient;

	public ClientRes(String nomIndividu, String prenomIndividu, String adresseIndividu, int cpIndividu,
			String villeIndividu, String codeClient) {
		super(nomIndividu, prenomIndividu, adresseIndividu, cpIndividu, villeIndividu);
		this.codeClient = codeClient;
	}

	public String getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}
}
