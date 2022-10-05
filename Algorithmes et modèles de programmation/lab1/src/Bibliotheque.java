public abstract class Bibliotheque {
    //Abstract Methods
    public abstract void ajouter(Ouvrage o);
    public abstract Ouvrage rechercher(int cote);
    public abstract Ouvrage supprimer(int cote);

    //Abstract toString
    public abstract String toString();


    
}
