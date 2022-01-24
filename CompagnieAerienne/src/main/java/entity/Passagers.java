package entity;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("passager")
public class Passagers extends Individu {
	
	private int codepassager;

	public Passagers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Passagers(String nom, String prenom, String adresse, String cp, String ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
	}
	

	public int getCodepassager() {
		return codepassager;
	}

	public void setCodepassager(int codepassager) {
		this.codepassager = codepassager;
	}
	
	
}
