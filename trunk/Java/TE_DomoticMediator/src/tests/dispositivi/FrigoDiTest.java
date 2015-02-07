package tests.dispositivi;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrigoDiTest extends JFrame{

	private static final long serialVersionUID = 0;
	
	private static final String ACCESO = "Acceso";
	private static final String SPENTO = "Spento";

	private static final int DURATA_PERIODO=10000;
	private static final int DURATA_INATTIVO=5000;
	private static final float ERRORE_DISPOSITIVO = 0.1f;
	
	private static final int WIDTH = 150;
	private static final int HEIGHT = 150;
	
	private JLabel frigoLabel;
	
	public FrigoDiTest() {
		
		frigoLabel=new JLabel("Accesa");
		getContentPane().add(frigoLabel);
		setBounds(100, 100, WIDTH, HEIGHT);
		setTitle("Frigo");
		setVisible(true);
	}

	/**
	 * Spegne o accende il Frigo
	 * @param acceso 
	 * @return true se l'accensione è andata a buon fine
	 */
	public boolean setAcceso(boolean acceso){
		if(operativo()){
			boolean erroreDiDispositivo = Math.random()<ERRORE_DISPOSITIVO;
			if(erroreDiDispositivo)
				return false;
			if(acceso){
				frigoLabel.setText(ACCESO);	
			}else{
				frigoLabel.setText(SPENTO);	
			} 
		}else{
			frigoLabel.setText("--");
		}
		return true;
	}
	
	/**
	 * Dice se il frigo è in rete
	 * @return
	 */
	public boolean operativo(){
		return !unoGnomettoStaNelFrigoETieneStaccatiICavi();
	}
	
	private boolean unoGnomettoStaNelFrigoETieneStaccatiICavi(){
		Calendar calendar=Calendar.getInstance();
		long time = calendar.getTime().getTime();
		return time%DURATA_PERIODO<DURATA_INATTIVO;
	} 
}
