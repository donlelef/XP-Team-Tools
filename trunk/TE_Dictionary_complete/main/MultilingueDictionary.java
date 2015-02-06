package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import dictionary.CreatorsProxy;
import dictionary.IDictionary;
import dictionary.IDictionaryCreator;
import dictionary.MultilingueDictionarySampleCreator;
import dictionary.TranslatorSampleCreator;
import ui.InfoLabel;
import ui.InputArea;
import ui.ObservableList;
import ui.OutputArea;
import ui.SearchButton;

public class MultilingueDictionary {

	
	
	private static ObservableList list = new ObservableList();
	private static CreatorsProxy creator = new CreatorsProxy();

	public static void main(String[] args) {
		
		IDictionaryCreator cr= new MultilingueDictionarySampleCreator();
		creator.setCreator(cr);
		
		JFrame frame = new JFrame("Dictionary Manager");
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
				JPanel controlPanel = new JPanel();
				controlPanel.setLayout(new GridLayout(1,2));
					InputArea inputArea = new InputArea();
					SearchButton searcher = new SearchButton(creator, inputArea, list);
					searcher.listen();
				controlPanel.add(inputArea.getInputArea());
				controlPanel.add(searcher);
				OutputArea area = new OutputArea(list);
				area.setEditable(false);
				InfoLabel label = new InfoLabel(list);
			panel.add(label, BorderLayout.SOUTH);
			panel.add(area, BorderLayout.CENTER);
			panel.add(controlPanel, BorderLayout.NORTH);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
