import java.util.LinkedList;

public class BiblioListPerso extends Bibliotheque {
    // Attributs maBiblioListPerso ouvrages ListeChainee
    private ListChainee listeOuvrages;

    // Constructeur
    public BiblioListPerso(String nom, int nbOuvrages) {
        super(nom, nbOuvrages);
        this.listeOuvrages = new ListChainee();
    }

    // toString
    @Override
    public String toString() {
        return "BiblioListPerso{" + "listeOuvrages=" + listeOuvrages + '}';
    }

    // ajoute
    public void ajoute(Ouvrage o) {
        listeOuvrages.add(o);
    }

    // supprime
    public void supprime(Ouvrage o) {
        listeOuvrages.remove(o);
    }

    // recherche
    public Ouvrage recherche(int cote) {
        return listeOuvrages.recherche(cote);
    }



    
}
