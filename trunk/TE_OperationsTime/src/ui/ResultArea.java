package ui;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;

import timeRace.ObservableList;
import timeRace.OperationRanking;

public class ResultArea extends JTextArea implements Observer {

	private static final long serialVersionUID = 1L;

	private ObservableList<OperationRanking> rankingList;

	public ResultArea(ObservableList<OperationRanking> rankingList) {
		super("Ranking will appear here.");
		this.rankingList = rankingList;
		rankingList.addObserver(this);
		this.build();
	}

	private void build() {

		this.setSize(240, 400);
		this.setEditable(false);

	}

	@Override
	public void update(Observable o, Object arg) {

		this.setText("Classification: " + "\n");
		ArrayList<OperationRanking> list = this.rankingList.getList();
		int position = 1;
		for (OperationRanking operationRanking : list) {
			this.insert(generateRankingString(position, operationRanking)
					+ "\n", this.getCaretPosition());
			position++;
		}

	}

	private String generateRankingString(int position,
			OperationRanking operationRanking) {
		return position + " " + operationRanking.getOperation().toString()
				+ " " + toFormattedMillis(operationRanking.getTime()) + "ms";
	}

	private String toFormattedMillis(long nanoTime) {

		double millis = nanoTime / 1000000F;

		NumberFormat format = NumberFormat.getNumberInstance();
		format.setMaximumFractionDigits(3);
		format.setMinimumFractionDigits(3);

		return format.format(millis);
	}

}
