package domaine;

public class Voiture {
	private int idVoiture;
    private String modele;
    private String couleur;
    private String immatriculation;
    private int puissance;

    public Voiture(int idVoiture, String modele, String couleur, String immatriculation, int puissance) {
        this.idVoiture = idVoiture;
        this.modele = modele;
        this.couleur = couleur;
        this.immatriculation = immatriculation;
        this.puissance = puissance;
    }
    
    
    
    public int getIdVoiture() {
        return idVoiture;
    }

    public void setIdVoiture(int idVoiture) {
        this.idVoiture = idVoiture;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
}
