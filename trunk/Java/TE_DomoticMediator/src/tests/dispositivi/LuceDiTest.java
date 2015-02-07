package tests.dispositivi;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LuceDiTest extends JFrame{

	private static final long serialVersionUID = 0;
	
	private static final String ACCESA = "Accesa";
	private static final String SPENTA = "Spenta";
	
	private static final int WIDTH = 150;
	private static final int HEIGHT = 150;
	
	private JLabel luceLabel;
	
	public LuceDiTest() {
		
		luceLabel=new JLabel("Accesa");
		getContentPane().add(luceLabel);
		setBounds(100, 100, WIDTH, HEIGHT);
		setTitle("Luce");
		setVisible(true);
	}

	public void accendi(){
		luceLabel.setText(ACCESA);
	}
	
	public void spenta(){
		luceLabel.setText(SPENTA);
	}
}
