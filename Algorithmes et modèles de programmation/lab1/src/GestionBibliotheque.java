import java.time.LocalDate;

public class GestionBibliotheque {
    public static void main(String[] args) throws Exception {

        //create object of BiblioListPerso
        BiblioListPerso biblioListPerso = new BiblioListPerso();
        
        //create list of livre
        Livre livre1 =  new Livre(1, "Livre1", "Auteur1", LocalDate.of(2019, 1, 1), "t");

        //add livre to the list
        biblioListPerso.ajouter(livre1);

     
    }
}
