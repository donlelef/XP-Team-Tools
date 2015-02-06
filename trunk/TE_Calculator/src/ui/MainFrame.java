package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import model.Calculator;
import model.expressionInterpreters.SampleExpressionInterpreter;
import model.operations.ProxyOperation;
import view.Display;
import control.EqualsPanel;
import control.NumberPanel;
import control.OperationsPanel;

public class MainFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private ProxyOperation operation = new ProxyOperation();
	private Calculator calculator = new Calculator(operation, new SampleExpressionInterpreter());
	private Display display;
	
	
	public MainFrame() {
		super("Calculator");
		calculator.setInterpreter(new SampleExpressionInterpreter());
	}

	public void launch() {
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(300, 500);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3, 1));
		super.getContentPane().add(mainPanel);
		
		this.display = new Display(calculator);
		mainPanel.add(display);
		
		JPanel keyboard = new JPanel();
		keyboard.setLayout(new GridLayout(1,2));
		mainPanel.add(keyboard);
		
		NumberPanel numberPanel = new NumberPanel(display);
		keyboard.add(numberPanel);
		
		OperationsPanel operationsPanel = new OperationsPanel(operation, display);
		keyboard.add(operationsPanel);
		
		EqualsPanel equalsPanel = new EqualsPanel(calculator, display);
		mainPanel.add(equalsPanel);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Actions");
		menuBar.add(menu);
		JMenuItem clear = new JMenuItem("Clear");
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText("");				
			}
		});
		menu.add(clear);
		this.setJMenuBar(menuBar);
		
		super.setVisible(true);
	}

}
