package supermarket_utils;

public class Supermarket {

	private int m;
	private int n;
	private Shelf[] shelves; // TODO Chiedere perchè il vettore non si istanzia
								// qui.

	public Supermarket(int m, int n) {
		if (n > 0)
			this.n = n;
		else
			this.n = 1;
		if (m > 0)
			this.m = m;
		else
			this.m = 1;
		this.shelves = new Shelf[m];
		for (int i = 0; i < shelves.length; i++) {
			shelves[i] = new Shelf(n);
		}
	}

	public int getTotalAmount(String otherCode) {
		int sum = 0;
		for (int i = 0; i < shelves.length; i++) {
			sum += shelves[i].productSearch(otherCode);
		}
		return sum;
	}

	public void setProduct(int k, int i, int amount, String code) {
		if (k >= 0 && k < m)
			shelves[k].setProduct(i, code, amount);
	}

	public SupermarketProduct getProduct(int k, int i) {
		if (k >= 0 && k < m)
			return shelves[k].getProduct(i);
		else
			return null; //TODO I'd rather to avoid returning a null pointer
	}
}
