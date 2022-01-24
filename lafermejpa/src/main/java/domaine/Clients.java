package domaine;

public class Clients {
	private int idClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String codePostal;
    private String ville;
    private int idProd;
    
    public Clients(int idClient,String nom,String prenom,String adresse,String codePostal,String ville,int idProd){
        this.idClient=idClient;
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.codePostal=codePostal;
        this.ville=ville;
        this.idProd=idProd;
    }
    
    public int getIdClient(){
        return idClient;
    }
    
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }
}
