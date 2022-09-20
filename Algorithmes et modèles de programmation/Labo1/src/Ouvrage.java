public class Ouvrage {
    // Attribut
    private String date;
    private int cote;

    // Constructeur
    public Ouvrage(String date, int cote) {
        this.date = date;
        this.cote = cote;
        cote++;
    }

    // Getters
    public String getDate() {
        return date;
    }

    public int getCote() {
        return cote;
    }

    // Setters
    public void setDate(String date) {
        this.date = date;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

    //toString
    @Override
    public String toString() {
        return "Ouvrage{" + "date=" + date + ", cote=" + cote + '}';
    }

    
}
