package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backend.DBMethods;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private DBMethods dbm = new DBMethods();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		dbm.Reg();
		dbm.Connect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 731, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/logo.png"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(10, 81, 379, 216);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Log In:");
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 44));
		lblNewLabel_1.setBounds(276, 10, 429, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username:");
		lblNewLabel_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(458, 81, 247, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password:");
		lblNewLabel_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(458, 170, 247, 29);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		textField.setBounds(458, 120, 222, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(458, 209, 222, 24);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textField.getText();
				String pswd = passwordField.getText();
				int succses = dbm.signIn(username, pswd);
				if(succses == 1) {
					MainMenu mm = new MainMenu();
					mm.setVisible(true);
					dispose();
				}else {
					CustomNotification("Sikertelen Bejelentkezés", 0);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		btnNewButton.setBounds(567, 293, 113, 29);
		contentPane.add(btnNewButton);
	}
	
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}
}
