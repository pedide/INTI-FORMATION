package entity;

public class compagnie {
	
	private Long idCompagnie;
	private String nomCompa;
	private String ResaStatut;
	
	public compagnie() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public compagnie(String nomCompa, String resaStatut) {
		this.nomCompa = nomCompa;
		ResaStatut = resaStatut;
	}

	public Long getIdCompagnie() {
		return idCompagnie;
	}

	public void setIdCompagnie(Long idCompagnie) {
		this.idCompagnie = idCompagnie;
	}

	public String getNomCompa() {
		return nomCompa;
	}

	public void setNomCompa(String nomCompa) {
		this.nomCompa = nomCompa;
	}

	public String getResaStatut() {
		return ResaStatut;
	}

	public void setResaStatut(String resaStatut) {
		ResaStatut = resaStatut;
	}
	

	
	
	
	
}
