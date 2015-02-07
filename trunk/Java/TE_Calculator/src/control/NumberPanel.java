package control;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import view.Display;

public class NumberPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Display display;
	private JButton buttons[] = new JButton[10];

	public NumberPanel(Display display) {
		super();
		this.display = display;
		this.buildPanel();
	}

	private void buildPanel() {
		this.setSize(150, 200);
		this.setLayout(new GridLayout(4, 3));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("" + i);
			buttons[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					display.insert(e.getActionCommand(), display.getCaretPosition());
				}
			});
		}
		for (int i = 0; i < buttons.length; i++) {
			this.add(buttons[i]);
		}
	}

}
