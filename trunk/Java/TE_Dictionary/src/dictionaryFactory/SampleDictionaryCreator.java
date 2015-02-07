package dictionaryFactory;

import java.util.HashMap;

public class SampleDictionaryCreator implements IDictionaryCreator{
	
	private SampleDictionary sampleDictionary;
	
	@Override
	/*
	 * (non-Javadoc)
	 * @see dictionaryFactory.IDictionaryCreator#create()
	 */
	public IDictionary create() {
		this.sampleDictionary = new SampleDictionary();
		this.load();
		return this.sampleDictionary;
	}
	
	@Override
	/*
	 * (non-Javadoc)
	 * @see dictionaryFactory.IDictionaryCreator#load()
	 */
	public void load() {
		HashMap<String, String> moneyMap = new HashMap<>();
		moneyMap.put("money", "money never sleeps.");
		moneyMap.put("pecunia", "pecunia non olet.");
		this.sampleDictionary.getDicitonaryMap().put("denaro", moneyMap);
	}

}
