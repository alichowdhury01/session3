import java.time.LocalDate;

public class GestionBibliotheque {
    public static void main(String[] args) throws Exception {
        // add Ouvrage objects to BiblioList
        BiblioList biblioList = new BiblioList();
        biblioList.ajouter(new CD(1, "titre1", "auteur1", LocalDate.of(2020, 1, 1)));

        // search by cote, if cote is found return cote if not return null
        System.out.println(biblioList.rechercher(99));
    

    }
}
