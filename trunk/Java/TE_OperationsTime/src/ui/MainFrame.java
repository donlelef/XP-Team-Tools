package ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import timeRace.IOperation;
import timeRace.ObservableList;
import timeRace.OperationRanking;

public class MainFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<IOperation> opList = new ArrayList<IOperation>();
	private ObservableList<IOperation> operationList = new ObservableList<IOperation>(opList);
	private ArrayList<OperationRanking> rkList = new ArrayList<OperationRanking>();
	private ObservableList<OperationRanking> rankingList = new ObservableList<OperationRanking>(rkList);
	
	
	public MainFrame() {
		super("Time race");
	}

	public void launch() {
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(new MainMenuBar(operationList));
		this.getContentPane().setLayout(new GridLayout(2, 1));
		JPanel areasPanel = new JPanel(new GridLayout(1,2));
		areasPanel.setSize(400, 500);
		areasPanel.add(new JScrollPane(new ResultArea(rankingList)), BorderLayout.WEST);
		areasPanel.add(new JScrollPane(new CompetitorsArea(operationList)), BorderLayout.EAST);
		this.getContentPane().add(areasPanel);
		this.getContentPane().add(new ButtonPanel(operationList, rankingList));
		
		this.setVisible(true);
	}
	

}
