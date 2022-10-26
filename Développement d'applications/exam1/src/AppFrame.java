import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class AppFrame extends JFrame {
	//
	JPanel topPanel = new JPanel();
	JPanel leftPanel = new JPanel();
	JPanel rightPanel = new JPanel();
	
	
	// sous-paneau right panel
	JPanel hautRP = new JPanel();	 	//hautRP = haut Right Panel
	JPanel millieuRP = new JPanel();	//millieuRP = millieu Right Panel
	JPanel basRP = new JPanel(); 		//basRP = bas Right Panel
	
	// sous-paneau hautRP
	JPanel leftHautRP = new JPanel();
	
	//sous-paneau basRP
	JPanel hautBasRP = new JPanel();
	JPanel millieuBasRP = new JPanel();
	
	
	Color couleurTop = new Color(0x323865);
	Color couleurCentre = new Color(0xDCD6F7);
	Color couleurBarreGauche = new Color(0xA6B1E1);
	Color couleurBgFrame = Color.white;
	
	AppFrame(){
		//------------------------------------------------- MAIN FRAME -------------------------------------------------------
		this.setTitle("TMP Inc.");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200, 700);
		this.setLayout(new BorderLayout(5,5));
		//this.setResizable(false);
		this.setVisible(true);	
		this.getContentPane().setBackground(couleurBgFrame);
		
		//------------------------------------------------- MAIN PANELS ------------------------------------------------------
				/*		____________________________________________________________
				 * 		|															|
				 *		|					TOP PANEL								|
				 *		|___________________________________________________________|
				 * 		|			|												|
				 * 		|			|												|	
				 * 		|			|												|
				 * 		|	LEFT	|			RIGHT PANEL							|
				 * 		|  PANEL	|												|
				 * 		|			|												|
				 * 		|			|												|
				 * 		|			|												|
				 * 		|			|												|
				 * 		|			|												|
				 * 		|___________|_______________________________________________|
				 */
		
		// --------------- TOP PANEL ----------------------------
		topPanel.setBackground(couleurTop);
		topPanel.setPreferredSize(new Dimension(225,100));
		topPanel.setLayout(new BorderLayout());
		this.add(topPanel, BorderLayout.NORTH);
		
		// --------------- LEFT PANEL ---------------------------
		leftPanel.setBackground(couleurBarreGauche);
		leftPanel.setPreferredSize(new Dimension(225,500));
		leftPanel.setBorder(new EmptyBorder(5,5,5,5));
		leftPanel.setLayout(new BorderLayout());
		this.add(leftPanel, BorderLayout.WEST);		
		
		// --------------- RIGHT PANEL --------------------------
		rightPanel.setPreferredSize(new Dimension(755,653));
		rightPanel.setLayout(new BorderLayout());
		this.add(rightPanel, BorderLayout.CENTER);
		
		
		
		//-------------------------------------------------- TOP PANEL ---------------------------------------------------------
			// 
			/*
			 * 			|		gaucheTP			|				rightTP												|
			           	_________________________________________________________________________________________________
			           	|		|___________________|																	|
			           	|		|______TURBO________|																	|				
						| LOGO	|_____MOLOTOV_______|						TOP RIGHT									|
						|		|______POTATO_______|																	|		
						|_______|___________________|___________________________________________________________________|
						 		
						| logo	|	  ecriture		|	
			*/
		
		//---------------- TOP LEFT PANEL ---------------------
		JPanel gaucheTP = new JPanel();
		gaucheTP.setPreferredSize(new Dimension(230,100));
		gaucheTP.setBorder(new EmptyBorder(0,6,0,0));
		gaucheTP.setBackground(couleurTop);
		gaucheTP.setLayout(new BorderLayout());
		topPanel.add(gaucheTP, BorderLayout.WEST);
		
		
		//------- séparer gaucheTP en 2 autres panels ----------
		//----- panel logo -----------
		JPanel logo = new JPanel();
		logo.setPreferredSize(new Dimension(90,100));
		logo.setBackground(couleurTop);
		logo.setLayout(new FlowLayout());
		gaucheTP.add(logo, BorderLayout.WEST);
		
		ImageIcon logoImg = new ImageIcon("./src/img/feu.png");
		Image image = logoImg.getImage(); // transform it 
		Image newimg = image.getScaledInstance(170, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		logoImg = new ImageIcon(newimg);  // transform it back
		
		JLabel logoLabel = new JLabel();
		logoLabel.setIcon(logoImg);
		logo.add(logoLabel);
		
		
		// ---------- panel ecriture ------------------
		// GridLayout 5,1 - devra etre separé en 5 pour 3 mots rapprochés
		JPanel ecriture = new JPanel();
		ecriture.setPreferredSize(new Dimension(125,100));
		ecriture.setBackground(couleurTop);
		ecriture.setLayout(new GridLayout(5,1));
		gaucheTP.add(ecriture, BorderLayout.EAST);
		
		JLabel hautVide = new JLabel();
		ecriture.add(hautVide);
		
		JLabel turbo = new JLabel();
		turbo.setText("TURBO");
		turbo.setFont(new Font("Comic Sans", Font.BOLD | Font.ITALIC,22));
		turbo.setForeground(new Color(0xB10F2E));
		turbo.setHorizontalAlignment(JLabel.CENTER);
		ecriture.add(turbo);
		
		JLabel molotov = new JLabel();
		molotov.setText("MOLOTOV");
		molotov.setFont(new Font("Comic Sans", Font.BOLD | Font.ITALIC,18));
		molotov.setForeground(new Color(0xF24333));
		molotov.setHorizontalAlignment(JLabel.CENTER);
		ecriture.add(molotov);
		
		JLabel potato = new JLabel();
		potato.setText("POTATO");
		potato.setFont(new Font("Comic Sans", Font.BOLD | Font.ITALIC,20));
		potato.setForeground(new Color(0xFE7F2D));
		potato.setHorizontalAlignment(JLabel.CENTER);
		ecriture.add(potato);
		
		JLabel basVide = new JLabel();
		ecriture.add(basVide);
		
		
		
		//--------- TOP CENTER PANEL -------------------------
		JPanel centerTP = new JPanel();
		centerTP.setPreferredSize(new Dimension(455,100));
		centerTP.setBackground(couleurTop);
		centerTP.setLayout(new BorderLayout());
		topPanel.add(centerTP, BorderLayout.CENTER);
		
		JLabel titre = new JLabel();
		titre.setText("GESTION DE LA BIBLIOTHÈQUE");
		titre.setFont(new Font("Comic Sans", Font.BOLD,25));
		titre.setForeground(Color.white);
		titre.setHorizontalAlignment(JLabel.CENTER);
		titre.setVerticalAlignment(JLabel.CENTER);
		centerTP.add(titre);
	
		
		
		//-------------------------------------------------- RIGHT PANEL ------------------------------------------------
				//------ 3 PANELS MODIFIABLE POUR AFFICHAGE, déclarés dans attribut de classe pour accès externe ---------------- 
				/*
				 * 						________________________________________________
				 * 			HAUT		|		LISTE DES OUVAGES		|	AJOUTER		|
				 * 	____________________|_______________________________|_______________|
				 * 						|												|
				 * 		  MILLIEU		|				  								|
				 * 						|												|
				 * 						|												|
				 * 						|												|
				 * 	____________________|_______________________________________________|
				 * 						|__________________TRIER PAR____________________|
				 * 			BAS			|____|NUM LIVRE|__|NUM AUTEUR|____|CATEGORIE|___|
				 * 						|				 |								|
				 * 						|________________|______________________________|
				 * 
				 */
			
		//-------------------------- HAUT ----------------------------------------------------------------------

		hautRP.setBackground(couleurCentre);
		hautRP.setLayout(new BorderLayout());
		hautRP.setPreferredSize(new Dimension(745,50));		

		// ------- Titre --------------------------------------------------
		
		
		// -------- Panel Haut gauche du hautRP pour bouton ajouter livre ---------
		
		leftHautRP.setPreferredSize(new Dimension(200,50));
		leftHautRP.setLayout(new BorderLayout());
		leftHautRP.setBackground(couleurCentre);
		hautRP.add(leftHautRP, BorderLayout.EAST);
		
		
		//-------------------------- MILLIEU --------------------------------------------------------------------
		millieuRP.setBackground(couleurCentre);
		millieuRP.setLayout(new FlowLayout());
		millieuRP.setPreferredSize(new Dimension(745,230));
		

		//---------------------------- BAS ----------------------------------------------------------------------
		basRP.setBackground(new Color(0xEBEAEC));
		basRP.setPreferredSize(new Dimension(745,150));
		basRP.setLayout(new BorderLayout());
		basRP.setBorder(new MatteBorder(5,0,0,0, couleurBgFrame));
		
		rightPanel.add(millieuRP, BorderLayout.CENTER);
		rightPanel.add(hautRP, BorderLayout.NORTH);
		rightPanel.add(basRP, BorderLayout.SOUTH);
		
		// ---------------------------------------------------- LEFT PANEL  -------------------------------------------------
		// --------- Instruction leftPanel ----------------------------
		majFrame();
	}
	
	public void majFrame() {
		// REDESSINER LE FRAME
		this.revalidate();
		this.repaint();
	}
	
	
	public void clearRightPanel() {
		// RETIRER LE CONTENU DU PANEL DROIT
		this.millieuRP.removeAll();
	}
	

}
