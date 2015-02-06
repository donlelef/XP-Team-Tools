package tests;

import model.Log;
import model.LogList;
import model.filters.NoFilter;
import model.loading.interpreters.LogInterpreter;

public class InterpreterTest {
	
	public static void main(String[] args) {
		
		LogList list = new LogList();
		
		LogInterpreter interpreter = new LogInterpreter(list);
		
		list.setFilter(new NoFilter(list));
		
		interpreter.interpret("ciao (21:23:94)	miao");
				
		for (Log log : list.getLogList()) {
			System.out.println(log.toString());
		}
		
	}

}
