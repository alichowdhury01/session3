public class ListChainee {

    // Attributs
    private Ouvrage ouvrage;
    private ListChainee suivant;

    // Constructeur
    public ListChainee() {
        this.ouvrage = null;
        this.suivant = null;
    }

    // Getters
    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public ListChainee getSuivant() {
        return suivant;
    }

    // Setters
    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    public void setSuivant(ListChainee suivant) {
        this.suivant = suivant;
    }

    // toString
    @Override
    public String toString() {
        return "ListChainee{" + "ouvrage=" + ouvrage + ", suivant=" + suivant + '}';
    }

    // add, remove, recherche big O(n)
    public void add(Ouvrage o) {
        if (this.ouvrage == null) {
            this.ouvrage = o;
        } else {
            if (this.suivant == null) {
                this.suivant = new ListChainee();
            }
            this.suivant.add(o);
        }
    }

    public void remove(Ouvrage o) {
        if (this.ouvrage == o) {
            this.ouvrage = this.suivant.ouvrage;
            this.suivant = this.suivant.suivant;
        } else {
            if (this.suivant != null) {
                this.suivant.remove(o);
            }
        }
    }

    public Ouvrage recherche(int cote) {
        if (this.ouvrage.getCote() == cote) {
            return this.ouvrage;
        } else {
            if (this.suivant != null) {
                return this.suivant.recherche(cote);
            }
        }
        return null;
    }

    
    
}
