package filtering;

import java.util.ArrayList;

public class PackageTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("casa");
		list.add("sonno");
		list.add("cibo");
		Filter<String> filter = new TargetFilter<String>(new StringChecker("cibo"));
		ArrayList<String> filteredList = new ArrayList<String>();
		filteredList =  (ArrayList<String>) filter.filter(list);
		for (String string : filteredList) {
			System.out.println(string);
		}
	}

}
