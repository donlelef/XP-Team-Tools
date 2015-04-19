package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import sounds.SoundPlayer;
import timer.TimerFormatter;

public class TimerUIA extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField timerArea;
	private JButton startButton;
	private static final String ENDTIMER = "00:00";
	private SoundPlayer player = new SoundPlayer("sounds/cannon.wav");
	
	
	public TimerUIA() {
		super();
		timerArea = new JTextField();
		Dimension dim = new Dimension();
		dim.setSize(100, 80);
		timerArea.setPreferredSize(dim);
		timerArea.setMinimumSize(dim);
		timerArea.setFont(new Font("TimesRoman", Font.BOLD, 30));
		timerArea.setDocument(new FixedSizeDocument());
		timerArea.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				alertEndTimer();
			}

			
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				alertEndTimer();		
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				alertEndTimer();
				
			}
		});
		dim = new Dimension();
		dim.setSize(70, 80);
		startButton = new JButton("Start");
		startButton.setBackground(Color.GREEN);
		startButton.setPreferredSize(dim);
		startButton.setMinimumSize(dim);
		
		super.add(startButton);
		super.add(timerArea);
	}
	
	public void setButtonTimerListener(ActionListener actionListener) {
		startButton.addActionListener(actionListener);
	}
	
	public void setTimer(String timeStamp) {
		timerArea.setText(timeStamp);
	}
	
	public void setButtomTimerClickable(boolean isClickable) {
		startButton.setEnabled(isClickable);
	}
	
	public String getTimeStamp() {
		return timerArea.getText();
	}
	
	public void setTimerEditable(boolean isEditable) {
		timerArea.setEnabled(isEditable);
	}
	
	public boolean isTimeStampValid(String timeStamp) {
		return TimerFormatter.isTimeStampValid(timeStamp);
	}
	private void alertEndTimer() {
		if(timerArea.getText().equals(ENDTIMER)) {
			player.playSong();
			setTimerEditable(true);
		}
	}
	
	

}
