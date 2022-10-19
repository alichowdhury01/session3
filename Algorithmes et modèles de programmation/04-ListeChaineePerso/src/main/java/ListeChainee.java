public class ListeChainee implements IlisteChainee {
    Noeud tete;
    Noeud queue;
    int taille;

    ListeChainee(){
        this.tete = null;
        this.queue = null;
        this.taille = 0;
    }
@Override
    public void ajouter(Object obj) {
        Noeud unNoeud = new Noeud(obj);
        if(this.tete == null){// Liste vide
            this.tete = unNoeud;
            this.queue = unNoeud;
        }else {
            this.queue.suiv = unNoeud;
            unNoeud.prec = this.queue;
            this.queue = unNoeud;
        }
        this.taille++;
    }

@Override
    public Noeud rechercher(Object obj){
        Noeud pt = tete;
        while(pt != null){
            if(pt.infos == obj){
                return pt;// Pour sortir de la boucle
            }else {
                pt = pt.suiv;
            }
        }
        return pt;
    }
@Override
    public void supprimer(Object obj){
        Noeud posObj = rechercher(obj);
       
        if(posObj == null){
            System.out.println("Objet introuvable");
        } else if(posObj == this.tete){// Cas si on supprime le premier noeud
            this.tete = this.tete.suiv;
        }else if(posObj == this.queue){// Cas où on supprime le dernier noeud
            posObj.prec.suiv = posObj.suiv;
        }else {// Cas où on supprime un élément autre que le premier ou dernier noeud
            posObj.prec.suiv = posObj.suiv;
            posObj.suiv.prec = posObj.prec;
        }
        this.taille--;
    }

@Override
    public void afficher(){
        Noeud pt = this.tete; 
        while(pt != null){
            System.out.println(pt.infos);
            pt = pt.suiv;
        }
    }
}
