package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UpdateCar extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateCar dialog = new UpdateCar();
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
	public UpdateCar() {
		setBounds(100, 100, 413, 232);
		getContentPane().setLayout(null);
		
		JLabel lblMotorStausUpdate = new JLabel("Motor Staus Update:");
		lblMotorStausUpdate.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
		lblMotorStausUpdate.setBounds(10, 10, 192, 22);
		getContentPane().add(lblMotorStausUpdate);
		
		JLabel lblMguk = new JLabel("MGUK:");
		lblMguk.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblMguk.setBounds(10, 42, 85, 18);
		getContentPane().add(lblMguk);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(114, 42, 144, 19);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 63, 144, 19);
		getContentPane().add(textField_1);
		
		JLabel lblEs = new JLabel("ES:");
		lblEs.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblEs.setBounds(10, 63, 85, 18);
		getContentPane().add(lblEs);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(114, 105, 144, 19);
		getContentPane().add(textField_2);
		
		JLabel lblMguk_1_1 = new JLabel("ICE:");
		lblMguk_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblMguk_1_1.setBounds(10, 105, 85, 18);
		getContentPane().add(lblMguk_1_1);
		
		JLabel lblCe = new JLabel("CE:");
		lblCe.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblCe.setBounds(10, 84, 85, 18);
		getContentPane().add(lblCe);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(114, 84, 144, 19);
		getContentPane().add(textField_3);
		
		JLabel lblMguk_2_1 = new JLabel("GEARBOX:");
		lblMguk_2_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblMguk_2_1.setBounds(10, 167, 85, 18);
		getContentPane().add(lblMguk_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(114, 167, 144, 19);
		getContentPane().add(textField_5);
		
		JLabel lblMguk_1_2 = new JLabel("TC:");
		lblMguk_1_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblMguk_1_2.setBounds(10, 146, 85, 18);
		getContentPane().add(lblMguk_1_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(114, 146, 144, 19);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(114, 125, 144, 19);
		getContentPane().add(textField_7);
		
		JLabel lblMguh = new JLabel("MGUH:");
		lblMguh.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblMguh.setBounds(10, 125, 85, 18);
		getContentPane().add(lblMguh);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(304, 166, 85, 21);
		getContentPane().add(btnNewButton);

	}

}
