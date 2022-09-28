public abstract class Bibliotheque {
    //Abstract Methods
    public abstract void ajouter(Ouvrage o);
    public abstract Ouvrage rechercher(int cote);
    public abstract void supprimer(int cote);
    public abstract Ouvrage supprimerr(Ouvrage o);
    public abstract void rechercherr(Ouvrage o);

    //Abstract toString
    public abstract String toString();


    
}
