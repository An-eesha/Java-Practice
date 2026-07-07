import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiplicationApp extends JFrame implements ActionListener {
    // Declaring components [2, 5]
    JTextField t1, t2, t3;
    JButton bMul, bExit;
    JLabel l1, l2, l3;

    public MultiplicationApp() {
        // Setting up the Frame [5]
        setTitle("Multiplication Calculator");
        setSize(400, 300);
        setLayout(new FlowLayout()); // Common Layout Manager [1]
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initializing components [2, 4]
        l1 = new JLabel("First Number:");
        t1 = new JTextField(10);
        
        l2 = new JLabel("Second Number:");
        t2 = new JTextField(10);
        
        l3 = new JLabel("Result:");
        t3 = new JTextField(10);
        t3.setEditable(false); // Make output field read-only

        bMul = new JButton("MUL");
        bExit = new JButton("Exit");

        // Registering listeners [1]
        bMul.addActionListener(this);
        bExit.addActionListener(this);

        // Adding components to frame [2]
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(bMul); add(bExit);

        setVisible(true);
    }

    // Implementing Event Handling [1, 2]
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bMul) {
            try {
                // Logic for multiplication
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int result = num1 * num2;
                t3.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                // Handling invalid input [6]
                JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
            }
        } else if (e.getSource() == bExit) {
            // Terminating the program
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new MultiplicationApp();
    }
}
