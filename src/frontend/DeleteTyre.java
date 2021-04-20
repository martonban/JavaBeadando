package frontend;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class DeleteTyre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteTyre dialog = new DeleteTyre();
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
	public DeleteTyre() {
		setBounds(100, 100, 450, 300);

	}

}
