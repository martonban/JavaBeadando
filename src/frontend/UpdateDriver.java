package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class UpdateDriver extends JDialog {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateDriver dialog = new UpdateDriver();
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
	public UpdateDriver() {
		setBounds(100, 100, 404, 190);
		getContentPane().setLayout(null);
		
		JLabel lblDriverStatusUpdate = new JLabel("Driver Status Update:");
		lblDriverStatusUpdate.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
		lblDriverStatusUpdate.setBounds(10, 10, 192, 22);
		getContentPane().add(lblDriverStatusUpdate);
		
		JLabel lblDriverId = new JLabel("Driver ID:");
		lblDriverId.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDriverId.setBounds(10, 42, 85, 18);
		getContentPane().add(lblDriverId);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(149, 40, 144, 19);
		getContentPane().add(textField);
		
		JLabel lblAvgPostion = new JLabel("AVG Postion:");
		lblAvgPostion.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblAvgPostion.setBounds(10, 63, 94, 18);
		getContentPane().add(lblAvgPostion);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(149, 61, 144, 19);
		getContentPane().add(textField_1);
		
		JLabel lblDidHeWin = new JLabel("Did he win?");
		lblDidHeWin.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDidHeWin.setBounds(10, 84, 85, 18);
		getContentPane().add(lblDidHeWin);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(289, 122, 85, 21);
		getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.setBounds(149, 81, 103, 21);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Yes");
		rdbtnNewRadioButton_1.setBounds(149, 106, 103, 21);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblDidHeGet = new JLabel("Did he get poles?");
		lblDidHeGet.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDidHeGet.setBounds(10, 109, 119, 18);
		getContentPane().add(lblDidHeGet);

	}
}
