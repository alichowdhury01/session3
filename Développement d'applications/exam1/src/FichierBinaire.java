import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

import java.util.Set;
import java.util.TreeSet;

import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class FichierBinaire {
	// attribut fichier
	BufferedReader tmpReadTexte;   
    public static RandomAccessFile fichierBin;
    BufferedReader clavier;
	String ligne="";
	
	//attribut fichier
	JFrame frame;
	JFileChooser fileChooser = new JFileChooser();
    
    //attribut Recherche Fichier Binaire
	static Set<IndexNoeud> tableIndexSet = new TreeSet<IndexNoeud>();
	TreeSet<String> categorieList = new TreeSet<String>();
	TreeSet<String> fabriquantList = new TreeSet<String>();
    TreeSet<Integer> numList = new TreeSet<Integer>();
	

	
	FichierBinaire() {
	}
	
	public void ecrireDansFichierBinaire(){
        String elems[] = new String[5];
        int num;
        String fabriquant, modele, option;
        float prix;
        
        try{
            // GUI file chooser
            fileChooser = new JFileChooser("./src/donnees");
            fileChooser.showOpenDialog(frame);
            File fichier = fileChooser.getSelectedFile();
            tmpReadTexte = new BufferedReader(new FileReader(fichier, StandardCharsets.UTF_8));
        
            fichierBin = new RandomAccessFile("./src/donnees/livres.bin", "rw");
            String ligne = tmpReadTexte.readLine();
            while(ligne != null ){
                elems = ligne.split(";");
                
                Long debut = fichierBin.getFilePointer();
                
                num = Integer.parseInt(elems[0]);
                fabriquant = elems[1];
                modele = elems[2];
                option = elems[3];
                prix = Float.parseFloat(elems[4]);
                
                // Écrire dans le ficher bin
                fichierBin.writeInt(num);
                fichierBin.writeUTF(fabriquant);
                fichierBin.writeUTF(modele);
                fichierBin.writeUTF(option);
                fichierBin.writeFloat(prix);
                
                Long fin = fichierBin.getFilePointer();
                int octets = (int) (fin - debut);
                //Creation des listes
                IndexNoeud noeudTMP = new IndexNoeud(num,debut,fabriquant, octets, false);
                tableIndexSet.add(noeudTMP);
                categorieList.add(elems[3]);
                fabriquantList.add(fabriquant);
                numList.add(num);                
                //Ligne suivante
                ligne = tmpReadTexte.readLine();
            }
            tmpReadTexte.close();

	    }catch(Exception e){
	        System.out.println("Gros probléme! " + e.getMessage());
	    }
    }	
}