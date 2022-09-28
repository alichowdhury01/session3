import java.time.LocalDate;

public class CD extends Ouvrage{
    //Constructors
    public CD(int cote, String titre, String auteur, LocalDate dateEmprunt) {
        super(cote, titre, auteur, dateEmprunt);
    }

    //Getters
    public int getCote() {
        return cote;
    }

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
    public void setCote(int cote) {
        this.cote = cote;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    //toString
    public String toString() {
        return "cote : " + cote + ", titre : " + titre + ", auteur : " + auteur + ", dateEmprunt : " + dateEmprunt;
    }
    

    
}
