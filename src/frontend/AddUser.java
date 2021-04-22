package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import backend.DBMethods;
import backend.DataTreat;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddUser extends JDialog {
	private JTextField nameField;
	private JTextField salaryField;
	private JTextField birthdayField;
	private JTextField positionField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
	private DBMethods dbm = new DBMethods();
	private DataTreat data = new DataTreat();
	
	/**
	 * Create the dialog.
	 */
	public AddUser() {
		dbm.Reg();
		dbm.Connect();
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
		
		nameField = new JTextField();
		nameField.setBounds(126, 53, 137, 19);
		getContentPane().add(nameField);
		nameField.setColumns(10);
		
		salaryField = new JTextField();
		salaryField.setColumns(10);
		salaryField.setBounds(126, 134, 56, 19);
		getContentPane().add(salaryField);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Salary:");
		lblNewLabel_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(10, 134, 45, 13);
		getContentPane().add(lblNewLabel_1_1_1);
		
		birthdayField = new JTextField();
		birthdayField.setColumns(10);
		birthdayField.setBounds(126, 192, 96, 19);
		getContentPane().add(birthdayField);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Birthday:");
		lblNewLabel_1_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(10, 192, 96, 13);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		positionField = new JTextField();
		positionField.setColumns(10);
		positionField.setBounds(126, 163, 137, 19);
		getContentPane().add(positionField);
		
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.setBounds(246, 235, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnAddUser = new JButton("Add User");
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Declaration
				boolean canInsert = true;
				int id = dbm.makeNewID("user", "uid");
				String name = nameField.getText();
				String salary = salaryField.getText();
				String pass1 = passwordField.getText();
				String pass2 = passwordField_1.getText();
				String position = positionField.getText();
				String date = birthdayField.getText();
				int salaryReal = 0;
				int canEdit = 0;
				
				//Checks
				System.out.println(name);
				System.out.println(position);
				if(name.equals("") || position.equals("")) {
					canInsert = false;
					CustomNotification("Rossz adata megadás a névnél vagy a poziciónál", 0);
				}else {
					System.out.println("Cool");
					
				}
				
				if(data.isThatDate(date) == false) {
					canInsert = false;
					CustomNotification("Hibás dátum", 0);
				}
				
				if(position.equals("admin")) {
					canEdit = 1;
				}
				
				
				if(data.isThatInt(salary) != true) {
					canInsert = false;
					CustomNotification("Nem szám típusú", 0);
				}else {
					salaryReal = data.convertToIntBasic(salary);
				}
				
				if(pass1.equals(pass2) == false) {
					canInsert = false;
					CustomNotification("Nem egyeznek a jelszavak", 0);
				}
				
				if(canInsert == true) {
					String sqlp = "insert into user values ("+id+", '"+name+"', '" + pass1 + "', "+salary+", '" + position + "', 30, '"+date+"', "+canEdit+");";
					dbm.CommandExecute(sqlp);
					CustomNotification("Sikeres felvétel", 1);
				}else {
					CustomNotification("Sikertelen felvétel", 0);
				}
				
				
			}
		});
		btnAddUser.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAddUser.setBounds(341, 235, 85, 21);
		getContentPane().add(btnAddUser);

	}
	
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}
	
}
