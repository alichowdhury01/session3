// La classe Bibliotheque sera simplement une version abstraite déclarant les mêmes méthodes que BiblioTab mais sans les implémenter.
public class Bibliotheque {

    // Attributs
    private String nom;
    private int nbOuvrages;

    // Constructeur
    public Bibliotheque(String nom, int nbOuvrages) {
        this.nom = nom;
        this.nbOuvrages = nbOuvrages;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getNbOuvrages() {
        return nbOuvrages;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbOuvrages(int nbOuvrages) {
        this.nbOuvrages = nbOuvrages;
    }

    // toString
    @Override
    public String toString() {
        return "Bibliotheque{" + "nom=" + nom + ", nbOuvrages=" + nbOuvrages + '}';
    }

    // Autres méthodes
    public void affiche() {
        System.out.println("Bibliotheque{" + "nom=" + nom + ", nbOuvrages=" + nbOuvrages + '}');
    }

    
    
    
}
