package control;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.Calculator;
import view.Display;

public class EqualsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Display display;
	private Calculator calculator;

	public EqualsPanel(Calculator calculator, Display display) {
		super();
		this.display = display;
		this.calculator = calculator;
		this.buildPanel();
	}

	private void buildPanel() {
		this.setLayout(new GridLayout(1, 1));
		this.setSize(200, 50);

		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					calculator.operate(display.getText());
				}catch(ArithmeticException e1){
					display.setText("I'm sorry, I can't!");
				}catch (Exception e1) {
					display.setText("Not a valid expression!");
				}
			}
		});
		this.add(equals);
	}

}
