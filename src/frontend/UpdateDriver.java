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
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateDriver extends JDialog {
	private JTextField DriverIDField;
	private JTextField avgpositonField;
	private DBMethods dbm = new DBMethods();
	private DataTreat data = new DataTreat();
	private JTextField polesField;
	private JTextField winsField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateDriver dialog = new UpdateDriver();
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
	public UpdateDriver() {
		dbm.Reg();
		dbm.Connect();
		setBounds(100, 100, 381, 213);
		getContentPane().setLayout(null);
		
		JLabel lblDriverStatusUpdate = new JLabel("Driver Status Update:");
		lblDriverStatusUpdate.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
		lblDriverStatusUpdate.setBounds(10, 10, 192, 22);
		getContentPane().add(lblDriverStatusUpdate);
		
		JLabel lblDriverId = new JLabel("Driver ID:");
		lblDriverId.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDriverId.setBounds(10, 42, 85, 18);
		getContentPane().add(lblDriverId);
		
		DriverIDField = new JTextField();
		DriverIDField.setColumns(10);
		DriverIDField.setBounds(149, 40, 144, 19);
		getContentPane().add(DriverIDField);
		
		JLabel lblAvgPostion = new JLabel("AVG Postion:");
		lblAvgPostion.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblAvgPostion.setBounds(10, 63, 94, 18);
		getContentPane().add(lblAvgPostion);
		
		avgpositonField = new JTextField();
		avgpositonField.setColumns(10);
		avgpositonField.setBounds(149, 61, 144, 19);
		getContentPane().add(avgpositonField);
		
		JLabel lblDidHeGet = new JLabel("Number of poles");
		lblDidHeGet.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDidHeGet.setBounds(10, 109, 119, 18);
		getContentPane().add(lblDidHeGet);
		
		JLabel lblDidHeWin = new JLabel("Number of Win");
		lblDidHeWin.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDidHeWin.setBounds(10, 84, 119, 18);
		getContentPane().add(lblDidHeWin);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean canInsert = true;
				boolean didHeWin = false;
				boolean didHeGetPole = false;
				
				String DriverIDStr = DriverIDField.getText();
				int id = 0;
				if(data.isThatInt(DriverIDStr)) {
					id = data.convertToIntBasic(DriverIDStr);
					if(dbm.existStuffInt("driver", "did", id)) {
						System.out.println("Cool");
					}else {
						canInsert = false;
						CustomNotification("Nem létezõ versenyzõre hivatkozik", 0);
					}
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az ID", 0);
				}
				
				
				String AVGPosStr = avgpositonField.getText();
				double avg = 0;
				if(data.isThatIDouble(AVGPosStr)) {
					avg = data.convertToDoubleBasic(AVGPosStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az AVG", 0);
				}
				
				String winsStr = winsField.getText();
				int win = 0;
				if(data.isThatInt(winsStr)) {
					win = data.convertToIntBasic(winsStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az WIN", 0);
				}
				
				String polesStr = polesField.getText();
				int poles = 0;
				if(data.isThatInt(polesStr)) {
					poles = data.convertToIntBasic(polesStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az POLES", 0);
				}
				
				
				if(canInsert) {
					String sqlp = "update driver set avgstart="+avg+", poles="+poles+", wins="+win+" where did="+id+";";
					dbm.CommandExecute(sqlp);
					
					
				
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(272, 149, 85, 21);
		getContentPane().add(btnNewButton);
		

		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnBack.setBounds(181, 149, 85, 21);
		getContentPane().add(btnBack);
		
		polesField = new JTextField();
		polesField.setColumns(10);
		polesField.setBounds(149, 105, 87, 19);
		getContentPane().add(polesField);
		
		winsField = new JTextField();
		winsField.setColumns(10);
		winsField.setBounds(149, 84, 87, 19);
		getContentPane().add(winsField);

	}
	
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}
}
