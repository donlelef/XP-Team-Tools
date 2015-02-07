package dispositivi;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Centralina {
	
	private HashMap<String, Dispositivo> dispositivi=
		new HashMap<String, Dispositivo>();

	private HashMap<String, DispositivoPercentuale> dispositiviPercentuali=
		new HashMap<String, DispositivoPercentuale>();

	public String getRisposta(String richiesta){
		
		StringTokenizer tokenizer=new StringTokenizer(richiesta);
		
		String nomeDispositivo=tokenizer.nextToken();
		
		Dispositivo disp=dispositivi.get(nomeDispositivo);
		
		if(disp!=null){
			String comando=tokenizer.nextToken();
			if(comando.equals("on")){
				disp.accendi();
			}else if(comando.equals("off")){
				disp.spegni();
			} 
		}else{
			DispositivoPercentuale dPerc=
				dispositiviPercentuali.get(nomeDispositivo);
			
			String comando=tokenizer.nextToken();
			
			String valore=comando.substring(comando.indexOf('=')+1);
			
			dPerc.setValore(Float.parseFloat(valore));
		}
		
		return nomeDispositivo+" done";
	}

	public void registraDispositivoPerc(String name,
			DispositivoPercentuale luce){
		dispositiviPercentuali.put(name, luce);
	}
	
	public void registraDispositivo(String name,Dispositivo luce){
		dispositivi.put(name, luce);
	}
}
