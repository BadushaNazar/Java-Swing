package hello;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class loginform {

private JFrame frame;
private JTextField textField;
private JPasswordField textField_1;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
loginform window = new loginform();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public loginform() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lblNewLabel = new JLabel("");
lblNewLabel.setBounds(10, 189, 434, 14);
frame.getContentPane().add(lblNewLabel);

JLabel lblUser = new JLabel("user");
lblUser.setBounds(33, 52, 46, 14);
frame.getContentPane().add(lblUser);

JLabel lblPassword = new JLabel("password");
lblPassword.setBounds(33, 108, 46, 14);
frame.getContentPane().add(lblPassword);

textField = new JTextField();
textField.setBounds(142, 49, 86, 20);
frame.getContentPane().add(textField);
textField.setColumns(10);

JButton btnNewButton = new JButton("Register");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{

String a=textField.getText();
String b=textField_1.getText();

if(a.equals("abc") && b.equals("123")) {
lblNewLabel.setText("successfull");
}
else
{
lblNewLabel.setText("Not successfull");
}

}
});
btnNewButton.setBounds(79, 155, 89, 23);
frame.getContentPane().add(btnNewButton);
textField_1 = new JPasswordField();
textField_1.setBounds(142, 105, 86, 20);
frame.getContentPane().add(textField_1);
}
}
