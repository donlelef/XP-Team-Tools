package old;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Example04 {

	public static void main(String[] args) {

		JFrame frame = ExamplesUtils.createFrame();
		
		JMenuBar menubar=new JMenuBar();
			JMenu menu=new JMenu("Ordimenti");
			menubar.add(menu);
				JMenuItem menuItem01=new JMenuItem("A-Z");
				menu.add(menuItem01);
				JMenuItem menuItem02=new JMenuItem("Z-A");
				menu.add(menuItem02);
				JMenuItem menuItem03=new JMenuItem("Casuale");
				menu.add(menuItem03);
		frame.setJMenuBar(menubar);	
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(2, 1));
		frame.getContentPane().add(panel);
		
		JPanel panel1=new JPanel();
			panel1.setLayout(new GridLayout(2, 1));
			panel.add(panel1);
			
			JTextField field=new JTextField("Scrivi qui");
			panel1.add(field);
			JButton button=new JButton("Aggiungi");
			panel1.add(button);
			
		JPanel panel2=new JPanel();
			panel2.setLayout(new GridLayout(1, 1));
			panel.add(panel2);

			JTextArea area=new JTextArea("elenco..");
			area.setEnabled(false);
			panel2.add(area);
			
		frame.setVisible(true);
	}
}


// Cliccando su aggiungi, la stringa immessa nel textField deve comparire nell'elenco
// I menuItam 
