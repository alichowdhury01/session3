import java.time.LocalDate;

public class GestionBibliotheque {
    public static void main(String[] args) throws Exception {
        int cote = 0;

        //Create a new BiblioList
        BiblioList biblioList = new BiblioList();

        //Create a new Livre
        Livre livre = new Livre("Harry Potter", "J.K. Rowling", "Bloomsbury", ++cote, LocalDate.of(2020, 12, 12));
        Livre livre2 = new Livre("Sapiens", "Yuval Noah Harari", "HarperCollins", ++cote, LocalDate.of(2011, 2, 14));
        Livre livre3 = new Livre("The Alchemist", "Paulo Coelho", "HarperCollins", ++cote, LocalDate.of(1988, 2, 2));


        //Add the Livre to the BiblioList
        biblioList.ajouter(livre);
        biblioList.ajouter(livre2);
        biblioList.ajouter(livre3);

        //supprimer the Livre in the BiblioList
        biblioList.supprimer(1);


        //rechercher the Livre in the BiblioList
        biblioList.rechercher(2);
        //biblioList.rechercher(2);
        //biblioList.rechercher(3);

        

        //biblioList toString method to display the entire BiblioList in a string format with a new line after each ouvrage in the linkedlist 
        //biblioList.toString();






      
    }
}

