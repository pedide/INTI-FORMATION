package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="clientres")
@PrimaryKeyJoinColumn(name="idIndividu")
public class ClientRes extends Individu {
	@Column(name="codeClient")
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
