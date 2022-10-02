import java.time.LocalDate;

public abstract class Ouvrage {
    //Attributes
    int cote;
    LocalDate dateEmprunt;

    // Constructors
    public Ouvrage(LocalDate dateEmprunt) {
        cote++;
        this.dateEmprunt = dateEmprunt;
    }

    // Abstract Getters 
   
    public abstract LocalDate getDateEmprunt();

    public int getCote() {
        return cote;
    }

    // Abstract Setters
    
    public abstract void setDateEmprunt(LocalDate dateEmprunt);

    public void setCote(int cote) {
        this.cote = cote;
    }

    // Abstract toString
    public abstract String toString();



}
