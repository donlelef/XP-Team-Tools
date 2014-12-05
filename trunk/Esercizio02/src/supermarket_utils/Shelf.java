package supermarket_utils;

public class Shelf {

	private static final int N = 2;
	private int n=N; //'cause the user may want to change this value
	private SupermarketProduct[] products;

	public Shelf(int size) {
		if (size > n)
			size = n;
		this.products = new SupermarketProduct[size];
	}

	public void setProduct(int i, String code, int amount) {
		if (i >= 0 && i < n)
			products[i] = new SupermarketProduct(code, amount);
	}

	public SupermarketProduct getProduct(int i) {
		if (i >= 0 && i < n)
			return products[i];
		else
			return null;
	}

	public void addPieces(String code, int amount) {
		for (int i = 0; i < products.length; i++) {
			if (code.compareTo(products[i].getCode()) == 0)
				products[i].setAmount(products[i].getAmount() + amount);
		}
	}

	public void subtractPieces(String code, int amount) {
		for (int i = 0; i < products.length; i++) {
			if (code.compareTo(products[i].getCode()) == 0) {
				if (products[i].getAmount() < amount)
					amount = products[i].getAmount();
				products[i].setAmount(products[i].getAmount() - amount);
			}
		}
	}

	public int productSearch(String code) {
		int sum=0;
		for (int i = 0; i < products.length; i++) {
			if (code.compareTo(products[i].getCode()) == 0)
				sum+=products[i].getAmount();
		}
		return sum;
		//System.out.println("Codice: " + code + " Numero: " + sum);
	}
}
