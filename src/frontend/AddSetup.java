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

public class AddSetup extends JDialog {
	private JTextField nameFied;
	private JTextField carIDField;
	private JTextField rwaF;
	private JTextField fwaF;
	private JTextField daofftF;
	private JTextField daontF;
	private JTextField rtpF;
	private JTextField tftpF;
	private JTextField rcF;
	private JTextField fcF;
	private JTextField ftF;
	private JTextField rtF;
	private JTextField fsF;
	private JTextField rsF;
	private JTextField farbF;
	private JTextField rarbF;
	private JTextField rrhF;
	private JTextField frhF;
	private JTextField balanceF;
	private JTextField bpF;
	private JTextField fbbF;
	private DBMethods dbm = new DBMethods();
	private DataTreat data = new DataTreat();


	/**
	 * Create the dialog.
	 */
	public AddSetup() {
		dbm.Reg();
		dbm.Connect();
		setBounds(100, 100, 730, 610);
		getContentPane().setLayout(null);
		
		JLabel lblAddSetup = new JLabel("Add Setup:");
		lblAddSetup.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 19));
		lblAddSetup.setBounds(308, 10, 93, 22);
		getContentPane().add(lblAddSetup);
		
		JLabel lblCarId = new JLabel("Basic Datas:");
		lblCarId.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblCarId.setBounds(10, 30, 93, 18);
		getContentPane().add(lblCarId);
		
		JLabel lblDriverId = new JLabel("Car ID:");
		lblDriverId.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDriverId.setBounds(10, 102, 72, 18);
		getContentPane().add(lblDriverId);
		
		JLabel lblNameOfThe = new JLabel("Name of the setup:");
		lblNameOfThe.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNameOfThe.setBounds(10, 58, 130, 18);
		getContentPane().add(lblNameOfThe);
		
		nameFied = new JTextField();
		nameFied.setBounds(10, 73, 130, 19);
		getContentPane().add(nameFied);
		nameFied.setColumns(10);
		
		carIDField = new JTextField();
		carIDField.setColumns(10);
		carIDField.setBounds(10, 117, 130, 19);
		getContentPane().add(carIDField);
		
		rwaF = new JTextField();
		rwaF.setColumns(10);
		rwaF.setBounds(10, 248, 130, 19);
		getContentPane().add(rwaF);
		
		JLabel lblRearWingAero = new JLabel("Rear Wing Aero: ");
		lblRearWingAero.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblRearWingAero.setBounds(10, 233, 149, 18);
		getContentPane().add(lblRearWingAero);
		
		fwaF = new JTextField();
		fwaF.setColumns(10);
		fwaF.setBounds(10, 204, 130, 19);
		getContentPane().add(fwaF);
		
		JLabel lblFrontWingAero = new JLabel("Front Wing Aero:");
		lblFrontWingAero.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblFrontWingAero.setBounds(10, 189, 149, 18);
		getContentPane().add(lblFrontWingAero);
		
		JLabel lblAerodynamics = new JLabel("Aerodynamics:");
		lblAerodynamics.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblAerodynamics.setBounds(10, 161, 119, 18);
		getContentPane().add(lblAerodynamics);
		
		daofftF = new JTextField();
		daofftF.setColumns(10);
		daofftF.setBounds(10, 379, 130, 19);
		getContentPane().add(daofftF);
		
		JLabel lblDifferentialAdjustmentOff = new JLabel("Differential Adjustment Off Throttle:");
		lblDifferentialAdjustmentOff.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDifferentialAdjustmentOff.setBounds(10, 364, 233, 18);
		getContentPane().add(lblDifferentialAdjustmentOff);
		
		daontF = new JTextField();
		daontF.setColumns(10);
		daontF.setBounds(10, 335, 130, 19);
		getContentPane().add(daontF);
		
		JLabel lblDifferentialAdjustmentOn = new JLabel("Differential Adjustment On Throttle:");
		lblDifferentialAdjustmentOn.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDifferentialAdjustmentOn.setBounds(10, 320, 233, 18);
		getContentPane().add(lblDifferentialAdjustmentOn);
		
		JLabel lblTransmission = new JLabel("Transmission");
		lblTransmission.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblTransmission.setBounds(10, 292, 119, 18);
		getContentPane().add(lblTransmission);
		
		rtpF = new JTextField();
		rtpF.setColumns(10);
		rtpF.setBounds(10, 509, 130, 19);
		getContentPane().add(rtpF);
		
		JLabel lblRearTyrePressure = new JLabel("Rear Tyre Pressure:");
		lblRearTyrePressure.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblRearTyrePressure.setBounds(10, 494, 142, 18);
		getContentPane().add(lblRearTyrePressure);
		
		tftpF = new JTextField();
		tftpF.setColumns(10);
		tftpF.setBounds(10, 465, 130, 19);
		getContentPane().add(tftpF);
		
		JLabel lblTyresFrontTyre = new JLabel("Tyres Front Tyre Pressure:");
		lblTyresFrontTyre.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblTyresFrontTyre.setBounds(10, 450, 182, 18);
		getContentPane().add(lblTyresFrontTyre);
		
		JLabel lblTyres = new JLabel("Tyres:");
		lblTyres.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblTyres.setBounds(10, 422, 119, 18);
		getContentPane().add(lblTyres);
		
		JLabel lblPsi = new JLabel("psi");
		lblPsi.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPsi.setBounds(144, 466, 25, 18);
		getContentPane().add(lblPsi);
		
		JLabel lblPsi_1 = new JLabel("psi");
		lblPsi_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPsi_1.setBounds(144, 509, 25, 18);
		getContentPane().add(lblPsi_1);
		
		JLabel lblPsi_2 = new JLabel("%");
		lblPsi_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPsi_2.setBounds(144, 338, 25, 18);
		getContentPane().add(lblPsi_2);
		
		JLabel lblPsi_2_1 = new JLabel("%");
		lblPsi_2_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPsi_2_1.setBounds(144, 382, 25, 18);
		getContentPane().add(lblPsi_2_1);
		
		rcF = new JTextField();
		rcF.setColumns(10);
		rcF.setBounds(302, 117, 130, 19);
		getContentPane().add(rcF);
		
		JLabel lblRearCamber = new JLabel("Rear Camber:");
		lblRearCamber.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblRearCamber.setBounds(302, 102, 99, 18);
		getContentPane().add(lblRearCamber);
		
		JLabel lblFrontCamber = new JLabel("Front Camber:");
		lblFrontCamber.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblFrontCamber.setBounds(302, 58, 130, 18);
		getContentPane().add(lblFrontCamber);
		
		fcF = new JTextField();
		fcF.setColumns(10);
		fcF.setBounds(302, 73, 130, 19);
		getContentPane().add(fcF);
		
		JLabel lblSuspensionGeometry = new JLabel("Suspension Geometry");
		lblSuspensionGeometry.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblSuspensionGeometry.setBounds(302, 30, 166, 18);
		getContentPane().add(lblSuspensionGeometry);
		
		JLabel lblNameOfThe_1_1 = new JLabel("Front Toe:");
		lblNameOfThe_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNameOfThe_1_1.setBounds(302, 145, 130, 18);
		getContentPane().add(lblNameOfThe_1_1);
		
		ftF = new JTextField();
		ftF.setColumns(10);
		ftF.setBounds(302, 160, 130, 19);
		getContentPane().add(ftF);
		
		JLabel lblDriverId_1_1 = new JLabel("Rear Toe:");
		lblDriverId_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDriverId_1_1.setBounds(302, 189, 72, 18);
		getContentPane().add(lblDriverId_1_1);
		
		rtF = new JTextField();
		rtF.setColumns(10);
		rtF.setBounds(302, 204, 130, 19);
		getContentPane().add(rtF);
		
		JLabel lblSuspension = new JLabel("Suspension");
		lblSuspension.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblSuspension.setBounds(302, 259, 166, 18);
		getContentPane().add(lblSuspension);
		
		JLabel lblFontSuspension = new JLabel("Font Suspension:");
		lblFontSuspension.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblFontSuspension.setBounds(302, 287, 130, 18);
		getContentPane().add(lblFontSuspension);
		
		fsF = new JTextField();
		fsF.setColumns(10);
		fsF.setBounds(302, 302, 130, 19);
		getContentPane().add(fsF);
		
		JLabel lblRearSuspension = new JLabel("Rear Suspension:");
		lblRearSuspension.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblRearSuspension.setBounds(302, 331, 130, 18);
		getContentPane().add(lblRearSuspension);
		
		rsF = new JTextField();
		rsF.setColumns(10);
		rsF.setBounds(302, 346, 130, 19);
		getContentPane().add(rsF);
		
		JLabel lblNameOfThe_1_1_1 = new JLabel("Front Anti-Roll Bar:");
		lblNameOfThe_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNameOfThe_1_1_1.setBounds(302, 374, 130, 18);
		getContentPane().add(lblNameOfThe_1_1_1);
		
		farbF = new JTextField();
		farbF.setColumns(10);
		farbF.setBounds(302, 389, 130, 19);
		getContentPane().add(farbF);
		
		JLabel lblDriverId_1_1_1 = new JLabel("Rear Anti-Roll Bar:");
		lblDriverId_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDriverId_1_1_1.setBounds(302, 418, 130, 18);
		getContentPane().add(lblDriverId_1_1_1);
		
		rarbF = new JTextField();
		rarbF.setColumns(10);
		rarbF.setBounds(302, 433, 130, 19);
		getContentPane().add(rarbF);
		
		rrhF = new JTextField();
		rrhF.setColumns(10);
		rrhF.setBounds(302, 524, 130, 19);
		getContentPane().add(rrhF);
		
		JLabel lblDriverId_1_1_1_1 = new JLabel("Rear Ride Height:");
		lblDriverId_1_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDriverId_1_1_1_1.setBounds(302, 509, 130, 18);
		getContentPane().add(lblDriverId_1_1_1_1);
		
		frhF = new JTextField();
		frhF.setColumns(10);
		frhF.setBounds(302, 480, 130, 19);
		getContentPane().add(frhF);
		
		JLabel lblNameOfThe_1_1_1_1 = new JLabel("Front Ride Height:");
		lblNameOfThe_1_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNameOfThe_1_1_1_1.setBounds(302, 465, 130, 18);
		getContentPane().add(lblNameOfThe_1_1_1_1);
		
		JLabel lblBrakes = new JLabel("Brakes");
		lblBrakes.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblBrakes.setBounds(539, 30, 166, 18);
		getContentPane().add(lblBrakes);
		
		JLabel lblBrakePressure = new JLabel("Brake Pressure:");
		lblBrakePressure.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblBrakePressure.setBounds(539, 58, 130, 18);
		getContentPane().add(lblBrakePressure);
		
		JLabel lblFrontBrakeBias = new JLabel("Front Brake Bias:");
		lblFrontBrakeBias.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblFrontBrakeBias.setBounds(539, 102, 130, 18);
		getContentPane().add(lblFrontBrakeBias);
		
		JLabel lblWeightDistribution = new JLabel("Weight Distribution");
		lblWeightDistribution.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblWeightDistribution.setBounds(539, 173, 166, 18);
		getContentPane().add(lblWeightDistribution);
		
		JLabel lblBallast = new JLabel("Ballast:");
		lblBallast.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblBallast.setBounds(539, 201, 130, 18);
		getContentPane().add(lblBallast);
		
		balanceF = new JTextField();
		balanceF.setColumns(10);
		balanceF.setBounds(539, 216, 130, 19);
		getContentPane().add(balanceF);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.setBounds(519, 259, 72, 37);
		getContentPane().add(btnNewButton);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Initializing
				boolean canInsert = true;
				String name = nameFied.getText();
				String carIDStr =  carIDField.getText();
				String rwaStr = rwaF.getText();
				String fwaStr = fwaF.getText();
				String daofftStr = daofftF.getText();
				String daontStr = daontF.getText();
				String rtpStr = rtpF.getText();
				String tftpStr = tftpF.getText();
				String rcStr = rcF.getText();
				String fcStr = fcF.getText();
				String ftStr = ftF.getText();
				String rtStr = rtF.getText();
				String fsStr = fsF.getText();
				String rsStr =  rsF.getText();
				String farbStr = farbF.getText();
				String rarbStr = rarbF.getText();
				String rrhStr = rrhF.getText();
				String frhStr = frhF.getText();
				String balanceStr = balanceF.getText();
				String bpStr = bpF.getText();
				String fbbStr = fbbF.getText();
				
				int id = dbm.makeNewID("setup", "sid");
				int balance = 0; 
				
				int carID =  0;
				int rwa = 0;
				int fwa= 0;

				int daofft = 0;
				int daont = 0;
				
				double rtp = 0;
				double tftp = 0;
				
				double rc = 0;
				double fc = 0;
				double ft = 0;
				double rt = 0;
				
				int fs = 0;
				int rs =  0;
				int farb = 0;
				int rarb = 0;
				int rrh = 0;
				int frh = 0;
				
				int bp = 0;
				int fbb = 0;

				//Checks
				//Basic Datas
				
				if(name.isEmpty()) {
					CustomNotification("A név helye üres", 0);
					canInsert = false; 
				}
				
				
				if(data.isThatInt(carIDStr)) {
					carID = data.convertToIntBasic(carIDStr);
					if(dbm.existStuffInt("car", "cid", carID)) {
						System.out.println("cool");
					}else {
						CustomNotification("Nem létezõ kocsira hivatkozik!",0);
						canInsert = false;
					}
				}else {
					CustomNotification("Probléma van a CarID-val",0);
					canInsert = false;
				}
			
				
				if(data.isThatInt(rwaStr)) {
					rwa = data.convertToIntBasic(rwaStr);
				}else {
					CustomNotification("Probléma van a(z) Rear Wing Areo-val",0);
					canInsert = false;
				}
				
				
				if(data.isThatInt(fwaStr)) {
					fwa = data.convertToIntBasic(fwaStr);
				}else {
					CustomNotification("Probléma van a(z) Front Wing Areo-val!",0);
					canInsert = false;
				}
				
				
				if(data.isThatInt(daofftStr)) {
					daofft = data.convertToIntBasic(daofftStr);
				}else {
					CustomNotification("Probléma van a Differential Adjustment Off Throttle:",0);
					canInsert = false;
				}
				
				
				if(data.isThatInt(daontStr)) {
					daont = data.convertToIntBasic(daontStr);
				}else {
					CustomNotification("Probléma van a Differential Adjustment On Throttle:",0);
					canInsert = false;
				}
			
				
				if(data.isThatIDouble(rtpStr)) {
					rtp = data.convertToDoubleBasic(rtpStr);
				}else {
					CustomNotification("Probléma van a Rear Tyre Pressure",0);
					canInsert = false;
				}
				
				
				if(data.isThatIDouble(tftpStr)) {
					tftp = data.convertToDoubleBasic(tftpStr);
				}else {
					CustomNotification("Probléma van a Front Tyre Pressure",0);
					canInsert = false;
				}
				
				
				if(data.isThatIDouble(rcStr)) {
					rc = data.convertToDoubleBasic(rcStr);
				}else {
					CustomNotification("Probléma van a Rear Camber",0);
					canInsert = false;
				}
				
				if(data.isThatIDouble(fcStr)) {
					fc = data.convertToDoubleBasic(fcStr);
				}else {
					CustomNotification("Probléma van a Front Camber",0);
					canInsert = false;
				}
				
				if(data.isThatIDouble(ftStr)) {
					ft = data.convertToDoubleBasic(ftStr);
				}else {
					CustomNotification("Probléma van a Front Toe",0);
					canInsert = false;
				}
				
				if(data.isThatIDouble(rtStr)) {
					rt = data.convertToDoubleBasic(rtStr);
				}else {
					CustomNotification("Probléma van a Rear Toe",0);
					canInsert = false;
				}
				
				if(data.isThatInt(fsStr)) {
					fs = data.convertToIntBasic(fsStr);
				}else {
					CustomNotification("Probléma van a Front Suspension",0);
					canInsert = false;
				}
				
				if(data.isThatInt(rsStr)) {
					rs = data.convertToIntBasic(rsStr);
				}else {
					CustomNotification("Probléma van a Rear Suspension",0);
					canInsert = false;
				}
				
				
				if(data.isThatInt(farbStr)) {
					farb = data.convertToIntBasic(farbStr);
				}else {
					CustomNotification("Probléma van a Front Anti-Roll Bar ",0);
					canInsert = false;
				}
								
				if(data.isThatInt(rarbStr)) {
					rarb = data.convertToIntBasic(rarbStr);
				}else {
					CustomNotification("Probléma van a Rear Anti-Roll Bar ",0);
					canInsert = false;
				}
				
				
				if(data.isThatInt(rrhStr)) {
					rrh = data.convertToIntBasic(rrhStr);
				}else {
					CustomNotification("Probléma van a Rear Ride Height",0);
					canInsert = false;
				}
				

				if(data.isThatInt(bpStr)) {
					bp = data.convertToIntBasic(bpStr);
				}else {
					CustomNotification("Probléma van a Brake Pressure",0);
					canInsert = false;
				}
								
				if(data.isThatInt(fbbStr)) {
					fbb = data.convertToIntBasic(fbbStr);
				}else {
					CustomNotification("Probléma van a Front Brake Bias",0);
					canInsert = false;
				}
				
				
				if(data.isThatInt(balanceStr)) {
					balance = data.convertToIntBasic(balanceStr);
				}else {
					CustomNotification("Probléma van a Ballast",0);
					canInsert = false;
				}
				
				
				if(canInsert) {
					String sqlp = "insert into setup values ("+id+", "+carID+", '"+name+"', "+fwa+", "+rwa+", "+daont+", "+daofft+", "+fc+", "+rc+", "+ft+", "+rt+", "+fs+", "+rs+", "+farb+", "+rarb+", "+frh+", "+rrh+", "+bp+", "+fbb+", "+tftp+", "+rtp+", "+balance+");";
					System.out.println(sqlp);
					dbm.CommandExecute(sqlp);
					CustomNotification("Hozzáadva", 1);
				}
				
				
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAdd.setBounds(613, 259, 80, 37);
		getContentPane().add(btnAdd);
		
		JLabel lblPsi_2_2 = new JLabel("%");
		lblPsi_2_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPsi_2_2.setBounds(673, 76, 25, 18);
		getContentPane().add(lblPsi_2_2);
		
		bpF = new JTextField();
		bpF.setColumns(10);
		bpF.setBounds(539, 73, 130, 19);
		getContentPane().add(bpF);
		
		JLabel lblPsi_2_2_1 = new JLabel("%");
		lblPsi_2_2_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPsi_2_2_1.setBounds(673, 120, 25, 18);
		getContentPane().add(lblPsi_2_2_1);
		
		fbbF = new JTextField();
		fbbF.setColumns(10);
		fbbF.setBounds(539, 117, 130, 19);
		getContentPane().add(fbbF);

	}
	
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}


}
