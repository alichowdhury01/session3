//import linkedlist.*;
import java.util.*;

public class BiblioList extends Bibliotheque {
    LinkedList<Ouvrage> biblioList = new LinkedList<Ouvrage>();

    //Methods ajouter from abstract class Bibliotheque 
    public void ajouter(Ouvrage o) {
        biblioList.add(o);
    }

    //Methods rechercher from abstract class Bibliotheque. Must search by cote in the list of Ouvrage objects 
    public Ouvrage rechercher(int cote) {
        for (Ouvrage o : biblioList) {
            if (o.getCote() == cote) {
                return o;
            }
        }
        return null;
    }

    //Methods rechercherr from abstract class Bibliotheque. 
    public void rechercherr(Ouvrage o) {
        for (Ouvrage ouvrage : biblioList) {
            if (ouvrage.equals(o)) {
                System.out.println(ouvrage);
            }
        }
    }

    //Methods supprimer from abstract class Bibliotheque. Must search by cote in the list of Ouvrage objects
    public void supprimer(int cote) {
        for (Ouvrage o : biblioList) {
            if (o.getCote() == cote) {
                biblioList.remove(o);
            }
        }
    }

    //Methods supprimerr from abstract class Bibliotheque.
    public Ouvrage supprimerr(Ouvrage o) {
        for (Ouvrage ouvrage : biblioList) {
            if (ouvrage.equals(o)) {
                biblioList.remove(ouvrage);
                return ouvrage;
            }
        }
        return null;
    }

    //toString
    public String toString() {
        return "BiblioList [biblioList=" + biblioList + "]";
    }
    
}
