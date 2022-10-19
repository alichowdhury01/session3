public class Noeud {
    Object infos;
    Noeud suiv;
    Noeud prec;

    Noeud(){
        this.infos = null;
        this.suiv = null;
        this.prec = null;
    }
    Noeud(Object infos) {
        this.infos = infos;
        this.suiv = null;
        this.prec = null;
    }
}