import java.time.LocalDate;

public class Livre extends Ouvrage {
    // Attributs

    private String editeur;

    // Constructeur
    Livre() {}

    Livre(String auteur, String titre, String editeur, LocalDate dateEmprunt, int cote) {
        super(dateEmprunt, cote, auteur, titre);
        this.editeur = editeur;
    }

    // Getters
    public String getTitre() {
        return super.getTitre();
    }

    public String getAuteur() {
        return super.getAuteur();
    }

    public String getEditeur() {
        return editeur;
    }

    // Setters
    public void setTitre(String titre) {
        super.setTitre(titre);
    }

    public void setAuteur(String auteur) {
        super.setAuteur(auteur);
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    // toString
    @Override
    public String toString() {
        return "Livre{" + "editeur=" + editeur + "}\n" + super.toString();
    }
    
}
