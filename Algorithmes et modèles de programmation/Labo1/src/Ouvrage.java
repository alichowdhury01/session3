import java.time.LocalDate;

public abstract class Ouvrage {

    // Attributs
    private LocalDate date;
    private int cote;
    private String auteur;
    private String titre;


    // Constructeur
    public Ouvrage(LocalDate date, int cote, String auteur, String titre) {
        this.titre = titre;
        this.auteur = auteur;
        this.date = date;
        this.cote = cote;
    }

    // Getters
    public LocalDate getDate() {
        return date;
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
    public void setDate(LocalDate date) {
        this.date = date;
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
        return "Ouvrage{" + "date=" + date + ", cote=" + cote + ", auteur=" + auteur + ", titre=" + titre + '}';
    }

    
}
