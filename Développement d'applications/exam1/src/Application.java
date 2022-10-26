//La function modifieer option ne fonctionne pas correctement. Elle modifie dans le fichier binaire, mais cré un doublon dans la jtable

import java.awt.*;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Set;

import javax.swing.*;

public class Application {	
	
	static AppFrame appFrame = new AppFrame();
	static FichierBinaire fichierBinaire = new FichierBinaire();
    static RandomAccessFile fichierBin;
    static long adresseFichierBinaire = 0;
	static String[] columnNames = {"Numéro", "Fabriquant", "Modèle", "Option", "Prix"};
	
	static JComboBox deroulCateg;
	static JComboBox deroulNum;
	static JComboBox deroulAuteur;
	
	
	static JPanel basBasRP = new JPanel();
	static JButton modifierTitre = new JButton("Modifier le titre");
	static JButton supprimer = new JButton("Supprimer");
	static JButton afficherTous = new JButton("Afficher tous");
	static JLabel intro = new JLabel();

	

	//---------------------------- DESSINER FRAME -------------------------------------------------
	
	
	
	public static void choisirFichier() {
		
		JTextArea bienvenue = new JTextArea(" Bienvenue dans \n votre bibliothèque!\n");
        bienvenue.setFont(new Font("Comic Sans", Font.BOLD | Font.ITALIC,22));
        bienvenue.setForeground(appFrame.couleurTop);
        bienvenue.setBackground(appFrame.couleurBarreGauche);
        String texteIntrodution = " Instruction : \n\n"
                + " - Choisissez une bibliotheque\n "
                + "  a importer en cliquant sur le\n"
                + "   bouton 'Importer une \n "
                + "  bibliothèque' \n\n";
        JTextArea instruction = new JTextArea(texteIntrodution);
        instruction.setFont(new Font("Arial", Font.PLAIN, 15));
        instruction.setForeground(appFrame.couleurTop);
        instruction.setBackground(appFrame.couleurBarreGauche);
       
        
        appFrame.leftPanel.add(bienvenue, BorderLayout.NORTH);
        appFrame.leftPanel.add(instruction);
        
		JButton importerFichier = new JButton("Importer une bibliotheque");
		importerFichier.setFocusable(false);
		importerFichier.setPreferredSize(new Dimension(200,100));
		importerFichier.addActionListener(e -> {
			fichierBinaire.ecrireDansFichierBinaire();
			fichierBin = fichierBinaire.fichierBin;
			deroulCateg = creerListeDeroulante(fichierBinaire.categorieList, "une catégorie");
			deroulNum = creerListeDeroulante(fichierBinaire.numList, "un numéro");
			deroulAuteur = creerListeDeroulante(fichierBinaire.fabriquantList, "un auteur");
			appFrame.leftPanel.removeAll();
			dessinerFrameApresImportation();
		});
		
		appFrame.millieuRP.add(importerFichier);
		
		appFrame.majFrame();
		
	}
	
	public static void dessinerFrameApresImportation() {
		JTextArea bienvenue = new JTextArea(" Bienvenue dans \n votre bibliothèque!\n");
		bienvenue.setFont(new Font("Comic Sans", Font.BOLD | Font.ITALIC,22));
		bienvenue.setForeground(appFrame.couleurTop);
		bienvenue.setBackground(appFrame.couleurBarreGauche);
		String texteInstruction = " Instruction : \n\n"
				+ " - Pour ajouter un ouvrage,\n "
				+ "   cliquez sur le bouton se\n"
				+ "   situant en haut à droite de\n "
				+ "   la liste d'ouvrages.\n\n"
				+ " - Pour trier la liste d'ouvrages,\n"
				+ "   utilisez les barres déroulantes\n"
				+ "   en bas à droite.\n\n"
				+ " - Pour modifier le titre ou \n"
				+ "   supprimer un ouvrage,\n"
				+ "   selectionnez tout d'abbord le\n "
				+ "   numéro du livre désiré.\n\n"
				+ "           Bonne navigation! ";
		JTextArea instruction = new JTextArea(texteInstruction);
		instruction.setFont(new Font("Arial", Font.PLAIN, 15));
		instruction.setForeground(appFrame.couleurTop);
		instruction.setBackground(appFrame.couleurBarreGauche);
		
		ImageIcon fleche = new ImageIcon("./src/img/fleche.png");
		Image image1 = fleche.getImage(); // transform it 
		Image newimg1 = image1.getScaledInstance(140, 140,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		fleche = new ImageIcon(newimg1);
		JLabel imageContainer = new JLabel(fleche);
		
		appFrame.leftPanel.add(bienvenue, BorderLayout.NORTH);
		appFrame.leftPanel.add(instruction);
		appFrame.leftPanel.add(imageContainer, BorderLayout.SOUTH);
		
		appFrame.clearRightPanel();
		appFrame.majFrame();
		
		
		
		intro.setText("  Liste des ouvrages");
		intro.setFont(new Font("Comic Sans", Font.ITALIC | Font.BOLD,20));
		intro.setHorizontalAlignment(JLabel.LEFT);
		intro.setVerticalAlignment(JLabel.CENTER);
		appFrame.hautRP.add(intro,BorderLayout.WEST );
		
		ImageIcon ajout = new ImageIcon("./src/img/ajoutIcone.png");
		Image image2 = ajout.getImage(); // transform it 
		Image newimg2 = image2.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ajout = new ImageIcon(newimg2);
		JLabel ajoutContainer = new JLabel(ajout);
		
		JButton ajouterOuvrage = new JButton("         Ajouter un livre");
		ajouterOuvrage.setFont(new Font("Comic Sans", Font.PLAIN,15));
		ajouterOuvrage.setHorizontalTextPosition(JButton.RIGHT);
		ajouterOuvrage.setFocusable(false);
		ajouterOuvrage.add(ajoutContainer, FlowLayout.LEFT);
		
		appFrame.leftHautRP.add(ajouterOuvrage, BorderLayout.CENTER);
		ajouterOuvrage.addActionListener(a -> {
			ajouterLivre();
		});
		appFrame.majFrame();		
		
		
		afficherParNumero();
		
		
		afficherTous.setPreferredSize(new Dimension(180,30));
		afficherTous.setFocusable(false);
		afficherTous.addActionListener(e -> {
			deroulNum.setSelectedIndex(0);
			deroulAuteur.setSelectedIndex(0);
			deroulCateg.setSelectedIndex(0);
			listerLesLivres();
		});
		
		appFrame.millieuBasRP.add(afficherTous);
		
		// -------------- SOUS-PANEAU basRP -----------------------------
        // --------- haut ----------------
        appFrame.hautBasRP.setBackground(new Color(0xEBEAEC));
        appFrame.hautBasRP.setLayout(new BorderLayout());
        appFrame.hautBasRP.setPreferredSize(new Dimension(745,40));  
        appFrame.basRP.add(appFrame.hautBasRP, BorderLayout.NORTH);

        JLabel trier = new JLabel("Trier par");
        trier.setFont(new Font("Comic Sans", Font.BOLD | Font.ITALIC, 20));
        trier.setHorizontalAlignment(JLabel.CENTER);
        appFrame.hautBasRP.add(trier);

        // --------- millieu ---------------    
        appFrame.millieuBasRP.setBackground(new Color(0xEBEAEC));
        appFrame.millieuBasRP.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 0));
        appFrame.millieuBasRP.setPreferredSize(new Dimension(745,30));
        appFrame.basRP.add(appFrame.millieuBasRP, BorderLayout.CENTER);

        // ---------- bas ------------------
		basBasRP.setBackground(new Color(0xEBEAEC));
		basBasRP.setLayout(null);
		basBasRP.setPreferredSize(new Dimension(745,70));   
        appFrame.basRP.add(basBasRP, BorderLayout.SOUTH);
		
		listerLesLivres();
		
		appFrame.majFrame();

	}
	
	//---------------------------- UTILITAIRES -------------------------------------------------

	
	public static <T> JComboBox creerListeDeroulante(Set<T> list, String option) {
		JComboBox deroul = new JComboBox();
		//deroul set height and width to default
		deroul.setPreferredSize(new Dimension(180,30));
		deroul.addItem("Choisissez " + option);
		for (T categorie : list) {
			deroul.addItem(categorie);
		}
		return deroul;
	}
	
	public static Object[][] peuplerTable() {
		appFrame.clearRightPanel();
		
		Object[][] data = new Object[FichierBinaire.tableIndexSet.size()][6];
		int vecteur = 0;
		for (IndexNoeud noeud : FichierBinaire.tableIndexSet) {
			if (!noeud.isDeleted()) {
				try {

							int adr = noeud.getAdr();
							fichierBin.seek(adr);
							data[vecteur][0] = fichierBin.readInt();
                            data[vecteur][1] = fichierBin.readUTF();
                            data[vecteur][2] = fichierBin.readUTF();
                            data[vecteur][3] = fichierBin.readUTF();
                            data[vecteur][4] = fichierBin.readFloat() + " $";
							vecteur++;
						} catch (IOException e) {
							System.out.println("Une erreur c'est produite lors de la création de la JTable" + e.getMessage());
							e.printStackTrace();
						}
			}
		}
		return data;
	}
	
	
	public static boolean verifierNumExistant(int num) {
		Boolean exist = false;
		for (IndexNoeud radio : fichierBinaire.tableIndexSet) {
			if (num == radio.getNum() && radio.isDeleted() == false) {
				exist = true;
			}
		}
		
		return exist;
	}
	
	
	//----------------------------- Lister les livres -------------------------------------------------
	
	public static void listerLesLivres() {		
		
		MyTable table = new MyTable(peuplerTable(), columnNames);

		table.setAdjustableSizeTable(table);
		appFrame.millieuRP.add(table.scrollPane);
		
		appFrame.majFrame();
	}
	

	
	
	//---------------------------- Recherche par numero -------------------------------------------------
	
	public static void afficherParNumero() {
		
		appFrame.clearRightPanel();
		

		deroulNum.addActionListener(e -> {
			Object choixUser = deroulNum.getSelectedItem();



			if (deroulNum.getSelectedIndex() == 0) {
				listerLesLivres();
				basBasRP.removeAll();
				appFrame.majFrame();
			}
			else{
                //when user choose an option in the jcombobox, the index selected must stay the same 
           
				
				appFrame.clearRightPanel();
				
				

				Object[][] data = new Object[FichierBinaire.tableIndexSet.size()][5];
				int vecteur = 0;
				

				for (IndexNoeud noeud : FichierBinaire.tableIndexSet) {
					if(!noeud.isDeleted()) {
						try {
							int adr = noeud.getAdr();
							fichierBin.seek(adr);					
							int num = fichierBin.readInt();
							String fabriquant = fichierBin.readUTF();
                            String modele = fichierBin.readUTF();
                            String option = fichierBin.readUTF();
                            float prix = fichierBin.readFloat();

                            if ((int)num == (int)choixUser) {
                                data[vecteur][0] = num;
                                data[vecteur][1] = fabriquant;
                                data[vecteur][2] = modele;
                                data[vecteur][3] = option;
                                data[vecteur][4] = prix + " $";
                                vecteur++;
								adresseFichierBinaire = adr;
								break;
							}
						} catch (IOException e1) {
							System.out.println("Une erreur c'est produite lors de la création de la JTable" + e1.getMessage());
							e1.printStackTrace();
						}
					}
				}
				MyTable table = new MyTable(data, columnNames);
				appFrame.millieuRP.add(table.scrollPane);
				table.setAdjustableSizeTable(table);

				modifierTitre.setBounds(42, 0, 180, 30);
				supprimer.setBounds(42, 34, 180, 30);
				basBasRP.add(supprimer);
				basBasRP.add(modifierTitre);
				modifierTitre();
				
				
				
				basBasRP.add(supprimer);
				supprimer.addActionListener(a -> suppression());

				appFrame.majFrame();
			}		
		});
		
		
		appFrame.millieuBasRP.add(deroulNum);
		appFrame.majFrame();
	}
	
	
	
	//---------------------------- Modifier Titre ------------------------------------------------
    public static void modifierTitre()  {
		IndexNoeud noeudTMP = new IndexNoeud();
		
		modifierTitre.addActionListener(e -> {
			

		
			JButton valider = new JButton("Valider");
			valider.setBounds(732, 0, 180, 30);
			basBasRP.add(valider);
		
			
			appFrame.majFrame();
			valider.addActionListener(f -> {
			
				
				
				for (IndexNoeud noeud : FichierBinaire.tableIndexSet) {
					int choixUser = (int) deroulNum.getSelectedItem();
					if (noeud.getNum() ==  choixUser) {
						try {
						
 
                            fichierBin.seek(noeud.getAdr());
                            int num = fichierBin.readInt();
                            String fabriquant = fichierBin.readUTF();
                            String modele = fichierBin.readUTF();
                            String option = fichierBin.readUTF();
                            float prix = fichierBin.readFloat();

                            int optionInt = Integer.parseInt(option);
                            if (optionInt == 111) {
                                option = "111";
                            } else {
                                if (optionInt == 110) {
                                    option = "111";
                                    fichierBin.seek(noeud.getAdr());
                            fichierBin.writeInt(num);
                            fichierBin.writeUTF(fabriquant);
                            fichierBin.writeUTF(modele);
                            
                            fichierBin.writeUTF(option);
                            fichierBin.writeFloat(prix);
                                } else {
                                    if (optionInt == 101) {
                                        option = "111";
                                        fichierBin.seek(noeud.getAdr());
                            fichierBin.writeInt(num);
                            fichierBin.writeUTF(fabriquant);
                            fichierBin.writeUTF(modele);
                            
                            fichierBin.writeUTF(option);
                            fichierBin.writeFloat(prix);
                                    } else {
                                        if (optionInt == 011) {
                                            option = "111";
                                            fichierBin.seek(noeud.getAdr());
                            fichierBin.writeInt(num);
                            fichierBin.writeUTF(fabriquant);
                            fichierBin.writeUTF(modele);
                            
                            fichierBin.writeUTF(option);
                            fichierBin.writeFloat(prix);
                                        } else {
                                            if (optionInt == 100) {
                                                option = "101";
                                                fichierBin.seek(noeud.getAdr());
                            fichierBin.writeInt(num);
                            fichierBin.writeUTF(fabriquant);
                            fichierBin.writeUTF(modele);
                            
                            fichierBin.writeUTF(option);
                            fichierBin.writeFloat(prix);
                                            } else {
                                                if (optionInt == 010) {
                                                    option = "011";
                                                    fichierBin.seek(noeud.getAdr());
                            fichierBin.writeInt(num);
                            fichierBin.writeUTF(fabriquant);
                            fichierBin.writeUTF(modele);
                            
                            fichierBin.writeUTF(option);
                            fichierBin.writeFloat(prix);
                                                } else {
                                                    if (optionInt == 001) {
                                                        option = "101";
                                                        fichierBin.seek(noeud.getAdr());
                            fichierBin.writeInt(num);
                            fichierBin.writeUTF(fabriquant);
                            fichierBin.writeUTF(modele);
                            
                            fichierBin.writeUTF(option);
                            fichierBin.writeFloat(prix);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            fichierBin.seek(noeud.getAdr());
                            fichierBin.writeInt(num);
                            fichierBin.writeUTF(fabriquant);
                            fichierBin.writeUTF(modele);
                            
                            fichierBin.writeUTF(option);
                            fichierBin.writeFloat(prix);

                            
                           
                    
                            
                            
                            break;
			                
						} catch (IOException e1) {
							System.out.println("Une erreur c'est produite lors de la création de la JTable" + e1.getMessage());
							e1.printStackTrace();
						}
					}
				}
				FichierBinaire.tableIndexSet.add(noeudTMP);
				appFrame.clearRightPanel();
				listerLesLivres();
                deroulNum.setSelectedIndex(0);
				appFrame.majFrame();
			});
		});
		
	}
	
	
	//----------------------------- Supprimer Livre ----------------------------------------------
	
	public static void suppression(){
		
		for (IndexNoeud noeud : FichierBinaire.tableIndexSet) {
			Object choixUser = deroulNum.getSelectedItem();
			try {
				if (noeud.getNum() == (int) choixUser) {
					noeud.setDeleted(true);
					noeud.setNum(-1);
					deroulNum.removeItem(choixUser);
					break;
				}
			} catch (Exception e) {
				break;
			}

		}
		
	
        deroulNum.setSelectedIndex(0);
		appFrame.millieuRP.removeAll();
        listerLesLivres();
		appFrame.majFrame();
	}
	
	//----------------------------- Ajouter Livre ----------------------------------------------
	public static void ajouterLivre() {
			
		appFrame.clearRightPanel();

			
		//ajouter un livre dans le fichier binaire et dans la table d'index 
		appFrame.millieuRP.add(new JLabel("Numéro l'appareil : "));
		JTextField numRadio = new JTextField(10);
		appFrame.millieuRP.add(numRadio);
		appFrame.millieuRP.add(new JLabel("Nom de la marque : "));
		JTextField nomMarque = new JTextField(10);
		appFrame.millieuRP.add(nomMarque);
		appFrame.millieuRP.add(new JLabel("Modèle : "));
		JTextField nomModele = new JTextField(10);
		appFrame.millieuRP.add(nomModele);
		appFrame.millieuRP.add(new JLabel("Options : "));
		JTextField typeOption = new JTextField(10);
		appFrame.millieuRP.add(typeOption);
		appFrame.millieuRP.add(new JLabel("Prix : "));
		JTextField prixRadio = new JTextField(10);
		appFrame.millieuRP.add(prixRadio);
	
        

		JButton ajouter = new JButton("Ajouter et sauvegarder");

		
		appFrame.millieuRP.add(ajouter);

		ajouter.addActionListener(a -> {
			try {
				int num = Integer.parseInt(numRadio.getText());
				String fabriquant = nomMarque.getText();
				String modele = nomModele.getText();
                String option = typeOption.getText();
                float prix = Float.parseFloat(prixRadio.getText());

                int debut = (int) fichierBin.length();
				
				Boolean exist = verifierNumExistant(num);
				
				if(exist == false) {
					
					
					fichierBin.seek(debut);
					
					fichierBin.writeInt(num);
					fichierBin.writeUTF(fabriquant);
                    fichierBin.writeUTF(modele);
                    fichierBin.writeUTF(option);
                    fichierBin.writeFloat(prix);
					int octets =((int) fichierBin.getFilePointer() - debut);
					IndexNoeud noeudTMP = new IndexNoeud(num,debut, fabriquant, octets, false);
					FichierBinaire.tableIndexSet.add(noeudTMP);
					
					fichierBinaire.numList.add(num);
					fichierBinaire.categorieList.add(modele);
					fichierBinaire.fabriquantList.add(fabriquant);
					
                    deroulNum = creerListeDeroulante(fichierBinaire.numList, "un numéro");
					afficherParNumero();
				
					appFrame.millieuBasRP.removeAll();
		        	appFrame.millieuBasRP.add(deroulNum);
		      
		        	appFrame.millieuBasRP.add(afficherTous);
		        	listerLesLivres();
		        	appFrame.majFrame();
		        	
				} else {
					JLabel existeDeja = new JLabel("*** Le numéro de l'appareil existe déjà. Modifiez le numéro! ***");
					existeDeja.setForeground(Color.red);
					existeDeja.setFont(new Font("Comic Sans", Font.BOLD | Font.ITALIC,18));
					appFrame.millieuRP.add(existeDeja);
					appFrame.majFrame();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		});
			
		appFrame.majFrame();
	}
	
	
	
	// ------------------------------------------------------- MAIN -----------------------------------------------------------------------
	public static void main(String[] args) {
		
		// --------------------------------------------------- BOUTTONS -------------------------------------------------------
		
		choisirFichier();
		
	}
}