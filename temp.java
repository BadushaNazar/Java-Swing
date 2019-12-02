package hello;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class temp {

private JFrame frame;
private JTextField textField;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
temp window = new temp();
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
public temp() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setBackground(Color.CYAN);
frame.setBounds(100, 100, 450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lblDegrees = new JLabel("Degrees");
lblDegrees.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
lblDegrees.setBackground(Color.ORANGE);
lblDegrees.setBounds(26, 51, 68, 14);
frame.getContentPane().add(lblDegrees);

textField = new JTextField();
textField.setBounds(86, 30, 242, 57);
frame.getContentPane().add(textField);
textField.setColumns(10);


JLabel label = new JLabel("");
label.setBounds(86, 113, 313, 14);
frame.getContentPane().add(label);

JButton btnToC = new JButton("To Celsius");
btnToC.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
btnToC.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

String a=textField.getText();
float number=Float.valueOf(a);
float c=(number-32)*5/9;
String b=String.valueOf(c);
label.setText("Result ="+b);

}
});

btnToC.setBounds(26, 138, 115, 42);
frame.getContentPane().add(btnToC);

JButton btnToF = new JButton("To Fahrenheit");
btnToF.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
btnToF.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

String a=textField.getText();
float number=Float.valueOf(a);
float c=(number*1.8f)+32;
String b=String.valueOf(c);
label.setText("Result ="+b);

}
});
btnToF.setBounds(257, 138, 123, 42);
frame.getContentPane().add(btnToF);
JButton btnNewButton = new JButton("CLEAR");
btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		textField.setText("");
		
	}
});
btnNewButton.setBounds(155, 199, 89, 37);
frame.getContentPane().add(btnNewButton);


}
}
