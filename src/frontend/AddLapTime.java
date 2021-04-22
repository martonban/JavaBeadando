package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import backend.DBMethods;
import backend.DataTreat;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddLapTime extends JDialog {
	private JTextField trackField;
	private JTextField s11f;
	private JTextField s12f;
	private JTextField s13f;
	private JTextField s21f;
	private JTextField s22f;
	private JTextField s23f;
	private JTextField s31f;
	private JTextField s32f;
	private JTextField s33f;
	private JTextField DriverID;
	private JTextField setupField;
	private DBMethods dbm = new DBMethods();
	private DataTreat data = new DataTreat();

	
	/**
	 * Create the dialog.
	 */
	public AddLapTime() {
		dbm.Reg();
		dbm.Connect();
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
		
		trackField = new JTextField();
		trackField.setBounds(59, 49, 40, 19);
		getContentPane().add(trackField);
		trackField.setColumns(10);
		
		JLabel lblSector = new JLabel("Sector 1");
		lblSector.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector.setBounds(10, 77, 53, 18);
		getContentPane().add(lblSector);
		
		s11f = new JTextField();
		s11f.setColumns(10);
		s11f.setBounds(10, 105, 29, 19);
		getContentPane().add(s11f);
		
		JLabel lblSector_1 = new JLabel(":");
		lblSector_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1.setBounds(49, 105, 10, 18);
		getContentPane().add(lblSector_1);
		
		s12f = new JTextField();
		s12f.setColumns(10);
		s12f.setBounds(59, 105, 53, 19);
		getContentPane().add(s12f);
		
		s13f = new JTextField();
		s13f.setColumns(10);
		s13f.setBounds(133, 105, 80, 19);
		getContentPane().add(s13f);
		
		JLabel lblSector_1_1 = new JLabel(":");
		lblSector_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1_1.setBounds(123, 105, 10, 18);
		getContentPane().add(lblSector_1_1);
		
		JLabel lblSector_4 = new JLabel("Sector 2:");
		lblSector_4.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_4.setBounds(10, 143, 72, 18);
		getContentPane().add(lblSector_4);
		
		s21f = new JTextField();
		s21f.setColumns(10);
		s21f.setBounds(10, 171, 29, 19);
		getContentPane().add(s21f);
		
		JLabel lblSector_1_2 = new JLabel(":");
		lblSector_1_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1_2.setBounds(49, 171, 10, 18);
		getContentPane().add(lblSector_1_2);
		
		s22f = new JTextField();
		s22f.setColumns(10);
		s22f.setBounds(59, 171, 53, 19);
		getContentPane().add(s22f);
		
		JLabel lblSector_1_1_1 = new JLabel(":");
		lblSector_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1_1_1.setBounds(123, 171, 10, 18);
		getContentPane().add(lblSector_1_1_1);
		
		s23f = new JTextField();
		s23f.setColumns(10);
		s23f.setBounds(133, 171, 80, 19);
		getContentPane().add(s23f);
		
		JLabel lblSector_3 = new JLabel("Sector 3:");
		lblSector_3.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_3.setBounds(10, 208, 72, 18);
		getContentPane().add(lblSector_3);
		
		s31f = new JTextField();
		s31f.setColumns(10);
		s31f.setBounds(10, 236, 29, 19);
		getContentPane().add(s31f);
		
		JLabel lblSector_1_3 = new JLabel(":");
		lblSector_1_3.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1_3.setBounds(49, 236, 10, 18);
		getContentPane().add(lblSector_1_3);
		
		s32f = new JTextField();
		s32f.setColumns(10);
		s32f.setBounds(59, 236, 53, 19);
		getContentPane().add(s32f);
		
		JLabel lblSector_1_1_2 = new JLabel(":");
		lblSector_1_1_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblSector_1_1_2.setBounds(123, 236, 10, 18);
		getContentPane().add(lblSector_1_1_2);
		
		s33f = new JTextField();
		s33f.setColumns(10);
		s33f.setBounds(133, 236, 80, 19);
		getContentPane().add(s33f);
		
		DriverID = new JTextField();
		DriverID.setColumns(10);
		DriverID.setBounds(208, 48, 40, 19);
		getContentPane().add(DriverID);
		
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
		
		setupField = new JTextField();
		setupField.setColumns(10);
		setupField.setBounds(83, 274, 40, 19);
		getContentPane().add(setupField);
		
		JComboBox compount = new JComboBox();
		compount.setBounds(271, 273, 93, 21);
		getContentPane().add(compount);
		
		
		String elem[] = {"Superhard", "Hard", "Medium", "Soft", "Supersoft", "Ultrasoft", "Hypersoft"};
		for (String s: elem) compount.addItem(s);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.setBounds(221, 355, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnAddLap = new JButton("Add Lap");
		btnAddLap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sel = (String)compount.getSelectedItem();
				int id = dbm.makeNewID("laptime", "lid");
				boolean canInsert = true;
				
				String track = trackField.getText();
				if(data.isEmpty(track)) {
					canInsert = false;
					CustomNotification("Track insert problem",0);
				}
				
				int did = 0;
				String DriverIDStr = DriverID.getText();
				if(data.isThatInt(DriverIDStr)) {
					did = data.convertToIntBasic(DriverIDStr);
					if(dbm.existStuffInt("driver", "did", did)) {
						System.out.println("Cool");
					}else {
						canInsert = false;
						CustomNotification("Nem létezõ pilótára hivatkozik",0);
					}
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú",0);
				}
				
				int sid = 0;
				String setupIDStr = setupField.getText();
				if(data.isThatInt(setupIDStr)) {
					sid = data.convertToIntBasic(setupIDStr);
					if(dbm.existStuffInt("setup", "sid", sid)) {
						System.out.println("Cool");
					}else {
						canInsert = false;
						CustomNotification("Nem létezõ setup hivatkozik",0);
					}
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú",0);
				}
				
				String s11Str = s11f.getText();
				String s12Str = s12f.getText();
				String s13Str = s13f.getText();
				String s21Str = s21f.getText();
				String s22Str = s22f.getText();
				String s23Str = s23f.getText();
				String s31Str = s31f.getText();
				String s32Str = s32f.getText();
				String s33Str = s33f.getText();
				
				
				if(data.isEmpty(s11Str)) {
					canInsert = false;
					CustomNotification("Sector 1",0);
				}
				
				if(data.isEmpty(s12Str)) {
					canInsert = false;
					CustomNotification("Sector 1",0);
				}

				if(data.isEmpty(s13Str)) {
					canInsert = false;
					CustomNotification("Sector 1",0);
				}
				
				if(data.isEmpty(s21Str)) {
					canInsert = false;
					CustomNotification("Sector 2",0);
				}
				
				if(data.isEmpty(s22Str)) {
					canInsert = false;
					CustomNotification("Sector 2",0);
				}

				if(data.isEmpty(s23Str)) {
					canInsert = false;
					CustomNotification("Sector 2",0);
				}
				if(data.isEmpty(s31Str)) {
					canInsert = false;
					CustomNotification("Sector 3",0);
				}
				
				if(data.isEmpty(s32Str)) {
					canInsert = false;
					CustomNotification("Sector 3",0);
				}

				if(data.isEmpty(s33Str)) {
					canInsert = false;
					CustomNotification("Sector 3",0);
				}
				
				String sector1 = s11Str + ":" + s12Str + ":" + s13Str;
				String sector2 = s21Str + ":" + s22Str + ":" + s23Str;
				String sector3 = s31Str + ":" + s32Str + ":" + s33Str;
				
				if(canInsert) {
					String sqlp = "insert into laptime values("+id+", '"+track+"', "+did+", '"+sel+"', '"+sector1+"' , '"+sector2+"', '"+sector3+"', "+sid+" );";
					dbm.CommandExecute(sqlp);
					CustomNotification("Insert", 1);
				}
				
			}
		});
		btnAddLap.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAddLap.setBounds(316, 355, 85, 21);
		getContentPane().add(btnAddLap);

	}
	
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}

}
