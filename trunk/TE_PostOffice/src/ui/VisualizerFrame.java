package ui;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import centalSystem.IVisualizer;

public class VisualizerFrame extends JFrame implements IVisualizer {

	private static final long serialVersionUID = 1L;

	private JTextArea area = new JTextArea();
	private static final int N = 20;
	private ArrayList<String> strings = new ArrayList<String>();

	public VisualizerFrame() {
		super("Clients Served");
		this.buildFrame();
	}

	private void buildFrame() {
		this.setSize(500, 500);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		area.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(area);
		this.getContentPane().add(scrollPane);
	}

	@Override
	public void insert(int counter, int service, int clientNumber) {
		String toBeInserted = "Client " + clientNumber + " at counter "
				+ counter + " on service " + service + ".";
		if (strings.size() < N)
			strings.add(toBeInserted);
		else {
			strings.remove(0);
			strings.add(toBeInserted);
		}
		area.setText("");
		for (int i = strings.size(); i > 0; i--) {
			area.insert(strings.get(i-1), area.getCaretPosition());
			area.insert("\n", area.getCaretPosition());
		}
	}
}