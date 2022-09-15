import java.io.*;

public class RechercheSeq {

	
	public void methode1() {
		int i = 1;
		int j = 0;
		try {
		i = i / j;
		} catch(ArithmeticException e) {
			e.printStackTrace(); // affiche la trace d'exécution
			System.out.println("exception attrapée");
		}
	}
	
	public static void main(String[] args) {
		
		
		
			methode1();
			System.exit(0);

}
