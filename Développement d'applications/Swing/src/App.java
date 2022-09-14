import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;


public class App {

    public static void frame(String[] args) throws Exception {
    // JFrame = a GUI window to add components to

    JFrame frame = new JFrame(); // creates a frame
    frame.setTitle("My First GUI"); // sets the title of the frame
    //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Still runs in background
    //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Don't close the program when the frame is closed
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
    frame.setResizable(false); // prevents the frame from being resized
    frame.setSize(420, 420); // sets the x-dimension, and y-dimension of the frame
    frame.setVisible(true); // makes the frame visible

    ImageIcon image = new ImageIcon("src\\icon.png"); // create an ImageIcon
    frame.setIconImage(image.getImage()); // change icon of frame
    frame.getContentPane().setBackground(new java.awt.Color(255, 0, 0)); // change color of background
    }

    public static void labels(String[] args) throws Exception {
        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("src\\icon.png"); // create an ImageIcon
        Border border = BorderFactory.createLineBorder(Color.green, 3); // create a border

        JLabel label = new JLabel(); // create a label
        label.setText("Hello World"); // set text of label
        label.setIcon(image); // set image of label
        label.setHorizontalTextPosition(JLabel.CENTER); // set LEFT, CENTER, or RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set TOP, CENTER, or BOTTOM of image icon
        label.setForeground(new java.awt.Color(0, 0, 0)); // set text color
        label.setFont(new java.awt.Font("MV Boli", java.awt.Font.PLAIN, 50)); // set text font
        label.setIconTextGap(-25); // set gap between text and image
        label.setBackground(new java.awt.Color(255, 255, 255)); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // set border of the label
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of text within label
        //label.setBounds(0, 0, 250, 250); // set x and y position, width, and height
        
        JFrame frame = new JFrame(); // creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        //frame.setSize(420, 420); // sets the x-dimension, and y-dimension of the frame
        //frame.setLayout(null); // no layout managers
        frame.setVisible(true); // makes the frame visible
        frame.add(label); // add label to frame
        frame.pack(); // resize frame to fit components
    }

    public static void panel(String[] args) throws Exception {
        // JPanel = a GUI container to hold components as a container to hold other components
        ImageIcon image = new ImageIcon("src\\icon.png"); // create an ImageIcon

        JLabel label = new JLabel(); // create a label
        label.setText("Hello World"); // set text of label
        label.setIcon(image); // set image of label
        label.setHorizontalTextPosition(JLabel.CENTER); // set LEFT, CENTER, or RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set TOP, CENTER, or BOTTOM of image icon
        label.setBounds(0, 0, 75, 75); // set x and y position, width, and height

        JPanel redPanel = new JPanel(); // create a panel
        redPanel.setBackground(Color.RED); // set background color
        redPanel.setBounds(0, 0, 250, 250); // set x and y position, width, and height
        redPanel.setLayout(new BorderLayout()); // set layout of panel

        JPanel bluePanel = new JPanel(); // create a panel
        bluePanel.setBackground(Color.BLUE); // set background color
        bluePanel.setBounds(250, 0, 250, 250); // set x and y position, width, and height
        bluePanel.setLayout(new BorderLayout()); // set layout of panel

        JPanel greenPanel = new JPanel(); // create a panel
        greenPanel.setBackground(Color.GREEN); // set background color
        greenPanel.setBounds(0, 250, 500, 250); // set x and y position, width, and height
        greenPanel.setLayout(new BorderLayout()); // set layout manager




        JFrame frame = new JFrame(); // creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setSize(420, 420); // sets the x-dimension, and y-dimension of the frame
        frame.setLayout(null); // no layout managers
        frame.setVisible(true); // makes the frame visible
        redPanel.add(label); // add label to panel
        //bluePanel.add(label); // add label to panel
        //greenPanel.add(label); // add label to panel
        frame.add(redPanel); // add panel to frame
        frame.add(bluePanel); // add panel to frame
        frame.add(greenPanel); // add panel to frame
    }

    public static void button(String[] args) throws Exception {
        // JButton = a button that performs an action when clicked on

        JButton button = new JButton("Click Me"); // create a button
        button.setBounds(100, 160, 200, 40); // set x and y position, width, and height

        JFrame frame = new JFrame(); // creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setSize(420, 420); // sets the x-dimension, and y-dimension of the frame
        frame.setLayout(null); // no layout managers
        frame.setVisible(true); // makes the frame visible
        frame.add(button); // add button to frame
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
