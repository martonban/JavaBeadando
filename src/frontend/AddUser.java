package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class AddUser extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUser dialog = new AddUser();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public AddUser() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add User:");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 10, 137, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 53, 45, 13);
		getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(126, 53, 137, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 134, 56, 19);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Salary:");
		lblNewLabel_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(10, 134, 45, 13);
		getContentPane().add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(126, 192, 96, 19);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Birthday:");
		lblNewLabel_1_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(10, 192, 96, 13);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(126, 163, 137, 19);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Position:");
		lblNewLabel_1_1_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(10, 163, 96, 13);
		getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Password Agin");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(10, 108, 108, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Password:");
		lblNewLabel_1_1_2_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1.setBounds(10, 79, 67, 13);
		getContentPane().add(lblNewLabel_1_1_2_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(126, 79, 108, 19);
		getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(126, 108, 108, 19);
		getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.setBounds(246, 235, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnAddUser = new JButton("Add User");
		btnAddUser.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAddUser.setBounds(341, 235, 85, 21);
		getContentPane().add(btnAddUser);

	}
}
