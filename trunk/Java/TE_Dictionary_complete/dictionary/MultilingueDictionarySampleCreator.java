package dictionary;

import java.util.HashMap;

/**
 * A debug-use only implementation of IDictionaryCreator
 * 
 * @author simone
 *
 */
public class MultilingueDictionarySampleCreator implements IDictionaryCreator{

	private MultilingueDictionary sampleDictionary;
	
	@Override
	/*
	 * (non-Javadoc)
	 * @see dictionaryFactory.IDictionaryCreator#create()
	 */
	public MultilingueDictionary create() {
		this.sampleDictionary = new MultilingueDictionary();
		this.load();
		return this.sampleDictionary;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see dictionaryFactory.IDictionaryCreator#load()
	 */
	public void load() {
		HashMap<String, String> ciaoMap = new HashMap<String, String>();
		ciaoMap.put("hello", "hello Ceasar");
		ciaoMap.put("ave", "ave Cesare");
		ciaoMap.put("hola", "Cesare");
		this.sampleDictionary.getDictionaryMap().put("ciao", ciaoMap);
	}

}
