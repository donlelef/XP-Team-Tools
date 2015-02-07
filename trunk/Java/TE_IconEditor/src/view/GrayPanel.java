package view;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Editor;
import model.GrayEstimator;

public class GrayPanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;

	private Editor editor;
	private JLabel min, max, avg;
	
	public GrayPanel(Editor editor, int width, int heigth) {
		super();
		this.editor = editor;
		editor.addObserver(this);
		this.setSize(width,heigth);
		this.buildPanel();
	}

	private void buildPanel() {
		this.setLayout(new GridLayout(3, 1));
		min = new JLabel("Minumum Intensity: ");
		min.setHorizontalTextPosition(JLabel.CENTER);
		this.add(min);
		max = new JLabel("Maximum Intensity: ");
		max.setHorizontalTextPosition(JLabel.CENTER);
		this.add(max);
		avg = new JLabel("Average Intensity: ");
		avg.setHorizontalTextPosition(JLabel.CENTER);
		this.add(avg);
	}

	@Override
	public void update(Observable o, Object arg) {
		GrayEstimator estimator = new GrayEstimator(editor.getIcon());
		min.setText("Minimum Intensity: " +"\n" + estimator.getMinimumIntensity());
		max.setText("Maximum Intensity: " +"\n" + estimator.getMaximumIntensity());
		avg.setText("Average Intensity: " +"\n" + estimator.getAverageIntensity());
	}

}
