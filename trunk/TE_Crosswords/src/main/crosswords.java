package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ui.FileLogger;
import ui.OutputArea;
import ui.VerificatonMenu;
import ui.VerifyButton;
import verification.Logger;
import verification.Verifier;

public class crosswords {

	public static void main(String[] args) {

		Verifier verifier = new Verifier();
		Logger logger = new Logger(verifier);

		JFrame frame = new JFrame("Crossword");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
		VerificatonMenu menu = new VerificatonMenu(verifier);
		menu.buildMenu();
		menubar.add(menu);
		frame.setJMenuBar(menubar);

		JPanel mainPanel = new JPanel(new GridLayout(2, 2));
		frame.getContentPane().add(mainPanel);

		JTextField inputField = new JTextField("Please type here");
		mainPanel.add(inputField);

		OutputArea outputArea = new OutputArea(logger);
		JScrollPane scrollPane = new JScrollPane(outputArea);
		mainPanel.add(scrollPane);

		JTextArea errorArea = new JTextArea();
		errorArea.setEditable(false);
		JScrollPane scroll1 = new JScrollPane(errorArea); 
		mainPanel.add(scroll1);
		
		JPanel buttonPanel = new JPanel();
		VerifyButton verifyButton = new VerifyButton(inputField, logger, errorArea);
		verifyButton.doVerify();
		buttonPanel.add(verifyButton, BorderLayout.SOUTH);
		mainPanel.add(buttonPanel);
		
		FileLogger fileLogger = new FileLogger(logger, "log.txt", errorArea);
		
		frame.setVisible(true);

	}

}
