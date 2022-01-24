package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="adoption")
public class Adoption {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAdoption")
	private int idAdoption;
	@Column(name="dateAdoption")
    private String dateAdoption;
	@Column(name="prixAdoption")
    private double prixAdoption;
	@Column(name="certificatAdoption")
    private boolean certificatAdoption;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="idClient")
	private Clients cli;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="idAniaml")
	private Animaux ani;
    
    public Adoption(String dateAdoption,double prixAdoption,boolean certificatAdoption,Clients cli,Animaux ani){
        this.dateAdoption=dateAdoption;
        this.prixAdoption=prixAdoption;
        this.certificatAdoption=certificatAdoption;
        this.cli=cli;
        this.ani=ani;
    }
    public Adoption(String dateAdoption,double prixAdoption,boolean certificatAdoption){
        this.dateAdoption=dateAdoption;
        this.prixAdoption=prixAdoption;
        this.certificatAdoption=certificatAdoption;
    }

    public int getIdAdoption() {
        return idAdoption;
    }

    public void setIdAdoption(int idAdoption) {
        this.idAdoption = idAdoption;
    }

    public String getDateAdoption() {
        return dateAdoption;
    }

    public void setDateAdoption(String dateAdoption) {
        this.dateAdoption = dateAdoption;
    }

    public double getPrixAdoption() {
        return prixAdoption;
    }

    public void setPrixAdoption(double prixAdoption) {
        this.prixAdoption = prixAdoption;
    }

    public boolean getCertificatAdoption() {
        return certificatAdoption;
    }

    public void setCertificatAdoption(boolean certificatAdoption) {
        this.certificatAdoption = certificatAdoption;
    }
}
