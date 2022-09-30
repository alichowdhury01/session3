import java.util.Arrays;

public class BiblioTab extends Bibliotheque {
    // Array that only contains Ouvrage objects and the size of the array is 10 maximum and can't be changed
    private Ouvrage[] biblioTab = new Ouvrage[2];

    //Methods ajouter from abstract class Bibliotheque. Must add the object to the array if there is space, if not say there is no space
    public void ajouter(Ouvrage o) {
        for (int i = 0; i < biblioTab.length; i++) {
            if (biblioTab[i] == null) {
                biblioTab[i] = o;
                return;
            }
        }
        System.out.println("No space");
    }

    //Methods rechercher from abstract class Bibliotheque. Must search by cote in the array of Ouvrage objects, if found say it's found and return the object, if not found say it's not found and return null
    public Ouvrage rechercher(int cote) {
        for (Ouvrage o : biblioTab) {
            if (o != null && o.getCote() == cote) {
                System.out.println("Found");
                return o;
            }
        }
        System.out.println("Not found");
        return null;
    }

    //Methods supprimer from abstract class Bibliotheque. Must search by cote in the array of Ouvrage objects, if found say it's found and object has been  deleted with the cote. remove it from the array, if not found say it's not found and return null
    public Ouvrage supprimer(int cote) {
        for (int i = 0; i < biblioTab.length; i++) {
            if (biblioTab[i] != null && biblioTab[i].getCote() == cote) {
                System.out.println("Found and book with cote " + biblioTab[i] + " has been deleted");
                biblioTab[i] = null;
                return biblioTab[i];
            }
        }
        System.out.println("Not found");
        return null;
    }

    //toString
    public String toString() {
        return "BiblioTab [biblioTab=" + Arrays.toString(biblioTab) + "]";
    }

}
