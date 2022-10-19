public class ListeChaineeLivres extends ListeChainee {
    ListeChaineeLivres(){
        super();
    }

    public void modifierTitre(Livre leLivre, String titre){
        Noeud pt = GestionLivres.listeLivres.rechercher(leLivre);
        if(pt == null){
            System.out.println("\nLivre inexistant!");
        }else {
          ((Livre)  pt.infos).setTitre(titre);
        }
    }

    public Livre chercherLivreParNumero(int numTrouver){
        ListeChaineeLivres listeLivres = GestionLivres.listeLivres;
        Noeud pt = listeLivres.tete;
        boolean trouve = false;
        while(pt != null && !trouve){
            if(((Livre)  pt.infos).getNum() == numTrouver){
                trouve = true;
            } else{
                pt = pt.suiv;
            }
        }
        if (trouve){
            return ((Livre)  pt.infos);
        }else {
            return null;
        }
    }
}
