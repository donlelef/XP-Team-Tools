package tests;

import java.util.HashMap;

import dictionaryFactory.CreatorsProxy;
import dictionaryFactory.SampleDictionaryCreator;
import dictionaryFactory.StringNotFoundException;

public class DictionaryTest {
	
	public static void main(String[] args) {
		
		CreatorsProxy proxy = new CreatorsProxy();
		
		proxy.setDictionaryCreator(new SampleDictionaryCreator());
		
		try {
			HashMap<String, String> dictonaryMap = new HashMap<String, String>();
			dictonaryMap = proxy.create().search("denaro");
			for (String string : dictonaryMap.keySet()) {
				System.out.println(string+" -> "+dictonaryMap.get(string));
			}
		} catch (StringNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
