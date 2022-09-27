import java.time.LocalDate;

// La classe Bibliotheque sera simplement une version abstraite déclarant les mêmes méthodes que BiblioTab mais sans les implémenter.
public abstract class Bibliotheque {
    // abstract methods ajouter, supprimer, rechercher
    public abstract void ajouter(Ouvrage o);

    public abstract void supprimer(Ouvrage o);

    public abstract void rechercher(Ouvrage o);


    
}
