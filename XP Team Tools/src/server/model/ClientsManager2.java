package server.model;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import server.db.DBConnection;
import server.db.IDBConnection;
import server.utils.auth.Authenticate;
import client.model.ClientConnectionDetails;
import client.model.ClientDetails;

/**
 * It handle the clients registering each of them, refreshing their dynamic
 * attributes
 * 
 * @author alberto
 *
 */


public class ClientsManager2 {

	private volatile IDBConnection db;
	private  volatile Authenticate auth = new Authenticate();
	private volatile Set<ClientConnectionDetails> clients = new HashSet<ClientConnectionDetails>();
	private static volatile ClientsManager2 instance = new ClientsManager2();
	
	private ClientsManager2() {
		db = new DBConnection();
	}

	
	/**
	 * Register a client. If a client is already registered, this method only
	 * refresh his dynamic attributes as sockets
	 * 
	 * @param client
	 * @throws SQLException
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 */
	public synchronized void  registerClient(ClientConnectionDetails client)
			throws NoSuchAlgorithmException, IOException, SQLException {
		if (authenticate(client.getNickname(), client.getPwd())) {

			System.out.println("Sto registrando " + client.getNickname() + " "
					+ client.getTeamName() + ClientsManager2.class);
			if (has(client)) {
				remove(client);
				System.out.println("L ho rimosso " + ClientsManager2.class);
				clients.add(client);
			} else {
				clients.add(client);
			}
			
		} else {
			// TODO throw new IOException("The user " + nickname
			// + "does not exist or invalid password");
			System.err.println("Utente non autenticato!");
		}
	}
	
	
	public Set<ClientConnectionDetails> getClients() {
		return clients;
	}

	/**
	 * It returns the {@link ClientConnectionDetails} that has the same team
	 * name and the same nickname of the {@link ClientDetails} passed as
	 * parameter. If there isn't the match, returns null
	 * 
	 * @param {@link ClientDetails}
	 * @return
	 */
	public synchronized ClientConnectionDetails get(ClientDetails det) {
		Iterator<ClientConnectionDetails> iter = clients.iterator();
		while (iter.hasNext()) {
			ClientConnectionDetails conDet = iter.next();
			if (conDet.equals(det)) {
				return conDet;
			}
		}
		return null;
	}

	
	private boolean authenticate(String nickname, String pwd)
			throws IOException, NoSuchAlgorithmException, SQLException { // TODO

		boolean autheniticated = auth.authenticate(db.getConnection(),
				nickname, pwd);

		return autheniticated;
	}

	public int size() {
		return clients.size();
	}
	
	public boolean has(ClientConnectionDetails conDet) {
		Iterator<ClientConnectionDetails> iter = clients.iterator();
		while (iter.hasNext()) {
			if(iter.next().getNickname().equals(conDet.getNickname())) {
				return true;
			}
		}
		return false;
	}

	public synchronized static ClientsManager2 getInstance() {
		return instance;
	}
	/**
	 * Performs the connection to database 
	 */
	public void connectToDB() {
		try {
			db.connect("alemonta", "protgamba", 3306, "52.74.20.119", "extreme01");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void remove(ClientConnectionDetails conDet) {
		Set<ClientConnectionDetails> clientsTmp = new HashSet<ClientConnectionDetails>();
		
		Iterator<ClientConnectionDetails> iter = clients.iterator();
		while (iter.hasNext()) {
			ClientConnectionDetails det = iter.next();
			if(!det.getNickname().equals(conDet.getNickname())) {
				clientsTmp.add(det);
			}
		}
		clients = clientsTmp;
	}
}
