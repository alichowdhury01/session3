import java.time.LocalDate;

public class GestionBibliotheque {
    public static void main(String[] args) throws Exception {
        

        //creation d'un livre
        Livre livre1 = new Livre("Le petit prince", "Antoine de Saint-Exupéry", "Gallimard", LocalDate.of(2020, 12, 12));
        Livre livre2 = new Livre("Le petit prince", "Antoine de Saint-Exupéry", "Gallimard", LocalDate.of(2020, 12, 12));
        //creation d'un CD

        //creation d'un periodique

        

        //creation objet BiblioListPerso
        BiblioListPerso biblioListPerso = new BiblioListPerso();
        BiblioList biblioList = new BiblioList();
        BiblioTab biblioTab = new BiblioTab();


        //biblioList
        biblioList.ajouter(livre1);
        biblioList.ajouter(livre2);
    
        biblioList.recherche(2);

        //biblioListPerso
        biblioListPerso.ajouter(livre1);
 
        //biblioListPerso.recherche(3);

        //biblioTab
        biblioTab.ajouter(livre1);
        biblioTab.ajouter(livre2);

        //biblioTab.recherche(1);
        
        //affichage de bibliolist
        //System.out.println(biblioList.toString());

//
      
    }
}

