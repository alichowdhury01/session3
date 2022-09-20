import javax.swing.*;
//sql imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    

    JFrame frame;

    public static void login() {
        // user login
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

        //username label and text field
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        frame.add(userLabel);
        frame.add(userText);

        //password label and text field
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        JTextField passwordText = new JTextField(20);
        passwordText.setBounds(100, 50, 165, 25);
        frame.add(passwordLabel);
        frame.add(passwordText);

        //login button
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        frame.add(loginButton);

        //login button action listener verifies user and password and connects to database method 
        loginButton.addActionListener(e -> {
            String user = userText.getText();
            String password = passwordText.getText();
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/officecenter", user, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM officecenter");
                //if connection is successful, open main menu
                if (conn != null) {
                    System.out.println("Connected to the database!");
                }
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        
        });
    }
        
    public static void main(String[] args) throws Exception {
        login();
    }
}
