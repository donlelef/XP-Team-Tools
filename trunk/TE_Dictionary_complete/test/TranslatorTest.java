package test;

import dictionary.CreatorsProxy;
import dictionary.IDictionary;
import dictionary.StringNotFoundException;
import dictionary.TranslatorSampleCreator;

public class TranslatorTest {

	public static void main(String[] args) throws StringNotFoundException {

		CreatorsProxy proxy = new CreatorsProxy();
		proxy.setCreator(new TranslatorSampleCreator());
		IDictionary dic = proxy.create();
		/*for (String string : dic.searcher("ciao").keySet()) {
			System.out.println(string + " e.g. " + dic.searcher("ciao").get(string));
		}*/
		
		for (String[] strings : dic.search("cio")) {
			for (int i = 0; i < strings.length; i++) {
				System.out.println(strings[i]);
			}
		}

	}
}
