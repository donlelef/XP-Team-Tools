package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import timeRace.IOperation;
import timeRace.ObservableList;
import timeRace.OperationRanking;
import timeRace.Race;

public class ButtonPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextArea ItemsNumberArea = new JTextArea();
	private ObservableList<IOperation> operationsList;
	private ObservableList<OperationRanking> rankingList;

	public ButtonPanel(ObservableList<IOperation> operationsList,
			ObservableList<OperationRanking> rankingList) {
		super();
		this.operationsList = operationsList;
		this.rankingList = rankingList;
		this.build();
	}

	private void build() {

		this.setLayout(new GridLayout(2, 1));
		this.setSize(500, 100);

		this.add(ItemsNumberArea);

		JPanel subPanel = new JPanel();
		subPanel.setLayout(new GridLayout(1, 2));

		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operationsList.clear();
			}
		});
		subPanel.add(clear);

		JButton start = new JButton("Start race");
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Race race = new Race(operationsList.getList(), Integer
							.parseInt(ItemsNumberArea.getText()));
					race.startRace();
					rankingList.setList(race.getRankingList());
				} catch (NumberFormatException e1) {
					ItemsNumberArea.setText("I need the number of items.");
				}
			}
		});
		subPanel.add(start);

		this.add(subPanel);

	}

}
