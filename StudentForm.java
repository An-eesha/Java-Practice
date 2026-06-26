import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm implements ActionListener{
    JTextField txtName;
    JTextField txtId;
    JTextField txtCourse;
    JTextField txtEmail;

StudentForm(){
    JFrame frm= new JFrame("Student Form");
    JPanel formPanel = new JPanel();
    formPanel.setLayout(new GridLayout(4,2,5,5));

    JLabel lblName =new JLabel("Student Name:");
    JLabel lblId= new JLabel ("Student ID:");
    JLabel lblCourse= new JLabel ("Course:");
    JLabel lblEmail = new JLabel ("Email:");

    txtName= new JTextField(20);
    txtId= new JTextField(20);
    txtCourse = new JTextField(20);
    txtEmail= new JTextField(20);

    formPanel.add(lblName);
    formPanel.add(txtName);

    formPanel.add(lblId);
    formPanel.add(txtId);

    formPanel.add(lblCourse);
    formPanel.add(txtCourse);

    formPanel.add(lblEmail);
    formPanel.add(txtEmail);

    JPanel buttonPanel =new JPanel(new FlowLayout());

    JButton btnRegister= new JButton ("Register");

    JButton btnClear= new JButton ("Clear");

    btnClear.addActionListener(this);
    
    buttonPanel.add(btnRegister);
    buttonPanel.add(btnClear);

    frm.add (formPanel, BorderLayout.CENTER);
    frm.add (buttonPanel, BorderLayout.SOUTH);

    frm.setTitle("Student Registration Form");
    frm.setSize(400,200);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setVisible(true);

    
}
  public void actionPerformed(ActionEvent ae){
    txtName.setText(" ");
      txtId.setText(" ");
        txtCourse.setText(" ");
          txtEmail.setText(" ");
  }

  public static void main (String [] args){
    new StudentForm();

  }
}