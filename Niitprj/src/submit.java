import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JButton;

public class submit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					submit frame = new submit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public submit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNiit = new JLabel("NIIT");
		lblNiit.setForeground(Color.BLUE);
		lblNiit.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 34));
		lblNiit.setBounds(26, 37, 89, 46);
		contentPane.add(lblNiit);
		
		JLabel lblNewLabel = new JLabel("World's  Leading Talent \r\nDevelopment Corporation");
		lblNewLabel.setBounds(95, 60, 270, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(36, 94, 532, 279);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(505, 11, 17, 257);
		panel.add(scrollBar);
		
		JLabel lblWelcomeMrmrs = new JLabel("Welcome MR/MRS");
		lblWelcomeMrmrs.setBounds(20, 11, 134, 14);
		panel.add(lblWelcomeMrmrs);
		
		textField = new JTextField();
		textField.setBounds(129, 8, 134, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAddStudent = new JLabel("Add student");
		lblAddStudent.setBounds(20, 74, 102, 14);
		panel.add(lblAddStudent);
		
		textField_1 = new JTextField();
		textField_1.setBounds(38, 120, 386, 75);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFillTheReson = new JLabel("Fill the reason");
		lblFillTheReson.setBounds(55, 95, 78, 14);
		panel.add(lblFillTheReson);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(335, 214, 89, 23);
		panel.add(btnOk);
		
		JButton btnAddFeesDetails = new JButton("Add  Fees Details");
		btnAddFeesDetails.setBounds(38, 245, 127, 23);
		panel.add(btnAddFeesDetails);
		
		JButton btnNewButton = new JButton("Add Courses");
		btnNewButton.setBounds(244, 245, 134, 23);
		panel.add(btnNewButton);
	}
}
