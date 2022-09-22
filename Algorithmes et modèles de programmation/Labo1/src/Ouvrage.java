import java.time.LocalDate;

public class Ouvrage {
    // attributs d'instance
    private LocalDate dateEmprunt;

    // atributs de classe
    private static int cote;

    // constructeur
    public Ouvrage(LocalDate date, int cote2) {
        this.dateEmprunt = null;
        cote++;
    }

    // getters
    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public static int getCote() {
        return cote;
    }

    // setters
    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public static void setCote(int cote) {
        Ouvrage.cote = cote;
    }

    // abstract toString
    @Override
    public String toString() {
        return "Ouvrage{" + "dateEmprunt=" + dateEmprunt + '}';
    }

    //toString
    public String toString(int cote) {
        return "Ouvrage{" + "dateEmprunt=" + dateEmprunt + ", cote=" + cote + '}';
    }
    



    
}
