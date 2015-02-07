package tests;

import java.util.ArrayList;

import timeRace.IOperation;
import timeRace.OperationRanking;
import timeRace.Race;
import timeRace.operations.AddIntegerToArraylist;
import timeRace.operations.AddIntegerToLinkedlist;

public class RaceTest {
	
	public static void main(String[] args) {
		
		IOperation op1 = new AddIntegerToArraylist();
		IOperation op2 = new AddIntegerToLinkedlist();
		
		ArrayList<IOperation> list = new ArrayList<IOperation>();
		list.add(op1);
		list.add(op2);
		
		Race race = new Race(list, 100);
		race.startRace();
		ArrayList<OperationRanking> ranking = race.getRankingList();
		
		for (OperationRanking operationRanking : ranking) {
			System.out.println(operationRanking.getOperation().toString()+" "+operationRanking.getTime());
		}		
	}

}
