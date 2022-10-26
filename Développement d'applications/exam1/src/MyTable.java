import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MyTable extends JScrollPane {

	DefaultTableModel model = new DefaultTableModel(); 
	JTable table = new JTable(model); 
	JScrollPane scrollPane = new JScrollPane(table);
	
	MyTable(Object[][] donnee, String[] columnNames){
		
		for (int i = 0; i < columnNames.length; i++) {
			model.addColumn(columnNames[i]);
		}
		
		table.setRowHeight(30);
		
		TableColumnModel columnModel = table.getColumnModel();	
		columnModel.getColumn(0).setPreferredWidth(70);
		columnModel.getColumn(1).setPreferredWidth(350);
		columnModel.getColumn(2).setPreferredWidth(100);
		columnModel.getColumn(3).setPreferredWidth(70);
		columnModel.getColumn(4).setPreferredWidth(70);
	
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		table.setDefaultRenderer(Object.class, centerRenderer);
		
		scrollPane.setSize(710, 400);
		table.setFillsViewportHeight(true);
		table.setEnabled(false);
		
		for (Object[] rangee : donnee ) {
			if(rangee[0] != null) {
				model.addRow(rangee);
			}
	
		}
	}
	
	public void setAdjustableSizeTable(MyTable tableau) {

		
	
		if (tableau.table.getRowCount() < 10) {
			tableau.table.setPreferredScrollableViewportSize(
					 new Dimension(tableau.table.getPreferredSize().width, 
							 tableau.table.getRowHeight() * tableau.table.getRowCount()));
		} else {
			tableau.table.setPreferredScrollableViewportSize(
					 new Dimension(tableau.table.getPreferredSize().width, 
							 tableau.table.getRowHeight() * 10));
		}

	}

	
}