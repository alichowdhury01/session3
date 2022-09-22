import java.util.LinkedList;

public class BiblioList extends Bibliotheque {

    //bibliolist ouvrages linkedlist
    private LinkedList<Ouvrage> listeOuvrages;

    //constructeur
    public BiblioList(String nom, int nbOuvrages) {
        super(nom, nbOuvrages);
        this.listeOuvrages = new LinkedList<>();
    }

    //toString
    @Override
    public String toString() {
        return "BiblioList{" + "listeOuvrages=" + listeOuvrages + '}';
    }

    //ajoute
    public void ajoute(Ouvrage o) {
        listeOuvrages.add(o);
    }

    //supprime
    public void supprime(Ouvrage o) {
        listeOuvrages.remove(o);
    }

    //recherche
    public Ouvrage recherche(int cote) {
        for (Ouvrage ouvrage : listeOuvrages) {
            if (ouvrage.getCote() == cote) {
                return ouvrage;
            }
        }
        return null;
    }
}
