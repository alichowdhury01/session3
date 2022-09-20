public class Periodique {
    // Attributs
    private String nom;
    private int numero;
    private String periodicite;

    // Constructeur
    public Periodique(String nom, int numero, String periodicite) {
        this.nom = nom;
        this.numero = numero;
        this.periodicite = periodicite;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public String getPeriodicite() {
        return periodicite;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    // toString
    @Override
    public String toString() {
        return "Periodique{" + "nom=" + nom + ", numero=" + numero + ", periodicite=" + periodicite + '}';
    }
    
}
