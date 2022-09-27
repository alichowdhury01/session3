public class Livre {
    // Attributes
    private int numeroLivre;
    private String titre;
    private int numeroAuteur;
    private int anneePublication;
    private int nbPages;
    private String categorie;

    // Constructor
    public Livre(int numeroLivre, String titre, int numeroAuteur, int anneePublication, int nbPages, String categorie) {
        this.numeroLivre = numeroLivre;
        this.titre = titre;
        this.numeroAuteur = numeroAuteur;
        this.anneePublication = anneePublication;
        this.nbPages = nbPages;
        this.categorie = categorie;
    }

    // Getters
    public int getNumeroLivre() {
        return numeroLivre;
    }

    public String getTitre() {
        return titre;
    }

    public int getNumeroAuteur() {
        return numeroAuteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public int getNbPages() {
        return nbPages;
    }

    public String getCategorie() {
        return categorie;
    }

    // Setters
    public void setNumeroLivre(int numeroLivre) {
        this.numeroLivre = numeroLivre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNumeroAuteur(int numeroAuteur) {
        this.numeroAuteur = numeroAuteur;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    // Methods (toString)
    @Override
    public String toString() {
        return "Livre [anneePublication=" + anneePublication + ", categorie=" + categorie + ", nbPages=" + nbPages
                + ", numeroAuteur=" + numeroAuteur + ", numeroLivre=" + numeroLivre + ", titre=" + titre + "]";
    }

}
