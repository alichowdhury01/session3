import java.time.LocalDate;

public class Periodique extends Ouvrage {
    String nom, numero;
    int perodicite;

    //Constructors
    public Periodique(String nom, String numero, int perodicite, LocalDate dateEmprunt) {
        super(dateEmprunt);
        this.setNom(nom);
        this.setNumero(numero);
        this.setPerodicite(perodicite);
    }

    //Getters
    public int getCote() {
        return cote;
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public int getPerodicite() {
        return perodicite;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    //Setters


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPerodicite(int perodicite) {
        this.perodicite = perodicite;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    //toString
    public String toString() {
        return "cote : " + cote +  ",\nnom : " + nom + ",\nnumero : " + numero + ",\nperodicite : " + perodicite + ",\ndateEmprunt : " + dateEmprunt;
    }
    
}
