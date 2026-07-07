import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LargestNumberApp extends JFrame implements ActionListener {
    // 1. Defining components as per source requirements [1]
    JTextField t1, t2, t3, tResult;
    JButton bFind;
    JLabel l1, l2, l3, lRes;

    public LargestNumberApp() {
        // Setting up the Frame [2]
        setTitle("Find Largest Number");
        setSize(300, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Initializing TextFields and Labels
        l1 = new JLabel("Enter First Number:");
        t1 = new JTextField(15);
        l2 = new JLabel("Enter Second Number:");
        t2 = new JTextField(15);
        l3 = new JLabel("Enter Third Number:");
        t3 = new JTextField(15);
        
        lRes = new JLabel("Largest Number is:");
        tResult = new JTextField(15);
        tResult.setEditable(false); // Result field is read-only

        bFind = new JButton("Find Largest");

        // 3. Registering the Action Listener [3]
        bFind.addActionListener(this);

        // Adding components to frame
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(bFind);
        add(lRes); add(tResult);

        setVisible(true);
    }

    // 4. Logic for finding the largest number using Control Statements [4]
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(t1.getText());
            double n2 = Double.parseDouble(t2.getText());
            double n3 = Double.parseDouble(t3.getText());
            double largest;

            // Using if-else decision-making statements [4]
            if (n1 >= n2 && n1 >= n3) {
                largest = n1;
            } else if (n2 >= n1 && n2 >= n3) {
                largest = n2;
            } else {
                largest = n3;
            }

            tResult.setText(String.valueOf(largest));
        } catch (NumberFormatException ex) {
            // Handling invalid input to keep the program "Robust" [5, 6]
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values.");
        }
    }

    public static void main(String[] args) {
        new LargestNumberApp();
    }
}