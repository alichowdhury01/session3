import java.time.LocalDate;

public class Livre extends Ouvrage {
    //Attributes
    private String editeur;

    //Constructors
    public Livre(int cote, String titre, String auteur, LocalDate dateEmprunt, String editeur) {
        super(cote, titre, auteur, dateEmprunt);
        this.editeur = editeur;
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

    public String getEditeur() {
        return editeur;
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

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    //toString
    public String toString() {
        return "cote : " + cote + ", titre : " + titre + ", auteur : " + auteur + ", dateEmprunt : " + dateEmprunt + ", editeur : " + editeur;
    }
}
