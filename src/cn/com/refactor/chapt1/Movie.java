package cn.com.refactor.chapt1;

public class Movie {
	
	public static final int REGULAR = 0;
	public static final int CHILDRENS = 2;
	public static final int NEW_RELEASE = 1;

	private int priceCode;
	
	public Movie(int priceCode) {
		super();
		this.priceCode = priceCode;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	
	
	
}
