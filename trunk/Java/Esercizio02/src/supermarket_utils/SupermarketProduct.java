package supermarket_utils;

public class SupermarketProduct {
	
	private String code;
	private int amount;
	
	public SupermarketProduct(String code, int amount) {
		super();
		this.setCode(code);
		this.setAmount(amount);
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
			this.code = code;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		if(amount>=0)
			this.amount=amount;
		else
			this.amount=0;
	}
}
