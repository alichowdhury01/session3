import java.util.Arrays;
//  *****************************************************DONE*****************************************************
//  **************************************************************************************************************
public class BiblioTab extends Bibliotheque {
    // Array that only contains Ouvrage objects and the size of the array is 10 maximum and can't be changed
    private Ouvrage[] biblioTab = new Ouvrage[9];

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


    //Methods recherche from abstract class Bibliotheque. Must search by cote in the array of Ouvrage objects, if found say it's found and return the object, if not found say it's not found and return null
    @Override
    public Ouvrage recherche(int cote) {
        for (Ouvrage ouvrage : biblioTab) {
            if (ouvrage != null && ouvrage.getCote() == cote) {
                System.out.println("L'ouvrage avec la cote " + ouvrage.getCote() + " a été trouvé à la position " + Arrays.asList(biblioTab).indexOf(ouvrage));
                return ouvrage;
            }
        }
        System.out.println("Not found");
        return null;
    }


    //Methods supprime from abstract class Bibliotheque. Must search by cote in the array of Ouvrage objects, if found say it's found and object has been  deleted with the cote. remove it from the array, if not found say it's not found and return null
    @Override
    public Ouvrage supprime(int cote) {
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

    
    //Methods toString from abstract class Bibliotheque. Must return the array of Ouvrage objects with a change line between each object and the total number of objects in the array
    @Override
    public String toString() {
        String str = "";
        for (Ouvrage ouvrage : biblioTab) {
            if (ouvrage != null) {
                str += ouvrage + "\n";
            }
        }
        return str + "\nTotal number of books: " + biblioTab.length;
    }
}
