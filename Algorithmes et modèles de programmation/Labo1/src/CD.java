import java.time.LocalDate;

public class CD extends Ouvrage {

    // Constructeur
    CD() {}

    CD(String titre, String auteur, LocalDate dateEmprunt, int cote) {
        super(dateEmprunt, cote, auteur, titre);
    
    }

    // Getters
    public String getTitre() {
        return super.getTitre();
    }

    public String getAuteur() {
        return super.getAuteur();
    }

    // Setters
    public void setTitre(String titre) {
        super.setTitre(titre);
    }

    public void setAuteur(String auteur) {
        super.setAuteur(auteur);
    }

    // toString 
    @Override
    public String toString() {
        return "CD{" + super.toString() + '}';
    }

}
