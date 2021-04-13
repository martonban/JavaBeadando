package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddTyre extends JDialog {
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
					AddTyre dialog = new AddTyre();
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
	public AddTyre() {
		setBounds(100, 100, 417, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTrack = new JLabel("Track:");
		lblTrack.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblTrack.setBounds(10, 49, 53, 18);
		getContentPane().add(lblTrack);
		
		JLabel lblAddTyre = new JLabel("Add Tyre:");
		lblAddTyre.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
		lblAddTyre.setBounds(10, 10, 93, 22);
		getContentPane().add(lblAddTyre);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 112, 93, 21);
		getContentPane().add(comboBox_1);
		
		JLabel lblCompount = new JLabel("Compount:");
		lblCompount.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblCompount.setBounds(10, 96, 82, 18);
		getContentPane().add(lblCompount);
		
		textField = new JTextField();
		textField.setBounds(10, 64, 132, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 158, 132, 19);
		getContentPane().add(textField_1);
		
		JLabel lblLaps = new JLabel("Laps:");
		lblLaps.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblLaps.setBounds(10, 143, 53, 18);
		getContentPane().add(lblLaps);
		
		JLabel lblCarId = new JLabel("Car ID:");
		lblCarId.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblCarId.setBounds(10, 193, 53, 18);
		getContentPane().add(lblCarId);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 208, 132, 19);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.setBounds(213, 232, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnAddTyer = new JButton("Add Tyre");
		btnAddTyer.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAddTyer.setBounds(308, 232, 85, 21);
		getContentPane().add(btnAddTyer);

	}

}
