package domaine;

public class Adoption {
	private int idAdoption;
    private String dateAdoption;
    private double prixAdoption;
    private boolean certificatAdoption;
    private int idClient;
    private int idAnimal;
    
    public Adoption(int idAdoption,String dateAdoption,double prixAdoption,boolean certificatAdoption,int idClient,int idAnimal){
        this.idAdoption=idAdoption;
        this.dateAdoption=dateAdoption;
        this.prixAdoption=prixAdoption;
        this.certificatAdoption=certificatAdoption;
        this.idClient=idClient;
        this.idAnimal=idAnimal;
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

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }
}
