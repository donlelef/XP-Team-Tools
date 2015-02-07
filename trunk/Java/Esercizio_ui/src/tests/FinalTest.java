package tests;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.StringList;
import view.StringListObrserver;
import control.StringAdder;
import control.StringNaturalSorter;
import control.StringReverseSorter;
import control.StringShuffleSorter;
import control.StringTotalDeleter;

public class FinalTest {

	public static void main(String[] args) {

		StringList list = new StringList();
		StringListObrserver viewer = new StringListObrserver(list);
		viewer.setEditable(false);

		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("StringListTest");

		JMenuBar menubar = new JMenuBar();
		JMenu ordinamenti = new JMenu("Ordinamenti");
		menubar.add(ordinamenti);
		StringNaturalSorter naturalSorter = new StringNaturalSorter(list);
		naturalSorter.control();
		ordinamenti.add(naturalSorter);
		StringReverseSorter inverseSorter = new StringReverseSorter(list);
		inverseSorter.control();
		ordinamenti.add(inverseSorter);
		StringShuffleSorter shuffleSorter = new StringShuffleSorter(list);
		shuffleSorter.control();
		ordinamenti.add(shuffleSorter);
		frame.setJMenuBar(menubar);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2, 1));
		frame.getContentPane().add(mainPanel);

		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(2, 1));
		mainPanel.add(controlPanel);

		JTextField field = new JTextField("Type here...");

		controlPanel.add(field);

		JPanel buttonPanel = new JPanel();

		StringAdder adder = new StringAdder(list, field);
		adder.control();
		StringTotalDeleter deleter = new StringTotalDeleter(list, field);
		deleter.control();

		buttonPanel.add(adder);
		buttonPanel.add(deleter);
		controlPanel.add(buttonPanel);

		JPanel viewerPanel = new JPanel();
		viewerPanel.setLayout(new GridLayout(1, 1));

		mainPanel.add(viewerPanel);

		viewerPanel.add(viewer);
		viewerPanel.add(new JScrollPane(viewer));

		frame.setVisible(true);

	}

}
