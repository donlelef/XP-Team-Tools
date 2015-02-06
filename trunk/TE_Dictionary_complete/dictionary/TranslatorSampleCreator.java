package dictionary;

import java.util.HashMap;

/**
 * A debug-use only implementation of IDictionaryCreator, 
 * providing a new Translator (IDictionary) object
 * 
 * @author simone
 *
 */
public class TranslatorSampleCreator implements IDictionaryCreator{

	private Translator sampleTranslator;
	
	@Override
	/*
	 * (non-Javadoc)
	 * @see dictionaryFactory.IDictionaryCreator#create()
	 */
	public Translator create() {
		this.sampleTranslator = new Translator();
		this.load();
		return this.sampleTranslator;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see dictionaryFactory.IDictionaryCreator#load()
	 */
	public void load() {
		this.sampleTranslator.getTranslatorMap().put("ciao", "hello");
	}

}
