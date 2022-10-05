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

        //CD 
        CD cd = new CD("The Dark Side of the Moon", "Pink Floyd", ++cote, LocalDate.of(1973, 3, 1));
        CD cd2 = new CD("Muse", "Muse", ++cote, LocalDate.of(1999, 6, 8));
        CD cd3 = new CD("Marshall Mathers LP", "Eminem", ++cote, LocalDate.of(2000, 5, 23));

        //Add the Livre to the BiblioList
        biblioList.ajouter(livre);
        biblioList.ajouter(livre2);
        biblioList.ajouter(livre3);

        //Add the CD to the BiblioList
        biblioList.ajouter(cd);
        biblioList.ajouter(cd2);
        biblioList.ajouter(cd3);

        //Add periodique
        Periodicite periodicite = new Periodicite("The Economist", 1, "The Economist Group", ++cote, LocalDate.of(2020, 12, 12));
        Periodicite periodicite2 = new Periodicite("The Economist", 2, "The Economist Group", ++cote, LocalDate.of(2020, 12, 12));
        Periodicite periodicite3 = new Periodicite("The Economist", 3, "The Economist Group", ++cote, LocalDate.of(2020, 12, 12));

        //supprimer the Livre in the BiblioList
        //biblioList.supprimer(1);


        //rechercher the Livre in the BiblioList
        //biblioList.rechercher(2);
        //biblioList.rechercher(2);
        //biblioList.rechercher(3);

        

        //biblioList toString method to display the entire BiblioList in a string format with a new line after each ouvrage in the linkedlist 
        biblioList.toString();






      
    }
}

