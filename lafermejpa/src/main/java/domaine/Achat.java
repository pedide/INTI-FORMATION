package domaine;

public class Achat {
	private int idAchat;
    private int idClient;
    private int idVoiture;
    private double prixAchat;
    
    
    public Achat(){}
    
    public Achat(int idAchat,int idClient,int idVoiture,double prixAchat){
        this.idAchat=idAchat;
        this.idClient=idClient;
        this.idVoiture=idVoiture;
        this.prixAchat=prixAchat;
    }

    public int getIdAchat() {
        return idAchat;
    }

    public void setIdAchat(int idAchat) {
        this.idAchat = idAchat;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdVoiture() {
        return idVoiture;
    }

    public void setIdVoiture(int idVoiture) {
        this.idVoiture = idVoiture;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }
}
