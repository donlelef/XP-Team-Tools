package export;

/**
 * An example of concrete implementation of {@link IFormatter}
 * @author lele
 *
 */
public class SampleFormatter implements IFormatter<String> {
	
	private String string = "ciao";
	
	@Override
	public String format(String toBeFormatted) {
		String line = toBeFormatted +" "+ string+"!";
		return line;
	}

}
