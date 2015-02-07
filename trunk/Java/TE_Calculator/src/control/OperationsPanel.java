package control;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.operations.Divide;
import model.operations.Multiply;
import model.operations.ProxyOperation;
import model.operations.Subtract;
import model.operations.Sum;
import view.Display;

public class OperationsPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private Display display;
	private ProxyOperation operation;

	public OperationsPanel(ProxyOperation operation, Display display) {
		super();
		this.display = display;
		this.operation = operation;
		this.buildPanel();
	}

	private void buildPanel() {
		
		this.setLayout(new GridLayout(4,1));
		this.setSize(50, 200);
		
		JButton sum = new JButton("+");
		sum.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.insert(" + ", display.getCaretPosition());
				
				operation.setOperation(new Sum());
			}
		});
		this.add(sum);
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!(display.getText().endsWith(" ") || display.getText().equals(""))){
					operation.setOperation(new Subtract());
				}
				display.insert(" - ", display.getCaretPosition());
			}
		});
		this.add(sub);
		
		JButton mult = new JButton("*");
		mult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.insert(" * ", display.getCaretPosition());
				operation.setOperation(new Multiply());
			}
		});
		this.add(mult);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.insert(" / ", display.getCaretPosition());
				operation.setOperation(new Divide());
			}
		});
		this.add(div);
	}

}
