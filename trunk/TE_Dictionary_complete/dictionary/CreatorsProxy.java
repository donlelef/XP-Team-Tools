package dictionary;

public class CreatorsProxy implements IDictionaryCreator {

	private IDictionaryCreator creator;
	
	@Override
	/*
	 * (non-Javadoc)
	 * @see dictionaryFactory.IDictionaryCreator#create()
	 */
	public IDictionary create() {
		return this.creator.create();
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see dictionaryFactory.IDictionaryCreator#load()
	 */
	public void load() {
		this.creator.load();
		
	}
	
	/**
	 * Set the concrete implementation to build a dictionary with
	 * 
	 * @param creator
	 */
	public void setCreator(IDictionaryCreator creator){
		this.creator = creator;
	}

	
}
