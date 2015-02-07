package tests.dispositivi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Riscaldamento 
 * 
 * @author Alessandro Martinelli
 */
public class RiscaldamentoDiTest extends JFrame{

	private static final long serialVersionUID = 0;
	
	private static final int DURATA_PERIODO=10000;
	private static final int DURATA_INATTIVO=5000;
	
	private static final int WIDTH = 150;
	private static final int HEIGHT = 150;
	
	private float valore;
	
	private int offsetAccensione;

	PannelloCalore pannelloCalore=new PannelloCalore();
	
	private class PannelloCalore extends JPanel{
		
		private static final long serialVersionUID = 0;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(operativo()){
				g.drawString(valore+"", 30, 30);	
			}else{
				g.drawString("Non operativo!", 30, 30);
			}
		}
		
		public void update(){
			repaint();
			int valoreInt=(int)(255*valore);
			
			if(operativo()){
				Color color=new Color(0xff0000ff+valoreInt*0x010000-(valoreInt));
				setBackground(color);	
			}else{
				Color color=new Color(0xff66ff66);
				setBackground(color);	
			}
		}
	}
	
	public RiscaldamentoDiTest(String name,int offsetAccensione) {
		
		getContentPane().add(pannelloCalore);
		setBounds(100, 100, WIDTH, HEIGHT);
		setTitle("Riscaldamento "+name);
		setVisible(true);
		this.offsetAccensione=offsetAccensione;
	
		Timer timer=new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pannelloCalore.update();
			}
		});
		timer.start();
	}	

	/**
	 * Imposta il valore del riscaldmento
	 * @param valore Deve essere compreso tra 0 e 1
	 * @return il valore effettivamente impostato
	 */
	public float setValore(float valore){
		if(valore<0)
			valore=0;
		else if(valore>1)
			valore=1;
		this.valore=valore;
		pannelloCalore.update();
		return valore;
	}
	
	/**
	 * Dice se il frigo è in rete
	 * @return
	 */
	public boolean operativo(){
		return !unoGnomettoStaNellaCaldaiaETieneStaccatiICavi();
	}
	
	private boolean unoGnomettoStaNellaCaldaiaETieneStaccatiICavi(){
		Calendar calendar=Calendar.getInstance();
		long time = calendar.getTime().getTime();
		return (time+offsetAccensione)%DURATA_PERIODO<DURATA_INATTIVO;
	} 
}
