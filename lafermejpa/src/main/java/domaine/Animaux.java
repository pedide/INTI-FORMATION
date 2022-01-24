package domaine;

public class Animaux {
	private int idAnimal;
    private String espece;
    private String date;
    private String nom;
    private String commentaire;
    
    public Animaux(int idAnimaux,String espece,String date,String nom,String commentaire){
        this.idAnimal=idAnimaux;
        this.espece=espece;
        this.date=date;
        this.nom=nom;
        this.commentaire=commentaire;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
