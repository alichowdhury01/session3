import java.time.LocalDate;

public abstract class Ouvrage {

    // Attributs
    private LocalDate dateEmprunt;
    private int cote;
    private String auteur, titre;


    // Constructeur
    Ouvrage() {}

    Ouvrage(LocalDate dateEmprunt, int cote, String auteur, String titre) {
        this.titre = titre;
        this.auteur = auteur;
        this.dateEmprunt = dateEmprunt;
        this.cote = cote;
    }

    // Getters
    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public int getCote() {
        return cote;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    // Setters
    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    // toString
    @Override
    public String toString() {
        return "Ouvrage{" + "dateEmprunt=" + dateEmprunt + ", cote=" + cote + ", auteur=" + auteur + ", titre=" + titre + '}';
    }
}
