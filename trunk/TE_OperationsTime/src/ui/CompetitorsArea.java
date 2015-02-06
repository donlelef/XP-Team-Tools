package ui;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;

import timeRace.IOperation;
import timeRace.ObservableList;

public class CompetitorsArea extends JTextArea implements Observer{
	
	private static final long serialVersionUID = 1L;
	
	private ObservableList<IOperation> operationList;

	public CompetitorsArea(ObservableList<IOperation> operationList) {
		super("Selected operations will be dislayed here.");
		this.operationList = operationList;
		this.operationList.addObserver(this);
		this.build();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setText("Selected operations:"+"\n");
		ArrayList<IOperation> list = this.operationList.getList();
		for (IOperation operation : list) {
			this.insert(operation.toString() + "\n", this.getCaretPosition());
		}
	}

	private void build() {
		
		this.setSize(240, 400);
		this.setEditable(false);
		
	}
}
