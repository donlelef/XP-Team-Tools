package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import timeRace.IOperation;
import timeRace.ObservableList;
import timeRace.operations.AddIntegerToArraylist;
import timeRace.operations.AddIntegerToLinkedlist;
import timeRace.operations.IntegerBubbleSort;
import timeRace.operations.IntegerCollectionsSort;
import timeRace.operations.IntegerVectorSorter;

public class MainMenuBar extends JMenuBar{
	
	private static final long serialVersionUID = 1L;
	
	ObservableList<IOperation> operationList;
	
	public MainMenuBar(ObservableList<IOperation> operationList) {
		super();
		this.operationList = operationList;
		this.buildMenuBar();
	}

	private void buildMenuBar() {
		
		JMenu addersMenu = new JMenu("Add to a list");
		JMenuItem arrayAdder = new JMenuItem("Add integers to an ArrayList");
		arrayAdder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operationList.add(new AddIntegerToArraylist());				
			}
		});
		addersMenu.add(arrayAdder);
		JMenuItem linkedAdder = new JMenuItem("Add integers to a LinkedList");
		linkedAdder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operationList.add(new AddIntegerToLinkedlist());
			}
		});
		addersMenu.add(linkedAdder);
		this.add(addersMenu);
		
		JMenu sortersMenu = new JMenu("Sort a list or an array");
		JMenuItem bubbleSorter = new JMenuItem("Sort a list of integers whith bubble sort");
		bubbleSorter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operationList.add(new IntegerBubbleSort());;				
			}
		});
		sortersMenu.add(bubbleSorter);
		JMenuItem sortSorter = new JMenuItem("Sort a list of integers whith Collections.sort");
		sortSorter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operationList.add(new IntegerCollectionsSort());				
			}
		});
		sortersMenu.add(sortSorter);
		JMenuItem vectorSorter = new JMenuItem("Sort a vector of integers whith Arrays.sort");
		vectorSorter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operationList.add(new IntegerVectorSorter());				
			}
		});
		sortersMenu.add(vectorSorter);
		
		this.add(sortersMenu);
	}

}
