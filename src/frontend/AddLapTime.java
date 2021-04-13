package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddLapTime extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddLapTime dialog = new AddLapTime();
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
	public AddLapTime() {
		setBounds(100, 100, 423, 423);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add New Lap:");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
		lblNewLabel.setBounds(10, 10, 130, 22);
		getContentPane().add(lblNewLabel);
		
		JLabel lblTrack = new JLabel("Track:");
		lblTrack.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblTrack.setBounds(10, 49, 53, 18);
		getContentPane().add(lblTrack);
		
		textField = new JTextField();
		textField.setBounds(59, 49, 40, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSector = new JLabel("Sector 1");
		lblSector.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector.setBounds(10, 77, 53, 18);
		getContentPane().add(lblSector);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 105, 29, 19);
		getContentPane().add(textField_1);
		
		JLabel lblSector_1 = new JLabel(":");
		lblSector_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1.setBounds(49, 105, 10, 18);
		getContentPane().add(lblSector_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(59, 105, 53, 19);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 105, 80, 19);
		getContentPane().add(textField_3);
		
		JLabel lblSector_1_1 = new JLabel(":");
		lblSector_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1_1.setBounds(123, 105, 10, 18);
		getContentPane().add(lblSector_1_1);
		
		JLabel lblSector_4 = new JLabel("Sector 2:");
		lblSector_4.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_4.setBounds(10, 143, 72, 18);
		getContentPane().add(lblSector_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 171, 29, 19);
		getContentPane().add(textField_4);
		
		JLabel lblSector_1_2 = new JLabel(":");
		lblSector_1_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1_2.setBounds(49, 171, 10, 18);
		getContentPane().add(lblSector_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(59, 171, 53, 19);
		getContentPane().add(textField_5);
		
		JLabel lblSector_1_1_1 = new JLabel(":");
		lblSector_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1_1_1.setBounds(123, 171, 10, 18);
		getContentPane().add(lblSector_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(133, 171, 80, 19);
		getContentPane().add(textField_6);
		
		JLabel lblSector_3 = new JLabel("Sector 3:");
		lblSector_3.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_3.setBounds(10, 208, 72, 18);
		getContentPane().add(lblSector_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(10, 236, 29, 19);
		getContentPane().add(textField_7);
		
		JLabel lblSector_1_3 = new JLabel(":");
		lblSector_1_3.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1_3.setBounds(49, 236, 10, 18);
		getContentPane().add(lblSector_1_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(59, 236, 53, 19);
		getContentPane().add(textField_8);
		
		JLabel lblSector_1_1_2 = new JLabel(":");
		lblSector_1_1_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1_1_2.setBounds(123, 236, 10, 18);
		getContentPane().add(lblSector_1_1_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(133, 236, 80, 19);
		getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(208, 48, 40, 19);
		getContentPane().add(textField_10);
		
		JLabel lblDriverId = new JLabel("Driver ID:");
		lblDriverId.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDriverId.setBounds(133, 48, 85, 18);
		getContentPane().add(lblDriverId);
		
		JLabel lblCompount = new JLabel("Compount:");
		lblCompount.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblCompount.setBounds(190, 274, 85, 18);
		getContentPane().add(lblCompount);
		
		JLabel lblSetupId = new JLabel("SetUp ID:");
		lblSetupId.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSetupId.setBounds(10, 275, 80, 18);
		getContentPane().add(lblSetupId);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(83, 274, 40, 19);
		getContentPane().add(textField_11);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(271, 273, 72, 21);
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.setBounds(221, 355, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnAddLap = new JButton("Add Lap");
		btnAddLap.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAddLap.setBounds(316, 355, 85, 21);
		getContentPane().add(btnAddLap);

	}
}
