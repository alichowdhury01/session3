import java.time.LocalDate;

public abstract class Ouvrage {
    //Attributes
    static int cote;
    static LocalDate dateEmprunt;

    // Constructors
    public Ouvrage(LocalDate dateEmprunt) {
        cote++;
        Ouvrage.dateEmprunt = dateEmprunt;
    }

    // Abstract Getters 
   
    public abstract LocalDate getDateEmprunt();

    public int getCote() {
        return cote;
    }

    // Abstract Setters
    
    public abstract void setDateEmprunt(LocalDate dateEmprunt);

    public void setCote(int cote) {
        Ouvrage.cote = cote;
    }

    // Abstract toString
    public abstract String toString();



}
