package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import backend.DBMethods;
import backend.DataTreat;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddTyre extends JDialog {
	private JTextField trackField;
	private JTextField lapsField;
	private JTextField carIDField;
	private DBMethods dbm = new DBMethods();
	private DataTreat data = new DataTreat();
	
	
	
	/**
	 * Create the dialog.
	 */
	public AddTyre() {
		dbm.Reg();
		dbm.Connect();
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
		
		JComboBox compount = new JComboBox();
		compount.setBounds(10, 112, 93, 21);
		getContentPane().add(compount);
		
		JLabel lblCompount = new JLabel("Compount:");
		lblCompount.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblCompount.setBounds(10, 96, 82, 18);
		getContentPane().add(lblCompount);
		
		trackField = new JTextField();
		trackField.setBounds(10, 64, 132, 19);
		getContentPane().add(trackField);
		trackField.setColumns(10);
		
		lapsField = new JTextField();
		lapsField.setColumns(10);
		lapsField.setBounds(10, 158, 132, 19);
		getContentPane().add(lapsField);
		
		JLabel lblLaps = new JLabel("Laps:");
		lblLaps.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblLaps.setBounds(10, 143, 53, 18);
		getContentPane().add(lblLaps);
		
		JLabel lblCarId = new JLabel("Car ID:");
		lblCarId.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblCarId.setBounds(10, 193, 53, 18);
		getContentPane().add(lblCarId);
		
		carIDField = new JTextField();
		carIDField.setColumns(10);
		carIDField.setBounds(10, 208, 132, 19);
		getContentPane().add(carIDField);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.setBounds(213, 232, 85, 21);
		getContentPane().add(btnNewButton);
		
		
		String elem[] = {"Superhard", "Hard", "Medium", "Soft", "Supersoft", "Ultrasoft", "Hypersoft"};
		for (String s: elem) compount.addItem(s);
		
		
		JButton btnAddTyer = new JButton("Add Tyre");
		btnAddTyer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean canInsert = true;
				int id = dbm.makeNewID("tyres", "tid");
				System.out.println(id);
				String sel = (String)compount.getSelectedItem();
				
				String track = trackField.getText();
				if(data.isEmpty(track)) {
					CustomNotification("Nincs a pályánál megadva semmi", 0);
					canInsert = false;
				}
				
				String lapsStr = lapsField.getText();
				int laps = 0;
				if(data.isThatInt(lapsStr)) {
					laps = data.convertToIntBasic(lapsStr);
				}else {
					CustomNotification("Nincs a körnél megadva rendesen", 0);
					canInsert = false;
				}
				
				String carIDStr = carIDField.getText();
				int carID = 0;
				if(data.isThatInt(carIDStr)) {
					carID = data.convertToIntBasic(carIDStr);
					if(dbm.existStuffInt("car", "cid", carID)) {
						System.out.println("Cool");
					}else {
						canInsert = false;
						CustomNotification("NEm létezõ CID", 0);
					}
				}else {
					CustomNotification("Nincs a körnél megadva rendesen", 0);
					canInsert = false;
				}
				
				
				
				if(canInsert) {
					String sqlp = "insert into tyres values("+id+", '"+sel+"', '"+track+"', "+laps+", " + carID + ");";
					dbm.CommandExecute(sqlp);
				}
				
				
				
				
			}
		});
		btnAddTyer.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAddTyer.setBounds(308, 232, 85, 21);
		getContentPane().add(btnAddTyer);

	}

	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}


}
