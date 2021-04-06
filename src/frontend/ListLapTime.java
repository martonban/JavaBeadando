package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class ListLapTime extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListLapTime dialog = new ListLapTime();
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
	public ListLapTime() {
		setBounds(100, 100, 450, 300);

	}

}
