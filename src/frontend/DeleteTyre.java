package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import backend.DBMethods;
import backend.DataTreat;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteTyre extends JDialog {
	private JTextField textField;
	private DBMethods dbm = new DBMethods();
	private DataTreat data = new DataTreat();



	/**
	 * Create the dialog.
	 */
	public DeleteTyre() {
		dbm.Reg();
		dbm.Connect();
		setBounds(100, 100, 194, 222);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Tyres");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
		lblNewLabel.setBounds(10, 10, 132, 22);
		getContentPane().add(lblNewLabel);
		
		JLabel lblTyreId = new JLabel("Tyre ID:");
		lblTyreId.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblTyreId.setBounds(10, 53, 61, 22);
		getContentPane().add(lblTyreId);
		
		textField = new JTextField();
		textField.setBounds(10, 80, 132, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean canDelete = true;
				String idStr = textField.getText();
				int id = 0;
				if(data.isThatInt(idStr)){
					id = data.convertToIntBasic(idStr);
					if(dbm.existStuffInt("tyres", "tid", id)){
						System.out.println("Cool");
					}else {
						canDelete = false;
						CustomNotification("Nem létezõ abroncsra hibatkozik", 0);
					}
				}else {
					canDelete = false;
					CustomNotification("Nem szám típusú az ID", 0);
				}
				
				if(canDelete) {
					String sqlp = "delete from tyres where tid = " + id + ";";
					dbm.CommandExecute(sqlp);
					CustomNotification("Törölve!", 1);
				}
				
					
			}
		});
		btnNewButton.setBounds(10, 117, 85, 21);
		getContentPane().add(btnNewButton);

	}
	
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}
}
