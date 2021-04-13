package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPart extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPart dialog = new AddPart();
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
	public AddPart() {
		setBounds(100, 100, 404, 376);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Part's name:");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 42, 85, 18);
		getContentPane().add(lblNewLabel);
		
		JLabel lblAddPart = new JLabel("Add Part:");
		lblAddPart.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
		lblAddPart.setBounds(10, 10, 85, 22);
		getContentPane().add(lblAddPart);
		
		textField = new JTextField();
		textField.setBounds(10, 60, 144, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPartsInThe = new JLabel("Part's in the engine:");
		lblPartsInThe.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPartsInThe.setBounds(10, 94, 131, 18);
		getContentPane().add(lblPartsInThe);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 112, 66, 19);
		getContentPane().add(textField_1);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPrice.setBounds(10, 151, 52, 18);
		getContentPane().add(lblPrice);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 169, 79, 19);
		getContentPane().add(textField_2);
		
		JLabel lblPrice_1 = new JLabel("\u20AC");
		lblPrice_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPrice_1.setBounds(99, 170, 52, 18);
		getContentPane().add(lblPrice_1);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblLocation.setBounds(10, 208, 131, 18);
		getContentPane().add(lblLocation);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 229, 85, 21);
		getContentPane().add(comboBox);
		
		JLabel lblLink = new JLabel("Documentation's link:");
		lblLink.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblLink.setBounds(10, 273, 144, 18);
		getContentPane().add(lblLink);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 291, 188, 19);
		getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.setBounds(208, 308, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnAddPart = new JButton("Add Part");
		btnAddPart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddPart.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAddPart.setBounds(299, 308, 85, 21);
		getContentPane().add(btnAddPart);

	}
}
