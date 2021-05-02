package backend;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DataTreat {

	
	//############################	Convert Methods	############################
	
	public int convertToIntBasic(String x) {
		int i = 0;
		try {
			i = Integer.parseInt(x);
		}catch(NumberFormatException e){
			CustomNotification("Nem alakítható át egész számmá", 1);
		}
		return i;
	}
	
	
	public double convertToDoubleBasic(String x) {
		double i = 0;
		try {
			i = Double.parseDouble(x);
		}catch(NumberFormatException e){
			CustomNotification("Nem alakítható át egész számmá", 1);
		}
		return i;
	}
	
	public int convertToInt(JTextField e) {
		int i = 0;
		String x = e.getText();
		try {
			i = Integer.parseInt(x);
		}catch(NumberFormatException g){
			CustomNotification("Nem alakítható át egész számmá", 1);
		}
		return i;
	}
	
	
	public double convertToDouble(JTextField e) {
		double i = 0;
		String x = e.getText();
		try {
			i = Double.parseDouble(x);
		}catch(NumberFormatException g){
			CustomNotification("Nem alakítható át egész számmá", 1);
		}
		return i;
	}
	
	
	public static boolean isThatInt(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        int d = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	public static boolean isThatIDouble(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	
	
	
	//############################	Basic Data Type	 ############################
	
	public boolean isEmpty(String varriable) {
		if(varriable.equals("") || varriable.isBlank() || varriable.equals(null)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static boolean isThatDate(String a) {
		DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		sdf.setLenient(false);
		try {
			sdf.parse(a);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	

	
	
	
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}

	
}
