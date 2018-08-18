package cn.com.refactor.chapt1.day2;

public class NewReleaseMovie implements Movie {
	private int priceCode = 1;
	
	@Override
	public int getPriceCode() {
		return priceCode;
	}
	
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	
	@Override
	public double getCharge(int daysRented) {
	
		return daysRented * 3;
	}
	
}
