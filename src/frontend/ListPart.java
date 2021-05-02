package frontend;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

import backend.PartTM;

import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListPart extends JDialog {
	private JTable table;
	private PartTM ptm;

	/**
	 * Create the dialog.
	 */
	public ListPart(JDialog f, PartTM pstm) {
		super(f, "Part List", true);
		ptm = pstm;
		setBounds(100, 100, 611, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 577, 215);
		getContentPane().add(scrollPane);
		
		
		table = new JTable(ptm);
		scrollPane.setViewportView(table);
		
		TableColumn tc = null;
		for (int i = 0; i < 7; i++) {
			tc = table.getColumnModel().getColumn(i);
			if (i==0 || i==1) tc.setPreferredWidth(30);
			else if (i==2 || i==3 || i==4 || i == 5) tc.setPreferredWidth(100);
			else {tc.setPreferredWidth(150);}
		}

		table.setAutoCreateRowSorter(true);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(253, 235, 85, 21);
		getContentPane().add(btnNewButton);
		TableRowSorter<PartTM> trs = (TableRowSorter<PartTM>)table.getRowSorter();
		trs.setSortable(0, false);

		Object partTm[] = {"Jel","Pid","Name","Part IN","Price","Location", "link"};
		PartTM ptm = new PartTM(partTm, 0);

		
	}
}
