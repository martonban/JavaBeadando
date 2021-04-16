package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import backend.DBMethods;
import backend.DataTreat;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPart extends JDialog {
	private JTextField partNameField;
	private JTextField partInField;
	private JTextField priceField;
	private JTextField linkField;
	private DBMethods dbm = new DBMethods();
	private DataTreat data = new DataTreat();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPart dialog = new AddPart();
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
	public AddPart() {
		dbm.Reg();
		dbm.Connect();
		setBounds(100, 100, 404, 376);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Part's name:");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 42, 85, 18);
		getContentPane().add(lblNewLabel);
		
		JLabel lblAddPart = new JLabel("Add Part:");
		lblAddPart.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
		lblAddPart.setBounds(10, 10, 85, 22);
		getContentPane().add(lblAddPart);
		
		partNameField = new JTextField();
		partNameField.setBounds(10, 60, 144, 19);
		getContentPane().add(partNameField);
		partNameField.setColumns(10);
		
		JLabel lblPartsInThe = new JLabel("Part's in the engine:");
		lblPartsInThe.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPartsInThe.setBounds(10, 94, 131, 18);
		getContentPane().add(lblPartsInThe);
		
		partInField = new JTextField();
		partInField.setColumns(10);
		partInField.setBounds(10, 112, 66, 19);
		getContentPane().add(partInField);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPrice.setBounds(10, 151, 52, 18);
		getContentPane().add(lblPrice);
		
		priceField = new JTextField();
		priceField.setColumns(10);
		priceField.setBounds(10, 169, 79, 19);
		getContentPane().add(priceField);
		
		JLabel lblPrice_1 = new JLabel("\u20AC");
		lblPrice_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblPrice_1.setBounds(99, 170, 52, 18);
		getContentPane().add(lblPrice_1);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblLocation.setBounds(10, 208, 131, 18);
		getContentPane().add(lblLocation);
		
		final JComboBox locationBox = new JComboBox();
		locationBox.setBounds(10, 229, 85, 21);
		getContentPane().add(locationBox);
		
		JLabel lblLink = new JLabel("Documentation's link:");
		lblLink.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblLink.setBounds(10, 273, 144, 18);
		getContentPane().add(lblLink);
		
		linkField = new JTextField();
		linkField.setColumns(10);
		linkField.setBounds(10, 291, 188, 19);
		getContentPane().add(linkField);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnNewButton.setBounds(208, 308, 85, 21);
		getContentPane().add(btnNewButton);	
		
		String elem[] = {"Garage","Factory"};
		for (String s: elem) locationBox.addItem(s);
		
		
		JButton btnAddPart = new JButton("Add Part");
		btnAddPart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean canInsert = true;
				int id = dbm.makeNewID("part", "pid");
				String sel = (String)locationBox.getSelectedItem();
				
				String name = partNameField.getText();
				if(data.isEmpty(name) == true) {
					canInsert = false;
					CustomNotification("Nem megfelelõ a név kitöltése", 0);
				}
				
				String partInTheEngine = partInField.getText();
				if(data.isEmpty(partInTheEngine) == true) {
					canInsert = false;
					CustomNotification("Nem megfelelõ a motor rész", 0);
				}
				
				int price = 0;
				String preiceStr = priceField.getText();
				if(data.isThatInt(preiceStr)) {
					price = data.convertToIntBasic(preiceStr);
				}else {
					canInsert = false;
					CustomNotification("Nem megfelelõ az ár bevitel", 0);
				}

				String link = linkField.getText();
				if(data.isEmpty(link) == true) {
					canInsert = false;
					CustomNotification("Nics link beilesztve", 0);
				}
				
				if(canInsert == true) {
					String sqlp = "insert into part values("+id+", '"+name+"', '"+partInTheEngine+"', "+price+", '"+sel+"', '"+link+"')";
					dbm.CommandExecute(sqlp);
				}
				
				
			}
		});
		

		btnAddPart.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAddPart.setBounds(299, 308, 85, 21);
		getContentPane().add(btnAddPart);

	}
	
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}

}
