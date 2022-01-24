package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compagnie")
public class Compagnie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCompagnie")
	private int idCompagnie;
	
	@Column(name="nomCompagnie")
	private String nomCompagnie;
	
	public Compagnie(String nomCompagnie) {
		super();
		this.nomCompagnie = nomCompagnie;
	}
	
	public int getIdCompagnie() {
		return idCompagnie;
	}
	
	public void setIdCompagnie(int idCompagnie) {
		this.idCompagnie = idCompagnie;
	}
	
	public String getNomCompagnie() {
		return nomCompagnie;
	}
	
	public void setNomCompagnie(String nomCompagnie) {
		this.nomCompagnie = nomCompagnie;
	}
}
