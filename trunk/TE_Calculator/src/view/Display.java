package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;

import model.Calculator;

public class Display extends JTextArea implements Observer{

	private static final long serialVersionUID = 1L;
	private Calculator calculator;
	
	public Display(Calculator calculator) {
		super();
		this.calculator = calculator;
		this.calculator.addObserver(this);
		super.setEditable(false);
		super.setSize(200, 100);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.insert(" = "+calculator.printResult(), this.getCaretPosition());		
	}
	

}
