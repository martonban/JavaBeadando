package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddSetup extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_20;
	private JTextField textField_18;
	private JTextField textField_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSetup dialog = new AddSetup();
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
	public AddSetup() {
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
		
		textField = new JTextField();
		textField.setBounds(10, 73, 130, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 117, 130, 19);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 248, 130, 19);
		getContentPane().add(textField_2);
		
		JLabel lblRearWingAero = new JLabel("Rear Wing Aero: ");
		lblRearWingAero.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblRearWingAero.setBounds(10, 233, 149, 18);
		getContentPane().add(lblRearWingAero);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 204, 130, 19);
		getContentPane().add(textField_3);
		
		JLabel lblFrontWingAero = new JLabel("Front Wing Aero:");
		lblFrontWingAero.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblFrontWingAero.setBounds(10, 189, 149, 18);
		getContentPane().add(lblFrontWingAero);
		
		JLabel lblAerodynamics = new JLabel("Aerodynamics:");
		lblAerodynamics.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblAerodynamics.setBounds(10, 161, 119, 18);
		getContentPane().add(lblAerodynamics);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 379, 130, 19);
		getContentPane().add(textField_4);
		
		JLabel lblDifferentialAdjustmentOff = new JLabel("Differential Adjustment Off Throttle:");
		lblDifferentialAdjustmentOff.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDifferentialAdjustmentOff.setBounds(10, 364, 233, 18);
		getContentPane().add(lblDifferentialAdjustmentOff);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 335, 130, 19);
		getContentPane().add(textField_5);
		
		JLabel lblDifferentialAdjustmentOn = new JLabel("Differential Adjustment On Throttle:");
		lblDifferentialAdjustmentOn.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDifferentialAdjustmentOn.setBounds(10, 320, 233, 18);
		getContentPane().add(lblDifferentialAdjustmentOn);
		
		JLabel lblTransmission = new JLabel("Transmission");
		lblTransmission.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblTransmission.setBounds(10, 292, 119, 18);
		getContentPane().add(lblTransmission);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(10, 509, 130, 19);
		getContentPane().add(textField_6);
		
		JLabel lblRearTyrePressure = new JLabel("Rear Tyre Pressure:");
		lblRearTyrePressure.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblRearTyrePressure.setBounds(10, 494, 142, 18);
		getContentPane().add(lblRearTyrePressure);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(10, 465, 130, 19);
		getContentPane().add(textField_7);
		
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
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(302, 117, 130, 19);
		getContentPane().add(textField_8);
		
		JLabel lblRearCamber = new JLabel("Rear Camber:");
		lblRearCamber.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblRearCamber.setBounds(302, 102, 99, 18);
		getContentPane().add(lblRearCamber);
		
		JLabel lblFrontCamber = new JLabel("Front Camber:");
		lblFrontCamber.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblFrontCamber.setBounds(302, 58, 130, 18);
		getContentPane().add(lblFrontCamber);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(302, 73, 130, 19);
		getContentPane().add(textField_9);
		
		JLabel lblSuspensionGeometry = new JLabel("Suspension Geometry");
		lblSuspensionGeometry.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblSuspensionGeometry.setBounds(302, 30, 166, 18);
		getContentPane().add(lblSuspensionGeometry);
		
		JLabel lblNameOfThe_1_1 = new JLabel("Front Toe:");
		lblNameOfThe_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNameOfThe_1_1.setBounds(302, 145, 130, 18);
		getContentPane().add(lblNameOfThe_1_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(302, 160, 130, 19);
		getContentPane().add(textField_10);
		
		JLabel lblDriverId_1_1 = new JLabel("Rear Toe:");
		lblDriverId_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDriverId_1_1.setBounds(302, 189, 72, 18);
		getContentPane().add(lblDriverId_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(302, 204, 130, 19);
		getContentPane().add(textField_11);
		
		JLabel lblSuspension = new JLabel("Suspension");
		lblSuspension.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblSuspension.setBounds(302, 259, 166, 18);
		getContentPane().add(lblSuspension);
		
		JLabel lblFontSuspension = new JLabel("Font Suspension:");
		lblFontSuspension.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblFontSuspension.setBounds(302, 287, 130, 18);
		getContentPane().add(lblFontSuspension);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(302, 302, 130, 19);
		getContentPane().add(textField_12);
		
		JLabel lblRearSuspension = new JLabel("Rear Suspension:");
		lblRearSuspension.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblRearSuspension.setBounds(302, 331, 130, 18);
		getContentPane().add(lblRearSuspension);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(302, 346, 130, 19);
		getContentPane().add(textField_13);
		
		JLabel lblNameOfThe_1_1_1 = new JLabel("Front Anti-Roll Bar:");
		lblNameOfThe_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNameOfThe_1_1_1.setBounds(302, 374, 130, 18);
		getContentPane().add(lblNameOfThe_1_1_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(302, 389, 130, 19);
		getContentPane().add(textField_14);
		
		JLabel lblDriverId_1_1_1 = new JLabel("Rear Anti-Roll Bar:");
		lblDriverId_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDriverId_1_1_1.setBounds(302, 418, 130, 18);
		getContentPane().add(lblDriverId_1_1_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(302, 433, 130, 19);
		getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(302, 524, 130, 19);
		getContentPane().add(textField_16);
		
		JLabel lblDriverId_1_1_1_1 = new JLabel("Rear Ride Height:");
		lblDriverId_1_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblDriverId_1_1_1_1.setBounds(302, 509, 130, 18);
		getContentPane().add(lblDriverId_1_1_1_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(302, 480, 130, 19);
		getContentPane().add(textField_17);
		
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
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(539, 216, 130, 19);
		getContentPane().add(textField_20);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.setBounds(519, 259, 72, 37);
		getContentPane().add(btnNewButton);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAdd.setBounds(613, 259, 80, 37);
		getContentPane().add(btnAdd);
		
		JLabel lblPsi_2_2 = new JLabel("%");
		lblPsi_2_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPsi_2_2.setBounds(673, 76, 25, 18);
		getContentPane().add(lblPsi_2_2);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(539, 73, 130, 19);
		getContentPane().add(textField_18);
		
		JLabel lblPsi_2_2_1 = new JLabel("%");
		lblPsi_2_2_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPsi_2_2_1.setBounds(673, 120, 25, 18);
		getContentPane().add(lblPsi_2_2_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(539, 117, 130, 19);
		getContentPane().add(textField_19);

	}

}
