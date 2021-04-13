package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Convert extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Convert dialog = new Convert();
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
	public Convert() {
		setBounds(100, 100, 385, 253);
		getContentPane().setLayout(null);
		
		JLabel lblConvert = new JLabel("Convert");
		lblConvert.setFont(new Font("Mongolian Baiti", Font.BOLD, 27));
		lblConvert.setBounds(168, 10, 192, 22);
		getContentPane().add(lblConvert);
		
		JLabel lblOnverTopath = new JLabel("Conver to (path):");
		lblOnverTopath.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblOnverTopath.setBounds(10, 42, 229, 18);
		getContentPane().add(lblOnverTopath);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 62, 253, 19);
		getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("SetUp");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 123, 85, 35);
		getContentPane().add(btnNewButton);
		
		JButton btnLaptimes = new JButton("LapTimes");
		btnLaptimes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLaptimes.setBounds(120, 123, 106, 35);
		getContentPane().add(btnLaptimes);
		
		JButton btnDriver = new JButton("Driver");
		btnDriver.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDriver.setBounds(250, 123, 106, 35);
		getContentPane().add(btnDriver);
		
		JButton btnPart = new JButton("Part");
		btnPart.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPart.setBounds(10, 168, 85, 35);
		getContentPane().add(btnPart);

	}

}
