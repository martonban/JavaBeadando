package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddDriver extends JDialog {
	private JTextField numberField;
	private JTextField nameField;
	private JTextField avgField;
	private JTextField startField;
	private JTextField winsField;
	private JTextField polesField;
	private JTextField IDField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDriver dialog = new AddDriver();
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
	public AddDriver() {
		setBounds(100, 100, 450, 562);
		getContentPane().setLayout(null);
		
		JLabel lblAddUser = new JLabel("Add Driver:");
		lblAddUser.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
		lblAddUser.setBounds(10, 10, 137, 24);
		getContentPane().add(lblAddUser);
		
		JLabel lblNumber = new JLabel("Number:");
		lblNumber.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNumber.setBounds(10, 54, 89, 13);
		getContentPane().add(lblNumber);
		
		numberField = new JTextField();
		numberField.setBounds(10, 77, 42, 19);
		getContentPane().add(numberField);
		numberField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(10, 140, 156, 19);
		getContentPane().add(nameField);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblName.setBounds(10, 117, 89, 13);
		getContentPane().add(lblName);
		
		avgField = new JTextField();
		avgField.setColumns(10);
		avgField.setBounds(10, 264, 62, 19);
		getContentPane().add(avgField);
		
		JLabel lblNumber_1_1 = new JLabel("Avarage Finish:");
		lblNumber_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNumber_1_1.setBounds(10, 241, 124, 13);
		getContentPane().add(lblNumber_1_1);
		
		startField = new JTextField();
		startField.setColumns(10);
		startField.setBounds(10, 201, 62, 19);
		getContentPane().add(startField);
		
		JLabel lblNumberOfRace = new JLabel("Number Of Race Start:");
		lblNumberOfRace.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNumberOfRace.setBounds(10, 178, 156, 13);
		getContentPane().add(lblNumberOfRace);
		
		winsField = new JTextField();
		winsField.setColumns(10);
		winsField.setBounds(10, 394, 62, 19);
		getContentPane().add(winsField);
		
		JLabel lblNumber_1_1_1 = new JLabel("Number of wins:");
		lblNumber_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNumber_1_1_1.setBounds(10, 371, 137, 13);
		getContentPane().add(lblNumber_1_1_1);
		
		polesField = new JTextField();
		polesField.setColumns(10);
		polesField.setBounds(10, 331, 62, 19);
		getContentPane().add(polesField);
		
		JLabel lblNumber_2_1 = new JLabel("Number of poles:");
		lblNumber_2_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNumber_2_1.setBounds(10, 308, 137, 13);
		getContentPane().add(lblNumber_2_1);
		
		IDField = new JTextField();
		IDField.setColumns(10);
		IDField.setBounds(10, 462, 62, 19);
		getContentPane().add(IDField);
		
		JLabel lblNumber_1_1_1_1 = new JLabel("Car  ID:");
		lblNumber_1_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNumber_1_1_1_1.setBounds(10, 439, 89, 13);
		getContentPane().add(lblNumber_1_1_1_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(235, 494, 62, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Driver");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(307, 494, 119, 21);
		getContentPane().add(btnNewButton_1);

	}
}
