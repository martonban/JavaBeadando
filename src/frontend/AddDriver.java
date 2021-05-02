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

public class AddDriver extends JDialog {
	private JTextField numberField;
	private JTextField nameField;
	private JTextField avgField;
	private JTextField startField;
	private JTextField winsField;
	private JTextField polesField;
	private JTextField IDField;

	private DBMethods dbm = new DBMethods();
	private DataTreat data = new DataTreat();
	
	
	


	/**
	 * Create the dialog.
	 */
	public AddDriver() {
		dbm.Reg();
		dbm.Connect();
		setBounds(100, 100, 458, 322);
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
		numberField.setBounds(184, 51, 42, 19);
		getContentPane().add(numberField);
		numberField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(184, 77, 156, 19);
		getContentPane().add(nameField);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblName.setBounds(10, 80, 89, 13);
		getContentPane().add(lblName);
		
		avgField = new JTextField();
		avgField.setColumns(10);
		avgField.setBounds(184, 135, 62, 19);
		getContentPane().add(avgField);
		
		JLabel lblNumber_1_1 = new JLabel("Avarage Finish:");
		lblNumber_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNumber_1_1.setBounds(10, 138, 124, 13);
		getContentPane().add(lblNumber_1_1);
		
		startField = new JTextField();
		startField.setColumns(10);
		startField.setBounds(184, 106, 42, 19);
		getContentPane().add(startField);
		
		JLabel lblNumberOfRace = new JLabel("Number Of Race Start:");
		lblNumberOfRace.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNumberOfRace.setBounds(10, 109, 156, 13);
		getContentPane().add(lblNumberOfRace);
		
		winsField = new JTextField();
		winsField.setColumns(10);
		winsField.setBounds(184, 193, 62, 19);
		getContentPane().add(winsField);
		
		JLabel lblNumber_1_1_1 = new JLabel("Number of wins:");
		lblNumber_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNumber_1_1_1.setBounds(10, 196, 137, 13);
		getContentPane().add(lblNumber_1_1_1);
		
		polesField = new JTextField();
		polesField.setColumns(10);
		polesField.setBounds(184, 164, 62, 19);
		getContentPane().add(polesField);
		
		JLabel lblNumber_2_1 = new JLabel("Number of poles:");
		lblNumber_2_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNumber_2_1.setBounds(10, 167, 137, 13);
		getContentPane().add(lblNumber_2_1);
		
		IDField = new JTextField();
		IDField.setColumns(10);
		IDField.setBounds(184, 222, 62, 19);
		getContentPane().add(IDField);
		
		JLabel lblNumber_1_1_1_1 = new JLabel("Car  ID:");
		lblNumber_1_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNumber_1_1_1_1.setBounds(10, 225, 89, 13);
		getContentPane().add(lblNumber_1_1_1_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(235, 251, 62, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Driver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean canInsert = true;
				//ID KIOSZTÁS
				int id = dbm.makeNewID("driver", "did");
				
				int number = 0;
				String numberOfDriver = numberField.getText();
				String name = nameField.getText();
				String startStr = startField.getText();
				String avgFinishStr = avgField.getText();
				
				
				if(data.isThatInt(numberOfDriver)) {
					number = data.convertToIntBasic(numberOfDriver);
				}else {
					canInsert = false;
					CustomNotification("A Versenyzõ száma nem szám típusú",0);
				}
				
				
				if(data.isEmpty(name)) {
					canInsert = false;
					CustomNotification("A Versenyzõ neve mezejében nincsen semmi",0);
				}
				
				
				int start = 0;
				if(data.isThatInt(startStr)) {
					start = data.convertToIntBasic(startStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusu adat az indulások számánál", 0);
				}
				
				
				
				double avgFinish = 0;
				if(data.isThatIDouble(avgFinishStr)) {
					avgFinish = data.convertToDoubleBasic(avgFinishStr); 
				}else {
					canInsert = false;
					CustomNotification("Nem double típusú az átalgos finish mezõ!(A tizedes az . nem ,)", 0);
				}
				
				String numberOfPoleStr = polesField.getText();
				int numberOfPole = 0;
				if(data.isThatInt(numberOfPoleStr)) {
					numberOfPole = data.convertToIntBasic(numberOfPoleStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú a pol poziciók száma!", 0);
				}
				
				String numberOfWinsStr = winsField.getText();
				int wins = 0;
				if(data.isThatInt(numberOfWinsStr)) {
					wins = data.convertToIntBasic(numberOfWinsStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusu a gyõzelmek száma",0);
				}
				
				String CIDStr = IDField.getText();
				int cid = 0;
				if(data.isThatInt(CIDStr)) {
					cid = data.convertToIntBasic(CIDStr);
					if(dbm.existStuffInt("car", "cid", cid)) {
						System.out.println("Cool");
					}else {
						CustomNotification("Nem létezõ autóra hivatkozott", 0);
					}
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusu a gyõzelmek száma",0);
				}
				
				
				//Insert
				if(canInsert) {
					String sqlp = "insert into driver values("+id+", "+number+", '"+name+"', "+start+", "+avgFinish+", "+numberOfPole+", "+wins+", "+cid+");";
					dbm.CommandExecute(sqlp);
				}else {
					System.out.println("");
				}
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(307, 251, 119, 21);
		getContentPane().add(btnNewButton_1);

	}
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}

	
}
