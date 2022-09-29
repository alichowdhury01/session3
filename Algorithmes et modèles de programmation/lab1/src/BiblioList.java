//import linkedlist.*;
import java.util.*;

public class BiblioList extends Bibliotheque {
    LinkedList<Ouvrage> biblioList = new LinkedList<Ouvrage>();
    
    //Methods ajouter from abstract class Bibliotheque 
    public void ajouter(Ouvrage o) {
        biblioList.add(o);
    }

    //Methods rechercher from abstract class Bibliotheque. Must search by cote in the list of Ouvrage objects, if found say it's found and return the object, if not found say it's not found and return null

    public Ouvrage rechercher(int cote) {
        for (Ouvrage o : biblioList) {
            if (o.getCote() == cote) {
                System.out.println("Found");
                return o;
            }
        }
        System.out.println("Not found");
        return null;
    }

    //Methods supprimer from abstract class Bibliotheque. Must search by cote in the list of Ouvrage objects, if found say it's found and object has been  deleted with the cote. remove it from the list, if not found say it's not found and return null
    public Ouvrage supprimer(int cote) {
        for (Ouvrage o : biblioList) {
            if (o.getCote() == cote) {
                System.out.println("Found and book with cote " + o + " has been deleted");
                biblioList.remove(o);
                return o;
            }
        }
        System.out.println("Not found");
        return null;
    }
    //toString
    public String toString() {
        return "BiblioList [biblioList=" + biblioList + "]";
    }
    
}
