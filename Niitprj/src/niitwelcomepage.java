import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class niitwelcomepage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					niitwelcomepage frame = new niitwelcomepage();
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
	public niitwelcomepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIIT");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.ITALIC, 37));
		lblNewLabel.setBounds(10, 22, 87, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblWords = new JLabel("World's  Leading Talent \r\nDevelopment Corporation");
		lblWords.setFont(new Font("Algerian", Font.ITALIC, 13));
		lblWords.setBounds(77, 26, 359, 52);
		contentPane.add(lblWords);
		
		JLabel lblNiitIndiaHeadquarters = new JLabel("NIIT India Headquarters");
		lblNiitIndiaHeadquarters.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNiitIndiaHeadquarters.setBounds(30, 91, 190, 22);
		contentPane.add(lblNiitIndiaHeadquarters);
		
		JLabel lblsecctorInstitutionalgurgaon = new JLabel("85,Secctor 32 Institutional,gurgaon 122001Haryana,india");
		lblsecctorInstitutionalgurgaon.setBounds(30, 115, 359, 18);
		contentPane.add(lblsecctorInstitutionalgurgaon);
		
		JLabel label = new JLabel("91-124-4293170");
		label.setBounds(30, 135, 120, 14);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 162, 267, 197);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLoginEmployee = new JLabel("Login Employee");
		lblLoginEmployee.setForeground(Color.BLUE);
		lblLoginEmployee.setBackground(Color.BLUE);
		lblLoginEmployee.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 18));
		lblLoginEmployee.setBounds(21, 31, 189, 24);
		panel.add(lblLoginEmployee);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(10, 78, 77, 14);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(10, 115, 46, 14);
		panel.add(lblPassword);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.setBounds(20, 150, 89, 23);
		panel.add(btnSubmit);
		
		textField = new JTextField();
		textField.setBounds(103, 75, 138, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 112, 138, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnRestart = new JButton("restart");
		btnRestart.setBounds(132, 150, 89, 23);
		panel.add(btnRestart);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 51, 0));
		panel_1.setBounds(338, 162, 265, 197);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewStudents = new JLabel("New Students");
		lblNewStudents.setForeground(Color.BLUE);
		lblNewStudents.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 15));
		lblNewStudents.setBounds(64, 27, 128, 20);
		panel_1.add(lblNewStudents);
		
		JLabel lblPhoneNumber = new JLabel("phone number");
		lblPhoneNumber.setBounds(10, 74, 100, 20);
		panel_1.add(lblPhoneNumber);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 74, 128, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnGotonextpage = new JButton("GoToNextPage");
		btnGotonextpage.setBounds(10, 122, 105, 23);
		panel_1.add(btnGotonextpage);
		
		JButton btnRestart_1 = new JButton("Restart");
		btnRestart_1.setBounds(129, 122, 89, 23);
		panel_1.add(btnRestart_1);
		
		JLabel lblGiveYourNumber = new JLabel("Give Your Number and see full course Details");
		lblGiveYourNumber.setBounds(10, 156, 245, 20);
		panel_1.add(lblGiveYourNumber);
	}
}
