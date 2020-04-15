import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class collection6 {

	public static void main(String[]args) {
		
		JFrame frame = new JFrame("JTable demo");
		frame.setSize(500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		String columns[] = {"ID", "First Name", "Last Name"};
		String data[][] = {
				{"1", "Adel", "AL-mdar" },
	            {"2", "Husaam", "AL-mdar" },
	            {"3", "Mehdi", "Saeed" },
	            {"4", "Salem", "Al-yami" },
	            {"5", "Al-Hassan", "Majrashi" },
	            {"6", "Mansoor", "Nasser" },
		
		};
		
		 DefaultTableModel model = new DefaultTableModel();
		 model.setDataVector(data, columns);
		 JTable table = new JTable(model);
		 JScrollPane tableScroller= new JScrollPane(table);
		 tableScroller.setBounds(60, 40, 370, 140);
		 frame.add(tableScroller); 
		 frame.setVisible(true);
	}
}
