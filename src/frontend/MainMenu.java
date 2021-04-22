package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;

import backend.DBMethods;
import backend.PartTM;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class MainMenu extends JDialog {

	
	private DBMethods dbm = new DBMethods();
	private PartTM ptm;
	

	/**
	 * Create the dialog.
	 */
	public MainMenu() {
		dbm.Reg();
		dbm.Connect();
		setBounds(100, 100, 398, 430);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ListPart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ptm = dbm.ReadAllPart();
				ListPart pl = new ListPart(MainMenu.this, ptm);
				pl.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(206, 303, 129, 32);
		getContentPane().add(btnNewButton);
		
		JButton btnUpdateDriver = new JButton("Update Driver");
		btnUpdateDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateDriver ud = new UpdateDriver();
				ud.setVisible(true);
			}
		});
		btnUpdateDriver.setBounds(206, 168, 129, 32);
		getContentPane().add(btnUpdateDriver);
		
		JButton btnUpdateCar = new JButton("Update Car");
		btnUpdateCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateCar uc = new UpdateCar();
				uc.setVisible(true);
			}
		});
		btnUpdateCar.setBounds(206, 126, 129, 32);
		getContentPane().add(btnUpdateCar);
		
		JButton btnDeleteUser = new JButton("Delete Tyre");
		btnDeleteUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteTyre du = new DeleteTyre();
				du.setVisible(true);
			}
		});
		btnDeleteUser.setBounds(206, 264, 129, 32);
		getContentPane().add(btnDeleteUser);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Convert con = new Convert();
				con.setVisible(true);
			}
		});
		btnConvert.setBounds(206, 35, 129, 32);
		getContentPane().add(btnConvert);
		
		JButton btnCompareDriver = new JButton("Compare Driver");
		btnCompareDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompareDrivers cd = new CompareDrivers();
				cd.setVisible(true);
			}
		});
		btnCompareDriver.setBounds(206, 345, 129, 32);
		getContentPane().add(btnCompareDriver);
		
		JButton btnAdduser = new JButton("Add User");
		btnAdduser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddUser au = new AddUser();
				au.setVisible(true);
			}
		});
		btnAdduser.setBounds(10, 60, 129, 32);
		getContentPane().add(btnAdduser);
		
		JButton btnAddTyre = new JButton("Add Tyre");
		btnAddTyre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTyre at = new AddTyre();
				at.setVisible(true);
			}
		});
		btnAddTyre.setBounds(10, 102, 129, 32);
		getContentPane().add(btnAddTyre);
		
		JButton btnAddSetup = new JButton("Add Setup");
		btnAddSetup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSetup as = new AddSetup();
				as.setVisible(true);
			}
		});
		btnAddSetup.setBounds(10, 139, 129, 32);
		getContentPane().add(btnAddSetup);
		
		JButton btnAddPart = new JButton("Add Part");
		btnAddPart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPart ap = new AddPart();
				ap.setVisible(true);
			}
		});
		btnAddPart.setBounds(10, 181, 129, 32);
		getContentPane().add(btnAddPart);
		
		JButton btnAddLaptime = new JButton("Add LapTime");
		btnAddLaptime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddLapTime alt = new AddLapTime();
				alt.setVisible(true);
			}
		});
		btnAddLaptime.setBounds(10, 223, 129, 32);
		getContentPane().add(btnAddLaptime);
		
		JButton btnAddLaptime_1 = new JButton("Add Driver");
		btnAddLaptime_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddDriver adr = new AddDriver();
				adr.setVisible(true);
			}
		});
		btnAddLaptime_1.setBounds(10, 265, 129, 32);
		getContentPane().add(btnAddLaptime_1);
		
		JLabel lblConvert = new JLabel("Convert");
		lblConvert.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblConvert.setBounds(230, 10, 114, 22);
		getContentPane().add(lblConvert);
		
		JLabel lblConvert_1 = new JLabel("Update");
		lblConvert_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblConvert_1.setBounds(230, 95, 114, 22);
		getContentPane().add(lblConvert_1);
		
		JLabel lblConvert_1_1 = new JLabel("More");
		lblConvert_1_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblConvert_1_1.setBounds(241, 238, 63, 22);
		getContentPane().add(lblConvert_1_1);
		
		JLabel lblAdd = new JLabel("Add");
		lblAdd.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblAdd.setBounds(44, 35, 51, 22);
		getContentPane().add(lblAdd);
		
		
		
		
		Object partTm[] = {"Jel","Pid","Name","Part IN","Price","Location", "link"};
		PartTM ptm = new PartTM(partTm, 7);

	}
}
