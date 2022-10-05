import java.time.LocalDate;

public abstract class Ouvrage {
    //Attribut
    int cote;
    LocalDate dateEmprunt;

    //Constructeur
    public Ouvrage(int cote, LocalDate dateEmprunt) {
        this.cote = cote;
        this.dateEmprunt = dateEmprunt;
    }

    //Getters abstraits
    public abstract int getCote();
    public abstract LocalDate getDateEmprunt();

    //Setters abstraits
    public abstract void setCote(int cote);
    public abstract void setDateEmprunt(LocalDate dateEmprunt);

    //toString abstrait
    public abstract String toString();

    

}
