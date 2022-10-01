public class Livre {
    private int num;
    private String titre;
    private int pages;

    Livre(){
        this.num = 0;
        this.titre = "";
        this.pages =0;
    }

    Livre(int  num, String titre, int pages){
        this.num = num;
        this.titre = titre;
        this.pages = pages;
    }

    public int getNum(){
        return this.num;
    }
    public String getTitre(){
        return this.titre;
    }
    public int getPages(){
        return this.pages;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void setTitre(String titre){
        this.titre = titre;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    @Override
    public String toString(){
        String rep = "\nNUMÉRO = "+this.num;
        rep+="\nTITRE = "+this.titre;
        rep+="\nPAGES = "+this.pages;
        rep+="\n********************************";
        return rep;
    }
}

