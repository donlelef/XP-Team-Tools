package tests;

import java.util.ArrayList;
import java.util.Collections;

import timeRace.IOperation;
import timeRace.ObservableList;
import timeRace.OperationRanking;
import timeRace.operations.AddIntegerToArraylist;
import timeRace.operations.AddIntegerToLinkedlist;

public class OperationRankingTest {
	
	public static void main(String[] args) {
		
		int[] data = {1,2,3,4,5,6,7,8,9};
		
		IOperation op1 = new AddIntegerToArraylist();
		op1.initializeData(data);
		IOperation op2 = new AddIntegerToLinkedlist();
		op2.initializeData(data);
		
		OperationRanking rank1 = new OperationRanking(op2, 11L);
		OperationRanking rank2 = new OperationRanking(op1, 10L);
		
		ArrayList<OperationRanking> Alist = new ArrayList<OperationRanking>();
		Alist.add(rank1);
		Alist.add(rank2);
		Collections.sort(Alist);
		
		ObservableList<OperationRanking> Olist = new ObservableList<OperationRanking>(Alist);
		Olist.setList(Alist);
		ArrayList<OperationRanking> Alist2 = Olist.getList();
		for (OperationRanking operationRanking : Alist2) {
			String string = ""+ operationRanking.getOperation().toString() + operationRanking.getTime();
			System.out.println(string);
		}
		
	}

}
