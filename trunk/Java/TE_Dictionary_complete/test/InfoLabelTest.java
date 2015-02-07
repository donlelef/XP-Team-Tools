package test;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ui.InfoLabel;
import ui.InputArea;
import ui.ObservableList;

public class InfoLabelTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		InputArea area = new InputArea();
		ObservableList list = new ObservableList();
		InfoLabel l = new InfoLabel(list);
		//panel.setLayout(new BorderLayout());
		frame.getContentPane().add(l);
		list.setList(new ArrayList<String[]>());
		frame.setVisible(true);
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
