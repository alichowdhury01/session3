import java.util.LinkedList;

public class BiblioTab extends Bibliotheque {

    static LinkedList<Ouvrage> biblio;
    
   // class BiblioTab utilisera un tableau de longueur suffisante 20
    public BiblioTab() {
        biblio = new LinkedList<>();
    }
    
    // ajouter un ouvrage dans la bibliotheque
    @Override
    public void ajouter(Ouvrage o) {
        biblio.add(o);
    }
    
    // supprimer un ouvrage de la bibliotheque
    @Override
    public void supprimer(Ouvrage o) {
        biblio.remove(o);
    }
    
    // afficher les ouvrages de la bibliotheque
    @Override
    public void afficher() {
        for (Ouvrage ouvrage : biblio) {
            System.out.println(ouvrage);
        }
    }
    
    // afficher les ouvrages d'un auteur
    @Override
    public void afficher(String auteur) {
        for (Ouvrage ouvrage : biblio) {
            if (ouvrage instanceof Livre) {
                if (((Livre) ouvrage).getAuteur().equals(auteur)) {
                    System.out.println(ouvrage);
                }
            }
        }
    }
    
    // afficher les ouvrages d'un editeur
    @Override
    public void afficherEditeur(String editeur) {
        for (Ouvrage ouvrage : biblio) {
            if (ouvrage instanceof Livre) {
                if (((Livre) ouvrage).getEditeur().equals(editeur)) {
                    System.out.println(ouvrage);
                }
            }
        }
    }
    
    // afficher les ouvrages d'un titre
    @Override
    public void afficherTitre(String titre) {
        for (Ouvrage ouvrage : biblio) {
            if (ouvrage instanceof Livre) {
                if (((Livre) ouvrage).getTitre().equals(titre)) {
                    System.out.println(ouvrage);
                }
            }
        }
    }
    
    // afficher les ouvrages d'un titre et d'un auteur
    @Override
    public void afficher(String titre, String auteur) {
        for (Ouvrage ouvrage : biblio) {
            if (ouvrage instanceof Livre) {
                if (((Livre) ouvrage).getTitre().equals(titre) && ((Livre )ouvrage).getAuteur().equals(auteur)) {
                    System.out.println(ouvrage);
                }
            }
        }
    }




}
