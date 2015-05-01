package ui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The UI of the chat: it's composed of a {@link ChatUI} and a {@link TimerUI}
 * 
 * @author Alberto
 *
 */

public class UI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	private final ChatUITestable chatUI = new ChatUITestable();
	private final TimerUI timerUI = new TimerUI();
	private final MeetingUIButton meetingUI = new MeetingUIButton();
	
	public UI() {
		super();
		super.setSize(400, 700);
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		
		GridBagConstraints lim = new GridBagConstraints();
		lim.gridx = 0;
		lim.gridy = 2;
		panel.add(chatUI, lim);
		
		lim = new GridBagConstraints();
		lim.gridx = 0;
		lim.gridy = 1;

		lim.anchor = GridBagConstraints.CENTER;
		lim.insets = new Insets(30, 0,0,0);
		panel.add(meetingUI, lim);
		
		lim = new GridBagConstraints();
		lim.gridx = 0;
		lim.gridy = 0;
		lim.anchor = GridBagConstraints.ABOVE_BASELINE;
		panel.add(timerUI, lim);
		
		super.getContentPane().setLayout(new BorderLayout(50, 10));
		super.getContentPane().add(panel);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setChatUI(ActionListener actionListener) {
		chatUI.setButtonAction(actionListener);
	}
	
	public void setTimerUI(ActionListener actionListener) {
		timerUI.setButtonTimerListener(actionListener);
	}
	
	public void setMeetingUi(ActionListener actionListener) {
		meetingUI.setButtonAction(actionListener);
	}
	
	public MeetingUIButton getMeetingUI() {
		return meetingUI;
	}

	public TimerUI getTimerUI() {
		return timerUI;
	}
	
	public ChatUITestable getChatUI() {
		return chatUI;
	}

}
