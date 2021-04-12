package backend;

import javax.swing.JOptionPane;

public class DataTreat {

	
	//############################	Convert Methods	############################
	
	public int covertToInt(String x) {
		int i = 0;
		try {
			i = Integer.parseInt(x);
		}catch(NumberFormatException e){
			CustomNotification("Nem alakítható át egész számmá", 1);
		}
		return i;
	}
	
	
	public double covertToDouble(String x) {
		double i = 0;
		try {
			i = Double.parseDouble(x);
		}catch(NumberFormatException e){
			CustomNotification("Nem alakítható át egész számmá", 1);
		}
		return i;
	}
	
	
	//############################	Basic Data Type	############################
	public boolean isEmpty(String varriable) {
		if(varriable.equals("") || varriable.isBlank() || varriable.equals(null)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

	
	
	
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}

	
}
