import java.time.LocalDate;

public class Livre extends Ouvrage {
    // Attributs

    private String editeur;

    // Constructeur
    public Livre(String auteur, String titre, String editeur, LocalDate date, int cote) {
        super(date, cote, auteur, titre);
        this.editeur = editeur;
    }

    // Getters
    public String getEditeur() {
        return editeur;
    }

    // Setters
    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    // toString
    @Override
    public String toString() {
        return "Livre{" + "editeur=" + editeur + "}\n" + super.toString();
    }
    
}
