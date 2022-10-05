//import linkedlist.*;
import java.util.LinkedList;

public class BiblioList extends Bibliotheque {
    //linkedlist
    private LinkedList<Ouvrage> biblioList = new LinkedList<Ouvrage>();

    @Override
    public void ajouter(Ouvrage o) {
        biblioList.add(o);
        
    }

    @Override
    public Ouvrage rechercher(int cote) {
        //search for the ouvrage with the cote number in the linkedlist and say if it's found on wich index and if not found say it's not found
        for (int i = 0; i < biblioList.size(); i++) {
            if (biblioList.get(i).getCote() == cote) {
                //display the ouvrage at the index i
                System.out.println("L'ouvrage a été trouvé à l'index " + i + " :\n" + biblioList.get(i));
                return biblioList.get(i);
            }
        }
        System.out.println("L'ouvrage n'est pas trouvé avec la cote " + cote + " demandée dans la bibliothèque"); 
        return null;
    }

    @Override
    public Ouvrage supprimer(int cote) {
        //search for the ouvrage with the cote number in the linkedlist and say if it's found say it is found on wich index and now it's deleted and if not found say it's not found
        for (int i = 0; i < biblioList.size(); i++) {
            if (biblioList.get(i).getCote() == cote) {
                //display the ouvrage at the index i
                System.out.println("L'ouvrage a été trouvé à l'index " + i + " et a été supprimé de la bibliothèque");
                //delete the ouvrage at the index i
                biblioList.remove(i);
                return biblioList.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        // return intire linkedlist in a string format with a new line after each ouvrage in the linkedlist 
        System.out.println("La bibliothèque contient les ouvrages suivants :");
        for (int i = 0; i < biblioList.size(); i++) {
            System.out.println(biblioList.get(i));
        }
        return null;
    }
}
