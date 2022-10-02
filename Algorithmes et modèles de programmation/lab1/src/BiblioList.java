//import linkedlist.*;
import java.util.LinkedList;

public class BiblioList extends Bibliotheque {
    LinkedList<Ouvrage> biblioList = new LinkedList<Ouvrage>();

    @Override
    public void ajouter(Ouvrage o) {
        
        biblioList.add(o);
    }



    @Override
    //recherche par cote avec linkedlist, si trouvé dire trouvé dire trouvé avec sa position dans la liste et retourner l'objet, si non trouvé dire non trouvé et retourner null
    public Ouvrage recherche(int cote) {
        for (int i = 0; i < biblioList.size(); i++) {
            if (biblioList.get(i).getCote() == cote) {
                //afficher la position de l'ouvrage dans la liste et dire trouvé tous les informations de l'ouvrage tel que titre, auteur, cote, éditeur
                System.out.println("L'ouvrage avec la cote " + biblioList.get(i).getCote() + " a été trouvé à la position " + i + " dans la liste" + "\n" + biblioList.get(i)); 
                return biblioList.get(i);
            }
        }
        for (Ouvrage ouvrage : biblioList) {
            if (ouvrage.getCote() == cote) {
                System.out.println("Found");
                return ouvrage;
            }
        }
        System.out.println("Not found");
        return null;
    }

    //@Override
    //public Ouvrage supprimer(Ouvrage o) {
    //    // recherche par cote avec linkedlist, si trouvé dire trouvé et supprimer l'objet, si non trouvé dire non trouvé et retourner null
    //    for (Ouvrage ouvrage : biblioList) {
    //        if (ouvrage.getCote() == o.getCote()) {
    //            System.out.println("Found and book with cote " + ouvrage + " has been deleted");
    //            biblioList.remove(ouvrage);
    //            return ouvrage;
    //        }
    //    }
    //    System.out.println("Not found");
    //    return null;
    //}

    @Override
    public Ouvrage supprime(int cote) {
        // recherche par cote avec linkedlist, si trouvé dire trouvé et supprimer l'objet, si non trouvé dire non trouvé et retourner null
        for (Ouvrage ouvrage : biblioList) {
            if (ouvrage.getCote() == cote) {
                System.out.println("Found and book with cote " + ouvrage + " has been deleted");
                biblioList.remove(ouvrage);
                return ouvrage;
            }
        }
        System.out.println("Not found");
        return null;
    }

    @Override
    public String toString() {
        //retur each book in the list one by one on a new lineand the total number of books in the list
        String str = "";
        for (Ouvrage ouvrage : biblioList) {
            if (ouvrage != null) {
                str += ouvrage + "\n\n" ;
            }
        }
        System.out.println("Total number of books in the list: " + biblioList.size() + "\n");
        return str;
    }
    
   
    
}
