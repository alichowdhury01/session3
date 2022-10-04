import java.time.LocalDate;

public class GestionBibliotheque {
    public static void main(String[] args) throws Exception {
        

        //creation d'un livre
        Livre livre1 = new Livre("Le petit prince", "Antoine de Saint-Exupéry", "Gallimard", LocalDate.of(1800, 12, 12));
        Livre livre2 = new Livre("Harry Potter", "J.K. Rowling", "Gallimard", LocalDate.of(1999, 9, 9));
        Livre livre3 = new Livre("Le seigneur des anneaux", "J.R.R. Tolkien", "Gallimard", LocalDate.of(2009, 1, 2));
        //creation d'un CD

        //creation d'un periodique

        

        //creation objet BiblioListPerso
        //BiblioListPerso biblioListPerso = new BiblioListPerso();
        BiblioList biblioList = new BiblioList();
        //BiblioTab biblioTab = new BiblioTab();


        //biblioList 
        biblioList.ajouter(livre1);
        biblioList.ajouter(livre2);
        biblioList.ajouter(livre3);
    
        biblioList.recherche(1);
        biblioList.recherche(3);
       
 
        //biblioListPerso.recherche(3);

        //biblioTab
        //biblioTab.ajouter(livre1);
        //biblioTab.ajouter(livre2);

        //biblioTab.recherche(1);
        
        //affichage de bibliolist
        //System.out.println(biblioList.toString());

//
      
    }
}

