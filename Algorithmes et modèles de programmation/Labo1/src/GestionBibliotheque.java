import java.time.LocalDate;
import java.util.Scanner;

public class GestionBibliotheque {

    //fichier text
    final static String FICHIER = "src/donnees/bibliotheque.txt";
    //fichier binaire
    final static String FICHIERB = "src/donnees/bibliotheque.dat";

    //methode creerBibliotheque
    public static Bibliotheque creerBibliotheque() {
        Bibliotheque bibliotheque = new BiblioListPerso();
        return bibliotheque;
    }

    //methode ajouterOuvrage
    public static void ajouterOuvrage(Bibliotheque bibliotheque) {
        Ouvrage o = new Livre("auteur", "titre", "editeur", LocalDate.now(), 1);
        bibliotheque.ajouter(o);
    }

    //methode supprimerOuvrage
    public static void supprimerOuvrage(Bibliotheque bibliotheque) {
        Ouvrage o = new Livre("auteur", "titre", "editeur", LocalDate.now(), 1);
        bibliotheque.supprimer(o);
    }

    //methode rechercherOuvrage
    public static void rechercherOuvrage(Bibliotheque bibliotheque) {
        Ouvrage o = new Livre("auteur", "titre", "editeur", LocalDate.now(), 1);
        bibliotheque.rechercher(o);
    }


    // main method
    public static void main(String[] args) {

        
        // demandé à l'utilisateur de choisir le type de bibliothèque
        Scanner userInput = new Scanner(System.in);
        System.out.println("Veuillez choisir le type de bibliothèque :");
        System.out.println("1 - Liste");
        System.out.println("2 - Tableau");
        System.out.println("3 - Fichier texte");
        System.out.println("4 - Fichier binaire");
        System.out.println("5 - Base de données");
        System.out.println("6 - Quitter");

        // input de l'utilisateur pour le choix de la bibliothèque à utiliser 
        String choix = userInput.nextLine();

        // switch pour le choix de la bibliothèque
    
    }
    
}
