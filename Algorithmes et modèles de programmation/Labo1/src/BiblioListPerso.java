
public class BiblioListPerso extends Bibliotheque {

    //create object of listchainee
    ListChainee list = new ListChainee();

    

    // Ajouter un ouvrage
    @Override
    public void ajouter(Ouvrage o) {
        list.insertAtEnd(o);
    }

    // Supprimer un ouvrage à une position donnée
    @Override
    public void supprimer(Ouvrage o) {
        list.deleteFromStart();
    }

    // Rechercher un ouvrage
    @Override
    public void rechercher(Ouvrage o) {
        if (list.head.data.equals(o)) {
            System.out.println("L'ouvrage est dans la bibliothèque");
        } else {
            System.out.println("L'ouvrage n'est pas dans la bibliothèque");
        }
    }

    //toString
    @Override
    public String toString() {
        return "BiblioListPerso [list=" + list + "]";
    }

    

    
    
}
