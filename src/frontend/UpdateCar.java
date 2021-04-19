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

public class UpdateCar extends JDialog {
	private JTextField mgukField;
	private JTextField esField;
	private JTextField iceField;
	private JTextField ceField;
	private JTextField geraboxField;
	private JTextField tcField;
	private JTextField mguhField;
	private JTextField carIDField;
	private DBMethods dbm = new DBMethods();
	private DataTreat data = new DataTreat();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateCar dialog = new UpdateCar();
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
	public UpdateCar() {
		dbm.Reg();
		dbm.Connect();
		setBounds(100, 100, 382, 294);
		getContentPane().setLayout(null);
		
		JLabel lblMotorStausUpdate = new JLabel("Motor Staus Update:");
		lblMotorStausUpdate.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
		lblMotorStausUpdate.setBounds(10, 10, 192, 22);
		getContentPane().add(lblMotorStausUpdate);
		
		JLabel lblMguk = new JLabel("MGUK:");
		lblMguk.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblMguk.setBounds(18, 62, 85, 18);
		getContentPane().add(lblMguk);
		
		mgukField = new JTextField();
		mgukField.setColumns(10);
		mgukField.setBounds(122, 62, 144, 19);
		getContentPane().add(mgukField);
		
		esField = new JTextField();
		esField.setColumns(10);
		esField.setBounds(122, 83, 144, 19);
		getContentPane().add(esField);
		
		JLabel lblEs = new JLabel("ES:");
		lblEs.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblEs.setBounds(18, 83, 85, 18);
		getContentPane().add(lblEs);
		
		iceField = new JTextField();
		iceField.setColumns(10);
		iceField.setBounds(122, 125, 144, 19);
		getContentPane().add(iceField);
		
		JLabel lblMguk_1_1 = new JLabel("ICE:");
		lblMguk_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblMguk_1_1.setBounds(18, 125, 85, 18);
		getContentPane().add(lblMguk_1_1);
		
		JLabel lblCe = new JLabel("CE:");
		lblCe.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblCe.setBounds(18, 104, 85, 18);
		getContentPane().add(lblCe);
		
		ceField = new JTextField();
		ceField.setColumns(10);
		ceField.setBounds(122, 104, 144, 19);
		getContentPane().add(ceField);
		
		JLabel lblMguk_2_1 = new JLabel("GEARBOX:");
		lblMguk_2_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblMguk_2_1.setBounds(18, 185, 85, 18);
		getContentPane().add(lblMguk_2_1);
		
		geraboxField = new JTextField();
		geraboxField.setColumns(10);
		geraboxField.setBounds(122, 185, 144, 19);
		getContentPane().add(geraboxField);
		
		JLabel lblMguk_1_2 = new JLabel("TC:");
		lblMguk_1_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblMguk_1_2.setBounds(18, 166, 85, 18);
		getContentPane().add(lblMguk_1_2);
		
		tcField = new JTextField();
		tcField.setColumns(10);
		tcField.setBounds(122, 164, 144, 19);
		getContentPane().add(tcField);
		
		mguhField = new JTextField();
		mguhField.setColumns(10);
		mguhField.setBounds(122, 145, 144, 19);
		getContentPane().add(mguhField);
		
		JLabel lblMguh = new JLabel("MGUH:");
		lblMguh.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblMguh.setBounds(18, 145, 85, 18);
		getContentPane().add(lblMguh);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean canInsert = true;
				
				String CarIDStr = carIDField.getText();
				int carID = 0;
				if(data.isThatInt(CarIDStr)) {
					carID = data.convertToIntBasic(CarIDStr);
					if(dbm.existStuffInt("car", "cid", carID)){
						System.out.println("cool");
					}else {
						canInsert = false;
						CustomNotification("Nem létezõ kocsira hivatkozik",0);
					}
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az ID",0);
				}
				
				
				String mgukStr = mgukField.getText();
				int mguk = 0;
				if(data.isThatInt(mgukStr)){
					mguk = data.convertToIntBasic(mgukStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az MGUK",0);
				}
				
				String esStr = esField.getText();
				int es = 0;
				if(data.isThatInt(esStr)){
					es = data.convertToIntBasic(esStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az ES",0);
				}
				
				String ceStr = ceField.getText();
				int ce = 0;
				if(data.isThatInt(ceStr)){
					ce = data.convertToIntBasic(ceStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az CE",0);
				}
				
				String iceStr = iceField.getText();
				int ice = 0;
				if(data.isThatInt(iceStr)){
					ice = data.convertToIntBasic(iceStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az ICE",0);
				}

				String mguhStr = mguhField.getText();
				int mguh = 0;
				if(data.isThatInt(mguhStr)){
					mguh = data.convertToIntBasic(mguhStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az MGUH",0);
				}

				String tcStr = tcField.getText();
				int tc = 0;
				if(data.isThatInt(tcStr)){
					tc = data.convertToIntBasic(tcStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az TC",0);
				}
				
				String gearboxStr = geraboxField.getText();
				int gearbox = 0;
				if(data.isThatInt(gearboxStr)){
					gearbox = data.convertToIntBasic(gearboxStr);
				}else {
					canInsert = false;
					CustomNotification("Nem szám típusú az TC",0);
				}
				
				
				if(canInsert) {
					String sqlp = "update car set mguk="+mguk+", es="+es+", ce="+ce+", ice="+ice+", mguh = "+mguh+", tc="+tc+", gearbox="+gearbox+" where cid="+carID+";";
					dbm.CommandExecute(sqlp);
					CustomNotification("Sikeres update", 1);
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(273, 229, 85, 21);
		getContentPane().add(btnNewButton);
		
		JLabel lblCarId = new JLabel("Car ID:");
		lblCarId.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lblCarId.setBounds(20, 42, 85, 18);
		getContentPane().add(lblCarId);
		
		carIDField = new JTextField();
		carIDField.setColumns(10);
		carIDField.setBounds(124, 42, 144, 19);
		getContentPane().add(carIDField);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnBack.setBounds(183, 229, 85, 21);
		getContentPane().add(btnBack);

	}
	
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}
}
