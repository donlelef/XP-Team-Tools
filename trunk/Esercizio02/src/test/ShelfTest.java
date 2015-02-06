package test;

import supermarket_utils.Shelf;

public class ShelfTest {
	
	public static void main(String[] args) {
		
		Shelf shelf1 = new Shelf(2);
		
		shelf1.setProduct(0, "Ciao", 2);
		shelf1.setProduct(1, "Miao", 3);
		shelf1.setProduct(2, "Biao", 4);
		
		shelf1.addPieces("Miao", 3);
		System.out.println("Code: "+shelf1.getProduct(1).getCode()+" Amount= "+shelf1.getProduct(1).getAmount());
		shelf1.subtractPieces("Miao", 8);
		System.out.println("Code: "+shelf1.getProduct(1).getCode()+" Amount= "+shelf1.getProduct(1).getAmount());
		
		shelf1.productSearch("Miao");
		shelf1.productSearch("Bhbuihiuoh");
		
	}
}
