import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    // 1. Define Swing components [2], [3]
    JLabel lUser, lPass;
    JTextField tUser;
    JPasswordField tPass;
    JButton bLogin, bClear;

    public LoginForm() {
        // Set up the frame [2]
        setTitle("Login Form");
        setSize(300, 200);
        setLayout(new FlowLayout()); // Simple layout as mentioned in sources [4]
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Initialize components
        lUser = new JLabel("Username:");
        tUser = new JTextField(15);
        
        lPass = new JLabel("Password:");
        tPass = new JPasswordField(15);

        bLogin = new JButton("Login");
        bClear = new JButton("Clear");

        // 3. Register ActionListeners for event handling [1]
        bLogin.addActionListener(this);
        bClear.addActionListener(this);

        // 4. Add components to the frame [3]
        add(lUser);
        add(tUser);
        add(lPass);
        add(tPass);
        add(bLogin);
        add(bClear);

        setVisible(true);
    }

    // 5. Handle ActionEvents [1]
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bLogin) {
            String username = tUser.getText();
            // JPasswordField returns a char array for security
            String password = new String(tPass.getPassword());

            // 6. Validate credentials using decision-making statements [5], [6]
            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == bClear) {
            // Reset both input fields
            tUser.setText("");
            tPass.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
