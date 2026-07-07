import javax.swing.*;
import java.awt.*;

public class SimpleLoginForm extends JFrame {
    // Declaring components as specified in the sources [2]
    JLabel lblUser, lblPass;
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;

    public SimpleLoginForm() {
        // Setting up the JFrame [1]
        setTitle("Simple Login Form");
        setSize(350, 200);
        setLayout(new FlowLayout()); // Standard Layout Manager mentioned in exam questions [3]
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initializing JLabels [2]
        lblUser = new JLabel("Username: ");
        lblPass = new JLabel("Password: ");

        // Initializing input components (Standard practice for a form) [4]
        txtUser = new JTextField(15);
        txtPass = new JPasswordField(15);

        // Initializing JButton [2]
        btnLogin = new JButton("Login");

        // Adding components to the JFrame
        add(lblUser);
        add(txtUser);
        add(lblPass);
        add(txtPass);
        add(btnLogin);

        // Making the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Executing the application
        new SimpleLoginForm();
    }
}