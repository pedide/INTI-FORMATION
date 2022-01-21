package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="amateur")
public class Amateur extends Sportif {
	@Column(name="CERTIF")
	private String certifmed;
	@Column(name="NOM_MED")
	private String nommed;
	
	
	public Amateur() {
		super();
	}
	
	public Amateur(String certifmed, String nommed) {
		super();
		this.certifmed = certifmed;
		this.nommed = nommed;
	}
	
	public Amateur(String nomsp, String prenomsp, int dossardCompet,String certifmed, String nommed) {
		super(nomsp, prenomsp, dossardCompet);
		// TODO Auto-generated constructor stub
		this.certifmed = certifmed;
		this.nommed = nommed;
	}
	
	

	public Amateur(String nomsp, String prenomsp,String certifmed, String nommed) {
		super(nomsp, prenomsp);
		// TODO Auto-generated constructor stub
		this.certifmed = certifmed;
		this.nommed = nommed;
	}

	public String getCertifmed() {
		return certifmed;
	}
	public void setCertifmed(String certifmed) {
		this.certifmed = certifmed;
	}
	public String getNommed() {
		return nommed;
	}
	public void setNommed(String nommed) {
		this.nommed = nommed;
	}
	
	
	
}
