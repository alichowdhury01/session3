public class Livre extends Ouvrage {
    // Attributs
    private String auteur;
    private String titre;
    private String editeur;

    // Constructeur
    public Livre(String auteur, String titre, String editeur, String date, int cote) {
        super(date, cote);
        this.auteur = auteur;
        this.titre = titre;
        this.editeur = editeur;
    }

    // Getters
    public String getAuteur() {
        return auteur;
    }
    
    public String getTitre() {
        return titre;
    }

    public String getEditeur() {
        return editeur;
    }

    // Setters
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    // toString
    @Override
    public String toString() {
        return "Livre{" + "auteur=" + auteur + ", titre=" + titre + ", editeur=" + editeur + '}';
    }

    
}
