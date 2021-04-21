package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;

import backend.DBMethods;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompareDrivers extends JDialog {

	
	private DBMethods dbm = new DBMethods();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompareDrivers dialog = new CompareDrivers();
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
	public CompareDrivers() {
		dbm.Reg();
		dbm.Connect();
		setBounds(100, 100, 607, 440);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Compare Drivers");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 26));
		lblNewLabel.setBounds(202, 10, 203, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel lblSebastianVettel = new JLabel("Sebastian Vettel");
		lblSebastianVettel.setFont(new Font("Mongolian Baiti", Font.BOLD, 23));
		lblSebastianVettel.setBounds(10, 61, 177, 25);
		getContentPane().add(lblSebastianVettel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lance Stroll");
		lblNewLabel_1_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(412, 61, 132, 25);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblSebastianVettel_1 = new JLabel("5");
		lblSebastianVettel_1.setForeground(new Color(238, 130, 238));
		lblSebastianVettel_1.setFont(new Font("Miriam Mono CLM", Font.BOLD, 23));
		lblSebastianVettel_1.setBounds(190, 61, 29, 25);
		getContentPane().add(lblSebastianVettel_1);
		
		JLabel lblSebastianVettel_1_1 = new JLabel("18");
		lblSebastianVettel_1_1.setForeground(new Color(0, 100, 0));
		lblSebastianVettel_1_1.setFont(new Font("Miriam Mono CLM", Font.BOLD, 23));
		lblSebastianVettel_1_1.setBounds(554, 61, 29, 25);
		getContentPane().add(lblSebastianVettel_1_1);
		
		JLabel lblAvaragePace = new JLabel("Avarage finish");
		lblAvaragePace.setFont(new Font("Miriam Mono CLM", Font.BOLD, 16));
		lblAvaragePace.setBounds(228, 116, 146, 25);
		getContentPane().add(lblAvaragePace);
		
		JLabel laFinish = new JLabel("0000");
		laFinish.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		laFinish.setBounds(464, 115, 48, 25);
		getContentPane().add(laFinish);
		
		JLabel sbFinish = new JLabel("0000");
		sbFinish.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		sbFinish.setBounds(70, 115, 48, 25);
		getContentPane().add(sbFinish);
		
		JLabel sbWins = new JLabel("0000");
		sbWins.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		sbWins.setBounds(70, 151, 48, 25);
		getContentPane().add(sbWins);
		
		JLabel lblAvaragePace_2 = new JLabel("Wins");
		lblAvaragePace_2.setFont(new Font("Miriam Mono CLM", Font.BOLD, 16));
		lblAvaragePace_2.setBounds(272, 152, 54, 25);
		getContentPane().add(lblAvaragePace_2);
		
		JLabel laWins = new JLabel("0000");
		laWins.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		laWins.setBounds(464, 151, 48, 25);
		getContentPane().add(laWins);
		
		JLabel sbPoles = new JLabel("0000");
		sbPoles.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		sbPoles.setBounds(70, 186, 48, 25);
		getContentPane().add(sbPoles);
		
		JLabel lblAvaragePace_2_1 = new JLabel("Poles");
		lblAvaragePace_2_1.setFont(new Font("Miriam Mono CLM", Font.BOLD, 16));
		lblAvaragePace_2_1.setBounds(272, 187, 54, 25);
		getContentPane().add(lblAvaragePace_2_1);
		
		JLabel laPoles = new JLabel("0000");
		laPoles.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		laPoles.setBounds(464, 186, 48, 25);
		getContentPane().add(laPoles);
		
		JLabel sbAvgMotor = new JLabel("0000");
		sbAvgMotor.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		sbAvgMotor.setBounds(70, 221, 80, 25);
		getContentPane().add(sbAvgMotor);
		
		JLabel lblAvaragePace_2_1_1 = new JLabel("Avarage motor use");
		lblAvaragePace_2_1_1.setFont(new Font("Miriam Mono CLM", Font.BOLD, 16));
		lblAvaragePace_2_1_1.setBounds(215, 222, 180, 25);
		getContentPane().add(lblAvaragePace_2_1_1);
		
		JLabel laAvgMotor = new JLabel("0000");
		laAvgMotor.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		laAvgMotor.setBounds(464, 221, 80, 25);
		getContentPane().add(laAvgMotor);
		
		JLabel lblAvaragePace_2_2 = new JLabel("More Setups");
		lblAvaragePace_2_2.setFont(new Font("Miriam Mono CLM", Font.BOLD, 16));
		lblAvaragePace_2_2.setBounds(242, 293, 120, 25);
		getContentPane().add(lblAvaragePace_2_2);
		
		JLabel lblMoreLaps = new JLabel("More Laps");
		lblMoreLaps.setFont(new Font("Miriam Mono CLM", Font.BOLD, 16));
		lblMoreLaps.setBounds(250, 257, 98, 25);
		getContentPane().add(lblMoreLaps);
		
		JLabel laLaps = new JLabel("0000");
		laLaps.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		laLaps.setBounds(464, 256, 48, 25);
		getContentPane().add(laLaps);
		
		JLabel laMS = new JLabel("0000");
		laMS.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		laMS.setBounds(464, 292, 48, 25);
		getContentPane().add(laMS);
		
		JLabel sbMS = new JLabel("0000");
		sbMS.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		sbMS.setBounds(70, 292, 48, 25);
		getContentPane().add(sbMS);
		
		JLabel sbLaps = new JLabel("0000");
		sbLaps.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		sbLaps.setBounds(70, 256, 48, 25);
		getContentPane().add(sbLaps);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Mongolian Baiti", Font.BOLD, 12));
		btnNewButton.setBounds(490, 360, 93, 31);
		getContentPane().add(btnNewButton);
		
		String sebWin =  String.valueOf(dbm.intReturnFromDB("driver", "wins", "did", 1));
		String lancWin = String.valueOf(dbm.intReturnFromDB("driver", "wins", "did", 2));
		
		sbWins.setText(sebWin);
		laWins.setText(lancWin);
		
		
		String sebPoles =  String.valueOf(dbm.intReturnFromDB("driver", "poles", "did", 1));
		String lancPoles = String.valueOf(dbm.intReturnFromDB("driver", "poles", "did", 2));
		
		sbPoles.setText(sebPoles);
		laPoles.setText(lancPoles);
		
		String sebavg =  String.valueOf(dbm.intReturnFromDB("driver", "avgstart", "did", 1));
		String lancavg = String.valueOf(dbm.intReturnFromDB("driver", "avgstart", "did", 2));
		
		sbFinish.setText(sebavg);
		laFinish.setText(lancavg);
		
		
		
		double sebUseSum =  (dbm.intReturnFromDB("car", "mguk", "cid",1)) +
				 			(dbm.intReturnFromDB("car", "es", "cid",1)) +
				 			(dbm.intReturnFromDB("car", "ce", "cid",1)) +
				 			(dbm.intReturnFromDB("car", "ice", "cid",1)) +
				 			(dbm.intReturnFromDB("car", "mguh", "cid",1)) +
				 			(dbm.intReturnFromDB("car", "tc", "cid",1)) +
				 			(dbm.intReturnFromDB("car", "gearbox", "cid",1));
		
		double sebMotorUse = sebUseSum/7;
		String sebFinisMotorUse =  String.valueOf(sebMotorUse);
		sbAvgMotor.setText(sebFinisMotorUse);
		
		
		double lanUseSum =  (dbm.intReturnFromDB("car", "mguk", "cid",2)) +
	 			(dbm.intReturnFromDB("car", "es", "cid", 2)) +
	 			(dbm.intReturnFromDB("car", "ce", "cid", 2)) +
	 			(dbm.intReturnFromDB("car", "ice", "cid", 2)) +
	 			(dbm.intReturnFromDB("car", "mguh", "cid", 2)) +
	 			(dbm.intReturnFromDB("car", "tc", "cid", 2)) +
	 			(dbm.intReturnFromDB("car", "gearbox", "cid", 2));

		double lanceMotorUse = lanUseSum/7;
		String lanceFinisMotorUse =  String.valueOf(lanceMotorUse);
		laAvgMotor.setText(lanceFinisMotorUse);

		
		String sebLapCount = String.valueOf(dbm.countRows("laptime", "lid", "did", 1));
		String lanceLapCount = String.valueOf(dbm.countRows("laptime", "lid", "did", 2));
		
		sbLaps.setText(sebLapCount);
		laLaps.setText(lanceLapCount);
		
		
		String sebSetupCount = String.valueOf(dbm.countRows("setup", "sid", "cid", 1));
		String lanceSetupCount = String.valueOf(dbm.countRows("setup", "sid", "cid", 2));
		
		sbMS.setText(sebSetupCount);
		laMS.setText(lanceSetupCount);


	}

}
