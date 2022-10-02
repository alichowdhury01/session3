public class BiblioListPerso extends Bibliotheque {
    ListChainee listChainee = new ListChainee();

    @Override
    public void ajouter(Ouvrage o) {
        //ajout des livres dans la bibliotheque
        listChainee.add(o);        
    }


    public Ouvrage recherche(int cote) {
        //search a book by cote number and return the book if found or null if not found 
        return listChainee.search(cote);
    }

    public Ouvrage supprime(int cote) {
        //search a book by cote number and delete the book if found or return null if not found 
        return listChainee.delete(cote);
    }

    @Override
    public String toString() {
        // return the list of books in the library with a change line between each book and the total number of books in the library
        System.out.println("\n");
        return listChainee.toString();

    }
    

}