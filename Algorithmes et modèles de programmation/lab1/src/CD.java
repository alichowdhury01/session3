import java.time.LocalDate;

public class CD extends Ouvrage{
    //Attributes
    private String titre;
    private String auteur;

    //Constructeur
    public CD(String titre, String auteur, int cote, LocalDate dateEmprunt) {
        super(cote, dateEmprunt);
        this.setTitre(titre);
        this.setAuteur(auteur);
    }

    //Getters
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
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
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public void setCote(int cote) {
        this.cote = cote;
        
    }

    @Override
    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    //toString
    @Override
    public String toString() {
        return "CD Titre : " + titre + ",\nAuteur : " + auteur + ",\nCote : " + cote + ",\nDate d'emprunt : " + dateEmprunt;
    }
}
