package dictionaryFactory;

public class CreatorsProxy implements IDictionaryCreator{
	
	private IDictionaryCreator dictionaryCreator;
	
	@Override
	public IDictionary create() {
		return this.dictionaryCreator.create();
	}
	
	@Override
	public void load() {
		this.dictionaryCreator.load();
	}
	
	public void setDictionaryCreator(IDictionaryCreator dictionaryCreator){
		this.dictionaryCreator = dictionaryCreator;
	}

}
