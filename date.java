import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class date extends JFrame {
	date(){
		setTitle("Expiration Date");
		JLabel label= new JLabel("Expiration Date:");
		setDefaultCloseOperation(date.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		
		String [] dateYear = {"2001", "20002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"};
		JComboBox  year = new JComboBox(dateYear);
		year.setSelectedIndex(0);
			
	p.add(label); 
	setContentPane(p);
	p.add(year);
	}

}
