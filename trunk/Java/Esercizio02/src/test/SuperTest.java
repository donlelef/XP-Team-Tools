package test;

import supermarket_utils.Supermarket;

public class SuperTest {

	public static void main(String[] args) {

		Supermarket super1 = new Supermarket(3, 2);
		
		super1.setProduct(0, 0, 1, "Ciao");
		super1.setProduct(0, 1, 1, "Miao");
		super1.setProduct(1, 0, 1, "Bau");
		super1.setProduct(1, 1, 1, "Grrr");
		super1.setProduct(2, 0, 1, "Ciao");
		super1.setProduct(2, 1, 1, "Ciao");
		
		System.out.println(super1.getTotalAmount("Bau"));
	}

}
