package test;

import java.util.Map;

import dictionary.CreatorsProxy;
import dictionary.IDictionary;
import dictionary.MultilingueDictionary;
import dictionary.MultilingueDictionarySampleCreator;
import dictionary.StringNotFoundException;

public class MultilingueSampleCreatorTest {

	public static void main(String[] args) throws StringNotFoundException {

		CreatorsProxy proxy = new CreatorsProxy();
		proxy.setCreator(new MultilingueDictionarySampleCreator());
		IDictionary dic = proxy.create();
		/*for (String string : dic.searcher("ciao").keySet()) {
			System.out.println(string + " e.g. " + dic.searcher("ciao").get(string));
		}*/
		
		for (String[] strings : dic.search("cao")) {
			for (int i = 0; i < strings.length; i++) {
				System.out.println(strings[i]);
			}
		}

	}
}

