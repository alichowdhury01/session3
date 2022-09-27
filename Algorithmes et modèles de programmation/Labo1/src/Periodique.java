import java.time.LocalDate;

public class Periodique extends Ouvrage {
    // Attributs
    private String nom, periodicite;
    private int numero;

    // Constructeur
    Periodique() {}

    Periodique(String auteur, String titre, String nom, String periodicite, int numero, LocalDate dateEmprunt, int cote) {
        super(dateEmprunt, cote, auteur, titre);
        this.nom = nom;
        this.periodicite = periodicite;
        this.numero = numero;
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
        return "Periodique{" + "nom=" + nom + ", numero=" + numero + ", periodicite=" + periodicite + "}\n" + super.toString();
    }

}
