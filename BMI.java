import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI {

	private JFrame frame;
	private JTextField H;
	private JTextField W;
	private JTextField bmi;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI window = new BMI();
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
	public BMI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 95, 414, 187);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Height(m)");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(97, 29, 86, 21);
		panel.add(lblNewLabel);
		
		H = new JTextField();
		H.setBounds(244, 29, 86, 20);
		panel.add(H);
		H.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Weight(KG)");
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(97, 72, 86, 14);
		panel.add(lblNewLabel_1);
		
		W = new JTextField();
		W.setBounds(244, 69, 86, 20);
		panel.add(W);
		W.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BMI :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(64, 115, 46, 14);
		panel.add(lblNewLabel_2);
		
		bmi = new JTextField();
		bmi.setBounds(126, 112, 86, 20);
		panel.add(bmi);
		bmi.setColumns(10);
		
		JLabel re = new JLabel("");
		re.setForeground(new Color(255, 255, 255));
		re.setBounds(262, 115, 89, 14);
		panel.add(re);
		
		JButton cal = new JButton("Calculate");
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float r1=Float.parseFloat(H.getText());
				float r2=Float.parseFloat(W.getText());
				float res=(float)(r2/(r1*r1));
				bmi.setText(String.valueOf(res));
				if(res<=18.5)
				{
					re.setForeground(Color.YELLOW);
					re.setText("Under Weight");
				}
				else if(res>18.5&&res<24.9)
				{
					re.setForeground(Color.GREEN);
					re.setText("Normal Weight");
				}
				else if(res>25&&res<29.9)
				{
					re.setForeground(Color.ORANGE);
					re.setText("OverWeight");
				}
				else
				{
					re.setForeground(Color.RED);
				re.setText("Obese");
				}
			}
		});
		cal.setBounds(50, 153, 89, 23);
		panel.add(cal);
		
		JButton clr = new JButton("Clear");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				H.setText("");
				W.setText("");
				bmi.setText("");
			}
		});
		clr.setBounds(171, 153, 89, 23);
		panel.add(clr);
		
		JButton ex = new JButton("Exit");
		ex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ex.setBounds(284, 153, 89, 23);
		panel.add(ex);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(0, 0, 0));
		panel2.setBounds(10, 293, 414, 169);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setFillsViewportHeight(true);
		table.setSurrendersFocusOnKeystroke(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"UnderWeight", "UnderWeight", "Normal Weight", "Obese"},
				{"< 18.5", "18.5 to 24.9", "25 to 29.9", "> 30"},
			},
			new String[] {
				"UnderWeight", "Normal Weight", "Over Weight", "Obese"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(77);
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(25, 112, 349, 46);
		panel2.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(10, 11, 414, 73);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("BODY MASS INDEX");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Bernard MT Condensed", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(132, 11, 136, 32);
		panel_2.add(lblNewLabel_4);
	}
}


