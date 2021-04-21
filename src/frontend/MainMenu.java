package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;

import backend.DBMethods;
import backend.PartTM;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JDialog {

	
	private DBMethods dbm = new DBMethods();
	private PartTM ptm;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu dialog = new MainMenu();
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
	public MainMenu() {
		dbm.Reg();
		dbm.Connect();
		setBounds(100, 100, 801, 430);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ListPart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ptm = dbm.ReadAllPart();
				ListPart pl = new ListPart(MainMenu.this, ptm);
				pl.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(10, 212, 100, 32);
		getContentPane().add(btnNewButton);
		
		
		
		
		Object partTm[] = {"Jel","Pid","Name","Part IN","Price","Location", "link"};
		PartTM ptm = new PartTM(partTm, 7);

	}

}
