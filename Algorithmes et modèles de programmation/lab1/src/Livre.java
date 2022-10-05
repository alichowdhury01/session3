import java.time.LocalDate;

public class Livre extends Ouvrage {
    //Attributes
    private String titre;
    private String auteur;
    private String editeur;

    //Constructeur
    public Livre(String titre, String auteur, String editeur, int cote, LocalDate dateEmprunt) {
        super(cote, dateEmprunt);
        this.setTitre(titre);
        this.setAuteur(auteur);
        this.setEditeur(editeur);
    }

    //Getters
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    //Setters
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    @Override
    public int getCote() {
        return cote;
    }

    @Override
    public LocalDate getDateEmprunt() {
        return dateEmprunt;
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
        //retrun each attribute of the class Livre in a string format with a new line after each attribute 
        return "Titre : " + titre + "\nAuteur : " + auteur + "\nEditeur : " + editeur + "\nCote : " + cote + "\nDate d'emprunt : " + dateEmprunt;
    }

    
}
