package server.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Timer;

import org.json.simple.parser.ParseException;

import protocol.JsonMaker;
import protocol.JsonParser;
import timer.TimerFormatter;
import client.model.ClientDetails;

public class TimerService1_1 implements IService {

	private ChatsManager chatsManager;
	private TimersManager timersManager;
	private MessagePropagator messagePropagator;
	public static final int TOTAL_MILLIS = 1000;
	
	public TimerService1_1(ChatsManager chatsManager,
			TimersManager timersManager, MessagePropagator messagePropagator) {
		super();
		this.chatsManager = chatsManager;
		this.timersManager = timersManager;
		this.messagePropagator = messagePropagator;
	}

	/**
	 * 
	 * It starts the timer making a division by groups (the timer is
	 * synchronized only with members of the same team)
	 * 
	 * @param teamName
	 */
	@Override
	public void doAction(String request) throws IOException,
			ParseException {

		String[] timerLines = JsonParser.parseTimerRequest(request);
		String indexString = timerLines[0];
		int index = Integer.parseInt(indexString);
		int minutes = Integer.parseInt(timerLines[1]);
		int seconds = Integer.parseInt(timerLines[2]);
		if (timersManager.hasMillisKey(index)) {
			timersManager.replaceMillis(index,
					TimerFormatter.getMillis(minutes, seconds));
		} else {
			timersManager.putMillis(index, TimerFormatter.getMillis(minutes, seconds));
		}

		startTimer(index);
	}

	private void startTimer(final int index) {

		final Timer timer = new Timer(TOTAL_MILLIS, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				final long totalMillis = timersManager.getMillis(index);

				if (totalMillis == 0 && timersManager.hasTimerKey(index)) {
					timersManager.getTimer(index).stop();
				}

				int[] vet = TimerFormatter.getTimeStamp(totalMillis);
				String lineTimer = JsonMaker.timerRequest(String.valueOf(index), vet[0],
						vet[1]); // minuti, secondi

				Chat chat = chatsManager.get(index);
				ArrayList<ClientDetails> list = chat.getAttendantsDetails();
				for (ClientDetails details : list) {
					try {
						messagePropagator.propagateMessage(lineTimer, details);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				timersManager.replaceMillis(index, totalMillis - TOTAL_MILLIS);

			}
		});

		if (timersManager.hasTimerKey(index)) {
			timersManager.replaceTimer(index, timer);
		} else {
			timersManager.putTimer(index, timer);
		}

		timersManager.getTimer(index).setInitialDelay(0);
		timersManager.getTimer(index).start();
	}
	
}
