package tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.json.simple.parser.ParseException;

import protocol.JsonMaker;
import protocol.JsonParser;
import ui.TeamListUI;
import ui.login.LoginUI;
import ui.login.MainLoginUI;
import ui.login.RegUI;
import client.model.Client;
import client.model.ClientConnectionDetails;
import client.utils.ErrorMessage;
import client.utils.ISessionSaver;
import client.utils.SessionSaver;

/**
 * This test shows the ultimate version of the chat: if the server is running,
 * the login panel it's shown; after the login, it's possible to select (or
 * create) the team from the team panel: in this way, appears a series of panels
 * which contains all the functionalities of our project: -chat service -timer
 * with adjustable countdown (synchronized with other members of the chat) -team
 * members panel, with the nicknames of other team members, thanks to which it's
 * possible select certain team members and start private chats -schedule a
 * meeting with the addition of meeting details
 * 
 * 
 *
 * 
 *
 *
 */
public class ClientMain {
	public static void main(String[] args) {

		final MainLoginUI ui = new MainLoginUI();
		final LoginUI login = ui.getLoginUI();

		ISessionSaver sessionSaver;
		try {

			sessionSaver = new SessionSaver("", "");
			login.setSessionSaver(sessionSaver);

			if (login.checkSession()) {
				login.setLoginNick(sessionSaver.getSessionValues()[0]);
				login.setPass(sessionSaver.getSessionValues()[1]);
			}

		} catch (IOException e3) {
			new ErrorMessage();
			ErrorMessage.infoBox("Error in:  " + e3.toString(), " error");
			System.exit(1);
			e3.printStackTrace();
		}

		final RegUI reg = ui.getRegUI();
		reg.setVisible(false);

		login.setLoginListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					login.getSessionSaver().setSessionValues(
							login.getLoginNick(), login.getPass());

					login.getCheckStatus();
				} catch (NoSuchAlgorithmException | IOException e2) {
					new ErrorMessage();
					ErrorMessage.infoBox("Error in:  " + e2.toString(),
							" error");
					System.exit(1);
					e2.printStackTrace();
				}

				ClientConnectionDetails clientConDet = new ClientConnectionDetails(
						login.getLoginNick(), null, login.getPass());
				final Client client = new Client(clientConDet);

				client.openStreams("localhost", 9999);
				Runnable runnable = new Runnable() {

					@Override
					public void run() {
						try {

							client.readFromSocket();

						} catch (Exception e) {
							new ClientMain();
							try {
								this.finalize();
							} catch (Throwable e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							e.printStackTrace();
						}
					}
				};

				Thread thread = new Thread(runnable);
				thread.start();

				String response;

				client.sendMessageToServer(JsonMaker.authRequest(clientConDet));

				response = client.waitServerResponse();

				try {
					if (!client.isAuthenticated(response)) {
						login.setError(true);
						ui.refresh();

					} else {

						client.sendMessageToServer(JsonMaker
								.teamsListRequest(client.getNickname()));
						response = client.waitServerResponse();
						String[] teams;
						try {
							teams = JsonParser.parseMakeTeamMembs(response);
							final TeamListUI teamListUI = new TeamListUI(
									client, teams);
							teamListUI.setCreateListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									client.sendMessageToServer(JsonMaker
											.newTeamRequest(
													teamListUI.getTeamName(),
													client.getNickname()));
									final int index = JsonParser
											.parseChatIndexRequest(client
													.waitServerResponse());
									client.sendMessageToServer(JsonMaker
											.teamsListRequest(client
													.getNickname()));
									teamListUI.setIndex(index);
									teamListUI.removeTeamPanel();
									try {
										teamListUI.fillTeamPane(JsonParser
												.parseListOfTeamsRequest(client
														.waitServerResponse()));
									} catch (ParseException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									teamListUI.refresh();
								}
							});

						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						ui.dispose();

					}

				} catch (ParseException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

			}
		});

		login.setRegisterListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				login.setVisible(false);
				reg.setVisible(true);
				ui.refresh();
			}
		});

		reg.setBackLoginListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				reg.setVisible(false);
				login.setVisible(true);
				ui.refresh();
			}
		});

		login.setEnterListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

				}

			}
		});

	}
}
