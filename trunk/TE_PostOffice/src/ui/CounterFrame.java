package ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import centalSystem.ICentralSystem;
import centralSystem.counters.CounterProxy;
import centralSystem.counters.LongestQueueCounter;
import centralSystem.counters.OneServiceCounter;
import centralSystem.counters.PriorityServiceCounter;

public class CounterFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private ICentralSystem centralSystem;
	private CounterProxy counter = new CounterProxy();
	private int counterNumber;
	private static final String[] SERVICES = { "Postal", "Financial", "Other" };
	private JLabel nextClientLabel = new JLabel(
			"Please configure the counter to start...");

	public CounterFrame(ICentralSystem centralSystem) {
		super("Counter user interface.");
		this.centralSystem = centralSystem;
		centralSystem.addCounter(counter);
		this.counterNumber = centralSystem.getCounterNumber();
		this.buildFrame();
	}

	private void buildFrame() {

		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(generatePanel());
		this.setJMenuBar(generateMenuBar());
		this.setVisible(true);

	}

	private JPanel generatePanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(nextClientLabel, BorderLayout.NORTH);
		JButton button = new JButton("Next >>");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					int nextQueue = centralSystem
							.nextTurnAtCounter(counterNumber - 1);
					nextClientLabel.setText("Next client: number "
							+ centralSystem.getNextClientAtQueue(nextQueue)
							+ " on " + SERVICES[nextQueue] + " service.");
				} catch (Exception e1) {
					nextClientLabel
							.setText("I'm sorry, I need you to configure me...");
				}
			}
		});
		panel.add(button, BorderLayout.SOUTH);

		return panel;
	}

	private JMenuBar generateMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Counter type");
		menuBar.add(menu);

		JMenu oneService = new JMenu("One service...");

		JMenuItem oneService1 = new JMenuItem("Postal");
		oneService1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				counter.setCounterType(new OneServiceCounter(centralSystem, 0));
			}
		});
		oneService.add(oneService1);

		JMenuItem oneService2 = new JMenuItem("Financial");
		oneService2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				counter.setCounterType(new OneServiceCounter(centralSystem, 1));
			}
		});
		oneService.add(oneService2);

		JMenuItem oneService3 = new JMenuItem("Other");
		oneService3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				counter.setCounterType(new OneServiceCounter(centralSystem, 2));
			}
		});
		oneService.add(oneService3);

		JMenu priorityService = new JMenu("Priority service...");

		JMenuItem priorityService1 = new JMenuItem("Postal");
		oneService1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				counter.setCounterType(new PriorityServiceCounter(
						centralSystem, 0));
			}
		});
		priorityService.add(priorityService1);

		JMenuItem priorityService2 = new JMenuItem("Financial");
		priorityService2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				counter.setCounterType(new PriorityServiceCounter(
						centralSystem, 1));
			}
		});
		priorityService.add(priorityService2);

		JMenuItem priorityService3 = new JMenuItem("Other");
		priorityService3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				counter.setCounterType(new PriorityServiceCounter(
						centralSystem, 2));
			}
		});
		priorityService.add(priorityService3);

		JMenuItem longestQueue = new JMenuItem("Longest queue");
		longestQueue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				counter.setCounterType(new LongestQueueCounter(centralSystem));
			}
		});

		menu.add(priorityService);
		menu.add(oneService);
		menu.add(longestQueue);

		return menuBar;
	}

}
