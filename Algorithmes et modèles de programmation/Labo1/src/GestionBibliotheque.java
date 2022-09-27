import java.time.LocalDate;


public class GestionBibliotheque {


    // main method
    public static void main(String[] args) {

        // create object of BiblioListPerso
        BiblioListPerso biblioListPerso = new BiblioListPerso();

        // create object of BiblioList
        BiblioList biblioList = new BiblioList();

        // create object of BiblioTab
        BiblioTab biblioTab = new BiblioTab();

        // create object of Ouvrage
        Ouvrage ouvrage = new Ouvrage(LocalDate.now(), 1, "auteur", "titre") {
        };

        // add ouvrage to biblioListPerso
        biblioListPerso.ajouter(ouvrage);

        // add ouvrage to biblioList
        biblioList.ajouter(ouvrage);

        // add ouvrage to biblioTab
        biblioTab.ajouter(ouvrage);

        // search ouvrage in biblioListPerso
        biblioListPerso.rechercher(ouvrage);

    }
    
}
