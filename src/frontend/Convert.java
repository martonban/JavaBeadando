package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import backend.DBMethods;


import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Convert extends JDialog {
	private JTextField textField;
	private DBMethods dbm = new DBMethods();

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
		dbm.Reg();
		dbm.Connect();
		setBounds(100, 100, 403, 250);
		getContentPane().setLayout(null);
		

		
		JLabel lblConvert = new JLabel("Convert");
		lblConvert.setFont(new Font("Mongolian Baiti", Font.BOLD, 27));
		lblConvert.setBounds(135, 10, 114, 22);
		getContentPane().add(lblConvert);
		
		JLabel lblOnverTopath = new JLabel("Conver to (path):");
		lblOnverTopath.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblOnverTopath.setBounds(10, 42, 229, 18);
		getContentPane().add(lblOnverTopath);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 62, 369, 19);
		getContentPane().add(textField);
		
		JComboBox formatBox = new JComboBox();
		formatBox.setBounds(10, 121, 114, 21);
		getContentPane().add(formatBox);
		
		JLabel lblFormat = new JLabel("Format:");
		lblFormat.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblFormat.setBounds(10, 102, 83, 18);
		getContentPane().add(lblFormat);
		
		JComboBox tabelBox = new JComboBox();
		tabelBox.setBounds(212, 121, 114, 21);
		getContentPane().add(tabelBox);
		
		JLabel lblTabel = new JLabel("Tabel:");
		lblTabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblTabel.setBounds(212, 102, 83, 18);
		getContentPane().add(lblTabel);
		
		
		String formatum[] = {".txt", ".csv"};
		for (String s: formatum) formatBox.addItem(s);
		
		String tablak[] = {"laptime", "user"};
		for (String s: tablak) tabelBox.addItem(s);
		
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path = textField.getText();
				String format = (String)formatBox.getSelectedItem();
				String table = (String)tabelBox.getSelectedItem();
				if(table.equals("laptime")) {
					String fullPath = path + "/laptime" + format; 
					if(format.equals(".txt")) {
						dbm.PrintToFileLapTime("\t", fullPath);
					}else {
						dbm.PrintToFileLapTime(";", fullPath);
					}	
				}
				
				if(table.equals("user")) {
					String fullPath = path + "/user" + format; 
					if(format.equals(".txt")) {
						dbm.PrintToFileUsers("\t", fullPath);
					}else {
						dbm.PrintToFileUsers(";", fullPath);
					}
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(102, 175, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnClose.setBounds(10, 175, 85, 21);
		getContentPane().add(btnClose);

	}
}
