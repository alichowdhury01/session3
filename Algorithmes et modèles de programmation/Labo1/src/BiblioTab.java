import java.util.LinkedList;

public class BiblioTab extends Bibliotheque {

    // Attributs array
    private Ouvrage[] listeOuvrages;

    // Constructeur
    public BiblioTab(String nom, int nbOuvrages) {
        super(nom, nbOuvrages);
        this.listeOuvrages = new Ouvrage[nbOuvrages];
    }

    //toString
    @Override
    public String toString() {
        return "BiblioTab{" + "listeOuvrages=" + listeOuvrages + '}';
    }

    // méthodes ajout
    public void ajoute(Ouvrage o) {
        for (int i = 0; i < listeOuvrages.length; i++) {
            if (listeOuvrages[i] == null) {
                listeOuvrages[i] = o;
                break;
            }
        }
    }

    //supprime
    public void supprime(Ouvrage o) {
        for (int i = 0; i < listeOuvrages.length; i++) {
            if (listeOuvrages[i] == o) {
                listeOuvrages[i] = null;
                break;
            }
        }
    }

    //recherche
    public Ouvrage recherche(int cote) {
        for (int i = 0; i < listeOuvrages.length; i++) {
            if (listeOuvrages[i].getCote() == cote) {
                return listeOuvrages[i];
            }
        }
        return null;
    }
}
