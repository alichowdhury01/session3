import java.time.LocalDate;

public abstract class Ouvrage {
    //Attributes
    int cote;
    String titre, auteur;
    LocalDate dateEmprunt;


    // Constructors
    public Ouvrage(int cote, String titre, String auteur, LocalDate dateEmprunt) {
        this.cote = cote;
        this.titre = titre;
        this.auteur = auteur;
        this.dateEmprunt = dateEmprunt;
    }

    // Abstract Getters 
    public abstract int getCote();
    public abstract String getTitre();
    public abstract String getAuteur();
    public abstract LocalDate getDateEmprunt();

    // Abstract Setters
    public abstract void setCote(int cote);
    public abstract void setTitre(String titre);
    public abstract void setAuteur(String auteur);
    public abstract void setDateEmprunt(LocalDate dateEmprunt);

    // Abstract toString
    public abstract String toString();



}
