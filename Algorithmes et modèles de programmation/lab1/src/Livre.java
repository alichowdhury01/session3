import java.time.LocalDate;

public class Livre extends Ouvrage {
    //Attributes
    private String titre;
    private String auteur;
    private String editeur;

    //Constructors
    public Livre(String titre, String auteur, String editeur, LocalDate dateEmprunt) {
        super(dateEmprunt);
        this.setTitre(titre);
        this.setAuteur(auteur);
        this.setEditeur(editeur);
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

    public String getEditeur() {
        return editeur;
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

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    //toString
    public String toString() {
        return "cote : " + cote + ",\ntitre : " + titre + ",\nauteur : " + auteur + ",\nediteur : " + editeur + ",\ndateEmprunt : " + dateEmprunt;
    }
}
