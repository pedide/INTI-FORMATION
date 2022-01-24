package domaine;

public class Produit {
	private int idProd;
    private String nom;
    private double prix;
    private String designation;
    
    public Produit(int idProd,String nom,double prix,String designation){
        this.idProd=idProd;
        this.nom=nom;
        this.prix=prix;
        this.designation=designation;
    }
    
    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
