public class Livre {
    int num;
    String titre;
    int auteur;
    int annee;
    int page;
    String categ;

    public Livre(int num, String titre, int auteur, int annee, int page, String categ) {
        this.num = num;
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.page = page;
        this.categ = categ;
    }

    public int getNum() {
        return num;
    }

    public String getTitre() {
        return titre;
    }

    public int getAuteur() {
        return auteur;
    }

    public int getAnnee() {
        return annee;
    }

    public int getPage() {
        return page;
    }

    public String getCateg() {
        return categ;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(int auteur) {
        this.auteur = auteur;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }
    
}
