package test;

import supermarket_utils.SupermarketProduct;

public class SupermarketProductTest {
	
	public static void main(String[] args){
		
		SupermarketProduct super1 = new SupermarketProduct("Ciao", 12);
		SupermarketProduct super2 = new SupermarketProduct("Miao", -24);
		
		System.out.println("super1: code= "+super1.getCode()+" amount= "+super1.getAmount());
		System.out.println("super2: code= "+super2.getCode()+" amount= "+super2.getAmount());
	}
}
