// La classe Bibliotheque sera simplement une version abstraite déclarant les mêmes méthodes que BiblioTab mais sans les implémenter.
public abstract class Bibliotheque {
    public abstract void ajouter(Ouvrage o);
    public abstract void supprimer(Ouvrage o);
    public abstract void rechercher(Ouvrage o);

    
}
