import java.time.LocalDate;

public class CD extends Ouvrage{
    //Attributes
    private String titre;
    private String auteur;
    //Constructors
    public CD(String titre, String auteur, LocalDate dateEmprunt) {
        super(dateEmprunt);
        this.setTitre(titre);
        this.setAuteur(auteur);
    }

    //Getters
 

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    //Setters


    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        CD.dateEmprunt = dateEmprunt;
    }

    //toString
    public String toString() {
        return "cote : " + cote + ",\ntitre : " + titre + ",\nauteur : " + auteur + ",\ndateEmprunt : " + dateEmprunt;
    }
    

    
}
