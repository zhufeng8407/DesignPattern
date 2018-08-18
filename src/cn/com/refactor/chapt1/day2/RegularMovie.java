package cn.com.refactor.chapt1.day2;

public class RegularMovie implements Movie {

	private int priceCode = 0;

	@Override
	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

	public double getCharge(int daysRented) {
		double thisAmount = 2;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 1.5;

		return thisAmount;
	}
}
