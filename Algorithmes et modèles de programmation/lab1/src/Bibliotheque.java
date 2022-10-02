public abstract class Bibliotheque {
    //Abstract Methods
    public abstract void ajouter(Ouvrage o);
    public abstract Ouvrage recherche(int cote);
    public abstract Ouvrage supprime(int cote);

    //Abstract toString
    public abstract String toString();


    
}
