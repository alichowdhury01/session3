public class GestionLivres {
    static ListeChaineeLivres listeLivres;
    public static void main(String[] args) throws Exception {
        listeLivres = new ListeChaineeLivres();
        Livre unLivre1 = new Livre(100,"Un bon livre", 250);
        Livre unLivre2 = new Livre(200,"Tour du soleil", 250);
        Livre unLivre3 = new Livre(300,"Le langage Java", 250);
        listeLivres.ajouter(unLivre1);
        listeLivres.ajouter(unLivre2);
        listeLivres.ajouter(unLivre3);
        Livre L1 = (Livre) listeLivres.rechercher(unLivre1).infos;
        System.out.println("\n**** INFOS DU unLivre1 ****");
        System.out.println(L1);
        System.out.println("\n**** LISTE DES LIVRES ****");
        listeLivres.afficher();
        System.out.println("\n**** ENLEVER LE unLivre1 ****");

        listeLivres.supprimer(unLivre2);
        System.out.println("\n**** LISTE DES LIVRES ****");
        listeLivres.afficher();
        System.out.println("\n**** Modifier le titre du livre unLivre3 ****");
        listeLivres.modifierTitre(unLivre3, "Espérons que cela puisse fonctionner!");
        System.out.println("\n**** LISTE DES LIVRES ****");
        listeLivres.afficher();
        System.out.println("\n**** Chercher par numéro ****");
        Livre leLivre = listeLivres.chercherLivreParNumero(300);
        if(leLivre == null){
            System.out.println("Le livre est introuvable");
        } else {
            System.out.println(leLivre);
        }

    }
}