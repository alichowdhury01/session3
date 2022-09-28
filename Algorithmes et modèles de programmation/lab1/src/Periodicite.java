import java.time.LocalDate;

public class Periodicite extends Ouvrage {
    String nom;
    int numero;

    //Constructors
    public Periodicite(int cote, String titre, String auteur, LocalDate dateEmprunt, String nom, int numero) {
        super(cote, titre, auteur, dateEmprunt);
        this.nom = nom;
        this.numero = numero;
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

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
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

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //toString
    public String toString() {
        return "cote : " + cote + ", titre : " + titre + ", auteur : " + auteur + ", dateEmprunt : " + dateEmprunt + ", nom : " + nom + ", numero : " + numero;
    }
    
}
