package model.loading.interpreters;

import java.util.StringTokenizer;

import model.Hour;
import model.Log;
import model.LogList;
import model.loading.ILineInterpreter;

public class LogInterpreter implements ILineInterpreter{
	
	private LogList logList;

	public LogInterpreter(LogList logList) {
		super();
		this.logList = logList;
	}
	
	@Override
	public void interpret(String line) {
		
		StringTokenizer tokenizer = new StringTokenizer(line);
		String theme = tokenizer.nextToken();
		tokenizer.nextToken("(");
		int hrs = Integer.parseInt(tokenizer.nextToken(":").substring(1));
		int mins = Integer.parseInt(tokenizer.nextToken(":"));
		int secs = Integer.parseInt(tokenizer.nextToken(")").substring(1));
		tokenizer.nextToken("\t");
		String message = tokenizer.nextToken();
		
		Log log = new Log(theme, new Hour(hrs, mins, secs), message);
		
		logList.add(log);
		//System.out.println(theme+hrs+mins+secs+message);
		
	}
}
