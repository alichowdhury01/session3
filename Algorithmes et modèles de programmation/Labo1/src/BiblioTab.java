import java.util.Arrays;

public class BiblioTab extends Bibliotheque {

    // attributs
    private Ouvrage[] bibliotheque; // tableau d'ouvrages
    private int nbOuvrages; // nombre d'ouvrages dans la bibliothèque

    // constructeur
    public BiblioTab() {
        this.bibliotheque = new Ouvrage[20];
        this.nbOuvrages = 0;
    }

    // méthodes abstraites de la classe mère Bibliotheque implémentées dans la classe fille BiblioTab
    // Ajouter un ouvrage
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

    // Supprimer un ouvrage
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

    // Rechercher un ouvrage
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

    //toString
    @Override
    public String toString() {
        return "BiblioTab [bibliotheque=" + Arrays.toString(bibliotheque) + ", nbOuvrages=" + nbOuvrages + "]";
    }



}
        

