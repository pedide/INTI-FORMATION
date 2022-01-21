package domain;

public class Sportifs {
	private int idSportif; 
	protected String nomSportif; 
	protected String prenomSportif; 
	protected String adresseSportif; 
	protected int cpSportif; 
	protected String villeSportif; 
	protected String paysSportif; 
	protected String email; 
	protected String tel; 
	protected int dossardCompet;
	
	public Sportifs() {
		super();
	}

	public Sportifs(String nomSportif, String prenomSportif, int dossardCompet) {
		super();
		this.nomSportif = nomSportif;
		this.prenomSportif = prenomSportif;
		this.dossardCompet = dossardCompet;
	}

	public Sportifs(String nomSportif, String prenomSportif, String adresseSportif, int cpSportif, String villeSportif,
			String paysSportif, String email, String tel, int dossardCompet) {
		super();
		this.nomSportif = nomSportif;
		this.prenomSportif = prenomSportif;
		this.adresseSportif = adresseSportif;
		this.cpSportif = cpSportif;
		this.villeSportif = villeSportif;
		this.paysSportif = paysSportif;
		this.email = email;
		this.tel = tel;
		this.dossardCompet = dossardCompet;
	}

	public int getIdSportif() {
		return idSportif;
	}

	public void setIdSportif(int idSportif) {
		this.idSportif = idSportif;
	}

	public String getNomSportif() {
		return nomSportif;
	}

	public void setNomSportif(String nomSportif) {
		this.nomSportif = nomSportif;
	}

	public String getPrenomSportif() {
		return prenomSportif;
	}

	public void setPrenomSportif(String prenomSportif) {
		this.prenomSportif = prenomSportif;
	}

	public String getAdresseSportif() {
		return adresseSportif;
	}

	public void setAdresseSportif(String adresseSportif) {
		this.adresseSportif = adresseSportif;
	}

	public int getCpSportif() {
		return cpSportif;
	}

	public void setCpSportif(int cpSportif) {
		this.cpSportif = cpSportif;
	}

	public String getVilleSportif() {
		return villeSportif;
	}

	public void setVilleSportif(String villeSportif) {
		this.villeSportif = villeSportif;
	}

	public String getPaysSportif() {
		return paysSportif;
	}

	public void setPaysSportif(String paysSportif) {
		this.paysSportif = paysSportif;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getDossardCompet() {
		return dossardCompet;
	}

	public void setDossardCompet(int dossardCompet) {
		this.dossardCompet = dossardCompet;
	} 
	
	
	
	
}
