import javax.swing.ImageIcon;
import javax.swing.JFrame;


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

        ImageIcon image = new ImageIcon("src\\icon.png"); // create an ImageIcon
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new java.awt.Color(255, 0, 0)); // change the background color of the frame
    }
}

// Index
// Jframe line 7

