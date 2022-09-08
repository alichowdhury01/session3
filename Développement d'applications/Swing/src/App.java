import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {
        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame(); // create a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation (exit when it is closed)
        // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // set the default close operation (exit when it is closed)
        // frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // set the default close operation (exit when it is closed)
        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // set the default close operation (exit when it is closed)
        frame.setTitle("My First Frame"); // set the title of the frame
        frame.setResizable(false); // prevents the frame from being resized
        frame.setSize(420, 420); // set the x-dimension, and y-dimension of the frame
        frame.setVisible(true); // make the frame visible

        // ImageIcon image = new ImageIcon("src\\icon.png"); // create an ImageIcon
        //frame.setIconImage(image.getImage()); // change icon of frame
        //frame.getContentPane().setBackground(new java.awt.Color(255, 0, 0)); // change the background color of the frame

        // JLabel label = a GUI display area for a string of text, an image, or both

        ImageIcon Image = new ImageIcon("src\\icon.png"); // load the image to a imageIcon
        Border border = BorderFactory.createLineBorder(Color.black, 3); // create a border

        JLabel label = new JLabel(); // create a label
        label.setText("This is a label"); // set the text of the label
        label.setText("null"); // set the text of the label
        label.setIcon(Image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, or RIGHT of imageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, or BOTTOM of imageIcon
        label.setForeground(new Color(255, 0, 0)); // set the foreground color of the text
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); // set the font of the text
        label.setIconTextGap(-25); // set the gap between the text and the imageIcon
        label.setBackground(Color.black); // set the background color of the label
        label.setOpaque(true); // display label background
        label.setBorder(border); // set the border of the label
        label.setVerticalAlignment(JLabel.CENTER); // set the vertical position of the icon+text within the label
        label.setHorizontalAlignment(JLabel.CENTER); // set the horizontal position of the icon+text within the label
        label.setBounds(0, 0, 250, 250); // set the x, y, width, and height of the label
        
        frame.add(label); // add the label to the frame
        //frame.setLayout(null); // set the layout of the frame
        frame.pack(); // resize the frame to fit the preferred size of its subcomponents
    }
}

// Index
// Jframe line 7
// JLabel line 28

