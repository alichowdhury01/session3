import java.time.LocalDate;

public class Periodicite extends Ouvrage {
    //Attributes
    String nom;
    int numero;
    String periodique;

    //Constructeur
    public Periodicite(String nom, int numero, String periodique, int cote, LocalDate dateEmprunt) {
        super(cote, dateEmprunt);
        this.setNom(nom);
        this.setNumero(numero);
        this.setPeriodique(periodique);
    }

    //Getters
    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public String getPeriodique() {
        return periodique;
    }

    @Override
    public int getCote() {
        return cote;
    }

    @Override
    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    //Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPeriodique(String periodique) {
        this.periodique = periodique;
    }

    @Override
    public void setCote(int cote) {
        this.cote = cote;
        
    }

    @Override
    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
        
        
    }

    @Override
    public String toString() {
        return "Nom : " + nom + ",\nNumero : " + numero + ",\nCote : " + cote + ",\nDate d'emprunt : " + dateEmprunt;
    }
    
}
