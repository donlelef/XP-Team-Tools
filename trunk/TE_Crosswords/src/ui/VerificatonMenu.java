package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import verification.CharVerifier;
import verification.PalindromeVerifier;
import verification.Verifier;

public class VerificatonMenu extends JMenu {

	private static final long serialVersionUID = 0;

	private Verifier verifier;

	public VerificatonMenu(Verifier verifier) {
		super("Verifications");
		this.verifier = verifier;
	}

	public void buildMenu() {
		JMenuItem charVerification = new JMenuItem("Strange characters test");
		charVerification.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				verifier.setVerifier(new CharVerifier(null));

			}
		});
		this.add(charVerification);

		JMenuItem palindromeVerification = new JMenuItem("Palindrome test");
		palindromeVerification.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				verifier.setVerifier(new PalindromeVerifier(null));

			}
		});
		this.add(palindromeVerification);
	}
}