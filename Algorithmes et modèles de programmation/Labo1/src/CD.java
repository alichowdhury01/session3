public class CD {
    // Attributs
    private String titre;
    private String auteur;

    // Constructeur
    public CD(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    // Getters
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    // Setters
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    // toString
    @Override
    public String toString() {
        return "CD{" + "titre=" + titre + ", auteur=" + auteur + '}';
    }
}
