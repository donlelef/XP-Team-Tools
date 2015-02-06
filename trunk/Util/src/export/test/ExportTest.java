package export.test;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import export.ExportMenu;
import export.IFormatter;
import export.SampleFormatter;

public class ExportTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ciao");
		list.add("miao");
		list.add("bau");
		list.add("grrr");
		list.add("psss");
		list.add("auuu");
		IFormatter<String> formatter = new SampleFormatter();
		
		JFrame frame = new JFrame("Test");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar = new JMenuBar();
		ExportMenu<String> menu = new ExportMenu<String>(list, formatter);
		menubar.add(menu);
		frame.setJMenuBar(menubar);
		
		frame.setVisible(true);
		
	}

}
