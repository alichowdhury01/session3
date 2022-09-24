import java.util.LinkedList;

public class BiblioList extends Bibliotheque {

    LinkedList<Ouvrage> bibliotheque = new LinkedList<Ouvrage>();

    // Ajouter un ouvrage
    @Override
    public void ajouter(Ouvrage o) {
        bibliotheque.add(o);
    }

    // Supprimer un ouvrage
    @Override
    public void supprimer(Ouvrage o) {
        bibliotheque.remove(o);
    }

    // Rechercher un ouvrage
    @Override
    public void rechercher(Ouvrage o) {
        if (bibliotheque.contains(o)) {
            System.out.println("L'ouvrage est dans la bibliothèque");
        } else {
            System.out.println("L'ouvrage n'est pas dans la bibliothèque");
        }
    }

    // Afficher la bibliothèque
    public void afficher() {
        for (Ouvrage o : bibliotheque) {
            System.out.println(o);
        }
    }

    

}
