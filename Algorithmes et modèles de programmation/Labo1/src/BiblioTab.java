import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class BiblioTab extends Bibliotheque {

    // attributs
    private Ouvrage[] bibliotheque;
    private int nbOuvrages;

    // constructeur
    public BiblioTab() {
        this.bibliotheque = new Ouvrage[20];
        this.nbOuvrages = 0;
    }

    // méthodes abstraites de la classe mère Bibliotheque implémentées dans la classe fille BiblioTab
   

    @Override
    public void ajouter(Ouvrage o) {
        //si la bibliotheque est pleine on affiche un message d'erreur
        if (this.nbOuvrages == this.bibliotheque.length) {
            System.out.println("La bibliothèque est pleine");
        } else {
            //sinon on ajoute l'ouvrage à la bibliotheque
            this.bibliotheque[this.nbOuvrages] = o;
            this.nbOuvrages++;
        }

    }

    @Override
    public void supprimer(Ouvrage o) {
        //on parcourt la bibliotheque
        for (int i = 0; i < this.nbOuvrages; i++) {
            //si l'ouvrage est trouvé
            if (this.bibliotheque[i].equals(o)) {
                //on décale tous les ouvrages suivants
                for (int j = i; j < this.nbOuvrages - 1; j++) {
                    this.bibliotheque[j] = this.bibliotheque[j + 1];
                }
                //on décrémente le nombre d'ouvrages
                this.nbOuvrages--;
                //on sort de la boucle
                break;
            }
        }
    }

    @Override
    public void rechercher(Ouvrage o) {
        //on parcourt la bibliotheque
        for (int i = 0; i < this.nbOuvrages; i++) {
            //si l'ouvrage est trouvé
            if (this.bibliotheque[i].equals(o)) {
                //on affiche l'ouvrage
                System.out.println(this.bibliotheque[i]);
                //on sort de la boucle
                break;
            }
        }
    }

    // méthode pour afficher la bibliothèque
    public void afficher() {
        for (int i = 0; i < this.nbOuvrages; i++) {
            System.out.println(this.bibliotheque[i]);
        }
    }



}
        

